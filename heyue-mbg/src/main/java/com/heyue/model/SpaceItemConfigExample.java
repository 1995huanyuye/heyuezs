package com.heyue.model;

import java.util.ArrayList;
import java.util.List;

public class SpaceItemConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpaceItemConfigExample() {
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

        public Criteria andSpaceConfigIdIsNull() {
            addCriterion("space_config_id is null");
            return (Criteria) this;
        }

        public Criteria andSpaceConfigIdIsNotNull() {
            addCriterion("space_config_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceConfigIdEqualTo(Long value) {
            addCriterion("space_config_id =", value, "spaceConfigId");
            return (Criteria) this;
        }

        public Criteria andSpaceConfigIdNotEqualTo(Long value) {
            addCriterion("space_config_id <>", value, "spaceConfigId");
            return (Criteria) this;
        }

        public Criteria andSpaceConfigIdGreaterThan(Long value) {
            addCriterion("space_config_id >", value, "spaceConfigId");
            return (Criteria) this;
        }

        public Criteria andSpaceConfigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("space_config_id >=", value, "spaceConfigId");
            return (Criteria) this;
        }

        public Criteria andSpaceConfigIdLessThan(Long value) {
            addCriterion("space_config_id <", value, "spaceConfigId");
            return (Criteria) this;
        }

        public Criteria andSpaceConfigIdLessThanOrEqualTo(Long value) {
            addCriterion("space_config_id <=", value, "spaceConfigId");
            return (Criteria) this;
        }

        public Criteria andSpaceConfigIdIn(List<Long> values) {
            addCriterion("space_config_id in", values, "spaceConfigId");
            return (Criteria) this;
        }

        public Criteria andSpaceConfigIdNotIn(List<Long> values) {
            addCriterion("space_config_id not in", values, "spaceConfigId");
            return (Criteria) this;
        }

        public Criteria andSpaceConfigIdBetween(Long value1, Long value2) {
            addCriterion("space_config_id between", value1, value2, "spaceConfigId");
            return (Criteria) this;
        }

        public Criteria andSpaceConfigIdNotBetween(Long value1, Long value2) {
            addCriterion("space_config_id not between", value1, value2, "spaceConfigId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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

        public Criteria andQuotaIsNull() {
            addCriterion("quota is null");
            return (Criteria) this;
        }

        public Criteria andQuotaIsNotNull() {
            addCriterion("quota is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaEqualTo(Integer value) {
            addCriterion("quota =", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotEqualTo(Integer value) {
            addCriterion("quota <>", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThan(Integer value) {
            addCriterion("quota >", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("quota >=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThan(Integer value) {
            addCriterion("quota <", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThanOrEqualTo(Integer value) {
            addCriterion("quota <=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaIn(List<Integer> values) {
            addCriterion("quota in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotIn(List<Integer> values) {
            addCriterion("quota not in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaBetween(Integer value1, Integer value2) {
            addCriterion("quota between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("quota not between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andQuantifyIsNull() {
            addCriterion("quantify is null");
            return (Criteria) this;
        }

        public Criteria andQuantifyIsNotNull() {
            addCriterion("quantify is not null");
            return (Criteria) this;
        }

        public Criteria andQuantifyEqualTo(Integer value) {
            addCriterion("quantify =", value, "quantify");
            return (Criteria) this;
        }

        public Criteria andQuantifyNotEqualTo(Integer value) {
            addCriterion("quantify <>", value, "quantify");
            return (Criteria) this;
        }

        public Criteria andQuantifyGreaterThan(Integer value) {
            addCriterion("quantify >", value, "quantify");
            return (Criteria) this;
        }

        public Criteria andQuantifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantify >=", value, "quantify");
            return (Criteria) this;
        }

        public Criteria andQuantifyLessThan(Integer value) {
            addCriterion("quantify <", value, "quantify");
            return (Criteria) this;
        }

        public Criteria andQuantifyLessThanOrEqualTo(Integer value) {
            addCriterion("quantify <=", value, "quantify");
            return (Criteria) this;
        }

        public Criteria andQuantifyIn(List<Integer> values) {
            addCriterion("quantify in", values, "quantify");
            return (Criteria) this;
        }

        public Criteria andQuantifyNotIn(List<Integer> values) {
            addCriterion("quantify not in", values, "quantify");
            return (Criteria) this;
        }

        public Criteria andQuantifyBetween(Integer value1, Integer value2) {
            addCriterion("quantify between", value1, value2, "quantify");
            return (Criteria) this;
        }

        public Criteria andQuantifyNotBetween(Integer value1, Integer value2) {
            addCriterion("quantify not between", value1, value2, "quantify");
            return (Criteria) this;
        }

        public Criteria andRegularIsNull() {
            addCriterion("regular is null");
            return (Criteria) this;
        }

        public Criteria andRegularIsNotNull() {
            addCriterion("regular is not null");
            return (Criteria) this;
        }

        public Criteria andRegularEqualTo(Integer value) {
            addCriterion("regular =", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularNotEqualTo(Integer value) {
            addCriterion("regular <>", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularGreaterThan(Integer value) {
            addCriterion("regular >", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularGreaterThanOrEqualTo(Integer value) {
            addCriterion("regular >=", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularLessThan(Integer value) {
            addCriterion("regular <", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularLessThanOrEqualTo(Integer value) {
            addCriterion("regular <=", value, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularIn(List<Integer> values) {
            addCriterion("regular in", values, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularNotIn(List<Integer> values) {
            addCriterion("regular not in", values, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularBetween(Integer value1, Integer value2) {
            addCriterion("regular between", value1, value2, "regular");
            return (Criteria) this;
        }

        public Criteria andRegularNotBetween(Integer value1, Integer value2) {
            addCriterion("regular not between", value1, value2, "regular");
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