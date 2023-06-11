package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpaceItemParam implements Serializable {
    private Long id;

    @ApiModelProperty(value = "参数id",position = 0)
    private Long spaceParamId;

    @ApiModelProperty(value = "空间主键",position = 1)
    private Long spaceItemId;

    @ApiModelProperty(value = "数值",position = 2)
    private String num;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpaceParamId() {
        return spaceParamId;
    }

    public void setSpaceParamId(Long spaceParamId) {
        this.spaceParamId = spaceParamId;
    }

    public Long getSpaceItemId() {
        return spaceItemId;
    }

    public void setSpaceItemId(Long spaceItemId) {
        this.spaceItemId = spaceItemId;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", spaceParamId=").append(spaceParamId);
        sb.append(", spaceItemId=").append(spaceItemId);
        sb.append(", num=").append(num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}