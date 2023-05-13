package com.heyue.model;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.heyue.util.RoundUpConverter;
import com.heyue.util.UnitConverter;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class MaterialDetail implements Serializable {
    @ExcelIgnore
    private Long id;
    @ExcelIgnore
    private Long categoryId;
    @ExcelProperty("定额名称")
    @ApiModelProperty(value = "定额名称")
    private String materialNumber;
    @ExcelProperty("定额分类")
    @ApiModelProperty(value = "定额分类")
    private String materialClassification;
    @ExcelProperty("材料类型")
    @ApiModelProperty(value = "材料类型")
    private String materialType;
    @ExcelProperty("定额编号")
    @ApiModelProperty(value = "定额编号")
    private String materialCode;
    @ExcelProperty(value = "计量单位",converter = UnitConverter.class)
    @ApiModelProperty(value = "计量单位")
    private Integer unit;
    @ExcelProperty(value = "计价数量向上取整",converter = RoundUpConverter.class)
    @ApiModelProperty(value = "计价数量向上取整")
    private Integer roundUp;
    @ExcelProperty("材料成本")
    @ApiModelProperty(value = "材料成本")
    private Double materialCost;
    @ExcelProperty("材料售价")
    @ApiModelProperty(value = "材料售价")
    private Double materialPrice;
    @ExcelProperty("材料损耗率")
    @ApiModelProperty(value = "材料损耗率")
    private Double materialWastageRate;
    @ExcelProperty("品牌")
    @ApiModelProperty(value = "品牌")
    private String brand;
    @ExcelProperty("型号")
    @ApiModelProperty(value = "型号")
    private String modelNumber;
    @ExcelProperty("规格")
    @ApiModelProperty(value = "规格")
    private String specification;
    @ExcelProperty("颜色")
    @ApiModelProperty(value = "颜色")
    private String color;
    @ExcelProperty("供应商")
    @ApiModelProperty(value = "供应商")
    private String supplier;
    @ExcelProperty("工程阶段")
    @ApiModelProperty(value = "工程阶段")
    private Integer engineeringStage;
    @ExcelProperty("施工类型")
    @ApiModelProperty(value = "施工类型")
    private Integer constructionType;
    @ExcelProperty("施工工艺、材料说明")
    @ApiModelProperty(value = "施工工艺、材料说明")
    private String materialDescription;
    @ExcelIgnore
    @ApiModelProperty(value = "图片")
    private String image;
    @ExcelProperty("上架状态")
    @ApiModelProperty(value = "上架状态")
    private String shelfStatus;
    @ExcelProperty("排序")
    @ApiModelProperty(value = "排序")
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

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getMaterialClassification() {
        return materialClassification;
    }

    public void setMaterialClassification(String materialClassification) {
        this.materialClassification = materialClassification;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
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

    public Double getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(Double materialCost) {
        this.materialCost = materialCost;
    }

    public Double getMaterialPrice() {
        return materialPrice;
    }

    public void setMaterialPrice(Double materialPrice) {
        this.materialPrice = materialPrice;
    }

    public Double getMaterialWastageRate() {
        return materialWastageRate;
    }

    public void setMaterialWastageRate(Double materialWastageRate) {
        this.materialWastageRate = materialWastageRate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
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

    public String getShelfStatus() {
        return shelfStatus;
    }

    public void setShelfStatus(String shelfStatus) {
        this.shelfStatus = shelfStatus;
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
        sb.append(", materialNumber=").append(materialNumber);
        sb.append(", materialClassification=").append(materialClassification);
        sb.append(", materialType=").append(materialType);
        sb.append(", materialCode=").append(materialCode);
        sb.append(", unit=").append(unit);
        sb.append(", roundUp=").append(roundUp);
        sb.append(", materialCost=").append(materialCost);
        sb.append(", materialPrice=").append(materialPrice);
        sb.append(", materialWastageRate=").append(materialWastageRate);
        sb.append(", brand=").append(brand);
        sb.append(", modelNumber=").append(modelNumber);
        sb.append(", specification=").append(specification);
        sb.append(", color=").append(color);
        sb.append(", supplier=").append(supplier);
        sb.append(", engineeringStage=").append(engineeringStage);
        sb.append(", constructionType=").append(constructionType);
        sb.append(", materialDescription=").append(materialDescription);
        sb.append(", image=").append(image);
        sb.append(", shelfStatus=").append(shelfStatus);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}