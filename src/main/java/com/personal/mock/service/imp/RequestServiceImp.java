package com.personal.mock.service.imp;

import com.alibaba.fastjson.JSONObject;
import com.personal.mock.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;

/**
 * author: zhaoxu
 * date: 2019/4/13 下午10:20
 */
@Service
public class RequestServiceImp implements RequestService {

    @Autowired
    private HttpServletRequest httpServletRequest;

    public JSONObject getRequestBody(){
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

    public JSONObject getRequestHeader(){

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

    public String getRequestURI(){
        return httpServletRequest.getRequestURI();
    }

    public String getQueryString(){
        return httpServletRequest.getQueryString();
    }

    public String getMethod(){
        return httpServletRequest.getMethod();
    }

}
