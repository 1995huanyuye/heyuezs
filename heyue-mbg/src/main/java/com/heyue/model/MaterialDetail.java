package com.heyue.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class MaterialDetail implements Serializable {
    private Long id;

    @ApiModelProperty(value = "材料类型")
    private String materialType;

    @ApiModelProperty(value = "材料名称")
    private String materialNumber;

    @ApiModelProperty(value = "材料编码")
    private String materialName;

    @ApiModelProperty(value = "供应商")
    private Long supplierId;

    @ApiModelProperty(value = "工程阶段")
    private String engineeringStage;

    @ApiModelProperty(value = "成本价")
    private Double costPrice;

    @ApiModelProperty(value = "核算价")
    private Double accountingPrice;

    @ApiModelProperty(value = "销售价")
    private Double salesPrice;

    @ApiModelProperty(value = "最低售价")
    private Double lowestSellingPrice;

    @ApiModelProperty(value = "建议售价")
    private Double recommendedSellingPrice;

    @ApiModelProperty(value = "发包价")
    private Double contractPrice;

    @ApiModelProperty(value = "主单位（枚举展示）")
    private Integer mainUnit;

    @ApiModelProperty(value = "副单位（枚举展示）")
    private Integer deputyUnit;

    @ApiModelProperty(value = "品牌")
    private Long brandId;

    @ApiModelProperty(value = "型号")
    private Long modelId;

    @ApiModelProperty(value = "规格")
    private Long specifications;

    @ApiModelProperty(value = "颜色")
    private Long color;

    @ApiModelProperty(value = "公式")
    private String formula;

    @ApiModelProperty(value = "上架状态")
    private String shelfStatus;

    @ApiModelProperty(value = "漏项提醒")
    private String remind;

    @ApiModelProperty(value = "是否向上取整")
    private String roundUp;

    @ApiModelProperty(value = "项目说明")
    private String projectDescription;

    @ApiModelProperty(value = "计价说明")
    private String pricingInstructions;

    @ApiModelProperty(value = "验收标准")
    private String acceptanceCriteria;

    @ApiModelProperty(value = "上传图片")
    private byte[] image;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getEngineeringStage() {
        return engineeringStage;
    }

    public void setEngineeringStage(String engineeringStage) {
        this.engineeringStage = engineeringStage;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getAccountingPrice() {
        return accountingPrice;
    }

    public void setAccountingPrice(Double accountingPrice) {
        this.accountingPrice = accountingPrice;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Double getLowestSellingPrice() {
        return lowestSellingPrice;
    }

    public void setLowestSellingPrice(Double lowestSellingPrice) {
        this.lowestSellingPrice = lowestSellingPrice;
    }

    public Double getRecommendedSellingPrice() {
        return recommendedSellingPrice;
    }

    public void setRecommendedSellingPrice(Double recommendedSellingPrice) {
        this.recommendedSellingPrice = recommendedSellingPrice;
    }

    public Double getContractPrice() {
        return contractPrice;
    }

    public void setContractPrice(Double contractPrice) {
        this.contractPrice = contractPrice;
    }

    public Integer getMainUnit() {
        return mainUnit;
    }

    public void setMainUnit(Integer mainUnit) {
        this.mainUnit = mainUnit;
    }

    public Integer getDeputyUnit() {
        return deputyUnit;
    }

    public void setDeputyUnit(Integer deputyUnit) {
        this.deputyUnit = deputyUnit;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Long specifications) {
        this.specifications = specifications;
    }

    public Long getColor() {
        return color;
    }

    public void setColor(Long color) {
        this.color = color;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getShelfStatus() {
        return shelfStatus;
    }

    public void setShelfStatus(String shelfStatus) {
        this.shelfStatus = shelfStatus;
    }

    public String getRemind() {
        return remind;
    }

    public void setRemind(String remind) {
        this.remind = remind;
    }

    public String getRoundUp() {
        return roundUp;
    }

    public void setRoundUp(String roundUp) {
        this.roundUp = roundUp;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getPricingInstructions() {
        return pricingInstructions;
    }

    public void setPricingInstructions(String pricingInstructions) {
        this.pricingInstructions = pricingInstructions;
    }

    public String getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", materialType=").append(materialType);
        sb.append(", materialNumber=").append(materialNumber);
        sb.append(", materialName=").append(materialName);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", engineeringStage=").append(engineeringStage);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", accountingPrice=").append(accountingPrice);
        sb.append(", salesPrice=").append(salesPrice);
        sb.append(", lowestSellingPrice=").append(lowestSellingPrice);
        sb.append(", recommendedSellingPrice=").append(recommendedSellingPrice);
        sb.append(", contractPrice=").append(contractPrice);
        sb.append(", mainUnit=").append(mainUnit);
        sb.append(", deputyUnit=").append(deputyUnit);
        sb.append(", brandId=").append(brandId);
        sb.append(", modelId=").append(modelId);
        sb.append(", specifications=").append(specifications);
        sb.append(", color=").append(color);
        sb.append(", formula=").append(formula);
        sb.append(", shelfStatus=").append(shelfStatus);
        sb.append(", remind=").append(remind);
        sb.append(", roundUp=").append(roundUp);
        sb.append(", projectDescription=").append(projectDescription);
        sb.append(", pricingInstructions=").append(pricingInstructions);
        sb.append(", acceptanceCriteria=").append(acceptanceCriteria);
        sb.append(", image=").append(image);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}