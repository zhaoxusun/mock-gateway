package com.personal.mock.service;

/**
 * Service to manager the sql function for table mock_group
 * Created at 2019-03-22
 */
public interface MockGroupService {
    Object getMockGroup(int id);
    Object updateMockGroup(int id,String name,String description,String approver);
    Object activeMockGroup(int id,String approver);
}
