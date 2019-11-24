package com.personal.mock.po;

import java.io.Serializable;
import java.util.Date;

public class MockAppStrategy implements Serializable {
    /**
     * 对应数据库关系 mock.mock_app_strategy.id
     */
    private Integer id;

    /**
     * 对应数据库关系 mock.mock_app_strategy.app_id
     */
    private Integer appId;

    /**
     * 对应数据库关系 mock.mock_app_strategy.strategy_id
     */
    private Integer strategyId;

    /**
     * 对应数据库关系 mock.mock_app_strategy.create_time
     */
    private Date createTime;

    /**
     * 对应数据库关系 mock.mock_app_strategy.update_time
     */
    private Date updateTime;

    /**
     * 对应数据库关系 mock.mock_app_strategy.approver
     */
    private String approver;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Integer strategyId) {
        this.strategyId = strategyId;
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