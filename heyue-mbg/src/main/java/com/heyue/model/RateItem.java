package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class RateItem implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "费率名称")
    private String name;

    @ApiModelProperty(value = "计算方式")
    private String calcType;

    @ApiModelProperty(value = "公式")
    private String formula;

    @ApiModelProperty(value = "折扣")
    private String discount;

    @ApiModelProperty(value = "说明")
    private String show;

    @ApiModelProperty(value = "成本方式")
    private String costType;

    @ApiModelProperty(value = "成本占比")
    private String costPercent;

    @ApiModelProperty(value = "排序值")
    private String sortValue;

    @ApiModelProperty(value = "更新时间")
    private Date modifytime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCalcType() {
        return calcType;
    }

    public void setCalcType(String calcType) {
        this.calcType = calcType;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public String getCostPercent() {
        return costPercent;
    }

    public void setCostPercent(String costPercent) {
        this.costPercent = costPercent;
    }

    public String getSortValue() {
        return sortValue;
    }

    public void setSortValue(String sortValue) {
        this.sortValue = sortValue;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", calcType=").append(calcType);
        sb.append(", formula=").append(formula);
        sb.append(", discount=").append(discount);
        sb.append(", show=").append(show);
        sb.append(", costType=").append(costType);
        sb.append(", costPercent=").append(costPercent);
        sb.append(", sortValue=").append(sortValue);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}