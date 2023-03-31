package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Client implements Serializable {
    @ApiModelProperty(value = "主键",position = 0)
    private Long id;

    @ApiModelProperty(value = "业主姓名",position = 1)
    private String clientName;

    @ApiModelProperty(value = "电话",position = 2)
    private String telephone;

    @ApiModelProperty(value = "客户来源",position = 3)
    private Integer clientResource;

    @ApiModelProperty(value = "提供者",position = 4)
    private Long provider;

    @ApiModelProperty(value = "备用电话",position = 5)
    private String vote;

    @ApiModelProperty(value = "所在楼盘",position = 6)
    private String location;

    @ApiModelProperty(value = "项目名称",position = 6)
    private String projectName;

    @ApiModelProperty(value = "项目地址",position = 7)
    private String projectAddress;

    @ApiModelProperty(value = "套内面积",position = 8)
    private Float inArea;

    @ApiModelProperty(value = "面积",position = 9)
    private Float area;

    @ApiModelProperty(value = "房屋户型",position = 10)
    private String type;

    @ApiModelProperty(value = "客户备注",position = 11)
    private String note;

    @ApiModelProperty(value = "财务备注",position = 12)
    private String fiNote;

    @ApiModelProperty(value = "工程备注",position = 13)
    private String projectNote;

    @ApiModelProperty(value = "材料备注",position = 14)
    private String materialNote;

    @ApiModelProperty(value = "其他备注",position = 15)
    private String otherNote;

    @ApiModelProperty(value = "客户状态",position = 16)
    private Integer status;

    @ApiModelProperty(value = "创建时间",position = 17)
    private Date creationtime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getClientResource() {
        return clientResource;
    }

    public void setClientResource(Integer clientResource) {
        this.clientResource = clientResource;
    }

    public Long getProvider() {
        return provider;
    }

    public void setProvider(Long provider) {
        this.provider = provider;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public Float getInArea() {
        return inArea;
    }

    public void setInArea(Float inArea) {
        this.inArea = inArea;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public String getFiNote() {
        return fiNote;
    }

    public void setFiNote(String fiNote) {
        this.fiNote = fiNote;
    }

    public String getProjectNote() {
        return projectNote;
    }

    public void setProjectNote(String projectNote) {
        this.projectNote = projectNote;
    }

    public String getMaterialNote() {
        return materialNote;
    }

    public void setMaterialNote(String materialNote) {
        this.materialNote = materialNote;
    }

    public String getOtherNote() {
        return otherNote;
    }

    public void setOtherNote(String otherNote) {
        this.otherNote = otherNote;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", clientName=").append(clientName);
        sb.append(", telephone=").append(telephone);
        sb.append(", clientResource=").append(clientResource);
        sb.append(", provider=").append(provider);
        sb.append(", vote=").append(vote);
        sb.append(", location=").append(location);
        sb.append(", projectName=").append(projectName);
        sb.append(", projectAddress=").append(projectAddress);
        sb.append(", inArea=").append(inArea);
        sb.append(", area=").append(area);
        sb.append(", type=").append(type);
        sb.append(", note=").append(note);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", fiNote=").append(fiNote);
        sb.append(", projectNote=").append(projectNote);
        sb.append(", materialNote=").append(materialNote);
        sb.append(", otherNote=").append(otherNote);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}