package com.personal.mock.po;

import java.io.Serializable;
import java.util.Date;

public class MockGroup implements Serializable {
    /**
     * 对应数据库关系 mock.mock_group.id
     */
    private Integer id;

    /**
     * 对应数据库关系 mock.mock_group.name
     */
    private String name;

    /**
     * 对应数据库关系 mock.mock_group.description
     */
    private String description;

    /**
     * 对应数据库关系 mock.mock_group.is_active
     */
    private Boolean isActive;

    /**
     * 对应数据库关系 mock.mock_group.create_time
     */
    private Date createTime;

    /**
     * 对应数据库关系 mock.mock_group.update_time
     */
    private Date updateTime;

    /**
     * 对应数据库关系 mock.mock_group.approver
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

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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