package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpaceItemConfig implements Serializable {
    private Long id;

    @ApiModelProperty(value = "空间id",position = 0)
    private Long spaceItemId;

    @ApiModelProperty(value = "关联基装或者材料目录id",position = 1)
    private Long spaceConfigId;

    @ApiModelProperty(value = "0：基装 1：材料",position = 2)
    private Integer type;

    @ApiModelProperty(value = "项目说明",position = 3)
    private String note;

    @ApiModelProperty(value = "排序",position = 4)
    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpaceItemId() {
        return spaceItemId;
    }

    public void setSpaceItemId(Long spaceItemId) {
        this.spaceItemId = spaceItemId;
    }

    public Long getSpaceConfigId() {
        return spaceConfigId;
    }

    public void setSpaceConfigId(Long spaceConfigId) {
        this.spaceConfigId = spaceConfigId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        sb.append(", spaceItemId=").append(spaceItemId);
        sb.append(", spaceConfigId=").append(spaceConfigId);
        sb.append(", type=").append(type);
        sb.append(", note=").append(note);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}