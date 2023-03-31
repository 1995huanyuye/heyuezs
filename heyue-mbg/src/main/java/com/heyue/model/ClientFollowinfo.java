package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ClientFollowinfo implements Serializable {
    private Long id;

    private Long clientId;

    @ApiModelProperty(value = "跟单业务部门",position = 0)
    private String followDept;

    @ApiModelProperty(value = "跟单人员",position = 1)
    private String userId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getFollowDept() {
        return followDept;
    }

    public void setFollowDept(String followDept) {
        this.followDept = followDept;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", clientId=").append(clientId);
        sb.append(", followDept=").append(followDept);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}