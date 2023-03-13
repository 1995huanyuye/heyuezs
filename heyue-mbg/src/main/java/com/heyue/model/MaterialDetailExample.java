package com.heyue.model;

import java.util.ArrayList;
import java.util.List;

public class MaterialDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialDetailExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNull() {
            addCriterion("material_type is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNotNull() {
            addCriterion("material_type is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeEqualTo(String value) {
            addCriterion("material_type =", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotEqualTo(String value) {
            addCriterion("material_type <>", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThan(String value) {
            addCriterion("material_type >", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("material_type >=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThan(String value) {
            addCriterion("material_type <", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThanOrEqualTo(String value) {
            addCriterion("material_type <=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLike(String value) {
            addCriterion("material_type like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotLike(String value) {
            addCriterion("material_type not like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIn(List<String> values) {
            addCriterion("material_type in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotIn(List<String> values) {
            addCriterion("material_type not in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeBetween(String value1, String value2) {
            addCriterion("material_type between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotBetween(String value1, String value2) {
            addCriterion("material_type not between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberIsNull() {
            addCriterion("material_number is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberIsNotNull() {
            addCriterion("material_number is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberEqualTo(String value) {
            addCriterion("material_number =", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotEqualTo(String value) {
            addCriterion("material_number <>", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberGreaterThan(String value) {
            addCriterion("material_number >", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("material_number >=", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberLessThan(String value) {
            addCriterion("material_number <", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberLessThanOrEqualTo(String value) {
            addCriterion("material_number <=", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberLike(String value) {
            addCriterion("material_number like", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotLike(String value) {
            addCriterion("material_number not like", value, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberIn(List<String> values) {
            addCriterion("material_number in", values, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotIn(List<String> values) {
            addCriterion("material_number not in", values, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberBetween(String value1, String value2) {
            addCriterion("material_number between", value1, value2, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNumberNotBetween(String value1, String value2) {
            addCriterion("material_number not between", value1, value2, "materialNumber");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Long value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Long value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Long value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Long value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Long> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Long> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Long value1, Long value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageIsNull() {
            addCriterion("engineering_stage is null");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageIsNotNull() {
            addCriterion("engineering_stage is not null");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageEqualTo(String value) {
            addCriterion("engineering_stage =", value, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageNotEqualTo(String value) {
            addCriterion("engineering_stage <>", value, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageGreaterThan(String value) {
            addCriterion("engineering_stage >", value, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageGreaterThanOrEqualTo(String value) {
            addCriterion("engineering_stage >=", value, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageLessThan(String value) {
            addCriterion("engineering_stage <", value, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageLessThanOrEqualTo(String value) {
            addCriterion("engineering_stage <=", value, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageLike(String value) {
            addCriterion("engineering_stage like", value, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageNotLike(String value) {
            addCriterion("engineering_stage not like", value, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageIn(List<String> values) {
            addCriterion("engineering_stage in", values, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageNotIn(List<String> values) {
            addCriterion("engineering_stage not in", values, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageBetween(String value1, String value2) {
            addCriterion("engineering_stage between", value1, value2, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageNotBetween(String value1, String value2) {
            addCriterion("engineering_stage not between", value1, value2, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(Double value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(Double value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(Double value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(Double value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(Double value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<Double> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<Double> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(Double value1, Double value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(Double value1, Double value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andAccountingPriceIsNull() {
            addCriterion("accounting_price is null");
            return (Criteria) this;
        }

        public Criteria andAccountingPriceIsNotNull() {
            addCriterion("accounting_price is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingPriceEqualTo(Double value) {
            addCriterion("accounting_price =", value, "accountingPrice");
            return (Criteria) this;
        }

        public Criteria andAccountingPriceNotEqualTo(Double value) {
            addCriterion("accounting_price <>", value, "accountingPrice");
            return (Criteria) this;
        }

        public Criteria andAccountingPriceGreaterThan(Double value) {
            addCriterion("accounting_price >", value, "accountingPrice");
            return (Criteria) this;
        }

        public Criteria andAccountingPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("accounting_price >=", value, "accountingPrice");
            return (Criteria) this;
        }

        public Criteria andAccountingPriceLessThan(Double value) {
            addCriterion("accounting_price <", value, "accountingPrice");
            return (Criteria) this;
        }

        public Criteria andAccountingPriceLessThanOrEqualTo(Double value) {
            addCriterion("accounting_price <=", value, "accountingPrice");
            return (Criteria) this;
        }

        public Criteria andAccountingPriceIn(List<Double> values) {
            addCriterion("accounting_price in", values, "accountingPrice");
            return (Criteria) this;
        }

        public Criteria andAccountingPriceNotIn(List<Double> values) {
            addCriterion("accounting_price not in", values, "accountingPrice");
            return (Criteria) this;
        }

        public Criteria andAccountingPriceBetween(Double value1, Double value2) {
            addCriterion("accounting_price between", value1, value2, "accountingPrice");
            return (Criteria) this;
        }

        public Criteria andAccountingPriceNotBetween(Double value1, Double value2) {
            addCriterion("accounting_price not between", value1, value2, "accountingPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIsNull() {
            addCriterion("sales_price is null");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIsNotNull() {
            addCriterion("sales_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPriceEqualTo(Double value) {
            addCriterion("sales_price =", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotEqualTo(Double value) {
            addCriterion("sales_price <>", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceGreaterThan(Double value) {
            addCriterion("sales_price >", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sales_price >=", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLessThan(Double value) {
            addCriterion("sales_price <", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLessThanOrEqualTo(Double value) {
            addCriterion("sales_price <=", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIn(List<Double> values) {
            addCriterion("sales_price in", values, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotIn(List<Double> values) {
            addCriterion("sales_price not in", values, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceBetween(Double value1, Double value2) {
            addCriterion("sales_price between", value1, value2, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotBetween(Double value1, Double value2) {
            addCriterion("sales_price not between", value1, value2, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andLowestSellingPriceIsNull() {
            addCriterion("lowest_selling_price is null");
            return (Criteria) this;
        }

        public Criteria andLowestSellingPriceIsNotNull() {
            addCriterion("lowest_selling_price is not null");
            return (Criteria) this;
        }

        public Criteria andLowestSellingPriceEqualTo(Double value) {
            addCriterion("lowest_selling_price =", value, "lowestSellingPrice");
            return (Criteria) this;
        }

        public Criteria andLowestSellingPriceNotEqualTo(Double value) {
            addCriterion("lowest_selling_price <>", value, "lowestSellingPrice");
            return (Criteria) this;
        }

        public Criteria andLowestSellingPriceGreaterThan(Double value) {
            addCriterion("lowest_selling_price >", value, "lowestSellingPrice");
            return (Criteria) this;
        }

        public Criteria andLowestSellingPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("lowest_selling_price >=", value, "lowestSellingPrice");
            return (Criteria) this;
        }

        public Criteria andLowestSellingPriceLessThan(Double value) {
            addCriterion("lowest_selling_price <", value, "lowestSellingPrice");
            return (Criteria) this;
        }

        public Criteria andLowestSellingPriceLessThanOrEqualTo(Double value) {
            addCriterion("lowest_selling_price <=", value, "lowestSellingPrice");
            return (Criteria) this;
        }

        public Criteria andLowestSellingPriceIn(List<Double> values) {
            addCriterion("lowest_selling_price in", values, "lowestSellingPrice");
            return (Criteria) this;
        }

        public Criteria andLowestSellingPriceNotIn(List<Double> values) {
            addCriterion("lowest_selling_price not in", values, "lowestSellingPrice");
            return (Criteria) this;
        }

        public Criteria andLowestSellingPriceBetween(Double value1, Double value2) {
            addCriterion("lowest_selling_price between", value1, value2, "lowestSellingPrice");
            return (Criteria) this;
        }

        public Criteria andLowestSellingPriceNotBetween(Double value1, Double value2) {
            addCriterion("lowest_selling_price not between", value1, value2, "lowestSellingPrice");
            return (Criteria) this;
        }

        public Criteria andRecommendedSellingPriceIsNull() {
            addCriterion("recommended_selling_price is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedSellingPriceIsNotNull() {
            addCriterion("recommended_selling_price is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedSellingPriceEqualTo(Double value) {
            addCriterion("recommended_selling_price =", value, "recommendedSellingPrice");
            return (Criteria) this;
        }

        public Criteria andRecommendedSellingPriceNotEqualTo(Double value) {
            addCriterion("recommended_selling_price <>", value, "recommendedSellingPrice");
            return (Criteria) this;
        }

        public Criteria andRecommendedSellingPriceGreaterThan(Double value) {
            addCriterion("recommended_selling_price >", value, "recommendedSellingPrice");
            return (Criteria) this;
        }

        public Criteria andRecommendedSellingPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("recommended_selling_price >=", value, "recommendedSellingPrice");
            return (Criteria) this;
        }

        public Criteria andRecommendedSellingPriceLessThan(Double value) {
            addCriterion("recommended_selling_price <", value, "recommendedSellingPrice");
            return (Criteria) this;
        }

        public Criteria andRecommendedSellingPriceLessThanOrEqualTo(Double value) {
            addCriterion("recommended_selling_price <=", value, "recommendedSellingPrice");
            return (Criteria) this;
        }

        public Criteria andRecommendedSellingPriceIn(List<Double> values) {
            addCriterion("recommended_selling_price in", values, "recommendedSellingPrice");
            return (Criteria) this;
        }

        public Criteria andRecommendedSellingPriceNotIn(List<Double> values) {
            addCriterion("recommended_selling_price not in", values, "recommendedSellingPrice");
            return (Criteria) this;
        }

        public Criteria andRecommendedSellingPriceBetween(Double value1, Double value2) {
            addCriterion("recommended_selling_price between", value1, value2, "recommendedSellingPrice");
            return (Criteria) this;
        }

        public Criteria andRecommendedSellingPriceNotBetween(Double value1, Double value2) {
            addCriterion("recommended_selling_price not between", value1, value2, "recommendedSellingPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceIsNull() {
            addCriterion("contract_price is null");
            return (Criteria) this;
        }

        public Criteria andContractPriceIsNotNull() {
            addCriterion("contract_price is not null");
            return (Criteria) this;
        }

        public Criteria andContractPriceEqualTo(Double value) {
            addCriterion("contract_price =", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceNotEqualTo(Double value) {
            addCriterion("contract_price <>", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceGreaterThan(Double value) {
            addCriterion("contract_price >", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("contract_price >=", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceLessThan(Double value) {
            addCriterion("contract_price <", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceLessThanOrEqualTo(Double value) {
            addCriterion("contract_price <=", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceIn(List<Double> values) {
            addCriterion("contract_price in", values, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceNotIn(List<Double> values) {
            addCriterion("contract_price not in", values, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceBetween(Double value1, Double value2) {
            addCriterion("contract_price between", value1, value2, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceNotBetween(Double value1, Double value2) {
            addCriterion("contract_price not between", value1, value2, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andMainUnitIsNull() {
            addCriterion("main_unit is null");
            return (Criteria) this;
        }

        public Criteria andMainUnitIsNotNull() {
            addCriterion("main_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMainUnitEqualTo(Integer value) {
            addCriterion("main_unit =", value, "mainUnit");
            return (Criteria) this;
        }

        public Criteria andMainUnitNotEqualTo(Integer value) {
            addCriterion("main_unit <>", value, "mainUnit");
            return (Criteria) this;
        }

        public Criteria andMainUnitGreaterThan(Integer value) {
            addCriterion("main_unit >", value, "mainUnit");
            return (Criteria) this;
        }

        public Criteria andMainUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("main_unit >=", value, "mainUnit");
            return (Criteria) this;
        }

        public Criteria andMainUnitLessThan(Integer value) {
            addCriterion("main_unit <", value, "mainUnit");
            return (Criteria) this;
        }

        public Criteria andMainUnitLessThanOrEqualTo(Integer value) {
            addCriterion("main_unit <=", value, "mainUnit");
            return (Criteria) this;
        }

        public Criteria andMainUnitIn(List<Integer> values) {
            addCriterion("main_unit in", values, "mainUnit");
            return (Criteria) this;
        }

        public Criteria andMainUnitNotIn(List<Integer> values) {
            addCriterion("main_unit not in", values, "mainUnit");
            return (Criteria) this;
        }

        public Criteria andMainUnitBetween(Integer value1, Integer value2) {
            addCriterion("main_unit between", value1, value2, "mainUnit");
            return (Criteria) this;
        }

        public Criteria andMainUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("main_unit not between", value1, value2, "mainUnit");
            return (Criteria) this;
        }

        public Criteria andDeputyUnitIsNull() {
            addCriterion("deputy_unit is null");
            return (Criteria) this;
        }

        public Criteria andDeputyUnitIsNotNull() {
            addCriterion("deputy_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDeputyUnitEqualTo(Integer value) {
            addCriterion("deputy_unit =", value, "deputyUnit");
            return (Criteria) this;
        }

        public Criteria andDeputyUnitNotEqualTo(Integer value) {
            addCriterion("deputy_unit <>", value, "deputyUnit");
            return (Criteria) this;
        }

        public Criteria andDeputyUnitGreaterThan(Integer value) {
            addCriterion("deputy_unit >", value, "deputyUnit");
            return (Criteria) this;
        }

        public Criteria andDeputyUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("deputy_unit >=", value, "deputyUnit");
            return (Criteria) this;
        }

        public Criteria andDeputyUnitLessThan(Integer value) {
            addCriterion("deputy_unit <", value, "deputyUnit");
            return (Criteria) this;
        }

        public Criteria andDeputyUnitLessThanOrEqualTo(Integer value) {
            addCriterion("deputy_unit <=", value, "deputyUnit");
            return (Criteria) this;
        }

        public Criteria andDeputyUnitIn(List<Integer> values) {
            addCriterion("deputy_unit in", values, "deputyUnit");
            return (Criteria) this;
        }

        public Criteria andDeputyUnitNotIn(List<Integer> values) {
            addCriterion("deputy_unit not in", values, "deputyUnit");
            return (Criteria) this;
        }

        public Criteria andDeputyUnitBetween(Integer value1, Integer value2) {
            addCriterion("deputy_unit between", value1, value2, "deputyUnit");
            return (Criteria) this;
        }

        public Criteria andDeputyUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("deputy_unit not between", value1, value2, "deputyUnit");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Long value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Long value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Long value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Long value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Long> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Long> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Long value1, Long value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Long value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Long value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Long value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Long value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Long value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Long> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Long> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Long value1, Long value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Long value1, Long value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNull() {
            addCriterion("specifications is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNotNull() {
            addCriterion("specifications is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsEqualTo(Long value) {
            addCriterion("specifications =", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotEqualTo(Long value) {
            addCriterion("specifications <>", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThan(Long value) {
            addCriterion("specifications >", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThanOrEqualTo(Long value) {
            addCriterion("specifications >=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThan(Long value) {
            addCriterion("specifications <", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThanOrEqualTo(Long value) {
            addCriterion("specifications <=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIn(List<Long> values) {
            addCriterion("specifications in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotIn(List<Long> values) {
            addCriterion("specifications not in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsBetween(Long value1, Long value2) {
            addCriterion("specifications between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotBetween(Long value1, Long value2) {
            addCriterion("specifications not between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(Long value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(Long value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(Long value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(Long value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(Long value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(Long value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<Long> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<Long> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(Long value1, Long value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(Long value1, Long value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andFormulaIsNull() {
            addCriterion("formula is null");
            return (Criteria) this;
        }

        public Criteria andFormulaIsNotNull() {
            addCriterion("formula is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaEqualTo(String value) {
            addCriterion("formula =", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotEqualTo(String value) {
            addCriterion("formula <>", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaGreaterThan(String value) {
            addCriterion("formula >", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaGreaterThanOrEqualTo(String value) {
            addCriterion("formula >=", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLessThan(String value) {
            addCriterion("formula <", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLessThanOrEqualTo(String value) {
            addCriterion("formula <=", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLike(String value) {
            addCriterion("formula like", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotLike(String value) {
            addCriterion("formula not like", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaIn(List<String> values) {
            addCriterion("formula in", values, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotIn(List<String> values) {
            addCriterion("formula not in", values, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaBetween(String value1, String value2) {
            addCriterion("formula between", value1, value2, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotBetween(String value1, String value2) {
            addCriterion("formula not between", value1, value2, "formula");
            return (Criteria) this;
        }

        public Criteria andShelfStatusIsNull() {
            addCriterion("shelf_status is null");
            return (Criteria) this;
        }

        public Criteria andShelfStatusIsNotNull() {
            addCriterion("shelf_status is not null");
            return (Criteria) this;
        }

        public Criteria andShelfStatusEqualTo(String value) {
            addCriterion("shelf_status =", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusNotEqualTo(String value) {
            addCriterion("shelf_status <>", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusGreaterThan(String value) {
            addCriterion("shelf_status >", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusGreaterThanOrEqualTo(String value) {
            addCriterion("shelf_status >=", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusLessThan(String value) {
            addCriterion("shelf_status <", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusLessThanOrEqualTo(String value) {
            addCriterion("shelf_status <=", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusLike(String value) {
            addCriterion("shelf_status like", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusNotLike(String value) {
            addCriterion("shelf_status not like", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusIn(List<String> values) {
            addCriterion("shelf_status in", values, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusNotIn(List<String> values) {
            addCriterion("shelf_status not in", values, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusBetween(String value1, String value2) {
            addCriterion("shelf_status between", value1, value2, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusNotBetween(String value1, String value2) {
            addCriterion("shelf_status not between", value1, value2, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andRemindIsNull() {
            addCriterion("remind is null");
            return (Criteria) this;
        }

        public Criteria andRemindIsNotNull() {
            addCriterion("remind is not null");
            return (Criteria) this;
        }

        public Criteria andRemindEqualTo(String value) {
            addCriterion("remind =", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindNotEqualTo(String value) {
            addCriterion("remind <>", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindGreaterThan(String value) {
            addCriterion("remind >", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindGreaterThanOrEqualTo(String value) {
            addCriterion("remind >=", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindLessThan(String value) {
            addCriterion("remind <", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindLessThanOrEqualTo(String value) {
            addCriterion("remind <=", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindLike(String value) {
            addCriterion("remind like", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindNotLike(String value) {
            addCriterion("remind not like", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindIn(List<String> values) {
            addCriterion("remind in", values, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindNotIn(List<String> values) {
            addCriterion("remind not in", values, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindBetween(String value1, String value2) {
            addCriterion("remind between", value1, value2, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindNotBetween(String value1, String value2) {
            addCriterion("remind not between", value1, value2, "remind");
            return (Criteria) this;
        }

        public Criteria andRoundUpIsNull() {
            addCriterion("round_up is null");
            return (Criteria) this;
        }

        public Criteria andRoundUpIsNotNull() {
            addCriterion("round_up is not null");
            return (Criteria) this;
        }

        public Criteria andRoundUpEqualTo(String value) {
            addCriterion("round_up =", value, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpNotEqualTo(String value) {
            addCriterion("round_up <>", value, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpGreaterThan(String value) {
            addCriterion("round_up >", value, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpGreaterThanOrEqualTo(String value) {
            addCriterion("round_up >=", value, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpLessThan(String value) {
            addCriterion("round_up <", value, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpLessThanOrEqualTo(String value) {
            addCriterion("round_up <=", value, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpLike(String value) {
            addCriterion("round_up like", value, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpNotLike(String value) {
            addCriterion("round_up not like", value, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpIn(List<String> values) {
            addCriterion("round_up in", values, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpNotIn(List<String> values) {
            addCriterion("round_up not in", values, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpBetween(String value1, String value2) {
            addCriterion("round_up between", value1, value2, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpNotBetween(String value1, String value2) {
            addCriterion("round_up not between", value1, value2, "roundUp");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIsNull() {
            addCriterion("project_description is null");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIsNotNull() {
            addCriterion("project_description is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionEqualTo(String value) {
            addCriterion("project_description =", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotEqualTo(String value) {
            addCriterion("project_description <>", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionGreaterThan(String value) {
            addCriterion("project_description >", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("project_description >=", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLessThan(String value) {
            addCriterion("project_description <", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLessThanOrEqualTo(String value) {
            addCriterion("project_description <=", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLike(String value) {
            addCriterion("project_description like", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotLike(String value) {
            addCriterion("project_description not like", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIn(List<String> values) {
            addCriterion("project_description in", values, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotIn(List<String> values) {
            addCriterion("project_description not in", values, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionBetween(String value1, String value2) {
            addCriterion("project_description between", value1, value2, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotBetween(String value1, String value2) {
            addCriterion("project_description not between", value1, value2, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andPricingInstructionsIsNull() {
            addCriterion("pricing_instructions is null");
            return (Criteria) this;
        }

        public Criteria andPricingInstructionsIsNotNull() {
            addCriterion("pricing_instructions is not null");
            return (Criteria) this;
        }

        public Criteria andPricingInstructionsEqualTo(String value) {
            addCriterion("pricing_instructions =", value, "pricingInstructions");
            return (Criteria) this;
        }

        public Criteria andPricingInstructionsNotEqualTo(String value) {
            addCriterion("pricing_instructions <>", value, "pricingInstructions");
            return (Criteria) this;
        }

        public Criteria andPricingInstructionsGreaterThan(String value) {
            addCriterion("pricing_instructions >", value, "pricingInstructions");
            return (Criteria) this;
        }

        public Criteria andPricingInstructionsGreaterThanOrEqualTo(String value) {
            addCriterion("pricing_instructions >=", value, "pricingInstructions");
            return (Criteria) this;
        }

        public Criteria andPricingInstructionsLessThan(String value) {
            addCriterion("pricing_instructions <", value, "pricingInstructions");
            return (Criteria) this;
        }

        public Criteria andPricingInstructionsLessThanOrEqualTo(String value) {
            addCriterion("pricing_instructions <=", value, "pricingInstructions");
            return (Criteria) this;
        }

        public Criteria andPricingInstructionsLike(String value) {
            addCriterion("pricing_instructions like", value, "pricingInstructions");
            return (Criteria) this;
        }

        public Criteria andPricingInstructionsNotLike(String value) {
            addCriterion("pricing_instructions not like", value, "pricingInstructions");
            return (Criteria) this;
        }

        public Criteria andPricingInstructionsIn(List<String> values) {
            addCriterion("pricing_instructions in", values, "pricingInstructions");
            return (Criteria) this;
        }

        public Criteria andPricingInstructionsNotIn(List<String> values) {
            addCriterion("pricing_instructions not in", values, "pricingInstructions");
            return (Criteria) this;
        }

        public Criteria andPricingInstructionsBetween(String value1, String value2) {
            addCriterion("pricing_instructions between", value1, value2, "pricingInstructions");
            return (Criteria) this;
        }

        public Criteria andPricingInstructionsNotBetween(String value1, String value2) {
            addCriterion("pricing_instructions not between", value1, value2, "pricingInstructions");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaIsNull() {
            addCriterion("acceptance_criteria is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaIsNotNull() {
            addCriterion("acceptance_criteria is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaEqualTo(String value) {
            addCriterion("acceptance_criteria =", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaNotEqualTo(String value) {
            addCriterion("acceptance_criteria <>", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaGreaterThan(String value) {
            addCriterion("acceptance_criteria >", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaGreaterThanOrEqualTo(String value) {
            addCriterion("acceptance_criteria >=", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaLessThan(String value) {
            addCriterion("acceptance_criteria <", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaLessThanOrEqualTo(String value) {
            addCriterion("acceptance_criteria <=", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaLike(String value) {
            addCriterion("acceptance_criteria like", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaNotLike(String value) {
            addCriterion("acceptance_criteria not like", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaIn(List<String> values) {
            addCriterion("acceptance_criteria in", values, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaNotIn(List<String> values) {
            addCriterion("acceptance_criteria not in", values, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaBetween(String value1, String value2) {
            addCriterion("acceptance_criteria between", value1, value2, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaNotBetween(String value1, String value2) {
            addCriterion("acceptance_criteria not between", value1, value2, "acceptanceCriteria");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}