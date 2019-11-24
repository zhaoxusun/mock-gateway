package com.personal.mock.po;

import java.io.Serializable;
import java.util.Date;

public class MockStrategy implements Serializable {
    /**
     * 对应数据库关系 mock.mock_strategy.id
     */
    private Integer id;

    /**
     * 对应数据库关系 mock.mock_strategy.name
     */
    private String name;

    /**
     * 对应数据库关系 mock.mock_strategy.description
     */
    private String description;

    /**
     * 对应数据库关系 mock.mock_strategy.mock_response_strategy
     */
    private Integer mockResponseStrategy;

    /**
     * 对应数据库关系 mock.mock_strategy.create_time
     */
    private Date createTime;

    /**
     * 对应数据库关系 mock.mock_strategy.update_time
     */
    private Date updateTime;

    /**
     * 对应数据库关系 mock.mock_strategy.approver
     */
    private String approver;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getMockResponseStrategy() {
        return mockResponseStrategy;
    }

    public void setMockResponseStrategy(Integer mockResponseStrategy) {
        this.mockResponseStrategy = mockResponseStrategy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }
}