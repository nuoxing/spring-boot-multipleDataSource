package com.work.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbFocusUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbFocusUserInfoExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andFocuseduseridIsNull() {
            addCriterion("focuseduserid is null");
            return (Criteria) this;
        }

        public Criteria andFocuseduseridIsNotNull() {
            addCriterion("focuseduserid is not null");
            return (Criteria) this;
        }

        public Criteria andFocuseduseridEqualTo(String value) {
            addCriterion("focuseduserid =", value, "focuseduserid");
            return (Criteria) this;
        }

        public Criteria andFocuseduseridNotEqualTo(String value) {
            addCriterion("focuseduserid <>", value, "focuseduserid");
            return (Criteria) this;
        }

        public Criteria andFocuseduseridGreaterThan(String value) {
            addCriterion("focuseduserid >", value, "focuseduserid");
            return (Criteria) this;
        }

        public Criteria andFocuseduseridGreaterThanOrEqualTo(String value) {
            addCriterion("focuseduserid >=", value, "focuseduserid");
            return (Criteria) this;
        }

        public Criteria andFocuseduseridLessThan(String value) {
            addCriterion("focuseduserid <", value, "focuseduserid");
            return (Criteria) this;
        }

        public Criteria andFocuseduseridLessThanOrEqualTo(String value) {
            addCriterion("focuseduserid <=", value, "focuseduserid");
            return (Criteria) this;
        }

        public Criteria andFocuseduseridLike(String value) {
            addCriterion("focuseduserid like", value, "focuseduserid");
            return (Criteria) this;
        }

        public Criteria andFocuseduseridNotLike(String value) {
            addCriterion("focuseduserid not like", value, "focuseduserid");
            return (Criteria) this;
        }

        public Criteria andFocuseduseridIn(List<String> values) {
            addCriterion("focuseduserid in", values, "focuseduserid");
            return (Criteria) this;
        }

        public Criteria andFocuseduseridNotIn(List<String> values) {
            addCriterion("focuseduserid not in", values, "focuseduserid");
            return (Criteria) this;
        }

        public Criteria andFocuseduseridBetween(String value1, String value2) {
            addCriterion("focuseduserid between", value1, value2, "focuseduserid");
            return (Criteria) this;
        }

        public Criteria andFocuseduseridNotBetween(String value1, String value2) {
            addCriterion("focuseduserid not between", value1, value2, "focuseduserid");
            return (Criteria) this;
        }

        public Criteria andFocusedusernameIsNull() {
            addCriterion("focusedusername is null");
            return (Criteria) this;
        }

        public Criteria andFocusedusernameIsNotNull() {
            addCriterion("focusedusername is not null");
            return (Criteria) this;
        }

        public Criteria andFocusedusernameEqualTo(String value) {
            addCriterion("focusedusername =", value, "focusedusername");
            return (Criteria) this;
        }

        public Criteria andFocusedusernameNotEqualTo(String value) {
            addCriterion("focusedusername <>", value, "focusedusername");
            return (Criteria) this;
        }

        public Criteria andFocusedusernameGreaterThan(String value) {
            addCriterion("focusedusername >", value, "focusedusername");
            return (Criteria) this;
        }

        public Criteria andFocusedusernameGreaterThanOrEqualTo(String value) {
            addCriterion("focusedusername >=", value, "focusedusername");
            return (Criteria) this;
        }

        public Criteria andFocusedusernameLessThan(String value) {
            addCriterion("focusedusername <", value, "focusedusername");
            return (Criteria) this;
        }

        public Criteria andFocusedusernameLessThanOrEqualTo(String value) {
            addCriterion("focusedusername <=", value, "focusedusername");
            return (Criteria) this;
        }

        public Criteria andFocusedusernameLike(String value) {
            addCriterion("focusedusername like", value, "focusedusername");
            return (Criteria) this;
        }

        public Criteria andFocusedusernameNotLike(String value) {
            addCriterion("focusedusername not like", value, "focusedusername");
            return (Criteria) this;
        }

        public Criteria andFocusedusernameIn(List<String> values) {
            addCriterion("focusedusername in", values, "focusedusername");
            return (Criteria) this;
        }

        public Criteria andFocusedusernameNotIn(List<String> values) {
            addCriterion("focusedusername not in", values, "focusedusername");
            return (Criteria) this;
        }

        public Criteria andFocusedusernameBetween(String value1, String value2) {
            addCriterion("focusedusername between", value1, value2, "focusedusername");
            return (Criteria) this;
        }

        public Criteria andFocusedusernameNotBetween(String value1, String value2) {
            addCriterion("focusedusername not between", value1, value2, "focusedusername");
            return (Criteria) this;
        }

        public Criteria andFocuseduserpictureIsNull() {
            addCriterion("focuseduserpicture is null");
            return (Criteria) this;
        }

        public Criteria andFocuseduserpictureIsNotNull() {
            addCriterion("focuseduserpicture is not null");
            return (Criteria) this;
        }

        public Criteria andFocuseduserpictureEqualTo(String value) {
            addCriterion("focuseduserpicture =", value, "focuseduserpicture");
            return (Criteria) this;
        }

        public Criteria andFocuseduserpictureNotEqualTo(String value) {
            addCriterion("focuseduserpicture <>", value, "focuseduserpicture");
            return (Criteria) this;
        }

        public Criteria andFocuseduserpictureGreaterThan(String value) {
            addCriterion("focuseduserpicture >", value, "focuseduserpicture");
            return (Criteria) this;
        }

        public Criteria andFocuseduserpictureGreaterThanOrEqualTo(String value) {
            addCriterion("focuseduserpicture >=", value, "focuseduserpicture");
            return (Criteria) this;
        }

        public Criteria andFocuseduserpictureLessThan(String value) {
            addCriterion("focuseduserpicture <", value, "focuseduserpicture");
            return (Criteria) this;
        }

        public Criteria andFocuseduserpictureLessThanOrEqualTo(String value) {
            addCriterion("focuseduserpicture <=", value, "focuseduserpicture");
            return (Criteria) this;
        }

        public Criteria andFocuseduserpictureLike(String value) {
            addCriterion("focuseduserpicture like", value, "focuseduserpicture");
            return (Criteria) this;
        }

        public Criteria andFocuseduserpictureNotLike(String value) {
            addCriterion("focuseduserpicture not like", value, "focuseduserpicture");
            return (Criteria) this;
        }

        public Criteria andFocuseduserpictureIn(List<String> values) {
            addCriterion("focuseduserpicture in", values, "focuseduserpicture");
            return (Criteria) this;
        }

        public Criteria andFocuseduserpictureNotIn(List<String> values) {
            addCriterion("focuseduserpicture not in", values, "focuseduserpicture");
            return (Criteria) this;
        }

        public Criteria andFocuseduserpictureBetween(String value1, String value2) {
            addCriterion("focuseduserpicture between", value1, value2, "focuseduserpicture");
            return (Criteria) this;
        }

        public Criteria andFocuseduserpictureNotBetween(String value1, String value2) {
            addCriterion("focuseduserpicture not between", value1, value2, "focuseduserpicture");
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