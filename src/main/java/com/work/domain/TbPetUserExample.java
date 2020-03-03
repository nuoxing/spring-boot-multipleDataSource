package com.work.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPetUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPetUserExample() {
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

        public Criteria andOPENIDIsNull() {
            addCriterion("OPENID is null");
            return (Criteria) this;
        }

        public Criteria andOPENIDIsNotNull() {
            addCriterion("OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andOPENIDEqualTo(String value) {
            addCriterion("OPENID =", value, "OPENID");
            return (Criteria) this;
        }

        public Criteria andOPENIDNotEqualTo(String value) {
            addCriterion("OPENID <>", value, "OPENID");
            return (Criteria) this;
        }

        public Criteria andOPENIDGreaterThan(String value) {
            addCriterion("OPENID >", value, "OPENID");
            return (Criteria) this;
        }

        public Criteria andOPENIDGreaterThanOrEqualTo(String value) {
            addCriterion("OPENID >=", value, "OPENID");
            return (Criteria) this;
        }

        public Criteria andOPENIDLessThan(String value) {
            addCriterion("OPENID <", value, "OPENID");
            return (Criteria) this;
        }

        public Criteria andOPENIDLessThanOrEqualTo(String value) {
            addCriterion("OPENID <=", value, "OPENID");
            return (Criteria) this;
        }

        public Criteria andOPENIDLike(String value) {
            addCriterion("OPENID like", value, "OPENID");
            return (Criteria) this;
        }

        public Criteria andOPENIDNotLike(String value) {
            addCriterion("OPENID not like", value, "OPENID");
            return (Criteria) this;
        }

        public Criteria andOPENIDIn(List<String> values) {
            addCriterion("OPENID in", values, "OPENID");
            return (Criteria) this;
        }

        public Criteria andOPENIDNotIn(List<String> values) {
            addCriterion("OPENID not in", values, "OPENID");
            return (Criteria) this;
        }

        public Criteria andOPENIDBetween(String value1, String value2) {
            addCriterion("OPENID between", value1, value2, "OPENID");
            return (Criteria) this;
        }

        public Criteria andOPENIDNotBetween(String value1, String value2) {
            addCriterion("OPENID not between", value1, value2, "OPENID");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEEqualTo(String value) {
            addCriterion("NICKNAME =", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMENotEqualTo(String value) {
            addCriterion("NICKNAME <>", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEGreaterThan(String value) {
            addCriterion("NICKNAME >", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMELessThan(String value) {
            addCriterion("NICKNAME <", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMELessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMELike(String value) {
            addCriterion("NICKNAME like", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMENotLike(String value) {
            addCriterion("NICKNAME not like", value, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEIn(List<String> values) {
            addCriterion("NICKNAME in", values, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMENotIn(List<String> values) {
            addCriterion("NICKNAME not in", values, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMEBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andNICKNAMENotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2, "NICKNAME");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDEqualTo(String value) {
            addCriterion("PASSWORD =", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThan(String value) {
            addCriterion("PASSWORD <", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLike(String value) {
            addCriterion("PASSWORD like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotLike(String value) {
            addCriterion("PASSWORD not like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIn(List<String> values) {
            addCriterion("PASSWORD in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andSEXIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSEXIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSEXEqualTo(String value) {
            addCriterion("SEX =", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXNotEqualTo(String value) {
            addCriterion("SEX <>", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXGreaterThan(String value) {
            addCriterion("SEX >", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXLessThan(String value) {
            addCriterion("SEX <", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXLike(String value) {
            addCriterion("SEX like", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXNotLike(String value) {
            addCriterion("SEX not like", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXIn(List<String> values) {
            addCriterion("SEX in", values, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXNotIn(List<String> values) {
            addCriterion("SEX not in", values, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "SEX");
            return (Criteria) this;
        }

        public Criteria andTELIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTELIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTELEqualTo(String value) {
            addCriterion("TEL =", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELNotEqualTo(String value) {
            addCriterion("TEL <>", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELGreaterThan(String value) {
            addCriterion("TEL >", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELLessThan(String value) {
            addCriterion("TEL <", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELLike(String value) {
            addCriterion("TEL like", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELNotLike(String value) {
            addCriterion("TEL not like", value, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELIn(List<String> values) {
            addCriterion("TEL in", values, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELNotIn(List<String> values) {
            addCriterion("TEL not in", values, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "TEL");
            return (Criteria) this;
        }

        public Criteria andTELNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "TEL");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYEqualTo(Date value) {
            addCriterion("BIRTHDAY =", value, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYNotEqualTo(Date value) {
            addCriterion("BIRTHDAY <>", value, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYGreaterThan(Date value) {
            addCriterion("BIRTHDAY >", value, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY >=", value, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYLessThan(Date value) {
            addCriterion("BIRTHDAY <", value, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYLessThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY <=", value, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYIn(List<Date> values) {
            addCriterion("BIRTHDAY in", values, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYNotIn(List<Date> values) {
            addCriterion("BIRTHDAY not in", values, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY between", value1, value2, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYNotBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andAGEIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAGEIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAGEEqualTo(String value) {
            addCriterion("AGE =", value, "AGE");
            return (Criteria) this;
        }

        public Criteria andAGENotEqualTo(String value) {
            addCriterion("AGE <>", value, "AGE");
            return (Criteria) this;
        }

        public Criteria andAGEGreaterThan(String value) {
            addCriterion("AGE >", value, "AGE");
            return (Criteria) this;
        }

        public Criteria andAGEGreaterThanOrEqualTo(String value) {
            addCriterion("AGE >=", value, "AGE");
            return (Criteria) this;
        }

        public Criteria andAGELessThan(String value) {
            addCriterion("AGE <", value, "AGE");
            return (Criteria) this;
        }

        public Criteria andAGELessThanOrEqualTo(String value) {
            addCriterion("AGE <=", value, "AGE");
            return (Criteria) this;
        }

        public Criteria andAGELike(String value) {
            addCriterion("AGE like", value, "AGE");
            return (Criteria) this;
        }

        public Criteria andAGENotLike(String value) {
            addCriterion("AGE not like", value, "AGE");
            return (Criteria) this;
        }

        public Criteria andAGEIn(List<String> values) {
            addCriterion("AGE in", values, "AGE");
            return (Criteria) this;
        }

        public Criteria andAGENotIn(List<String> values) {
            addCriterion("AGE not in", values, "AGE");
            return (Criteria) this;
        }

        public Criteria andAGEBetween(String value1, String value2) {
            addCriterion("AGE between", value1, value2, "AGE");
            return (Criteria) this;
        }

        public Criteria andAGENotBetween(String value1, String value2) {
            addCriterion("AGE not between", value1, value2, "AGE");
            return (Criteria) this;
        }

        public Criteria andPERSONALPROFILEIsNull() {
            addCriterion("PERSONALPROFILE is null");
            return (Criteria) this;
        }

        public Criteria andPERSONALPROFILEIsNotNull() {
            addCriterion("PERSONALPROFILE is not null");
            return (Criteria) this;
        }

        public Criteria andPERSONALPROFILEEqualTo(String value) {
            addCriterion("PERSONALPROFILE =", value, "PERSONALPROFILE");
            return (Criteria) this;
        }

        public Criteria andPERSONALPROFILENotEqualTo(String value) {
            addCriterion("PERSONALPROFILE <>", value, "PERSONALPROFILE");
            return (Criteria) this;
        }

        public Criteria andPERSONALPROFILEGreaterThan(String value) {
            addCriterion("PERSONALPROFILE >", value, "PERSONALPROFILE");
            return (Criteria) this;
        }

        public Criteria andPERSONALPROFILEGreaterThanOrEqualTo(String value) {
            addCriterion("PERSONALPROFILE >=", value, "PERSONALPROFILE");
            return (Criteria) this;
        }

        public Criteria andPERSONALPROFILELessThan(String value) {
            addCriterion("PERSONALPROFILE <", value, "PERSONALPROFILE");
            return (Criteria) this;
        }

        public Criteria andPERSONALPROFILELessThanOrEqualTo(String value) {
            addCriterion("PERSONALPROFILE <=", value, "PERSONALPROFILE");
            return (Criteria) this;
        }

        public Criteria andPERSONALPROFILELike(String value) {
            addCriterion("PERSONALPROFILE like", value, "PERSONALPROFILE");
            return (Criteria) this;
        }

        public Criteria andPERSONALPROFILENotLike(String value) {
            addCriterion("PERSONALPROFILE not like", value, "PERSONALPROFILE");
            return (Criteria) this;
        }

        public Criteria andPERSONALPROFILEIn(List<String> values) {
            addCriterion("PERSONALPROFILE in", values, "PERSONALPROFILE");
            return (Criteria) this;
        }

        public Criteria andPERSONALPROFILENotIn(List<String> values) {
            addCriterion("PERSONALPROFILE not in", values, "PERSONALPROFILE");
            return (Criteria) this;
        }

        public Criteria andPERSONALPROFILEBetween(String value1, String value2) {
            addCriterion("PERSONALPROFILE between", value1, value2, "PERSONALPROFILE");
            return (Criteria) this;
        }

        public Criteria andPERSONALPROFILENotBetween(String value1, String value2) {
            addCriterion("PERSONALPROFILE not between", value1, value2, "PERSONALPROFILE");
            return (Criteria) this;
        }

        public Criteria andPICTUREIsNull() {
            addCriterion("PICTURE is null");
            return (Criteria) this;
        }

        public Criteria andPICTUREIsNotNull() {
            addCriterion("PICTURE is not null");
            return (Criteria) this;
        }

        public Criteria andPICTUREEqualTo(String value) {
            addCriterion("PICTURE =", value, "PICTURE");
            return (Criteria) this;
        }

        public Criteria andPICTURENotEqualTo(String value) {
            addCriterion("PICTURE <>", value, "PICTURE");
            return (Criteria) this;
        }

        public Criteria andPICTUREGreaterThan(String value) {
            addCriterion("PICTURE >", value, "PICTURE");
            return (Criteria) this;
        }

        public Criteria andPICTUREGreaterThanOrEqualTo(String value) {
            addCriterion("PICTURE >=", value, "PICTURE");
            return (Criteria) this;
        }

        public Criteria andPICTURELessThan(String value) {
            addCriterion("PICTURE <", value, "PICTURE");
            return (Criteria) this;
        }

        public Criteria andPICTURELessThanOrEqualTo(String value) {
            addCriterion("PICTURE <=", value, "PICTURE");
            return (Criteria) this;
        }

        public Criteria andPICTURELike(String value) {
            addCriterion("PICTURE like", value, "PICTURE");
            return (Criteria) this;
        }

        public Criteria andPICTURENotLike(String value) {
            addCriterion("PICTURE not like", value, "PICTURE");
            return (Criteria) this;
        }

        public Criteria andPICTUREIn(List<String> values) {
            addCriterion("PICTURE in", values, "PICTURE");
            return (Criteria) this;
        }

        public Criteria andPICTURENotIn(List<String> values) {
            addCriterion("PICTURE not in", values, "PICTURE");
            return (Criteria) this;
        }

        public Criteria andPICTUREBetween(String value1, String value2) {
            addCriterion("PICTURE between", value1, value2, "PICTURE");
            return (Criteria) this;
        }

        public Criteria andPICTURENotBetween(String value1, String value2) {
            addCriterion("PICTURE not between", value1, value2, "PICTURE");
            return (Criteria) this;
        }

        public Criteria andCITYIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCITYIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCITYEqualTo(String value) {
            addCriterion("CITY =", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYNotEqualTo(String value) {
            addCriterion("CITY <>", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYGreaterThan(String value) {
            addCriterion("CITY >", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYLessThan(String value) {
            addCriterion("CITY <", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYLike(String value) {
            addCriterion("CITY like", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYNotLike(String value) {
            addCriterion("CITY not like", value, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYIn(List<String> values) {
            addCriterion("CITY in", values, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYNotIn(List<String> values) {
            addCriterion("CITY not in", values, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "CITY");
            return (Criteria) this;
        }

        public Criteria andCITYNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "CITY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYEqualTo(String value) {
            addCriterion("COUNTRY =", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYLessThan(String value) {
            addCriterion("COUNTRY <", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYLike(String value) {
            addCriterion("COUNTRY like", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYNotLike(String value) {
            addCriterion("COUNTRY not like", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYIn(List<String> values) {
            addCriterion("COUNTRY in", values, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andPOVINCESIsNull() {
            addCriterion("POVINCES is null");
            return (Criteria) this;
        }

        public Criteria andPOVINCESIsNotNull() {
            addCriterion("POVINCES is not null");
            return (Criteria) this;
        }

        public Criteria andPOVINCESEqualTo(String value) {
            addCriterion("POVINCES =", value, "POVINCES");
            return (Criteria) this;
        }

        public Criteria andPOVINCESNotEqualTo(String value) {
            addCriterion("POVINCES <>", value, "POVINCES");
            return (Criteria) this;
        }

        public Criteria andPOVINCESGreaterThan(String value) {
            addCriterion("POVINCES >", value, "POVINCES");
            return (Criteria) this;
        }

        public Criteria andPOVINCESGreaterThanOrEqualTo(String value) {
            addCriterion("POVINCES >=", value, "POVINCES");
            return (Criteria) this;
        }

        public Criteria andPOVINCESLessThan(String value) {
            addCriterion("POVINCES <", value, "POVINCES");
            return (Criteria) this;
        }

        public Criteria andPOVINCESLessThanOrEqualTo(String value) {
            addCriterion("POVINCES <=", value, "POVINCES");
            return (Criteria) this;
        }

        public Criteria andPOVINCESLike(String value) {
            addCriterion("POVINCES like", value, "POVINCES");
            return (Criteria) this;
        }

        public Criteria andPOVINCESNotLike(String value) {
            addCriterion("POVINCES not like", value, "POVINCES");
            return (Criteria) this;
        }

        public Criteria andPOVINCESIn(List<String> values) {
            addCriterion("POVINCES in", values, "POVINCES");
            return (Criteria) this;
        }

        public Criteria andPOVINCESNotIn(List<String> values) {
            addCriterion("POVINCES not in", values, "POVINCES");
            return (Criteria) this;
        }

        public Criteria andPOVINCESBetween(String value1, String value2) {
            addCriterion("POVINCES between", value1, value2, "POVINCES");
            return (Criteria) this;
        }

        public Criteria andPOVINCESNotBetween(String value1, String value2) {
            addCriterion("POVINCES not between", value1, value2, "POVINCES");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMENotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMELessThan(Date value) {
            addCriterion("CREATETIME <", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMELessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMENotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMEBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCREATETIMENotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "CREATETIME");
            return (Criteria) this;
        }

        public Criteria andLASTRIGESTTIMEIsNull() {
            addCriterion("LASTRIGESTTIME is null");
            return (Criteria) this;
        }

        public Criteria andLASTRIGESTTIMEIsNotNull() {
            addCriterion("LASTRIGESTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLASTRIGESTTIMEEqualTo(Date value) {
            addCriterion("LASTRIGESTTIME =", value, "LASTRIGESTTIME");
            return (Criteria) this;
        }

        public Criteria andLASTRIGESTTIMENotEqualTo(Date value) {
            addCriterion("LASTRIGESTTIME <>", value, "LASTRIGESTTIME");
            return (Criteria) this;
        }

        public Criteria andLASTRIGESTTIMEGreaterThan(Date value) {
            addCriterion("LASTRIGESTTIME >", value, "LASTRIGESTTIME");
            return (Criteria) this;
        }

        public Criteria andLASTRIGESTTIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTRIGESTTIME >=", value, "LASTRIGESTTIME");
            return (Criteria) this;
        }

        public Criteria andLASTRIGESTTIMELessThan(Date value) {
            addCriterion("LASTRIGESTTIME <", value, "LASTRIGESTTIME");
            return (Criteria) this;
        }

        public Criteria andLASTRIGESTTIMELessThanOrEqualTo(Date value) {
            addCriterion("LASTRIGESTTIME <=", value, "LASTRIGESTTIME");
            return (Criteria) this;
        }

        public Criteria andLASTRIGESTTIMEIn(List<Date> values) {
            addCriterion("LASTRIGESTTIME in", values, "LASTRIGESTTIME");
            return (Criteria) this;
        }

        public Criteria andLASTRIGESTTIMENotIn(List<Date> values) {
            addCriterion("LASTRIGESTTIME not in", values, "LASTRIGESTTIME");
            return (Criteria) this;
        }

        public Criteria andLASTRIGESTTIMEBetween(Date value1, Date value2) {
            addCriterion("LASTRIGESTTIME between", value1, value2, "LASTRIGESTTIME");
            return (Criteria) this;
        }

        public Criteria andLASTRIGESTTIMENotBetween(Date value1, Date value2) {
            addCriterion("LASTRIGESTTIME not between", value1, value2, "LASTRIGESTTIME");
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