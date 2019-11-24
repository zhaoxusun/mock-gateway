package com.personal.mock.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.filters.SimpleRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * author: zhaoxu
 * date: 2019/4/25 下午2:49
 */
@Component
public class MockZuulRouteLocator extends SimpleRouteLocator {

    private ZuulProperties properties;

    @Autowired
    public MockZuulRouteLocator(ServerProperties server, ZuulProperties properties) {
        super(server.getServletPrefix(), properties);
        this.properties = properties;
    }

    public void updateRoutes(ZuulProperties.ZuulRoute route){
        Map<String, ZuulProperties.ZuulRoute> routeMap = new HashMap<>();
        routeMap.put(route.getPath(),route);
        this.properties.setRoutes(routeMap);
        this.properties.setPrefix(route.getPath());
        doRefresh();
    }
}
