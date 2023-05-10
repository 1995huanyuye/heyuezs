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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
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

        public Criteria andMaterialClassificationIsNull() {
            addCriterion("material_classification is null");
            return (Criteria) this;
        }

        public Criteria andMaterialClassificationIsNotNull() {
            addCriterion("material_classification is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialClassificationEqualTo(String value) {
            addCriterion("material_classification =", value, "materialClassification");
            return (Criteria) this;
        }

        public Criteria andMaterialClassificationNotEqualTo(String value) {
            addCriterion("material_classification <>", value, "materialClassification");
            return (Criteria) this;
        }

        public Criteria andMaterialClassificationGreaterThan(String value) {
            addCriterion("material_classification >", value, "materialClassification");
            return (Criteria) this;
        }

        public Criteria andMaterialClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("material_classification >=", value, "materialClassification");
            return (Criteria) this;
        }

        public Criteria andMaterialClassificationLessThan(String value) {
            addCriterion("material_classification <", value, "materialClassification");
            return (Criteria) this;
        }

        public Criteria andMaterialClassificationLessThanOrEqualTo(String value) {
            addCriterion("material_classification <=", value, "materialClassification");
            return (Criteria) this;
        }

        public Criteria andMaterialClassificationLike(String value) {
            addCriterion("material_classification like", value, "materialClassification");
            return (Criteria) this;
        }

        public Criteria andMaterialClassificationNotLike(String value) {
            addCriterion("material_classification not like", value, "materialClassification");
            return (Criteria) this;
        }

        public Criteria andMaterialClassificationIn(List<String> values) {
            addCriterion("material_classification in", values, "materialClassification");
            return (Criteria) this;
        }

        public Criteria andMaterialClassificationNotIn(List<String> values) {
            addCriterion("material_classification not in", values, "materialClassification");
            return (Criteria) this;
        }

        public Criteria andMaterialClassificationBetween(String value1, String value2) {
            addCriterion("material_classification between", value1, value2, "materialClassification");
            return (Criteria) this;
        }

        public Criteria andMaterialClassificationNotBetween(String value1, String value2) {
            addCriterion("material_classification not between", value1, value2, "materialClassification");
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

        public Criteria andMaterialCodeIsNull() {
            addCriterion("material_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNotNull() {
            addCriterion("material_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeEqualTo(String value) {
            addCriterion("material_code =", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotEqualTo(String value) {
            addCriterion("material_code <>", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThan(String value) {
            addCriterion("material_code >", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_code >=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThan(String value) {
            addCriterion("material_code <", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThanOrEqualTo(String value) {
            addCriterion("material_code <=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLike(String value) {
            addCriterion("material_code like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotLike(String value) {
            addCriterion("material_code not like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIn(List<String> values) {
            addCriterion("material_code in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotIn(List<String> values) {
            addCriterion("material_code not in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeBetween(String value1, String value2) {
            addCriterion("material_code between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotBetween(String value1, String value2) {
            addCriterion("material_code not between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(Integer value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(Integer value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(Integer value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(Integer value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(Integer value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<Integer> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<Integer> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(Integer value1, Integer value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("unit not between", value1, value2, "unit");
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

        public Criteria andRoundUpEqualTo(Integer value) {
            addCriterion("round_up =", value, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpNotEqualTo(Integer value) {
            addCriterion("round_up <>", value, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpGreaterThan(Integer value) {
            addCriterion("round_up >", value, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("round_up >=", value, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpLessThan(Integer value) {
            addCriterion("round_up <", value, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpLessThanOrEqualTo(Integer value) {
            addCriterion("round_up <=", value, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpIn(List<Integer> values) {
            addCriterion("round_up in", values, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpNotIn(List<Integer> values) {
            addCriterion("round_up not in", values, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpBetween(Integer value1, Integer value2) {
            addCriterion("round_up between", value1, value2, "roundUp");
            return (Criteria) this;
        }

        public Criteria andRoundUpNotBetween(Integer value1, Integer value2) {
            addCriterion("round_up not between", value1, value2, "roundUp");
            return (Criteria) this;
        }

        public Criteria andMaterialCostIsNull() {
            addCriterion("material_cost is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCostIsNotNull() {
            addCriterion("material_cost is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCostEqualTo(Double value) {
            addCriterion("material_cost =", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostNotEqualTo(Double value) {
            addCriterion("material_cost <>", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostGreaterThan(Double value) {
            addCriterion("material_cost >", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostGreaterThanOrEqualTo(Double value) {
            addCriterion("material_cost >=", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostLessThan(Double value) {
            addCriterion("material_cost <", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostLessThanOrEqualTo(Double value) {
            addCriterion("material_cost <=", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostIn(List<Double> values) {
            addCriterion("material_cost in", values, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostNotIn(List<Double> values) {
            addCriterion("material_cost not in", values, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostBetween(Double value1, Double value2) {
            addCriterion("material_cost between", value1, value2, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostNotBetween(Double value1, Double value2) {
            addCriterion("material_cost not between", value1, value2, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceIsNull() {
            addCriterion("material_price is null");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceIsNotNull() {
            addCriterion("material_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceEqualTo(Double value) {
            addCriterion("material_price =", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceNotEqualTo(Double value) {
            addCriterion("material_price <>", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceGreaterThan(Double value) {
            addCriterion("material_price >", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("material_price >=", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceLessThan(Double value) {
            addCriterion("material_price <", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceLessThanOrEqualTo(Double value) {
            addCriterion("material_price <=", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceIn(List<Double> values) {
            addCriterion("material_price in", values, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceNotIn(List<Double> values) {
            addCriterion("material_price not in", values, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceBetween(Double value1, Double value2) {
            addCriterion("material_price between", value1, value2, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceNotBetween(Double value1, Double value2) {
            addCriterion("material_price not between", value1, value2, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialWastageRateIsNull() {
            addCriterion("material_wastage_rate is null");
            return (Criteria) this;
        }

        public Criteria andMaterialWastageRateIsNotNull() {
            addCriterion("material_wastage_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialWastageRateEqualTo(Double value) {
            addCriterion("material_wastage_rate =", value, "materialWastageRate");
            return (Criteria) this;
        }

        public Criteria andMaterialWastageRateNotEqualTo(Double value) {
            addCriterion("material_wastage_rate <>", value, "materialWastageRate");
            return (Criteria) this;
        }

        public Criteria andMaterialWastageRateGreaterThan(Double value) {
            addCriterion("material_wastage_rate >", value, "materialWastageRate");
            return (Criteria) this;
        }

        public Criteria andMaterialWastageRateGreaterThanOrEqualTo(Double value) {
            addCriterion("material_wastage_rate >=", value, "materialWastageRate");
            return (Criteria) this;
        }

        public Criteria andMaterialWastageRateLessThan(Double value) {
            addCriterion("material_wastage_rate <", value, "materialWastageRate");
            return (Criteria) this;
        }

        public Criteria andMaterialWastageRateLessThanOrEqualTo(Double value) {
            addCriterion("material_wastage_rate <=", value, "materialWastageRate");
            return (Criteria) this;
        }

        public Criteria andMaterialWastageRateIn(List<Double> values) {
            addCriterion("material_wastage_rate in", values, "materialWastageRate");
            return (Criteria) this;
        }

        public Criteria andMaterialWastageRateNotIn(List<Double> values) {
            addCriterion("material_wastage_rate not in", values, "materialWastageRate");
            return (Criteria) this;
        }

        public Criteria andMaterialWastageRateBetween(Double value1, Double value2) {
            addCriterion("material_wastage_rate between", value1, value2, "materialWastageRate");
            return (Criteria) this;
        }

        public Criteria andMaterialWastageRateNotBetween(Double value1, Double value2) {
            addCriterion("material_wastage_rate not between", value1, value2, "materialWastageRate");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andModelNumberIsNull() {
            addCriterion("model_number is null");
            return (Criteria) this;
        }

        public Criteria andModelNumberIsNotNull() {
            addCriterion("model_number is not null");
            return (Criteria) this;
        }

        public Criteria andModelNumberEqualTo(String value) {
            addCriterion("model_number =", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberNotEqualTo(String value) {
            addCriterion("model_number <>", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberGreaterThan(String value) {
            addCriterion("model_number >", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberGreaterThanOrEqualTo(String value) {
            addCriterion("model_number >=", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberLessThan(String value) {
            addCriterion("model_number <", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberLessThanOrEqualTo(String value) {
            addCriterion("model_number <=", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberLike(String value) {
            addCriterion("model_number like", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberNotLike(String value) {
            addCriterion("model_number not like", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberIn(List<String> values) {
            addCriterion("model_number in", values, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberNotIn(List<String> values) {
            addCriterion("model_number not in", values, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberBetween(String value1, String value2) {
            addCriterion("model_number between", value1, value2, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberNotBetween(String value1, String value2) {
            addCriterion("model_number not between", value1, value2, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
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

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
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

        public Criteria andEngineeringStageEqualTo(Integer value) {
            addCriterion("engineering_stage =", value, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageNotEqualTo(Integer value) {
            addCriterion("engineering_stage <>", value, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageGreaterThan(Integer value) {
            addCriterion("engineering_stage >", value, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageGreaterThanOrEqualTo(Integer value) {
            addCriterion("engineering_stage >=", value, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageLessThan(Integer value) {
            addCriterion("engineering_stage <", value, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageLessThanOrEqualTo(Integer value) {
            addCriterion("engineering_stage <=", value, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageIn(List<Integer> values) {
            addCriterion("engineering_stage in", values, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageNotIn(List<Integer> values) {
            addCriterion("engineering_stage not in", values, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageBetween(Integer value1, Integer value2) {
            addCriterion("engineering_stage between", value1, value2, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andEngineeringStageNotBetween(Integer value1, Integer value2) {
            addCriterion("engineering_stage not between", value1, value2, "engineeringStage");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeIsNull() {
            addCriterion("construction_type is null");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeIsNotNull() {
            addCriterion("construction_type is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeEqualTo(Integer value) {
            addCriterion("construction_type =", value, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeNotEqualTo(Integer value) {
            addCriterion("construction_type <>", value, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeGreaterThan(Integer value) {
            addCriterion("construction_type >", value, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("construction_type >=", value, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeLessThan(Integer value) {
            addCriterion("construction_type <", value, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("construction_type <=", value, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeIn(List<Integer> values) {
            addCriterion("construction_type in", values, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeNotIn(List<Integer> values) {
            addCriterion("construction_type not in", values, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeBetween(Integer value1, Integer value2) {
            addCriterion("construction_type between", value1, value2, "constructionType");
            return (Criteria) this;
        }

        public Criteria andConstructionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("construction_type not between", value1, value2, "constructionType");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionIsNull() {
            addCriterion("material_description is null");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionIsNotNull() {
            addCriterion("material_description is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionEqualTo(String value) {
            addCriterion("material_description =", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionNotEqualTo(String value) {
            addCriterion("material_description <>", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionGreaterThan(String value) {
            addCriterion("material_description >", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("material_description >=", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionLessThan(String value) {
            addCriterion("material_description <", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionLessThanOrEqualTo(String value) {
            addCriterion("material_description <=", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionLike(String value) {
            addCriterion("material_description like", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionNotLike(String value) {
            addCriterion("material_description not like", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionIn(List<String> values) {
            addCriterion("material_description in", values, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionNotIn(List<String> values) {
            addCriterion("material_description not in", values, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionBetween(String value1, String value2) {
            addCriterion("material_description between", value1, value2, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionNotBetween(String value1, String value2) {
            addCriterion("material_description not between", value1, value2, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
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

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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