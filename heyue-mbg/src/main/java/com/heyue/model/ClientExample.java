package com.heyue.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientExample() {
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

        public Criteria andClientNameIsNull() {
            addCriterion("client_name is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("client_name is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("client_name =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("client_name <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("client_name >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("client_name >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("client_name <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("client_name <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("client_name like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("client_name not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("client_name in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("client_name not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("client_name between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("client_name not between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andClientResourceIsNull() {
            addCriterion("client_resource is null");
            return (Criteria) this;
        }

        public Criteria andClientResourceIsNotNull() {
            addCriterion("client_resource is not null");
            return (Criteria) this;
        }

        public Criteria andClientResourceEqualTo(Integer value) {
            addCriterion("client_resource =", value, "clientResource");
            return (Criteria) this;
        }

        public Criteria andClientResourceNotEqualTo(Integer value) {
            addCriterion("client_resource <>", value, "clientResource");
            return (Criteria) this;
        }

        public Criteria andClientResourceGreaterThan(Integer value) {
            addCriterion("client_resource >", value, "clientResource");
            return (Criteria) this;
        }

        public Criteria andClientResourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_resource >=", value, "clientResource");
            return (Criteria) this;
        }

        public Criteria andClientResourceLessThan(Integer value) {
            addCriterion("client_resource <", value, "clientResource");
            return (Criteria) this;
        }

        public Criteria andClientResourceLessThanOrEqualTo(Integer value) {
            addCriterion("client_resource <=", value, "clientResource");
            return (Criteria) this;
        }

        public Criteria andClientResourceIn(List<Integer> values) {
            addCriterion("client_resource in", values, "clientResource");
            return (Criteria) this;
        }

        public Criteria andClientResourceNotIn(List<Integer> values) {
            addCriterion("client_resource not in", values, "clientResource");
            return (Criteria) this;
        }

        public Criteria andClientResourceBetween(Integer value1, Integer value2) {
            addCriterion("client_resource between", value1, value2, "clientResource");
            return (Criteria) this;
        }

        public Criteria andClientResourceNotBetween(Integer value1, Integer value2) {
            addCriterion("client_resource not between", value1, value2, "clientResource");
            return (Criteria) this;
        }

        public Criteria andProviderIsNull() {
            addCriterion("provider is null");
            return (Criteria) this;
        }

        public Criteria andProviderIsNotNull() {
            addCriterion("provider is not null");
            return (Criteria) this;
        }

        public Criteria andProviderEqualTo(Long value) {
            addCriterion("provider =", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotEqualTo(Long value) {
            addCriterion("provider <>", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderGreaterThan(Long value) {
            addCriterion("provider >", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderGreaterThanOrEqualTo(Long value) {
            addCriterion("provider >=", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLessThan(Long value) {
            addCriterion("provider <", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLessThanOrEqualTo(Long value) {
            addCriterion("provider <=", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderIn(List<Long> values) {
            addCriterion("provider in", values, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotIn(List<Long> values) {
            addCriterion("provider not in", values, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderBetween(Long value1, Long value2) {
            addCriterion("provider between", value1, value2, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotBetween(Long value1, Long value2) {
            addCriterion("provider not between", value1, value2, "provider");
            return (Criteria) this;
        }

        public Criteria andVoteIsNull() {
            addCriterion("vote is null");
            return (Criteria) this;
        }

        public Criteria andVoteIsNotNull() {
            addCriterion("vote is not null");
            return (Criteria) this;
        }

        public Criteria andVoteEqualTo(String value) {
            addCriterion("vote =", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteNotEqualTo(String value) {
            addCriterion("vote <>", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteGreaterThan(String value) {
            addCriterion("vote >", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteGreaterThanOrEqualTo(String value) {
            addCriterion("vote >=", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteLessThan(String value) {
            addCriterion("vote <", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteLessThanOrEqualTo(String value) {
            addCriterion("vote <=", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteLike(String value) {
            addCriterion("vote like", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteNotLike(String value) {
            addCriterion("vote not like", value, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteIn(List<String> values) {
            addCriterion("vote in", values, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteNotIn(List<String> values) {
            addCriterion("vote not in", values, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteBetween(String value1, String value2) {
            addCriterion("vote between", value1, value2, "vote");
            return (Criteria) this;
        }

        public Criteria andVoteNotBetween(String value1, String value2) {
            addCriterion("vote not between", value1, value2, "vote");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectAddressIsNull() {
            addCriterion("project_address is null");
            return (Criteria) this;
        }

        public Criteria andProjectAddressIsNotNull() {
            addCriterion("project_address is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAddressEqualTo(String value) {
            addCriterion("project_address =", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotEqualTo(String value) {
            addCriterion("project_address <>", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressGreaterThan(String value) {
            addCriterion("project_address >", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressGreaterThanOrEqualTo(String value) {
            addCriterion("project_address >=", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressLessThan(String value) {
            addCriterion("project_address <", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressLessThanOrEqualTo(String value) {
            addCriterion("project_address <=", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressLike(String value) {
            addCriterion("project_address like", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotLike(String value) {
            addCriterion("project_address not like", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressIn(List<String> values) {
            addCriterion("project_address in", values, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotIn(List<String> values) {
            addCriterion("project_address not in", values, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressBetween(String value1, String value2) {
            addCriterion("project_address between", value1, value2, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotBetween(String value1, String value2) {
            addCriterion("project_address not between", value1, value2, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andInAreaIsNull() {
            addCriterion("in_area is null");
            return (Criteria) this;
        }

        public Criteria andInAreaIsNotNull() {
            addCriterion("in_area is not null");
            return (Criteria) this;
        }

        public Criteria andInAreaEqualTo(Float value) {
            addCriterion("in_area =", value, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaNotEqualTo(Float value) {
            addCriterion("in_area <>", value, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaGreaterThan(Float value) {
            addCriterion("in_area >", value, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("in_area >=", value, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaLessThan(Float value) {
            addCriterion("in_area <", value, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaLessThanOrEqualTo(Float value) {
            addCriterion("in_area <=", value, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaIn(List<Float> values) {
            addCriterion("in_area in", values, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaNotIn(List<Float> values) {
            addCriterion("in_area not in", values, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaBetween(Float value1, Float value2) {
            addCriterion("in_area between", value1, value2, "inArea");
            return (Criteria) this;
        }

        public Criteria andInAreaNotBetween(Float value1, Float value2) {
            addCriterion("in_area not between", value1, value2, "inArea");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Float value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Float value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Float value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Float value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Float value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Float> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Float> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Float value1, Float value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Float value1, Float value2) {
            addCriterion("area not between", value1, value2, "area");
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

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
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

        public Criteria andCreationtimeIsNull() {
            addCriterion("creationtime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("creationtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Date value) {
            addCriterion("creationtime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Date value) {
            addCriterion("creationtime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Date value) {
            addCriterion("creationtime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creationtime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Date value) {
            addCriterion("creationtime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("creationtime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Date> values) {
            addCriterion("creationtime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Date> values) {
            addCriterion("creationtime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Date value1, Date value2) {
            addCriterion("creationtime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("creationtime not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andFiNoteIsNull() {
            addCriterion("fi_note is null");
            return (Criteria) this;
        }

        public Criteria andFiNoteIsNotNull() {
            addCriterion("fi_note is not null");
            return (Criteria) this;
        }

        public Criteria andFiNoteEqualTo(String value) {
            addCriterion("fi_note =", value, "fiNote");
            return (Criteria) this;
        }

        public Criteria andFiNoteNotEqualTo(String value) {
            addCriterion("fi_note <>", value, "fiNote");
            return (Criteria) this;
        }

        public Criteria andFiNoteGreaterThan(String value) {
            addCriterion("fi_note >", value, "fiNote");
            return (Criteria) this;
        }

        public Criteria andFiNoteGreaterThanOrEqualTo(String value) {
            addCriterion("fi_note >=", value, "fiNote");
            return (Criteria) this;
        }

        public Criteria andFiNoteLessThan(String value) {
            addCriterion("fi_note <", value, "fiNote");
            return (Criteria) this;
        }

        public Criteria andFiNoteLessThanOrEqualTo(String value) {
            addCriterion("fi_note <=", value, "fiNote");
            return (Criteria) this;
        }

        public Criteria andFiNoteLike(String value) {
            addCriterion("fi_note like", value, "fiNote");
            return (Criteria) this;
        }

        public Criteria andFiNoteNotLike(String value) {
            addCriterion("fi_note not like", value, "fiNote");
            return (Criteria) this;
        }

        public Criteria andFiNoteIn(List<String> values) {
            addCriterion("fi_note in", values, "fiNote");
            return (Criteria) this;
        }

        public Criteria andFiNoteNotIn(List<String> values) {
            addCriterion("fi_note not in", values, "fiNote");
            return (Criteria) this;
        }

        public Criteria andFiNoteBetween(String value1, String value2) {
            addCriterion("fi_note between", value1, value2, "fiNote");
            return (Criteria) this;
        }

        public Criteria andFiNoteNotBetween(String value1, String value2) {
            addCriterion("fi_note not between", value1, value2, "fiNote");
            return (Criteria) this;
        }

        public Criteria andProjectNoteIsNull() {
            addCriterion("project_note is null");
            return (Criteria) this;
        }

        public Criteria andProjectNoteIsNotNull() {
            addCriterion("project_note is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNoteEqualTo(String value) {
            addCriterion("project_note =", value, "projectNote");
            return (Criteria) this;
        }

        public Criteria andProjectNoteNotEqualTo(String value) {
            addCriterion("project_note <>", value, "projectNote");
            return (Criteria) this;
        }

        public Criteria andProjectNoteGreaterThan(String value) {
            addCriterion("project_note >", value, "projectNote");
            return (Criteria) this;
        }

        public Criteria andProjectNoteGreaterThanOrEqualTo(String value) {
            addCriterion("project_note >=", value, "projectNote");
            return (Criteria) this;
        }

        public Criteria andProjectNoteLessThan(String value) {
            addCriterion("project_note <", value, "projectNote");
            return (Criteria) this;
        }

        public Criteria andProjectNoteLessThanOrEqualTo(String value) {
            addCriterion("project_note <=", value, "projectNote");
            return (Criteria) this;
        }

        public Criteria andProjectNoteLike(String value) {
            addCriterion("project_note like", value, "projectNote");
            return (Criteria) this;
        }

        public Criteria andProjectNoteNotLike(String value) {
            addCriterion("project_note not like", value, "projectNote");
            return (Criteria) this;
        }

        public Criteria andProjectNoteIn(List<String> values) {
            addCriterion("project_note in", values, "projectNote");
            return (Criteria) this;
        }

        public Criteria andProjectNoteNotIn(List<String> values) {
            addCriterion("project_note not in", values, "projectNote");
            return (Criteria) this;
        }

        public Criteria andProjectNoteBetween(String value1, String value2) {
            addCriterion("project_note between", value1, value2, "projectNote");
            return (Criteria) this;
        }

        public Criteria andProjectNoteNotBetween(String value1, String value2) {
            addCriterion("project_note not between", value1, value2, "projectNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteIsNull() {
            addCriterion("material_note is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteIsNotNull() {
            addCriterion("material_note is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteEqualTo(String value) {
            addCriterion("material_note =", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteNotEqualTo(String value) {
            addCriterion("material_note <>", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteGreaterThan(String value) {
            addCriterion("material_note >", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteGreaterThanOrEqualTo(String value) {
            addCriterion("material_note >=", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteLessThan(String value) {
            addCriterion("material_note <", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteLessThanOrEqualTo(String value) {
            addCriterion("material_note <=", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteLike(String value) {
            addCriterion("material_note like", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteNotLike(String value) {
            addCriterion("material_note not like", value, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteIn(List<String> values) {
            addCriterion("material_note in", values, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteNotIn(List<String> values) {
            addCriterion("material_note not in", values, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteBetween(String value1, String value2) {
            addCriterion("material_note between", value1, value2, "materialNote");
            return (Criteria) this;
        }

        public Criteria andMaterialNoteNotBetween(String value1, String value2) {
            addCriterion("material_note not between", value1, value2, "materialNote");
            return (Criteria) this;
        }

        public Criteria andOtherNoteIsNull() {
            addCriterion("other_note is null");
            return (Criteria) this;
        }

        public Criteria andOtherNoteIsNotNull() {
            addCriterion("other_note is not null");
            return (Criteria) this;
        }

        public Criteria andOtherNoteEqualTo(String value) {
            addCriterion("other_note =", value, "otherNote");
            return (Criteria) this;
        }

        public Criteria andOtherNoteNotEqualTo(String value) {
            addCriterion("other_note <>", value, "otherNote");
            return (Criteria) this;
        }

        public Criteria andOtherNoteGreaterThan(String value) {
            addCriterion("other_note >", value, "otherNote");
            return (Criteria) this;
        }

        public Criteria andOtherNoteGreaterThanOrEqualTo(String value) {
            addCriterion("other_note >=", value, "otherNote");
            return (Criteria) this;
        }

        public Criteria andOtherNoteLessThan(String value) {
            addCriterion("other_note <", value, "otherNote");
            return (Criteria) this;
        }

        public Criteria andOtherNoteLessThanOrEqualTo(String value) {
            addCriterion("other_note <=", value, "otherNote");
            return (Criteria) this;
        }

        public Criteria andOtherNoteLike(String value) {
            addCriterion("other_note like", value, "otherNote");
            return (Criteria) this;
        }

        public Criteria andOtherNoteNotLike(String value) {
            addCriterion("other_note not like", value, "otherNote");
            return (Criteria) this;
        }

        public Criteria andOtherNoteIn(List<String> values) {
            addCriterion("other_note in", values, "otherNote");
            return (Criteria) this;
        }

        public Criteria andOtherNoteNotIn(List<String> values) {
            addCriterion("other_note not in", values, "otherNote");
            return (Criteria) this;
        }

        public Criteria andOtherNoteBetween(String value1, String value2) {
            addCriterion("other_note between", value1, value2, "otherNote");
            return (Criteria) this;
        }

        public Criteria andOtherNoteNotBetween(String value1, String value2) {
            addCriterion("other_note not between", value1, value2, "otherNote");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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