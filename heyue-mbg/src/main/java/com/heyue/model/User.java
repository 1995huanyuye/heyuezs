package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class User implements Serializable {
    @ApiModelProperty(value = "主键",position = 0)
    private Long id;

    @ApiModelProperty(value = "用户名",position = 1)
    private String userCode;

    @ApiModelProperty(value = "用户姓名",position = 2)
    private String userName;

    @ApiModelProperty(value = "性别",position = 3)
    private Integer sex;

    @ApiModelProperty(value = "手机号码",position = 4)
    private String phoneNumber;

    @ApiModelProperty(value = "角色",position = 5)
    private Long roleId;

    @ApiModelProperty(value = "状态",position = 6)
    private Integer status;

    @ApiModelProperty(value = "用户密码",position = 7)
    private String password;

    @ApiModelProperty(value = "用户账号",position = 8)
    private String userAccount;

    @ApiModelProperty(value = "所属部门",position = 9)
    private Long dept;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Long getDept() {
        return dept;
    }

    public void setDept(Long dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userCode=").append(userCode);
        sb.append(", userName=").append(userName);
        sb.append(", sex=").append(sex);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", roleId=").append(roleId);
        sb.append(", status=").append(status);
        sb.append(", password=").append(password);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", dept=").append(dept);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}