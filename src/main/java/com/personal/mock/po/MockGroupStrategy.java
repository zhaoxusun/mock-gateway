package com.personal.mock.po;

import java.io.Serializable;
import java.util.Date;

public class MockGroupStrategy implements Serializable {
    /**
     * 对应数据库关系 mock.mock_group_strategy.id
     */
    private Integer id;

    /**
     * 对应数据库关系 mock.mock_group_strategy.group_id
     */
    private Integer groupId;

    /**
     * 对应数据库关系 mock.mock_group_strategy.strategy
     */
    private Integer strategy;

    /**
     * 对应数据库关系 mock.mock_group_strategy.create_time
     */
    private Date createTime;

    /**
     * 对应数据库关系 mock.mock_group_strategy.update_time
     */
    private Date updateTime;

    /**
     * 对应数据库关系 mock.mock_group_strategy.approver
     */
    private String approver;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getStrategy() {
        return strategy;
    }

    public void setStrategy(Integer strategy) {
        this.strategy = strategy;
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