package com.heyue.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClientDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientDetailExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(Long value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(Long value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(Long value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(Long value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(Long value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(Long value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<Long> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<Long> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(Long value1, Long value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(Long value1, Long value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeIsNull() {
            addCriterion("quotation_type is null");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeIsNotNull() {
            addCriterion("quotation_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeEqualTo(String value) {
            addCriterion("quotation_type =", value, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeNotEqualTo(String value) {
            addCriterion("quotation_type <>", value, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeGreaterThan(String value) {
            addCriterion("quotation_type >", value, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("quotation_type >=", value, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeLessThan(String value) {
            addCriterion("quotation_type <", value, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeLessThanOrEqualTo(String value) {
            addCriterion("quotation_type <=", value, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeLike(String value) {
            addCriterion("quotation_type like", value, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeNotLike(String value) {
            addCriterion("quotation_type not like", value, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeIn(List<String> values) {
            addCriterion("quotation_type in", values, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeNotIn(List<String> values) {
            addCriterion("quotation_type not in", values, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeBetween(String value1, String value2) {
            addCriterion("quotation_type between", value1, value2, "quotationType");
            return (Criteria) this;
        }

        public Criteria andQuotationTypeNotBetween(String value1, String value2) {
            addCriterion("quotation_type not between", value1, value2, "quotationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeIsNull() {
            addCriterion("decoration_type is null");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeIsNotNull() {
            addCriterion("decoration_type is not null");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeEqualTo(String value) {
            addCriterion("decoration_type =", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeNotEqualTo(String value) {
            addCriterion("decoration_type <>", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeGreaterThan(String value) {
            addCriterion("decoration_type >", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("decoration_type >=", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeLessThan(String value) {
            addCriterion("decoration_type <", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeLessThanOrEqualTo(String value) {
            addCriterion("decoration_type <=", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeLike(String value) {
            addCriterion("decoration_type like", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeNotLike(String value) {
            addCriterion("decoration_type not like", value, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeIn(List<String> values) {
            addCriterion("decoration_type in", values, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeNotIn(List<String> values) {
            addCriterion("decoration_type not in", values, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeBetween(String value1, String value2) {
            addCriterion("decoration_type between", value1, value2, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDecorationTypeNotBetween(String value1, String value2) {
            addCriterion("decoration_type not between", value1, value2, "decorationType");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusIsNull() {
            addCriterion("delivery_status is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusIsNotNull() {
            addCriterion("delivery_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusEqualTo(Integer value) {
            addCriterion("delivery_status =", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusNotEqualTo(Integer value) {
            addCriterion("delivery_status <>", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusGreaterThan(Integer value) {
            addCriterion("delivery_status >", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_status >=", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusLessThan(Integer value) {
            addCriterion("delivery_status <", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_status <=", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusIn(List<Integer> values) {
            addCriterion("delivery_status in", values, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusNotIn(List<Integer> values) {
            addCriterion("delivery_status not in", values, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusBetween(Integer value1, Integer value2) {
            addCriterion("delivery_status between", value1, value2, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_status not between", value1, value2, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Date value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Date value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Date value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Date value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Date> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Date> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {
            addCriterion("time_limit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {
            addCriterion("time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(Integer value) {
            addCriterion("time_limit =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(Integer value) {
            addCriterion("time_limit <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(Integer value) {
            addCriterion("time_limit >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_limit >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(Integer value) {
            addCriterion("time_limit <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(Integer value) {
            addCriterion("time_limit <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<Integer> values) {
            addCriterion("time_limit in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<Integer> values) {
            addCriterion("time_limit not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(Integer value1, Integer value2) {
            addCriterion("time_limit between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("time_limit not between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayIsNull() {
            addCriterion("client_birthday is null");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayIsNotNull() {
            addCriterion("client_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("client_birthday =", value, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("client_birthday <>", value, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("client_birthday >", value, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("client_birthday >=", value, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("client_birthday <", value, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("client_birthday <=", value, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("client_birthday in", values, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("client_birthday not in", values, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("client_birthday between", value1, value2, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("client_birthday not between", value1, value2, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientAddressIsNull() {
            addCriterion("client_address is null");
            return (Criteria) this;
        }

        public Criteria andClientAddressIsNotNull() {
            addCriterion("client_address is not null");
            return (Criteria) this;
        }

        public Criteria andClientAddressEqualTo(String value) {
            addCriterion("client_address =", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotEqualTo(String value) {
            addCriterion("client_address <>", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressGreaterThan(String value) {
            addCriterion("client_address >", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressGreaterThanOrEqualTo(String value) {
            addCriterion("client_address >=", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressLessThan(String value) {
            addCriterion("client_address <", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressLessThanOrEqualTo(String value) {
            addCriterion("client_address <=", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressLike(String value) {
            addCriterion("client_address like", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotLike(String value) {
            addCriterion("client_address not like", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressIn(List<String> values) {
            addCriterion("client_address in", values, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotIn(List<String> values) {
            addCriterion("client_address not in", values, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressBetween(String value1, String value2) {
            addCriterion("client_address between", value1, value2, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotBetween(String value1, String value2) {
            addCriterion("client_address not between", value1, value2, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andModifyerIsNull() {
            addCriterion("modifyer is null");
            return (Criteria) this;
        }

        public Criteria andModifyerIsNotNull() {
            addCriterion("modifyer is not null");
            return (Criteria) this;
        }

        public Criteria andModifyerEqualTo(Long value) {
            addCriterion("modifyer =", value, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerNotEqualTo(Long value) {
            addCriterion("modifyer <>", value, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerGreaterThan(Long value) {
            addCriterion("modifyer >", value, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerGreaterThanOrEqualTo(Long value) {
            addCriterion("modifyer >=", value, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerLessThan(Long value) {
            addCriterion("modifyer <", value, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerLessThanOrEqualTo(Long value) {
            addCriterion("modifyer <=", value, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerIn(List<Long> values) {
            addCriterion("modifyer in", values, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerNotIn(List<Long> values) {
            addCriterion("modifyer not in", values, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerBetween(Long value1, Long value2) {
            addCriterion("modifyer between", value1, value2, "modifyer");
            return (Criteria) this;
        }

        public Criteria andModifyerNotBetween(Long value1, Long value2) {
            addCriterion("modifyer not between", value1, value2, "modifyer");
            return (Criteria) this;
        }

        public Criteria andIspublicIsNull() {
            addCriterion("ispublic is null");
            return (Criteria) this;
        }

        public Criteria andIspublicIsNotNull() {
            addCriterion("ispublic is not null");
            return (Criteria) this;
        }

        public Criteria andIspublicEqualTo(Integer value) {
            addCriterion("ispublic =", value, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicNotEqualTo(Integer value) {
            addCriterion("ispublic <>", value, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicGreaterThan(Integer value) {
            addCriterion("ispublic >", value, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicGreaterThanOrEqualTo(Integer value) {
            addCriterion("ispublic >=", value, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicLessThan(Integer value) {
            addCriterion("ispublic <", value, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicLessThanOrEqualTo(Integer value) {
            addCriterion("ispublic <=", value, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicIn(List<Integer> values) {
            addCriterion("ispublic in", values, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicNotIn(List<Integer> values) {
            addCriterion("ispublic not in", values, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicBetween(Integer value1, Integer value2) {
            addCriterion("ispublic between", value1, value2, "ispublic");
            return (Criteria) this;
        }

        public Criteria andIspublicNotBetween(Integer value1, Integer value2) {
            addCriterion("ispublic not between", value1, value2, "ispublic");
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