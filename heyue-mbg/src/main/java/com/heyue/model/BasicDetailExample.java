package com.heyue.model;

import java.util.ArrayList;
import java.util.List;

public class BasicDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasicDetailExample() {
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

        public Criteria andDetailTypeIsNull() {
            addCriterion("detail_type is null");
            return (Criteria) this;
        }

        public Criteria andDetailTypeIsNotNull() {
            addCriterion("detail_type is not null");
            return (Criteria) this;
        }

        public Criteria andDetailTypeEqualTo(String value) {
            addCriterion("detail_type =", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeNotEqualTo(String value) {
            addCriterion("detail_type <>", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeGreaterThan(String value) {
            addCriterion("detail_type >", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeGreaterThanOrEqualTo(String value) {
            addCriterion("detail_type >=", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeLessThan(String value) {
            addCriterion("detail_type <", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeLessThanOrEqualTo(String value) {
            addCriterion("detail_type <=", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeLike(String value) {
            addCriterion("detail_type like", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeNotLike(String value) {
            addCriterion("detail_type not like", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeIn(List<String> values) {
            addCriterion("detail_type in", values, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeNotIn(List<String> values) {
            addCriterion("detail_type not in", values, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeBetween(String value1, String value2) {
            addCriterion("detail_type between", value1, value2, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeNotBetween(String value1, String value2) {
            addCriterion("detail_type not between", value1, value2, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailNameIsNull() {
            addCriterion("detail_name is null");
            return (Criteria) this;
        }

        public Criteria andDetailNameIsNotNull() {
            addCriterion("detail_name is not null");
            return (Criteria) this;
        }

        public Criteria andDetailNameEqualTo(String value) {
            addCriterion("detail_name =", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotEqualTo(String value) {
            addCriterion("detail_name <>", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameGreaterThan(String value) {
            addCriterion("detail_name >", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameGreaterThanOrEqualTo(String value) {
            addCriterion("detail_name >=", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameLessThan(String value) {
            addCriterion("detail_name <", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameLessThanOrEqualTo(String value) {
            addCriterion("detail_name <=", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameLike(String value) {
            addCriterion("detail_name like", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotLike(String value) {
            addCriterion("detail_name not like", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameIn(List<String> values) {
            addCriterion("detail_name in", values, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotIn(List<String> values) {
            addCriterion("detail_name not in", values, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameBetween(String value1, String value2) {
            addCriterion("detail_name between", value1, value2, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotBetween(String value1, String value2) {
            addCriterion("detail_name not between", value1, value2, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailCodeIsNull() {
            addCriterion("detail_code is null");
            return (Criteria) this;
        }

        public Criteria andDetailCodeIsNotNull() {
            addCriterion("detail_code is not null");
            return (Criteria) this;
        }

        public Criteria andDetailCodeEqualTo(String value) {
            addCriterion("detail_code =", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeNotEqualTo(String value) {
            addCriterion("detail_code <>", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeGreaterThan(String value) {
            addCriterion("detail_code >", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("detail_code >=", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeLessThan(String value) {
            addCriterion("detail_code <", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeLessThanOrEqualTo(String value) {
            addCriterion("detail_code <=", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeLike(String value) {
            addCriterion("detail_code like", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeNotLike(String value) {
            addCriterion("detail_code not like", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeIn(List<String> values) {
            addCriterion("detail_code in", values, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeNotIn(List<String> values) {
            addCriterion("detail_code not in", values, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeBetween(String value1, String value2) {
            addCriterion("detail_code between", value1, value2, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeNotBetween(String value1, String value2) {
            addCriterion("detail_code not between", value1, value2, "detailCode");
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

        public Criteria andLaborCostIsNull() {
            addCriterion("labor_cost is null");
            return (Criteria) this;
        }

        public Criteria andLaborCostIsNotNull() {
            addCriterion("labor_cost is not null");
            return (Criteria) this;
        }

        public Criteria andLaborCostEqualTo(Double value) {
            addCriterion("labor_cost =", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostNotEqualTo(Double value) {
            addCriterion("labor_cost <>", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostGreaterThan(Double value) {
            addCriterion("labor_cost >", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostGreaterThanOrEqualTo(Double value) {
            addCriterion("labor_cost >=", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostLessThan(Double value) {
            addCriterion("labor_cost <", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostLessThanOrEqualTo(Double value) {
            addCriterion("labor_cost <=", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostIn(List<Double> values) {
            addCriterion("labor_cost in", values, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostNotIn(List<Double> values) {
            addCriterion("labor_cost not in", values, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostBetween(Double value1, Double value2) {
            addCriterion("labor_cost between", value1, value2, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostNotBetween(Double value1, Double value2) {
            addCriterion("labor_cost not between", value1, value2, "laborCost");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialCostIsNull() {
            addCriterion("auxiliary_material_cost is null");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialCostIsNotNull() {
            addCriterion("auxiliary_material_cost is not null");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialCostEqualTo(Double value) {
            addCriterion("auxiliary_material_cost =", value, "auxiliaryMaterialCost");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialCostNotEqualTo(Double value) {
            addCriterion("auxiliary_material_cost <>", value, "auxiliaryMaterialCost");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialCostGreaterThan(Double value) {
            addCriterion("auxiliary_material_cost >", value, "auxiliaryMaterialCost");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialCostGreaterThanOrEqualTo(Double value) {
            addCriterion("auxiliary_material_cost >=", value, "auxiliaryMaterialCost");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialCostLessThan(Double value) {
            addCriterion("auxiliary_material_cost <", value, "auxiliaryMaterialCost");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialCostLessThanOrEqualTo(Double value) {
            addCriterion("auxiliary_material_cost <=", value, "auxiliaryMaterialCost");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialCostIn(List<Double> values) {
            addCriterion("auxiliary_material_cost in", values, "auxiliaryMaterialCost");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialCostNotIn(List<Double> values) {
            addCriterion("auxiliary_material_cost not in", values, "auxiliaryMaterialCost");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialCostBetween(Double value1, Double value2) {
            addCriterion("auxiliary_material_cost between", value1, value2, "auxiliaryMaterialCost");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialCostNotBetween(Double value1, Double value2) {
            addCriterion("auxiliary_material_cost not between", value1, value2, "auxiliaryMaterialCost");
            return (Criteria) this;
        }

        public Criteria andLaborPriceIsNull() {
            addCriterion("labor_price is null");
            return (Criteria) this;
        }

        public Criteria andLaborPriceIsNotNull() {
            addCriterion("labor_price is not null");
            return (Criteria) this;
        }

        public Criteria andLaborPriceEqualTo(Double value) {
            addCriterion("labor_price =", value, "laborPrice");
            return (Criteria) this;
        }

        public Criteria andLaborPriceNotEqualTo(Double value) {
            addCriterion("labor_price <>", value, "laborPrice");
            return (Criteria) this;
        }

        public Criteria andLaborPriceGreaterThan(Double value) {
            addCriterion("labor_price >", value, "laborPrice");
            return (Criteria) this;
        }

        public Criteria andLaborPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("labor_price >=", value, "laborPrice");
            return (Criteria) this;
        }

        public Criteria andLaborPriceLessThan(Double value) {
            addCriterion("labor_price <", value, "laborPrice");
            return (Criteria) this;
        }

        public Criteria andLaborPriceLessThanOrEqualTo(Double value) {
            addCriterion("labor_price <=", value, "laborPrice");
            return (Criteria) this;
        }

        public Criteria andLaborPriceIn(List<Double> values) {
            addCriterion("labor_price in", values, "laborPrice");
            return (Criteria) this;
        }

        public Criteria andLaborPriceNotIn(List<Double> values) {
            addCriterion("labor_price not in", values, "laborPrice");
            return (Criteria) this;
        }

        public Criteria andLaborPriceBetween(Double value1, Double value2) {
            addCriterion("labor_price between", value1, value2, "laborPrice");
            return (Criteria) this;
        }

        public Criteria andLaborPriceNotBetween(Double value1, Double value2) {
            addCriterion("labor_price not between", value1, value2, "laborPrice");
            return (Criteria) this;
        }

        public Criteria andAccessoriesPriceIsNull() {
            addCriterion("accessories_price is null");
            return (Criteria) this;
        }

        public Criteria andAccessoriesPriceIsNotNull() {
            addCriterion("accessories_price is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoriesPriceEqualTo(Double value) {
            addCriterion("accessories_price =", value, "accessoriesPrice");
            return (Criteria) this;
        }

        public Criteria andAccessoriesPriceNotEqualTo(Double value) {
            addCriterion("accessories_price <>", value, "accessoriesPrice");
            return (Criteria) this;
        }

        public Criteria andAccessoriesPriceGreaterThan(Double value) {
            addCriterion("accessories_price >", value, "accessoriesPrice");
            return (Criteria) this;
        }

        public Criteria andAccessoriesPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("accessories_price >=", value, "accessoriesPrice");
            return (Criteria) this;
        }

        public Criteria andAccessoriesPriceLessThan(Double value) {
            addCriterion("accessories_price <", value, "accessoriesPrice");
            return (Criteria) this;
        }

        public Criteria andAccessoriesPriceLessThanOrEqualTo(Double value) {
            addCriterion("accessories_price <=", value, "accessoriesPrice");
            return (Criteria) this;
        }

        public Criteria andAccessoriesPriceIn(List<Double> values) {
            addCriterion("accessories_price in", values, "accessoriesPrice");
            return (Criteria) this;
        }

        public Criteria andAccessoriesPriceNotIn(List<Double> values) {
            addCriterion("accessories_price not in", values, "accessoriesPrice");
            return (Criteria) this;
        }

        public Criteria andAccessoriesPriceBetween(Double value1, Double value2) {
            addCriterion("accessories_price between", value1, value2, "accessoriesPrice");
            return (Criteria) this;
        }

        public Criteria andAccessoriesPriceNotBetween(Double value1, Double value2) {
            addCriterion("accessories_price not between", value1, value2, "accessoriesPrice");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialLossRateIsNull() {
            addCriterion("auxiliary_material_loss_rate is null");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialLossRateIsNotNull() {
            addCriterion("auxiliary_material_loss_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialLossRateEqualTo(Double value) {
            addCriterion("auxiliary_material_loss_rate =", value, "auxiliaryMaterialLossRate");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialLossRateNotEqualTo(Double value) {
            addCriterion("auxiliary_material_loss_rate <>", value, "auxiliaryMaterialLossRate");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialLossRateGreaterThan(Double value) {
            addCriterion("auxiliary_material_loss_rate >", value, "auxiliaryMaterialLossRate");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialLossRateGreaterThanOrEqualTo(Double value) {
            addCriterion("auxiliary_material_loss_rate >=", value, "auxiliaryMaterialLossRate");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialLossRateLessThan(Double value) {
            addCriterion("auxiliary_material_loss_rate <", value, "auxiliaryMaterialLossRate");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialLossRateLessThanOrEqualTo(Double value) {
            addCriterion("auxiliary_material_loss_rate <=", value, "auxiliaryMaterialLossRate");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialLossRateIn(List<Double> values) {
            addCriterion("auxiliary_material_loss_rate in", values, "auxiliaryMaterialLossRate");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialLossRateNotIn(List<Double> values) {
            addCriterion("auxiliary_material_loss_rate not in", values, "auxiliaryMaterialLossRate");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialLossRateBetween(Double value1, Double value2) {
            addCriterion("auxiliary_material_loss_rate between", value1, value2, "auxiliaryMaterialLossRate");
            return (Criteria) this;
        }

        public Criteria andAuxiliaryMaterialLossRateNotBetween(Double value1, Double value2) {
            addCriterion("auxiliary_material_loss_rate not between", value1, value2, "auxiliaryMaterialLossRate");
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

        public Criteria andShelfStatusEqualTo(Integer value) {
            addCriterion("shelf_status =", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusNotEqualTo(Integer value) {
            addCriterion("shelf_status <>", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusGreaterThan(Integer value) {
            addCriterion("shelf_status >", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("shelf_status >=", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusLessThan(Integer value) {
            addCriterion("shelf_status <", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusLessThanOrEqualTo(Integer value) {
            addCriterion("shelf_status <=", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusIn(List<Integer> values) {
            addCriterion("shelf_status in", values, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusNotIn(List<Integer> values) {
            addCriterion("shelf_status not in", values, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusBetween(Integer value1, Integer value2) {
            addCriterion("shelf_status between", value1, value2, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("shelf_status not between", value1, value2, "shelfStatus");
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