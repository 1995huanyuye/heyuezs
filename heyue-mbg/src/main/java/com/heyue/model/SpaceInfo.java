package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpaceInfo implements Serializable {
    private Long id;

    private Long categoryId;

    @ApiModelProperty(value = "空间名称 ")
    private String spaceName;

    @ApiModelProperty(value = "空间编码")
    private String spaceCode;

    @ApiModelProperty(value = "移入限制")
    private String limit;

    @ApiModelProperty(value = "空间类型")
    private String spaceType;

    @ApiModelProperty(value = "备注说明")
    private String note;

    @ApiModelProperty(value = "排序值")
    private String sortValue;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public String getSpaceCode() {
        return spaceCode;
    }

    public void setSpaceCode(String spaceCode) {
        this.spaceCode = spaceCode;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        sb.append(", categoryId=").append(categoryId);
        sb.append(", spaceName=").append(spaceName);
        sb.append(", spaceCode=").append(spaceCode);
        sb.append(", limit=").append(limit);
        sb.append(", spaceType=").append(spaceType);
        sb.append(", note=").append(note);
        sb.append(", sortValue=").append(sortValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}