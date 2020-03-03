package com.work.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPictureInfoDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPictureInfoDataExample() {
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

        public Criteria andPictypeIsNull() {
            addCriterion("pictype is null");
            return (Criteria) this;
        }

        public Criteria andPictypeIsNotNull() {
            addCriterion("pictype is not null");
            return (Criteria) this;
        }

        public Criteria andPictypeEqualTo(String value) {
            addCriterion("pictype =", value, "pictype");
            return (Criteria) this;
        }

        public Criteria andPictypeNotEqualTo(String value) {
            addCriterion("pictype <>", value, "pictype");
            return (Criteria) this;
        }

        public Criteria andPictypeGreaterThan(String value) {
            addCriterion("pictype >", value, "pictype");
            return (Criteria) this;
        }

        public Criteria andPictypeGreaterThanOrEqualTo(String value) {
            addCriterion("pictype >=", value, "pictype");
            return (Criteria) this;
        }

        public Criteria andPictypeLessThan(String value) {
            addCriterion("pictype <", value, "pictype");
            return (Criteria) this;
        }

        public Criteria andPictypeLessThanOrEqualTo(String value) {
            addCriterion("pictype <=", value, "pictype");
            return (Criteria) this;
        }

        public Criteria andPictypeLike(String value) {
            addCriterion("pictype like", value, "pictype");
            return (Criteria) this;
        }

        public Criteria andPictypeNotLike(String value) {
            addCriterion("pictype not like", value, "pictype");
            return (Criteria) this;
        }

        public Criteria andPictypeIn(List<String> values) {
            addCriterion("pictype in", values, "pictype");
            return (Criteria) this;
        }

        public Criteria andPictypeNotIn(List<String> values) {
            addCriterion("pictype not in", values, "pictype");
            return (Criteria) this;
        }

        public Criteria andPictypeBetween(String value1, String value2) {
            addCriterion("pictype between", value1, value2, "pictype");
            return (Criteria) this;
        }

        public Criteria andPictypeNotBetween(String value1, String value2) {
            addCriterion("pictype not between", value1, value2, "pictype");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
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

        public Criteria andRelativeidIsNull() {
            addCriterion("relativeid is null");
            return (Criteria) this;
        }

        public Criteria andRelativeidIsNotNull() {
            addCriterion("relativeid is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeidEqualTo(String value) {
            addCriterion("relativeid =", value, "relativeid");
            return (Criteria) this;
        }

        public Criteria andRelativeidNotEqualTo(String value) {
            addCriterion("relativeid <>", value, "relativeid");
            return (Criteria) this;
        }

        public Criteria andRelativeidGreaterThan(String value) {
            addCriterion("relativeid >", value, "relativeid");
            return (Criteria) this;
        }

        public Criteria andRelativeidGreaterThanOrEqualTo(String value) {
            addCriterion("relativeid >=", value, "relativeid");
            return (Criteria) this;
        }

        public Criteria andRelativeidLessThan(String value) {
            addCriterion("relativeid <", value, "relativeid");
            return (Criteria) this;
        }

        public Criteria andRelativeidLessThanOrEqualTo(String value) {
            addCriterion("relativeid <=", value, "relativeid");
            return (Criteria) this;
        }

        public Criteria andRelativeidLike(String value) {
            addCriterion("relativeid like", value, "relativeid");
            return (Criteria) this;
        }

        public Criteria andRelativeidNotLike(String value) {
            addCriterion("relativeid not like", value, "relativeid");
            return (Criteria) this;
        }

        public Criteria andRelativeidIn(List<String> values) {
            addCriterion("relativeid in", values, "relativeid");
            return (Criteria) this;
        }

        public Criteria andRelativeidNotIn(List<String> values) {
            addCriterion("relativeid not in", values, "relativeid");
            return (Criteria) this;
        }

        public Criteria andRelativeidBetween(String value1, String value2) {
            addCriterion("relativeid between", value1, value2, "relativeid");
            return (Criteria) this;
        }

        public Criteria andRelativeidNotBetween(String value1, String value2) {
            addCriterion("relativeid not between", value1, value2, "relativeid");
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

        public Criteria andCompletepathIsNull() {
            addCriterion("completepath is null");
            return (Criteria) this;
        }

        public Criteria andCompletepathIsNotNull() {
            addCriterion("completepath is not null");
            return (Criteria) this;
        }

        public Criteria andCompletepathEqualTo(String value) {
            addCriterion("completepath =", value, "completepath");
            return (Criteria) this;
        }

        public Criteria andCompletepathNotEqualTo(String value) {
            addCriterion("completepath <>", value, "completepath");
            return (Criteria) this;
        }

        public Criteria andCompletepathGreaterThan(String value) {
            addCriterion("completepath >", value, "completepath");
            return (Criteria) this;
        }

        public Criteria andCompletepathGreaterThanOrEqualTo(String value) {
            addCriterion("completepath >=", value, "completepath");
            return (Criteria) this;
        }

        public Criteria andCompletepathLessThan(String value) {
            addCriterion("completepath <", value, "completepath");
            return (Criteria) this;
        }

        public Criteria andCompletepathLessThanOrEqualTo(String value) {
            addCriterion("completepath <=", value, "completepath");
            return (Criteria) this;
        }

        public Criteria andCompletepathLike(String value) {
            addCriterion("completepath like", value, "completepath");
            return (Criteria) this;
        }

        public Criteria andCompletepathNotLike(String value) {
            addCriterion("completepath not like", value, "completepath");
            return (Criteria) this;
        }

        public Criteria andCompletepathIn(List<String> values) {
            addCriterion("completepath in", values, "completepath");
            return (Criteria) this;
        }

        public Criteria andCompletepathNotIn(List<String> values) {
            addCriterion("completepath not in", values, "completepath");
            return (Criteria) this;
        }

        public Criteria andCompletepathBetween(String value1, String value2) {
            addCriterion("completepath between", value1, value2, "completepath");
            return (Criteria) this;
        }

        public Criteria andCompletepathNotBetween(String value1, String value2) {
            addCriterion("completepath not between", value1, value2, "completepath");
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