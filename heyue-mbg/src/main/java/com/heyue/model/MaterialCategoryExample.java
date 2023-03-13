package com.heyue.model;

import java.util.ArrayList;
import java.util.List;

public class MaterialCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialCategoryExample() {
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

        public Criteria andMaterialCategoryNameIsNull() {
            addCriterion("material_category_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNameIsNotNull() {
            addCriterion("material_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNameEqualTo(String value) {
            addCriterion("material_category_name =", value, "materialCategoryName");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNameNotEqualTo(String value) {
            addCriterion("material_category_name <>", value, "materialCategoryName");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNameGreaterThan(String value) {
            addCriterion("material_category_name >", value, "materialCategoryName");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_category_name >=", value, "materialCategoryName");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNameLessThan(String value) {
            addCriterion("material_category_name <", value, "materialCategoryName");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("material_category_name <=", value, "materialCategoryName");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNameLike(String value) {
            addCriterion("material_category_name like", value, "materialCategoryName");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNameNotLike(String value) {
            addCriterion("material_category_name not like", value, "materialCategoryName");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNameIn(List<String> values) {
            addCriterion("material_category_name in", values, "materialCategoryName");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNameNotIn(List<String> values) {
            addCriterion("material_category_name not in", values, "materialCategoryName");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNameBetween(String value1, String value2) {
            addCriterion("material_category_name between", value1, value2, "materialCategoryName");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNameNotBetween(String value1, String value2) {
            addCriterion("material_category_name not between", value1, value2, "materialCategoryName");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryCodeIsNull() {
            addCriterion("material_category_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryCodeIsNotNull() {
            addCriterion("material_category_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryCodeEqualTo(String value) {
            addCriterion("material_category_code =", value, "materialCategoryCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryCodeNotEqualTo(String value) {
            addCriterion("material_category_code <>", value, "materialCategoryCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryCodeGreaterThan(String value) {
            addCriterion("material_category_code >", value, "materialCategoryCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_category_code >=", value, "materialCategoryCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryCodeLessThan(String value) {
            addCriterion("material_category_code <", value, "materialCategoryCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("material_category_code <=", value, "materialCategoryCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryCodeLike(String value) {
            addCriterion("material_category_code like", value, "materialCategoryCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryCodeNotLike(String value) {
            addCriterion("material_category_code not like", value, "materialCategoryCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryCodeIn(List<String> values) {
            addCriterion("material_category_code in", values, "materialCategoryCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryCodeNotIn(List<String> values) {
            addCriterion("material_category_code not in", values, "materialCategoryCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryCodeBetween(String value1, String value2) {
            addCriterion("material_category_code between", value1, value2, "materialCategoryCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("material_category_code not between", value1, value2, "materialCategoryCode");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andIsrootIsNull() {
            addCriterion("isroot is null");
            return (Criteria) this;
        }

        public Criteria andIsrootIsNotNull() {
            addCriterion("isroot is not null");
            return (Criteria) this;
        }

        public Criteria andIsrootEqualTo(String value) {
            addCriterion("isroot =", value, "isroot");
            return (Criteria) this;
        }

        public Criteria andIsrootNotEqualTo(String value) {
            addCriterion("isroot <>", value, "isroot");
            return (Criteria) this;
        }

        public Criteria andIsrootGreaterThan(String value) {
            addCriterion("isroot >", value, "isroot");
            return (Criteria) this;
        }

        public Criteria andIsrootGreaterThanOrEqualTo(String value) {
            addCriterion("isroot >=", value, "isroot");
            return (Criteria) this;
        }

        public Criteria andIsrootLessThan(String value) {
            addCriterion("isroot <", value, "isroot");
            return (Criteria) this;
        }

        public Criteria andIsrootLessThanOrEqualTo(String value) {
            addCriterion("isroot <=", value, "isroot");
            return (Criteria) this;
        }

        public Criteria andIsrootLike(String value) {
            addCriterion("isroot like", value, "isroot");
            return (Criteria) this;
        }

        public Criteria andIsrootNotLike(String value) {
            addCriterion("isroot not like", value, "isroot");
            return (Criteria) this;
        }

        public Criteria andIsrootIn(List<String> values) {
            addCriterion("isroot in", values, "isroot");
            return (Criteria) this;
        }

        public Criteria andIsrootNotIn(List<String> values) {
            addCriterion("isroot not in", values, "isroot");
            return (Criteria) this;
        }

        public Criteria andIsrootBetween(String value1, String value2) {
            addCriterion("isroot between", value1, value2, "isroot");
            return (Criteria) this;
        }

        public Criteria andIsrootNotBetween(String value1, String value2) {
            addCriterion("isroot not between", value1, value2, "isroot");
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