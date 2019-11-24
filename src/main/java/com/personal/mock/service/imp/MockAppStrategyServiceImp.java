package com.personal.mock.service.imp;

import com.personal.mock.dao.MockAppStrategyRepository;
import com.personal.mock.po.MockAppStrategy;
import com.personal.mock.po.MockAppStrategyQuery;
import com.personal.mock.service.MockAppStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Service to manager the sql function for table mock_app_strategy
 * Created at 2019-03-22
 */
@Service
public class MockAppStrategyServiceImp implements MockAppStrategyService {

    @Autowired
    MockAppStrategyRepository mockAppStrategyRepository;

    @Override
    public Object insertMockApp(MockAppStrategy mockAppStrategy) {
        mockAppStrategy.setCreateTime(new Date());
        mockAppStrategy.setUpdateTime(new Date());
//        mockAppStrategy.setIsActive(false);
        mockAppStrategyRepository.insertSelective(mockAppStrategy);
        return mockAppStrategy;
    }

    @Override
    public Object searchMockAppStrategyById(Integer id) {
        return mockAppStrategyRepository.selectByPrimaryKey(id);
    }

    @Override
    public List<MockAppStrategy> search(Integer id, Integer appId, Integer strategyId) {
        MockAppStrategyQuery mockAppStrategyQuery = new MockAppStrategyQuery();
        MockAppStrategyQuery.Criteria criteria = mockAppStrategyQuery.createCriteria();
        if (id != null){
            criteria.andIdEqualTo(id);
        }
        if (appId != null){
            criteria.andAppIdEqualTo(appId);
        }
        if (strategyId != null){
            criteria.andStrategyIdEqualTo(strategyId);
        }
        return mockAppStrategyRepository.selectByExample(mockAppStrategyQuery);
    }

    @Override
    public List<MockAppStrategy> searchAll() {
        MockAppStrategyQuery mockAppStrategyQuery = new MockAppStrategyQuery();
//        MockAppStrategyQuery.Criteria criteria = mockAppStrategyQuery.createCriteria();
        return mockAppStrategyRepository.selectByExample(mockAppStrategyQuery);
    }
}
