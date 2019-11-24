package com.personal.mock.service.imp;

import com.personal.mock.po.MockApp;
import com.personal.mock.po.MockAppStrategy;
import com.personal.mock.po.MockStrategy;
import com.personal.mock.service.MockAppService;
import com.personal.mock.service.MockAppStrategyService;
import com.personal.mock.service.MockStrategyService;
import com.personal.mock.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author: zhaoxu
 * date: 2019/5/8 下午3:00
 */
@Service
public class RouteServiceImp implements RouteService {

    @Autowired
    MockAppService mockAppService;

    @Autowired
    MockAppStrategyService mockAppStrategyService;

    @Autowired
    MockStrategyService mockStrategyService;


    @Override
    public Map<MockApp,Integer> getAllRoutesInfoByDB() {
        Map<MockApp,Integer> map = new HashMap<>();
        List<MockAppStrategy> mockAppStrategyList = mockAppStrategyService.searchAll();
        for (MockAppStrategy mockAppStrategy : mockAppStrategyList) {
            Integer mockAppId = mockAppStrategy.getAppId();
            Integer mockStrategyId = mockAppStrategy.getStrategyId();
            MockApp mockApp = mockAppService.searchMockAppById(mockAppId);
            MockStrategy mockStrategy = mockStrategyService.searchById(mockStrategyId);
            if (mockApp == null){
                continue;
            }
            if (mockStrategy == null){
                continue;
            }
            if (!mockApp.getIsActive()){
                continue;
            }
            Integer mockResponseStrategy = mockStrategy.getMockResponseStrategy();
            if ( mockResponseStrategy == null){
                continue;
            }
            map.put(mockApp,mockResponseStrategy);
        }
        return map;
    }

}
