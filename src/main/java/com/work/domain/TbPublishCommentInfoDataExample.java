package com.work.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPublishCommentInfoDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPublishCommentInfoDataExample() {
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

        public Criteria andDynamictidIsNull() {
            addCriterion("dynamictid is null");
            return (Criteria) this;
        }

        public Criteria andDynamictidIsNotNull() {
            addCriterion("dynamictid is not null");
            return (Criteria) this;
        }

        public Criteria andDynamictidEqualTo(String value) {
            addCriterion("dynamictid =", value, "dynamictid");
            return (Criteria) this;
        }

        public Criteria andDynamictidNotEqualTo(String value) {
            addCriterion("dynamictid <>", value, "dynamictid");
            return (Criteria) this;
        }

        public Criteria andDynamictidGreaterThan(String value) {
            addCriterion("dynamictid >", value, "dynamictid");
            return (Criteria) this;
        }

        public Criteria andDynamictidGreaterThanOrEqualTo(String value) {
            addCriterion("dynamictid >=", value, "dynamictid");
            return (Criteria) this;
        }

        public Criteria andDynamictidLessThan(String value) {
            addCriterion("dynamictid <", value, "dynamictid");
            return (Criteria) this;
        }

        public Criteria andDynamictidLessThanOrEqualTo(String value) {
            addCriterion("dynamictid <=", value, "dynamictid");
            return (Criteria) this;
        }

        public Criteria andDynamictidLike(String value) {
            addCriterion("dynamictid like", value, "dynamictid");
            return (Criteria) this;
        }

        public Criteria andDynamictidNotLike(String value) {
            addCriterion("dynamictid not like", value, "dynamictid");
            return (Criteria) this;
        }

        public Criteria andDynamictidIn(List<String> values) {
            addCriterion("dynamictid in", values, "dynamictid");
            return (Criteria) this;
        }

        public Criteria andDynamictidNotIn(List<String> values) {
            addCriterion("dynamictid not in", values, "dynamictid");
            return (Criteria) this;
        }

        public Criteria andDynamictidBetween(String value1, String value2) {
            addCriterion("dynamictid between", value1, value2, "dynamictid");
            return (Criteria) this;
        }

        public Criteria andDynamictidNotBetween(String value1, String value2) {
            addCriterion("dynamictid not between", value1, value2, "dynamictid");
            return (Criteria) this;
        }

        public Criteria andSenduseridIsNull() {
            addCriterion("senduserid is null");
            return (Criteria) this;
        }

        public Criteria andSenduseridIsNotNull() {
            addCriterion("senduserid is not null");
            return (Criteria) this;
        }

        public Criteria andSenduseridEqualTo(String value) {
            addCriterion("senduserid =", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridNotEqualTo(String value) {
            addCriterion("senduserid <>", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridGreaterThan(String value) {
            addCriterion("senduserid >", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridGreaterThanOrEqualTo(String value) {
            addCriterion("senduserid >=", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridLessThan(String value) {
            addCriterion("senduserid <", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridLessThanOrEqualTo(String value) {
            addCriterion("senduserid <=", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridLike(String value) {
            addCriterion("senduserid like", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridNotLike(String value) {
            addCriterion("senduserid not like", value, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridIn(List<String> values) {
            addCriterion("senduserid in", values, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridNotIn(List<String> values) {
            addCriterion("senduserid not in", values, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridBetween(String value1, String value2) {
            addCriterion("senduserid between", value1, value2, "senduserid");
            return (Criteria) this;
        }

        public Criteria andSenduseridNotBetween(String value1, String value2) {
            addCriterion("senduserid not between", value1, value2, "senduserid");
            return (Criteria) this;
        }

        public Criteria andMsgtypeIsNull() {
            addCriterion("msgtype is null");
            return (Criteria) this;
        }

        public Criteria andMsgtypeIsNotNull() {
            addCriterion("msgtype is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtypeEqualTo(String value) {
            addCriterion("msgtype =", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotEqualTo(String value) {
            addCriterion("msgtype <>", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeGreaterThan(String value) {
            addCriterion("msgtype >", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeGreaterThanOrEqualTo(String value) {
            addCriterion("msgtype >=", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeLessThan(String value) {
            addCriterion("msgtype <", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeLessThanOrEqualTo(String value) {
            addCriterion("msgtype <=", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeLike(String value) {
            addCriterion("msgtype like", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotLike(String value) {
            addCriterion("msgtype not like", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeIn(List<String> values) {
            addCriterion("msgtype in", values, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotIn(List<String> values) {
            addCriterion("msgtype not in", values, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeBetween(String value1, String value2) {
            addCriterion("msgtype between", value1, value2, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotBetween(String value1, String value2) {
            addCriterion("msgtype not between", value1, value2, "msgtype");
            return (Criteria) this;
        }

        public Criteria andReplyeduseridIsNull() {
            addCriterion("replyeduserid is null");
            return (Criteria) this;
        }

        public Criteria andReplyeduseridIsNotNull() {
            addCriterion("replyeduserid is not null");
            return (Criteria) this;
        }

        public Criteria andReplyeduseridEqualTo(String value) {
            addCriterion("replyeduserid =", value, "replyeduserid");
            return (Criteria) this;
        }

        public Criteria andReplyeduseridNotEqualTo(String value) {
            addCriterion("replyeduserid <>", value, "replyeduserid");
            return (Criteria) this;
        }

        public Criteria andReplyeduseridGreaterThan(String value) {
            addCriterion("replyeduserid >", value, "replyeduserid");
            return (Criteria) this;
        }

        public Criteria andReplyeduseridGreaterThanOrEqualTo(String value) {
            addCriterion("replyeduserid >=", value, "replyeduserid");
            return (Criteria) this;
        }

        public Criteria andReplyeduseridLessThan(String value) {
            addCriterion("replyeduserid <", value, "replyeduserid");
            return (Criteria) this;
        }

        public Criteria andReplyeduseridLessThanOrEqualTo(String value) {
            addCriterion("replyeduserid <=", value, "replyeduserid");
            return (Criteria) this;
        }

        public Criteria andReplyeduseridLike(String value) {
            addCriterion("replyeduserid like", value, "replyeduserid");
            return (Criteria) this;
        }

        public Criteria andReplyeduseridNotLike(String value) {
            addCriterion("replyeduserid not like", value, "replyeduserid");
            return (Criteria) this;
        }

        public Criteria andReplyeduseridIn(List<String> values) {
            addCriterion("replyeduserid in", values, "replyeduserid");
            return (Criteria) this;
        }

        public Criteria andReplyeduseridNotIn(List<String> values) {
            addCriterion("replyeduserid not in", values, "replyeduserid");
            return (Criteria) this;
        }

        public Criteria andReplyeduseridBetween(String value1, String value2) {
            addCriterion("replyeduserid between", value1, value2, "replyeduserid");
            return (Criteria) this;
        }

        public Criteria andReplyeduseridNotBetween(String value1, String value2) {
            addCriterion("replyeduserid not between", value1, value2, "replyeduserid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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