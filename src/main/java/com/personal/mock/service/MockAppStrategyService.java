package com.personal.mock.service;

import com.personal.mock.po.MockApp;
import com.personal.mock.po.MockAppStrategy;

import java.util.List;

/**
 * Service to manager the sql function for table mock_app_strategy
 * Created at 2019-03-22
 */
public interface MockAppStrategyService {

    Object insertMockApp(MockAppStrategy mockAppStrategy);
    Object searchMockAppStrategyById(Integer id);
    List<MockAppStrategy> search(Integer id, Integer appId, Integer strategyId);
    List<MockAppStrategy> searchAll();


}
