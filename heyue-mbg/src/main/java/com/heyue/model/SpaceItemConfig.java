package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpaceItemConfig implements Serializable {
    private Long id;

    private String name;

    private int num;

    @ApiModelProperty(value = "空间id")
    private Long spaceItemId;

    @ApiModelProperty(value = "关联基装或者材料目录id ")
    private Long spaceConfigId;

    @ApiModelProperty(value = "0：基装 1：材料")
    private Integer type;

    @ApiModelProperty(value = "项目说明")
    private String note;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "定额：0：不选中 1：选中")
    private Integer quota;

    @ApiModelProperty(value = "定量：0：不选中 1：选中")
    private Integer quantify;

    @ApiModelProperty(value = "固定：0：不选中 1：选中")
    private Integer regular;

    @ApiModelProperty(value = "公式")
    private String formula;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

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

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Integer getQuantify() {
        return quantify;
    }

    public void setQuantify(Integer quantify) {
        this.quantify = quantify;
    }

    public Integer getRegular() {
        return regular;
    }

    public void setRegular(Integer regular) {
        this.regular = regular;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
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
        sb.append(", quota=").append(quota);
        sb.append(", quantify=").append(quantify);
        sb.append(", regular=").append(regular);
        sb.append(", formula=").append(formula);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}