package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SpaceCategory implements Serializable {
    private Long id;

    @ApiModelProperty(value = "分类名称",position = 0)
    private String categoryName;

    @ApiModelProperty(value = "分类编码",position = 1)
    private String categoryCode;

    @ApiModelProperty(value = "空间类型 0：内部空间 1：代购空间",position = 2)
    private Integer type;

    @ApiModelProperty(value = "排序值",position = 3)
    private Integer sort;

    @ApiModelProperty(value = "最后一级才可以添加空间",position = 4)
    private String islast;

    @ApiModelProperty(value = "创建时间",position = 5)
    private Date creationtime;

    @ApiModelProperty(value = "创建人",position = 6)
    private Long creator;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIslast() {
        return islast;
    }

    public void setIslast(String islast) {
        this.islast = islast;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", categoryCode=").append(categoryCode);
        sb.append(", type=").append(type);
        sb.append(", sort=").append(sort);
        sb.append(", islast=").append(islast);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", creator=").append(creator);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}