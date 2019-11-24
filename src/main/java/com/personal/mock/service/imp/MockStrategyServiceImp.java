package com.personal.mock.service.imp;

import com.personal.mock.dao.MockStrategyRepository;
import com.personal.mock.po.MockStrategy;
import com.personal.mock.po.MockStrategyQuery;
import com.personal.mock.service.MockStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service to manager the sql function for table mock_strategy
 * Created at 2019-03-22
 */
@Service
public class MockStrategyServiceImp implements MockStrategyService {

    @Autowired
    MockStrategyRepository mockStrategyRepository;

    @Override
    public List<MockStrategy> search(Integer id, String name, String description, Integer mockResponseStrategy, Integer redirectStrategy, Integer proxyStrategy) {
        MockStrategyQuery mockStrategyQuery = new MockStrategyQuery();
        MockStrategyQuery.Criteria criteria = mockStrategyQuery.createCriteria();
        if (id != null){
            criteria.andIdEqualTo(id);
        }
        if (name != null){
            criteria.andNameEqualTo(name);
        }
        if (description != null){
            criteria.andDescriptionEqualTo(null);
        }
        if (mockResponseStrategy != null){
            criteria.andMockResponseStrategyEqualTo(mockResponseStrategy);
        }
        return mockStrategyRepository.selectByExample(mockStrategyQuery);
    }

    @Override
    public List<MockStrategy> searchAll() {
        MockStrategyQuery mockStrategyQuery = new MockStrategyQuery();
        MockStrategyQuery.Criteria criteria = mockStrategyQuery.createCriteria();
        return mockStrategyRepository.selectByExample(mockStrategyQuery);
    }

    @Override
    public MockStrategy searchById(Integer id) {
        MockStrategyQuery mockStrategyQuery = new MockStrategyQuery();
        MockStrategyQuery.Criteria criteria = mockStrategyQuery.createCriteria();
        if (id != null){
            criteria.andIdEqualTo(id);
        }
        return mockStrategyRepository.selectByExample(mockStrategyQuery).get(0);
    }


}
