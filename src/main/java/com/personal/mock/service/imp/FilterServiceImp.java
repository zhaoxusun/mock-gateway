package com.personal.mock.service.imp;

import com.alibaba.fastjson.JSONObject;
import com.personal.mock.po.MockApp;
import com.personal.mock.po.MockAppStrategy;
import com.personal.mock.po.MockStrategy;
import com.personal.mock.service.FilterService;
import com.personal.mock.service.MockAppService;
import com.personal.mock.service.MockAppStrategyService;
import com.personal.mock.service.MockStrategyService;
import com.personal.mock.common.util.JsonUtil;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * author: zhaoxu
 * date: 2019/4/26 下午6:15
 */
@Service
public class FilterServiceImp implements FilterService {

    @Autowired
    MockAppService mockAppService;

    @Autowired
    MockAppStrategyService mockAppStrategyService;

    @Autowired
    MockStrategyService mockStrategyService;

    @Override
    public Map<MockApp, Integer> getFilterInfo(HttpServletRequest httpServletRequest) {
        String requestType = httpServletRequest.getMethod();
        String requestUrl = httpServletRequest.getRequestURI();
        String requestQuery = httpServletRequest.getQueryString();
        JSONObject requestBody = getRequestBody(httpServletRequest);
        JSONObject requestHeader = getRequestHeader(httpServletRequest);
        List<MockApp> mockAppList = mockAppService.searchMockApp(null,null,null,requestType,
                requestUrl,null,null,true);
        //所有匹配上的mockApp.id的集合
        List<Integer> mockAppIdList = new ArrayList<>();
        //匹配requestBody，去掉不匹配的数据
        for (MockApp mockApp:mockAppList) {
            JSONObject mockAppRequestBodyJson = JSONObject.parseObject(mockApp.getRequestBody());
            if (mockAppRequestBodyJson != null){
                try {
                    if (JsonUtil.assertJsonEquals(requestBody,mockAppRequestBodyJson, JSONCompareMode.LENIENT,null)){
//                        if (requestQuery == null && mockApp.getRequestQuery() == null){
                        if (mockApp.getRequestQuery() == null){
                            mockAppIdList.add(mockApp.getId());
//                        } else if (requestQuery != null && mockApp.getRequestQuery() != null){
                        } else {
                            if (requestQuery != null){
                                String [] actualRequestQueryGroup = requestQuery.split("&");
                                String [] expectRequestQueryGroup = mockApp.getRequestQuery().split("&");
                                Arrays.sort(actualRequestQueryGroup);
                                Arrays.sort(expectRequestQueryGroup);
                                if (Arrays.equals(actualRequestQueryGroup,expectRequestQueryGroup)){
                                    mockAppIdList.add(mockApp.getId());
                                }
                            }else if (mockApp.getRequestQuery().trim().equals("")){
                                mockAppIdList.add(mockApp.getId());
                            }
                        }
                    }
                } catch (JSONException e) {
                    System.out.println("requestBody与Mock数据中requestBody匹配时异常,请检查Mock配置");
                    //throw new MockAppException(requestUrl+"请求,requestBody与Mock数据中requestBody匹配时异常,请检查Mock配置");
                }
            } else {
                mockAppIdList.add(mockApp.getId());
            }
        }

        if (mockAppList.size() > 0){
            List<MockAppStrategy> mockAppStrategyList = mockAppStrategyService.searchAll();

            for (MockAppStrategy mockAppStrategy : mockAppStrategyList) {
                Integer mockAppId = mockAppStrategy.getAppId();
                Integer mockStrategyId = mockAppStrategy.getStrategyId();
                MockStrategy mockStrategy = mockStrategyService.searchById(mockStrategyId);
                if (mockStrategy != null){
                    if (mockAppIdList.contains(mockAppId)){
                        MockApp mockApp = mockAppService.searchMockAppById(mockAppId);
                        Integer mockResponseStrategy = mockStrategy.getMockResponseStrategy();
//                        MockStrategyEnum mockStrategyEnum = MockStrategyEnum.getMockStrategyByStrategyId(mockResponseStrategy);
                        Map<MockApp,Integer> map = new HashMap<MockApp,Integer>();
                        map.put(mockApp,mockResponseStrategy);
                        return map;
                    }
                }
            }
        }
        return null;
    }

    private JSONObject getRequestBody(HttpServletRequest httpServletRequest){
        int contentLength = httpServletRequest.getContentLength();
        if (contentLength < 0){
            return null;
        }
        String charEncoding = httpServletRequest.getCharacterEncoding();
        if (charEncoding == null){
            charEncoding = "UTF-8";
        }
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(httpServletRequest.getInputStream(),charEncoding));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str;
        try {
            while ((str=bufferedReader.readLine())!=null){
                stringBuilder.append(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return JSONObject.parseObject(stringBuilder.toString());

    }

    private JSONObject getRequestHeader(HttpServletRequest httpServletRequest){

        Enumeration<String> header = httpServletRequest.getHeaderNames();
        if (!header.hasMoreElements()) {
            return null;
        }
        JSONObject headerJson = new JSONObject();
        while (header.hasMoreElements()) {
            String key = header.nextElement();
            headerJson.put(key,httpServletRequest.getHeader(key));
        }
        return headerJson;
    }


}
