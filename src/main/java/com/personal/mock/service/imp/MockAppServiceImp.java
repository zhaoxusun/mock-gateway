package com.personal.mock.service.imp;

import com.personal.mock.dao.MockAppRepository;
import com.personal.mock.po.MockApp;
import com.personal.mock.po.MockAppQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.personal.mock.service.MockAppService;

import java.util.Date;
import java.util.List;

/**
 * Service to manager the sql function for table mock_app
 * Created at 2019-03-22
 */
@Service
public class MockAppServiceImp implements MockAppService {

    @Autowired
    MockAppRepository mockAppRepository;

    @Override
    public Object getAllMockApp() {
        return null;
    }

    @Override
    public Object updateMockApp(MockApp mockApp) {
        mockApp.setUpdateTime(new Date());
        mockApp.setIsActive(false);
        mockAppRepository.updateByPrimaryKeySelective(mockApp);
        return mockApp;
    }

    @Override
    public Object insertMockApp(MockApp mockApp) {
        mockApp.setCreateTime(new Date());
        mockApp.setUpdateTime(new Date());
        mockApp.setIsActive(false);
        mockAppRepository.insertSelective(mockApp);
        return mockApp;
    }

    @Override
    public MockApp searchMockAppById(Integer id) {
        return mockAppRepository.selectByPrimaryKey(id);
    }

    @Override
    public List<MockApp> searchMockApp(Integer id, String name, String description, String requestType, String requestUrl, String requestQuery, String requestBody, Boolean isActive) {
        MockAppQuery mockAppQuery = new MockAppQuery();
        MockAppQuery.Criteria criteria = mockAppQuery.createCriteria();
        if (id != null){
            criteria.andIdEqualTo(id);
        }
        if (name != null){
            criteria.andNameEqualTo(name);
        }
        if (description != null){
            criteria.andDescriptionEqualTo(description);
        }
        if (requestType != null){
            criteria.andRequestTypeEqualTo(requestType);
        }
        if (requestUrl != null){
            criteria.andRequestUriEqualTo(requestUrl);
        }
        if (requestQuery != null){
            criteria.andRequestQueryEqualTo(requestQuery);
        }
        if (requestBody != null){
            criteria.andRequestBodyEqualTo(requestBody);
        }
        if (isActive != null){
            criteria.andIsActiveEqualTo(isActive);
        }
        return mockAppRepository.selectByExample(mockAppQuery);
    }

}
