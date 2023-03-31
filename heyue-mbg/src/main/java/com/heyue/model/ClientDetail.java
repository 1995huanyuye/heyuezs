package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ClientDetail implements Serializable {
    private Long id;

    private Long clientId;

    @ApiModelProperty(value = "报价类型",position = 0)
    private String quotationType;

    @ApiModelProperty(value = "装修类型",position = 1)
    private String decorationType;

    @ApiModelProperty(value = "交房状态",position = 2)
    private Integer deliveryStatus;

    @ApiModelProperty(value = "交房时间",position = 3)
    private Date deliveryTime;

    @ApiModelProperty(value = "预计开工日期",position = 4)
    private Date beginTime;

    @ApiModelProperty(value = "合同工期",position = 5)
    private Integer timeLimit;

    @ApiModelProperty(value = "性别",position = 6)
    private Integer sex;

    @ApiModelProperty(value = "客户生日",position = 7)
    private Date clientBirthday;

    @ApiModelProperty(value = "现居地址",position = 8)
    private String clientAddress;

    @ApiModelProperty(value = "约定交底日期",position = 9)
    private Date endTime;

    @ApiModelProperty(value = "录入人",position = 10)
    private Long modifyer;

    @ApiModelProperty(value = "是否公开",position = 11)
    private Integer ispublic;

    @ApiModelProperty(value = "客户分类",position = 12)
    private Integer type;

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

    public String getQuotationType() {
        return quotationType;
    }

    public void setQuotationType(String quotationType) {
        this.quotationType = quotationType;
    }

    public String getDecorationType() {
        return decorationType;
    }

    public void setDecorationType(String decorationType) {
        this.decorationType = decorationType;
    }

    public Integer getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(Integer deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getClientBirthday() {
        return clientBirthday;
    }

    public void setClientBirthday(Date clientBirthday) {
        this.clientBirthday = clientBirthday;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getModifyer() {
        return modifyer;
    }

    public void setModifyer(Long modifyer) {
        this.modifyer = modifyer;
    }

    public Integer getIspublic() {
        return ispublic;
    }

    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", clientId=").append(clientId);
        sb.append(", quotationType=").append(quotationType);
        sb.append(", decorationType=").append(decorationType);
        sb.append(", deliveryStatus=").append(deliveryStatus);
        sb.append(", deliveryTime=").append(deliveryTime);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", timeLimit=").append(timeLimit);
        sb.append(", sex=").append(sex);
        sb.append(", clientBirthday=").append(clientBirthday);
        sb.append(", clientAddress=").append(clientAddress);
        sb.append(", endTime=").append(endTime);
        sb.append(", modifyer=").append(modifyer);
        sb.append(", ispublic=").append(ispublic);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}