package com.heyue.model;

import java.util.ArrayList;
import java.util.List;

public class SpaceItemParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpaceItemParamExample() {
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

        public Criteria andSpaceParamIdIsNull() {
            addCriterion("space_param_id is null");
            return (Criteria) this;
        }

        public Criteria andSpaceParamIdIsNotNull() {
            addCriterion("space_param_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceParamIdEqualTo(Long value) {
            addCriterion("space_param_id =", value, "spaceParamId");
            return (Criteria) this;
        }

        public Criteria andSpaceParamIdNotEqualTo(Long value) {
            addCriterion("space_param_id <>", value, "spaceParamId");
            return (Criteria) this;
        }

        public Criteria andSpaceParamIdGreaterThan(Long value) {
            addCriterion("space_param_id >", value, "spaceParamId");
            return (Criteria) this;
        }

        public Criteria andSpaceParamIdGreaterThanOrEqualTo(Long value) {
            addCriterion("space_param_id >=", value, "spaceParamId");
            return (Criteria) this;
        }

        public Criteria andSpaceParamIdLessThan(Long value) {
            addCriterion("space_param_id <", value, "spaceParamId");
            return (Criteria) this;
        }

        public Criteria andSpaceParamIdLessThanOrEqualTo(Long value) {
            addCriterion("space_param_id <=", value, "spaceParamId");
            return (Criteria) this;
        }

        public Criteria andSpaceParamIdIn(List<Long> values) {
            addCriterion("space_param_id in", values, "spaceParamId");
            return (Criteria) this;
        }

        public Criteria andSpaceParamIdNotIn(List<Long> values) {
            addCriterion("space_param_id not in", values, "spaceParamId");
            return (Criteria) this;
        }

        public Criteria andSpaceParamIdBetween(Long value1, Long value2) {
            addCriterion("space_param_id between", value1, value2, "spaceParamId");
            return (Criteria) this;
        }

        public Criteria andSpaceParamIdNotBetween(Long value1, Long value2) {
            addCriterion("space_param_id not between", value1, value2, "spaceParamId");
            return (Criteria) this;
        }

        public Criteria andSpaceItemIdIsNull() {
            addCriterion("space_item_id is null");
            return (Criteria) this;
        }

        public Criteria andSpaceItemIdIsNotNull() {
            addCriterion("space_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceItemIdEqualTo(Long value) {
            addCriterion("space_item_id =", value, "spaceItemId");
            return (Criteria) this;
        }

        public Criteria andSpaceItemIdNotEqualTo(Long value) {
            addCriterion("space_item_id <>", value, "spaceItemId");
            return (Criteria) this;
        }

        public Criteria andSpaceItemIdGreaterThan(Long value) {
            addCriterion("space_item_id >", value, "spaceItemId");
            return (Criteria) this;
        }

        public Criteria andSpaceItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("space_item_id >=", value, "spaceItemId");
            return (Criteria) this;
        }

        public Criteria andSpaceItemIdLessThan(Long value) {
            addCriterion("space_item_id <", value, "spaceItemId");
            return (Criteria) this;
        }

        public Criteria andSpaceItemIdLessThanOrEqualTo(Long value) {
            addCriterion("space_item_id <=", value, "spaceItemId");
            return (Criteria) this;
        }

        public Criteria andSpaceItemIdIn(List<Long> values) {
            addCriterion("space_item_id in", values, "spaceItemId");
            return (Criteria) this;
        }

        public Criteria andSpaceItemIdNotIn(List<Long> values) {
            addCriterion("space_item_id not in", values, "spaceItemId");
            return (Criteria) this;
        }

        public Criteria andSpaceItemIdBetween(Long value1, Long value2) {
            addCriterion("space_item_id between", value1, value2, "spaceItemId");
            return (Criteria) this;
        }

        public Criteria andSpaceItemIdNotBetween(Long value1, Long value2) {
            addCriterion("space_item_id not between", value1, value2, "spaceItemId");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("num not between", value1, value2, "num");
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