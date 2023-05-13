package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;

public class MaterialCategory implements Serializable {
    private Long id;

    @ApiModelProperty(value = "材料定额类别名称")
    private String materialCategoryName;

    @ApiModelProperty(value = "材料定额类别编码")
    private String materialCategoryCode;

    @ApiModelProperty(value = "上级节点")
    private Long parentId;

    @ApiModelProperty(value = "是否根节点")
    private String isroot;

    @ApiModelProperty(value = "排序值")
    private Integer sort;

    private List<MaterialCategory> children;

    public List<MaterialCategory> getChildren() {
        return children;
    }

    public void setChildren(List<MaterialCategory> child) {
        this.children = child;
    }

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterialCategoryName() {
        return materialCategoryName;
    }

    public void setMaterialCategoryName(String materialCategoryName) {
        this.materialCategoryName = materialCategoryName;
    }

    public String getMaterialCategoryCode() {
        return materialCategoryCode;
    }

    public void setMaterialCategoryCode(String materialCategoryCode) {
        this.materialCategoryCode = materialCategoryCode;
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
        sb.append(", materialCategoryName=").append(materialCategoryName);
        sb.append(", materialCategoryCode=").append(materialCategoryCode);
        sb.append(", parentId=").append(parentId);
        sb.append(", isroot=").append(isroot);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}