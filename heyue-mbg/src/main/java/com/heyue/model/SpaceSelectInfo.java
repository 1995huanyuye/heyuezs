package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpaceSelectInfo implements Serializable {
    private Long id;

    @ApiModelProperty(value = "空间模板")
    private Long spaceItemId;

    @ApiModelProperty(value = "0:基装项目 1：材料项目")
    private Integer type;

    @ApiModelProperty(value = "基装或材料项目的主键")
    private Long selectedId;

    @ApiModelProperty(value = "是否以选择：默认0为不选择，1为选择")
    private Integer isselected;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(Long selectedId) {
        this.selectedId = selectedId;
    }

    public Integer getIsselected() {
        return isselected;
    }

    public void setIsselected(Integer isselected) {
        this.isselected = isselected;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", spaceItemId=").append(spaceItemId);
        sb.append(", type=").append(type);
        sb.append(", selectedId=").append(selectedId);
        sb.append(", isselected=").append(isselected);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}