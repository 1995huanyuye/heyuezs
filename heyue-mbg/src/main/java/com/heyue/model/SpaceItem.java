package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpaceItem implements Serializable {
    private Long id;

    @ApiModelProperty(value = "空间分类id",position = 0)
    private Long categoryId;

    @ApiModelProperty(value = "空间名称",position = 1)
    private String spaceItemName;

    @ApiModelProperty(value = "空间编码",position = 2)
    private String spaceItemCode;

    @ApiModelProperty(value = "移入限制 0：不限制 1：套内空间 2：套外空间",position = 3)
    private Integer limit;

    @ApiModelProperty(value = "空间类型 0：清单空间 1：套餐空间 2：整装（基装包）3：整装（材料包）4：套餐包（新）",position = 4)
    private Integer spaceType;

    @ApiModelProperty(value = "备注说明",position = 5)
    private String note;

    @ApiModelProperty(value = "排序值",position = 6)
    private Integer sort;

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

    public String getSpaceItemName() {
        return spaceItemName;
    }

    public void setSpaceItemName(String spaceItemName) {
        this.spaceItemName = spaceItemName;
    }

    public String getSpaceItemCode() {
        return spaceItemCode;
    }

    public void setSpaceItemCode(String spaceItemCode) {
        this.spaceItemCode = spaceItemCode;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(Integer spaceType) {
        this.spaceType = spaceType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", spaceItemName=").append(spaceItemName);
        sb.append(", spaceItemCode=").append(spaceItemCode);
        sb.append(", limit=").append(limit);
        sb.append(", spaceType=").append(spaceType);
        sb.append(", note=").append(note);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}