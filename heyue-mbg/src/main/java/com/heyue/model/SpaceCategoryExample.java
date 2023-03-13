package com.heyue.model;

import java.util.ArrayList;
import java.util.List;

public class SpaceCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpaceCategoryExample() {
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

        public Criteria andSpaceCategoryNameIsNull() {
            addCriterion("space_category_name is null");
            return (Criteria) this;
        }

        public Criteria andSpaceCategoryNameIsNotNull() {
            addCriterion("space_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceCategoryNameEqualTo(String value) {
            addCriterion("space_category_name =", value, "spaceCategoryName");
            return (Criteria) this;
        }

        public Criteria andSpaceCategoryNameNotEqualTo(String value) {
            addCriterion("space_category_name <>", value, "spaceCategoryName");
            return (Criteria) this;
        }

        public Criteria andSpaceCategoryNameGreaterThan(String value) {
            addCriterion("space_category_name >", value, "spaceCategoryName");
            return (Criteria) this;
        }

        public Criteria andSpaceCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("space_category_name >=", value, "spaceCategoryName");
            return (Criteria) this;
        }

        public Criteria andSpaceCategoryNameLessThan(String value) {
            addCriterion("space_category_name <", value, "spaceCategoryName");
            return (Criteria) this;
        }

        public Criteria andSpaceCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("space_category_name <=", value, "spaceCategoryName");
            return (Criteria) this;
        }

        public Criteria andSpaceCategoryNameLike(String value) {
            addCriterion("space_category_name like", value, "spaceCategoryName");
            return (Criteria) this;
        }

        public Criteria andSpaceCategoryNameNotLike(String value) {
            addCriterion("space_category_name not like", value, "spaceCategoryName");
            return (Criteria) this;
        }

        public Criteria andSpaceCategoryNameIn(List<String> values) {
            addCriterion("space_category_name in", values, "spaceCategoryName");
            return (Criteria) this;
        }

        public Criteria andSpaceCategoryNameNotIn(List<String> values) {
            addCriterion("space_category_name not in", values, "spaceCategoryName");
            return (Criteria) this;
        }

        public Criteria andSpaceCategoryNameBetween(String value1, String value2) {
            addCriterion("space_category_name between", value1, value2, "spaceCategoryName");
            return (Criteria) this;
        }

        public Criteria andSpaceCategoryNameNotBetween(String value1, String value2) {
            addCriterion("space_category_name not between", value1, value2, "spaceCategoryName");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeIsNull() {
            addCriterion("space_type is null");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeIsNotNull() {
            addCriterion("space_type is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeEqualTo(String value) {
            addCriterion("space_type =", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeNotEqualTo(String value) {
            addCriterion("space_type <>", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeGreaterThan(String value) {
            addCriterion("space_type >", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("space_type >=", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeLessThan(String value) {
            addCriterion("space_type <", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeLessThanOrEqualTo(String value) {
            addCriterion("space_type <=", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeLike(String value) {
            addCriterion("space_type like", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeNotLike(String value) {
            addCriterion("space_type not like", value, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeIn(List<String> values) {
            addCriterion("space_type in", values, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeNotIn(List<String> values) {
            addCriterion("space_type not in", values, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeBetween(String value1, String value2) {
            addCriterion("space_type between", value1, value2, "spaceType");
            return (Criteria) this;
        }

        public Criteria andSpaceTypeNotBetween(String value1, String value2) {
            addCriterion("space_type not between", value1, value2, "spaceType");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("parentid like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("parentid not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
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

        public Criteria andSortValueIsNull() {
            addCriterion("sort_value is null");
            return (Criteria) this;
        }

        public Criteria andSortValueIsNotNull() {
            addCriterion("sort_value is not null");
            return (Criteria) this;
        }

        public Criteria andSortValueEqualTo(String value) {
            addCriterion("sort_value =", value, "sortValue");
            return (Criteria) this;
        }

        public Criteria andSortValueNotEqualTo(String value) {
            addCriterion("sort_value <>", value, "sortValue");
            return (Criteria) this;
        }

        public Criteria andSortValueGreaterThan(String value) {
            addCriterion("sort_value >", value, "sortValue");
            return (Criteria) this;
        }

        public Criteria andSortValueGreaterThanOrEqualTo(String value) {
            addCriterion("sort_value >=", value, "sortValue");
            return (Criteria) this;
        }

        public Criteria andSortValueLessThan(String value) {
            addCriterion("sort_value <", value, "sortValue");
            return (Criteria) this;
        }

        public Criteria andSortValueLessThanOrEqualTo(String value) {
            addCriterion("sort_value <=", value, "sortValue");
            return (Criteria) this;
        }

        public Criteria andSortValueLike(String value) {
            addCriterion("sort_value like", value, "sortValue");
            return (Criteria) this;
        }

        public Criteria andSortValueNotLike(String value) {
            addCriterion("sort_value not like", value, "sortValue");
            return (Criteria) this;
        }

        public Criteria andSortValueIn(List<String> values) {
            addCriterion("sort_value in", values, "sortValue");
            return (Criteria) this;
        }

        public Criteria andSortValueNotIn(List<String> values) {
            addCriterion("sort_value not in", values, "sortValue");
            return (Criteria) this;
        }

        public Criteria andSortValueBetween(String value1, String value2) {
            addCriterion("sort_value between", value1, value2, "sortValue");
            return (Criteria) this;
        }

        public Criteria andSortValueNotBetween(String value1, String value2) {
            addCriterion("sort_value not between", value1, value2, "sortValue");
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