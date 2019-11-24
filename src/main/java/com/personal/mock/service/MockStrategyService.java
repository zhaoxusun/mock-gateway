package com.personal.mock.service;

import com.personal.mock.po.MockApp;
import com.personal.mock.po.MockStrategy;

import java.util.List;

/**
 * Service to manager the sql function for table mock_strategy
 * Created at 2019-03-22
 */
public interface MockStrategyService {

    List<MockStrategy> search(Integer id,String name,String description,Integer mockResponseStrategy,
                              Integer redirectStrategy,Integer proxyStrategy);

    List<MockStrategy> searchAll();

    MockStrategy searchById(Integer id);


}
