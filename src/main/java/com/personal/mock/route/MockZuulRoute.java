package com.personal.mock.route;

import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

import java.util.Set;

/**
 * author: zhaoxu
 * date: 2019/5/8 下午3:42
 */
public class MockZuulRoute extends ZuulProperties.ZuulRoute {

    public MockZuulRoute(String id, String path, String serviceId, String url, boolean stripPrefix, Boolean retryable, Set<String> sensitiveHeaders) {
        super(id, path, serviceId, url, stripPrefix, retryable, sensitiveHeaders);
    }

    public MockZuulRoute(String id, String path, String url) {
        super(id, path,null, url, false, false, null);
    }
}
