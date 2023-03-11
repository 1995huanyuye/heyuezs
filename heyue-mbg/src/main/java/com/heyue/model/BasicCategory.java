package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class BasicCategory implements Serializable {
    private Long id;

    @ApiModelProperty(value = "基装定额类别名称")
    private String basicCategoryName;

    @ApiModelProperty(value = "基装定额类别编码")
    private String basicCategoryCode;

    @ApiModelProperty(value = "上级节点")
    private Long parentId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBasicCategoryName() {
        return basicCategoryName;
    }

    public void setBasicCategoryName(String basicCategoryName) {
        this.basicCategoryName = basicCategoryName;
    }

    public String getBasicCategoryCode() {
        return basicCategoryCode;
    }

    public void setBasicCategoryCode(String basicCategoryCode) {
        this.basicCategoryCode = basicCategoryCode;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", basicCategoryName=").append(basicCategoryName);
        sb.append(", basicCategoryCode=").append(basicCategoryCode);
        sb.append(", parentId=").append(parentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}