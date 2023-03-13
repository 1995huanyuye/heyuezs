package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpaceCategory implements Serializable {
    private Long id;

    @ApiModelProperty(value = "空间分类名称")
    private String spaceCategoryName;

    @ApiModelProperty(value = "空间类型")
    private String spaceType;

    @ApiModelProperty(value = "上级节点")
    private String parentid;

    @ApiModelProperty(value = "是否根节点")
    private String isroot;

    @ApiModelProperty(value = "排序值")
    private String sortValue;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpaceCategoryName() {
        return spaceCategoryName;
    }

    public void setSpaceCategoryName(String spaceCategoryName) {
        this.spaceCategoryName = spaceCategoryName;
    }

    public String getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getIsroot() {
        return isroot;
    }

    public void setIsroot(String isroot) {
        this.isroot = isroot;
    }

    public String getSortValue() {
        return sortValue;
    }

    public void setSortValue(String sortValue) {
        this.sortValue = sortValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", spaceCategoryName=").append(spaceCategoryName);
        sb.append(", spaceType=").append(spaceType);
        sb.append(", parentid=").append(parentid);
        sb.append(", isroot=").append(isroot);
        sb.append(", sortValue=").append(sortValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}