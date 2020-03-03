package com.work.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbGiftInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGiftInfoExample() {
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

        public Criteria andGiftdescIsNull() {
            addCriterion("giftdesc is null");
            return (Criteria) this;
        }

        public Criteria andGiftdescIsNotNull() {
            addCriterion("giftdesc is not null");
            return (Criteria) this;
        }

        public Criteria andGiftdescEqualTo(String value) {
            addCriterion("giftdesc =", value, "giftdesc");
            return (Criteria) this;
        }

        public Criteria andGiftdescNotEqualTo(String value) {
            addCriterion("giftdesc <>", value, "giftdesc");
            return (Criteria) this;
        }

        public Criteria andGiftdescGreaterThan(String value) {
            addCriterion("giftdesc >", value, "giftdesc");
            return (Criteria) this;
        }

        public Criteria andGiftdescGreaterThanOrEqualTo(String value) {
            addCriterion("giftdesc >=", value, "giftdesc");
            return (Criteria) this;
        }

        public Criteria andGiftdescLessThan(String value) {
            addCriterion("giftdesc <", value, "giftdesc");
            return (Criteria) this;
        }

        public Criteria andGiftdescLessThanOrEqualTo(String value) {
            addCriterion("giftdesc <=", value, "giftdesc");
            return (Criteria) this;
        }

        public Criteria andGiftdescLike(String value) {
            addCriterion("giftdesc like", value, "giftdesc");
            return (Criteria) this;
        }

        public Criteria andGiftdescNotLike(String value) {
            addCriterion("giftdesc not like", value, "giftdesc");
            return (Criteria) this;
        }

        public Criteria andGiftdescIn(List<String> values) {
            addCriterion("giftdesc in", values, "giftdesc");
            return (Criteria) this;
        }

        public Criteria andGiftdescNotIn(List<String> values) {
            addCriterion("giftdesc not in", values, "giftdesc");
            return (Criteria) this;
        }

        public Criteria andGiftdescBetween(String value1, String value2) {
            addCriterion("giftdesc between", value1, value2, "giftdesc");
            return (Criteria) this;
        }

        public Criteria andGiftdescNotBetween(String value1, String value2) {
            addCriterion("giftdesc not between", value1, value2, "giftdesc");
            return (Criteria) this;
        }

        public Criteria andGiftpathIsNull() {
            addCriterion("giftpath is null");
            return (Criteria) this;
        }

        public Criteria andGiftpathIsNotNull() {
            addCriterion("giftpath is not null");
            return (Criteria) this;
        }

        public Criteria andGiftpathEqualTo(String value) {
            addCriterion("giftpath =", value, "giftpath");
            return (Criteria) this;
        }

        public Criteria andGiftpathNotEqualTo(String value) {
            addCriterion("giftpath <>", value, "giftpath");
            return (Criteria) this;
        }

        public Criteria andGiftpathGreaterThan(String value) {
            addCriterion("giftpath >", value, "giftpath");
            return (Criteria) this;
        }

        public Criteria andGiftpathGreaterThanOrEqualTo(String value) {
            addCriterion("giftpath >=", value, "giftpath");
            return (Criteria) this;
        }

        public Criteria andGiftpathLessThan(String value) {
            addCriterion("giftpath <", value, "giftpath");
            return (Criteria) this;
        }

        public Criteria andGiftpathLessThanOrEqualTo(String value) {
            addCriterion("giftpath <=", value, "giftpath");
            return (Criteria) this;
        }

        public Criteria andGiftpathLike(String value) {
            addCriterion("giftpath like", value, "giftpath");
            return (Criteria) this;
        }

        public Criteria andGiftpathNotLike(String value) {
            addCriterion("giftpath not like", value, "giftpath");
            return (Criteria) this;
        }

        public Criteria andGiftpathIn(List<String> values) {
            addCriterion("giftpath in", values, "giftpath");
            return (Criteria) this;
        }

        public Criteria andGiftpathNotIn(List<String> values) {
            addCriterion("giftpath not in", values, "giftpath");
            return (Criteria) this;
        }

        public Criteria andGiftpathBetween(String value1, String value2) {
            addCriterion("giftpath between", value1, value2, "giftpath");
            return (Criteria) this;
        }

        public Criteria andGiftpathNotBetween(String value1, String value2) {
            addCriterion("giftpath not between", value1, value2, "giftpath");
            return (Criteria) this;
        }

        public Criteria andGifttypeIsNull() {
            addCriterion("gifttype is null");
            return (Criteria) this;
        }

        public Criteria andGifttypeIsNotNull() {
            addCriterion("gifttype is not null");
            return (Criteria) this;
        }

        public Criteria andGifttypeEqualTo(String value) {
            addCriterion("gifttype =", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeNotEqualTo(String value) {
            addCriterion("gifttype <>", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeGreaterThan(String value) {
            addCriterion("gifttype >", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeGreaterThanOrEqualTo(String value) {
            addCriterion("gifttype >=", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeLessThan(String value) {
            addCriterion("gifttype <", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeLessThanOrEqualTo(String value) {
            addCriterion("gifttype <=", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeLike(String value) {
            addCriterion("gifttype like", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeNotLike(String value) {
            addCriterion("gifttype not like", value, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeIn(List<String> values) {
            addCriterion("gifttype in", values, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeNotIn(List<String> values) {
            addCriterion("gifttype not in", values, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeBetween(String value1, String value2) {
            addCriterion("gifttype between", value1, value2, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGifttypeNotBetween(String value1, String value2) {
            addCriterion("gifttype not between", value1, value2, "gifttype");
            return (Criteria) this;
        }

        public Criteria andGiftcompletepathIsNull() {
            addCriterion("giftcompletepath is null");
            return (Criteria) this;
        }

        public Criteria andGiftcompletepathIsNotNull() {
            addCriterion("giftcompletepath is not null");
            return (Criteria) this;
        }

        public Criteria andGiftcompletepathEqualTo(String value) {
            addCriterion("giftcompletepath =", value, "giftcompletepath");
            return (Criteria) this;
        }

        public Criteria andGiftcompletepathNotEqualTo(String value) {
            addCriterion("giftcompletepath <>", value, "giftcompletepath");
            return (Criteria) this;
        }

        public Criteria andGiftcompletepathGreaterThan(String value) {
            addCriterion("giftcompletepath >", value, "giftcompletepath");
            return (Criteria) this;
        }

        public Criteria andGiftcompletepathGreaterThanOrEqualTo(String value) {
            addCriterion("giftcompletepath >=", value, "giftcompletepath");
            return (Criteria) this;
        }

        public Criteria andGiftcompletepathLessThan(String value) {
            addCriterion("giftcompletepath <", value, "giftcompletepath");
            return (Criteria) this;
        }

        public Criteria andGiftcompletepathLessThanOrEqualTo(String value) {
            addCriterion("giftcompletepath <=", value, "giftcompletepath");
            return (Criteria) this;
        }

        public Criteria andGiftcompletepathLike(String value) {
            addCriterion("giftcompletepath like", value, "giftcompletepath");
            return (Criteria) this;
        }

        public Criteria andGiftcompletepathNotLike(String value) {
            addCriterion("giftcompletepath not like", value, "giftcompletepath");
            return (Criteria) this;
        }

        public Criteria andGiftcompletepathIn(List<String> values) {
            addCriterion("giftcompletepath in", values, "giftcompletepath");
            return (Criteria) this;
        }

        public Criteria andGiftcompletepathNotIn(List<String> values) {
            addCriterion("giftcompletepath not in", values, "giftcompletepath");
            return (Criteria) this;
        }

        public Criteria andGiftcompletepathBetween(String value1, String value2) {
            addCriterion("giftcompletepath between", value1, value2, "giftcompletepath");
            return (Criteria) this;
        }

        public Criteria andGiftcompletepathNotBetween(String value1, String value2) {
            addCriterion("giftcompletepath not between", value1, value2, "giftcompletepath");
            return (Criteria) this;
        }

        public Criteria andPicsizeIsNull() {
            addCriterion("picsize is null");
            return (Criteria) this;
        }

        public Criteria andPicsizeIsNotNull() {
            addCriterion("picsize is not null");
            return (Criteria) this;
        }

        public Criteria andPicsizeEqualTo(Integer value) {
            addCriterion("picsize =", value, "picsize");
            return (Criteria) this;
        }

        public Criteria andPicsizeNotEqualTo(Integer value) {
            addCriterion("picsize <>", value, "picsize");
            return (Criteria) this;
        }

        public Criteria andPicsizeGreaterThan(Integer value) {
            addCriterion("picsize >", value, "picsize");
            return (Criteria) this;
        }

        public Criteria andPicsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("picsize >=", value, "picsize");
            return (Criteria) this;
        }

        public Criteria andPicsizeLessThan(Integer value) {
            addCriterion("picsize <", value, "picsize");
            return (Criteria) this;
        }

        public Criteria andPicsizeLessThanOrEqualTo(Integer value) {
            addCriterion("picsize <=", value, "picsize");
            return (Criteria) this;
        }

        public Criteria andPicsizeIn(List<Integer> values) {
            addCriterion("picsize in", values, "picsize");
            return (Criteria) this;
        }

        public Criteria andPicsizeNotIn(List<Integer> values) {
            addCriterion("picsize not in", values, "picsize");
            return (Criteria) this;
        }

        public Criteria andPicsizeBetween(Integer value1, Integer value2) {
            addCriterion("picsize between", value1, value2, "picsize");
            return (Criteria) this;
        }

        public Criteria andPicsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("picsize not between", value1, value2, "picsize");
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