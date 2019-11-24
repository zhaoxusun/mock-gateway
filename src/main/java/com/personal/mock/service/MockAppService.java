package com.personal.mock.service;

import com.personal.mock.po.MockApp;

import java.util.List;

/**
 * Service to manager the sql function for table mock_app
 * Created at 2019-03-22
 */
public interface MockAppService {

    Object getAllMockApp();
    Object updateMockApp(MockApp mockApp);
    Object insertMockApp(MockApp mockApp);
    MockApp searchMockAppById(Integer id);
    List<MockApp> searchMockApp(Integer id, String name, String description, String requestType, String requestUrl, String requestQuery, String requestBody, Boolean isActive);
}
