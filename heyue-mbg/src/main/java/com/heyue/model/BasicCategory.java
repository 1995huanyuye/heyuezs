package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;

public class BasicCategory implements Serializable {
    private Long id;

    @ApiModelProperty(value = "基装定额类别名称")
    private String basicCategoryName;

    @ApiModelProperty(value = "基装定额类别编码")
    private String basicCategoryCode;

    @ApiModelProperty(value = "上级节点")
    private Long parentId;

    @ApiModelProperty(value = "是否根节点")
    private String isroot;

    @ApiModelProperty(value = "排序值")
    private Integer sort;

    private List<BasicCategory> children;

    public List<BasicCategory> getChildren() {
        return children;
    }

    public void setChildren(List<BasicCategory> child) {
        this.children = child;
    }

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

    public String getIsroot() {
        return isroot;
    }

    public void setIsroot(String isroot) {
        this.isroot = isroot;
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
        sb.append(", basicCategoryName=").append(basicCategoryName);
        sb.append(", basicCategoryCode=").append(basicCategoryCode);
        sb.append(", parentId=").append(parentId);
        sb.append(", isroot=").append(isroot);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}