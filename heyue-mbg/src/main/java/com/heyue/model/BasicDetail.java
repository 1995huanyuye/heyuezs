package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class BasicDetail implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    private Long categoryId;

    @ApiModelProperty(value = "定额分类")
    private String detailType;

    @ApiModelProperty(value = "定额名称")
    private String detailName;

    @ApiModelProperty(value = "定额编号")
    private String detailCode;

    @ApiModelProperty(value = "计价单位")
    private Integer unit;

    @ApiModelProperty(value = "计价数量向上取整")
    private Integer roundUp;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "人工成本")
    private Double laborCost;

    @ApiModelProperty(value = "辅料成本")
    private Double auxiliaryMaterialCost;

    @ApiModelProperty(value = "人工售价")
    private Double laborPrice;

    @ApiModelProperty(value = "辅料售价")
    private Double accessoriesPrice;

    @ApiModelProperty(value = "辅材损耗率")
    private Double auxiliaryMaterialLossRate;

    @ApiModelProperty(value = "工程阶段")
    private Integer engineeringStage;

    @ApiModelProperty(value = "施工类型")
    private Integer constructionType;

    @ApiModelProperty(value = "施工工艺、材料说明")
    private String materialDescription;

    @ApiModelProperty(value = "图片")
    private String image;

    @ApiModelProperty(value = "上架状态")
    private Integer shelfStatus;

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

    public String getDetailType() {
        return detailType;
    }

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public String getDetailCode() {
        return detailCode;
    }

    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getRoundUp() {
        return roundUp;
    }

    public void setRoundUp(Integer roundUp) {
        this.roundUp = roundUp;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Double getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(Double laborCost) {
        this.laborCost = laborCost;
    }

    public Double getAuxiliaryMaterialCost() {
        return auxiliaryMaterialCost;
    }

    public void setAuxiliaryMaterialCost(Double auxiliaryMaterialCost) {
        this.auxiliaryMaterialCost = auxiliaryMaterialCost;
    }

    public Double getLaborPrice() {
        return laborPrice;
    }

    public void setLaborPrice(Double laborPrice) {
        this.laborPrice = laborPrice;
    }

    public Double getAccessoriesPrice() {
        return accessoriesPrice;
    }

    public void setAccessoriesPrice(Double accessoriesPrice) {
        this.accessoriesPrice = accessoriesPrice;
    }

    public Double getAuxiliaryMaterialLossRate() {
        return auxiliaryMaterialLossRate;
    }

    public void setAuxiliaryMaterialLossRate(Double auxiliaryMaterialLossRate) {
        this.auxiliaryMaterialLossRate = auxiliaryMaterialLossRate;
    }

    public Integer getEngineeringStage() {
        return engineeringStage;
    }

    public void setEngineeringStage(Integer engineeringStage) {
        this.engineeringStage = engineeringStage;
    }

    public Integer getConstructionType() {
        return constructionType;
    }

    public void setConstructionType(Integer constructionType) {
        this.constructionType = constructionType;
    }

    public String getMaterialDescription() {
        return materialDescription;
    }

    public void setMaterialDescription(String materialDescription) {
        this.materialDescription = materialDescription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getShelfStatus() {
        return shelfStatus;
    }

    public void setShelfStatus(Integer shelfStatus) {
        this.shelfStatus = shelfStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", detailType=").append(detailType);
        sb.append(", detailName=").append(detailName);
        sb.append(", detailCode=").append(detailCode);
        sb.append(", unit=").append(unit);
        sb.append(", roundUp=").append(roundUp);
        sb.append(", sort=").append(sort);
        sb.append(", laborCost=").append(laborCost);
        sb.append(", auxiliaryMaterialCost=").append(auxiliaryMaterialCost);
        sb.append(", laborPrice=").append(laborPrice);
        sb.append(", accessoriesPrice=").append(accessoriesPrice);
        sb.append(", auxiliaryMaterialLossRate=").append(auxiliaryMaterialLossRate);
        sb.append(", engineeringStage=").append(engineeringStage);
        sb.append(", constructionType=").append(constructionType);
        sb.append(", materialDescription=").append(materialDescription);
        sb.append(", image=").append(image);
        sb.append(", shelfStatus=").append(shelfStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}