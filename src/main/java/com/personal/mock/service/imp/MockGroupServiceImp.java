package com.personal.mock.service.imp;


import com.personal.mock.service.MockGroupService;
import org.springframework.stereotype.Service;
/**
 * Service to manager the sql function for table mock_group
 * Created at 2019-03-22
 */
@Service
public class MockGroupServiceImp implements MockGroupService {


    @Override
    public Object getMockGroup(int id) {
        return null;
    }

    @Override
    public Object updateMockGroup(int id, String name, String description, String approver) {
        return null;
    }

    @Override
    public Object activeMockGroup(int id, String approver) {
        return null;
    }
}
