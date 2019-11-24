package com.personal.mock.filter;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.personal.mock.common.MockStrategyEnum;
import com.personal.mock.po.MockApp;
import com.personal.mock.route.MockZuulRoute;
import com.personal.mock.route.MockZuulRouteLocator;
import com.personal.mock.service.FilterService;
import com.personal.mock.service.RequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;

import static com.personal.mock.common.Constant.*;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * author: zhaoxu
 * date: 2019/4/30 上午10:07
 */
@Component
public class MockPreFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(MockPreFilter.class);

    @Value(value = "${mock.request.address}")
    private String mockRequestAddress;
    @Value(value = "${mock.response.address}")
    private String mockResponseAddress;
    @Value(value = "${proxy.address}")
    private String proxyAddress;
    @Value(value = "${redirect.address}")
    private String redirectAddress;


    @Autowired
    FilterService filterService;

    @Autowired
    RequestService requestService;

    @Autowired
    MockZuulRouteLocator mockZuulRouteLocator;

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 4;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = ctx.getRequest();

        logger.info(String.valueOf(requestService.getRequestHeader()));
        logger.info(requestService.getMethod());
        logger.info(requestService.getQueryString());
        logger.info(requestService.getRequestURI());
        logger.info(String.valueOf(requestService.getRequestBody()));

        logger.info("request uri: "+httpServletRequest.getRequestURI());
        Map<MockApp, Integer> map = filterService.getFilterInfo(httpServletRequest);
        if (null != map){
            Iterator <MockApp>iterator = map.keySet().iterator();
            MockApp mockApp = iterator.next();
            Integer mockStrategyId = map.get(mockApp);
            String path = mockApp.getRequestUri();
            Integer mockAppId = mockApp.getId();
            String url = null;
            try{
                MockStrategyEnum mockStrategyEnum = MockStrategyEnum.getMockStrategyByStrategyId(mockStrategyId);
                switch (mockStrategyEnum) {
                    case MOCK_RESPONSE_DIRECT:
                        url = mockResponseAddress;
                        logger.info("【正常，gateway转发给下级服务处理】" +url);
                        break;
                    case MOCK_REQUEST_RETURN:
                        url = mockRequestAddress;
                        logger.info("【正常，gateway转发给下级服务处理】" +url);
                        break;
                    case REQUEST_REDIRECT:
                        url = redirectAddress;
                        logger.info("【正常，gateway转发给下级服务处理】" +url);
                        break;
                    case PROXY:
                        url = proxyAddress;
                        logger.info("【正常，gateway转发给下级服务处理】" +url);
                        break;
                }
            } catch(NullPointerException e){
                logger.error("【异常，没有匹配到策略，详情如下：】");
                logger.error("【mock_app.id=%d 对应的mock_strategy.mock_response_strategy配置异常，请检查】");
            }
            MockZuulRoute mockZuulRoute = new MockZuulRoute(mockAppId.toString(),path,url);
            mockZuulRouteLocator.updateRoutes(mockZuulRoute);
            ctx.addZuulRequestHeader(MOCK_STRATEGY_ID,mockStrategyId.toString());
            ctx.addZuulRequestHeader(MOCK_APP_ID,mockAppId.toString());
            ctx.addZuulRequestHeader(REQUEST_URI,httpServletRequest.getRequestURI());
        } else {
            logger.error("【异常，没有匹配到mock数据，请检查】");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("errorMessage","【呃呃呃, 你的请求没有匹配到数据库的mock数据，请检查】");
            ctx.setResponseBody(jsonObject.toJSONString());
            ctx.getResponse().setContentType("application/json;charset=UTF-8");
        }
        return null;
    }
}
