package com.work.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbGiftGiveInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGiftGiveInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGiveuseridIsNull() {
            addCriterion("giveuserid is null");
            return (Criteria) this;
        }

        public Criteria andGiveuseridIsNotNull() {
            addCriterion("giveuserid is not null");
            return (Criteria) this;
        }

        public Criteria andGiveuseridEqualTo(String value) {
            addCriterion("giveuserid =", value, "giveuserid");
            return (Criteria) this;
        }

        public Criteria andGiveuseridNotEqualTo(String value) {
            addCriterion("giveuserid <>", value, "giveuserid");
            return (Criteria) this;
        }

        public Criteria andGiveuseridGreaterThan(String value) {
            addCriterion("giveuserid >", value, "giveuserid");
            return (Criteria) this;
        }

        public Criteria andGiveuseridGreaterThanOrEqualTo(String value) {
            addCriterion("giveuserid >=", value, "giveuserid");
            return (Criteria) this;
        }

        public Criteria andGiveuseridLessThan(String value) {
            addCriterion("giveuserid <", value, "giveuserid");
            return (Criteria) this;
        }

        public Criteria andGiveuseridLessThanOrEqualTo(String value) {
            addCriterion("giveuserid <=", value, "giveuserid");
            return (Criteria) this;
        }

        public Criteria andGiveuseridLike(String value) {
            addCriterion("giveuserid like", value, "giveuserid");
            return (Criteria) this;
        }

        public Criteria andGiveuseridNotLike(String value) {
            addCriterion("giveuserid not like", value, "giveuserid");
            return (Criteria) this;
        }

        public Criteria andGiveuseridIn(List<String> values) {
            addCriterion("giveuserid in", values, "giveuserid");
            return (Criteria) this;
        }

        public Criteria andGiveuseridNotIn(List<String> values) {
            addCriterion("giveuserid not in", values, "giveuserid");
            return (Criteria) this;
        }

        public Criteria andGiveuseridBetween(String value1, String value2) {
            addCriterion("giveuserid between", value1, value2, "giveuserid");
            return (Criteria) this;
        }

        public Criteria andGiveuseridNotBetween(String value1, String value2) {
            addCriterion("giveuserid not between", value1, value2, "giveuserid");
            return (Criteria) this;
        }

        public Criteria andBegiveuseridIsNull() {
            addCriterion("begiveuserid is null");
            return (Criteria) this;
        }

        public Criteria andBegiveuseridIsNotNull() {
            addCriterion("begiveuserid is not null");
            return (Criteria) this;
        }

        public Criteria andBegiveuseridEqualTo(String value) {
            addCriterion("begiveuserid =", value, "begiveuserid");
            return (Criteria) this;
        }

        public Criteria andBegiveuseridNotEqualTo(String value) {
            addCriterion("begiveuserid <>", value, "begiveuserid");
            return (Criteria) this;
        }

        public Criteria andBegiveuseridGreaterThan(String value) {
            addCriterion("begiveuserid >", value, "begiveuserid");
            return (Criteria) this;
        }

        public Criteria andBegiveuseridGreaterThanOrEqualTo(String value) {
            addCriterion("begiveuserid >=", value, "begiveuserid");
            return (Criteria) this;
        }

        public Criteria andBegiveuseridLessThan(String value) {
            addCriterion("begiveuserid <", value, "begiveuserid");
            return (Criteria) this;
        }

        public Criteria andBegiveuseridLessThanOrEqualTo(String value) {
            addCriterion("begiveuserid <=", value, "begiveuserid");
            return (Criteria) this;
        }

        public Criteria andBegiveuseridLike(String value) {
            addCriterion("begiveuserid like", value, "begiveuserid");
            return (Criteria) this;
        }

        public Criteria andBegiveuseridNotLike(String value) {
            addCriterion("begiveuserid not like", value, "begiveuserid");
            return (Criteria) this;
        }

        public Criteria andBegiveuseridIn(List<String> values) {
            addCriterion("begiveuserid in", values, "begiveuserid");
            return (Criteria) this;
        }

        public Criteria andBegiveuseridNotIn(List<String> values) {
            addCriterion("begiveuserid not in", values, "begiveuserid");
            return (Criteria) this;
        }

        public Criteria andBegiveuseridBetween(String value1, String value2) {
            addCriterion("begiveuserid between", value1, value2, "begiveuserid");
            return (Criteria) this;
        }

        public Criteria andBegiveuseridNotBetween(String value1, String value2) {
            addCriterion("begiveuserid not between", value1, value2, "begiveuserid");
            return (Criteria) this;
        }

        public Criteria andGiftidIsNull() {
            addCriterion("giftid is null");
            return (Criteria) this;
        }

        public Criteria andGiftidIsNotNull() {
            addCriterion("giftid is not null");
            return (Criteria) this;
        }

        public Criteria andGiftidEqualTo(String value) {
            addCriterion("giftid =", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidNotEqualTo(String value) {
            addCriterion("giftid <>", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidGreaterThan(String value) {
            addCriterion("giftid >", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidGreaterThanOrEqualTo(String value) {
            addCriterion("giftid >=", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidLessThan(String value) {
            addCriterion("giftid <", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidLessThanOrEqualTo(String value) {
            addCriterion("giftid <=", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidLike(String value) {
            addCriterion("giftid like", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidNotLike(String value) {
            addCriterion("giftid not like", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidIn(List<String> values) {
            addCriterion("giftid in", values, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidNotIn(List<String> values) {
            addCriterion("giftid not in", values, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidBetween(String value1, String value2) {
            addCriterion("giftid between", value1, value2, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidNotBetween(String value1, String value2) {
            addCriterion("giftid not between", value1, value2, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftnumIsNull() {
            addCriterion("giftnum is null");
            return (Criteria) this;
        }

        public Criteria andGiftnumIsNotNull() {
            addCriterion("giftnum is not null");
            return (Criteria) this;
        }

        public Criteria andGiftnumEqualTo(Integer value) {
            addCriterion("giftnum =", value, "giftnum");
            return (Criteria) this;
        }

        public Criteria andGiftnumNotEqualTo(Integer value) {
            addCriterion("giftnum <>", value, "giftnum");
            return (Criteria) this;
        }

        public Criteria andGiftnumGreaterThan(Integer value) {
            addCriterion("giftnum >", value, "giftnum");
            return (Criteria) this;
        }

        public Criteria andGiftnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("giftnum >=", value, "giftnum");
            return (Criteria) this;
        }

        public Criteria andGiftnumLessThan(Integer value) {
            addCriterion("giftnum <", value, "giftnum");
            return (Criteria) this;
        }

        public Criteria andGiftnumLessThanOrEqualTo(Integer value) {
            addCriterion("giftnum <=", value, "giftnum");
            return (Criteria) this;
        }

        public Criteria andGiftnumIn(List<Integer> values) {
            addCriterion("giftnum in", values, "giftnum");
            return (Criteria) this;
        }

        public Criteria andGiftnumNotIn(List<Integer> values) {
            addCriterion("giftnum not in", values, "giftnum");
            return (Criteria) this;
        }

        public Criteria andGiftnumBetween(Integer value1, Integer value2) {
            addCriterion("giftnum between", value1, value2, "giftnum");
            return (Criteria) this;
        }

        public Criteria andGiftnumNotBetween(Integer value1, Integer value2) {
            addCriterion("giftnum not between", value1, value2, "giftnum");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
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