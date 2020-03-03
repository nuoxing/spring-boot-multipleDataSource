package com.work.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPetDetailedInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPetDetailedInfoExample() {
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

        public Criteria andVarietynameIsNull() {
            addCriterion("varietyname is null");
            return (Criteria) this;
        }

        public Criteria andVarietynameIsNotNull() {
            addCriterion("varietyname is not null");
            return (Criteria) this;
        }

        public Criteria andVarietynameEqualTo(String value) {
            addCriterion("varietyname =", value, "varietyname");
            return (Criteria) this;
        }

        public Criteria andVarietynameNotEqualTo(String value) {
            addCriterion("varietyname <>", value, "varietyname");
            return (Criteria) this;
        }

        public Criteria andVarietynameGreaterThan(String value) {
            addCriterion("varietyname >", value, "varietyname");
            return (Criteria) this;
        }

        public Criteria andVarietynameGreaterThanOrEqualTo(String value) {
            addCriterion("varietyname >=", value, "varietyname");
            return (Criteria) this;
        }

        public Criteria andVarietynameLessThan(String value) {
            addCriterion("varietyname <", value, "varietyname");
            return (Criteria) this;
        }

        public Criteria andVarietynameLessThanOrEqualTo(String value) {
            addCriterion("varietyname <=", value, "varietyname");
            return (Criteria) this;
        }

        public Criteria andVarietynameLike(String value) {
            addCriterion("varietyname like", value, "varietyname");
            return (Criteria) this;
        }

        public Criteria andVarietynameNotLike(String value) {
            addCriterion("varietyname not like", value, "varietyname");
            return (Criteria) this;
        }

        public Criteria andVarietynameIn(List<String> values) {
            addCriterion("varietyname in", values, "varietyname");
            return (Criteria) this;
        }

        public Criteria andVarietynameNotIn(List<String> values) {
            addCriterion("varietyname not in", values, "varietyname");
            return (Criteria) this;
        }

        public Criteria andVarietynameBetween(String value1, String value2) {
            addCriterion("varietyname between", value1, value2, "varietyname");
            return (Criteria) this;
        }

        public Criteria andVarietynameNotBetween(String value1, String value2) {
            addCriterion("varietyname not between", value1, value2, "varietyname");
            return (Criteria) this;
        }

        public Criteria andVarietryentnameIsNull() {
            addCriterion("varietryentname is null");
            return (Criteria) this;
        }

        public Criteria andVarietryentnameIsNotNull() {
            addCriterion("varietryentname is not null");
            return (Criteria) this;
        }

        public Criteria andVarietryentnameEqualTo(String value) {
            addCriterion("varietryentname =", value, "varietryentname");
            return (Criteria) this;
        }

        public Criteria andVarietryentnameNotEqualTo(String value) {
            addCriterion("varietryentname <>", value, "varietryentname");
            return (Criteria) this;
        }

        public Criteria andVarietryentnameGreaterThan(String value) {
            addCriterion("varietryentname >", value, "varietryentname");
            return (Criteria) this;
        }

        public Criteria andVarietryentnameGreaterThanOrEqualTo(String value) {
            addCriterion("varietryentname >=", value, "varietryentname");
            return (Criteria) this;
        }

        public Criteria andVarietryentnameLessThan(String value) {
            addCriterion("varietryentname <", value, "varietryentname");
            return (Criteria) this;
        }

        public Criteria andVarietryentnameLessThanOrEqualTo(String value) {
            addCriterion("varietryentname <=", value, "varietryentname");
            return (Criteria) this;
        }

        public Criteria andVarietryentnameLike(String value) {
            addCriterion("varietryentname like", value, "varietryentname");
            return (Criteria) this;
        }

        public Criteria andVarietryentnameNotLike(String value) {
            addCriterion("varietryentname not like", value, "varietryentname");
            return (Criteria) this;
        }

        public Criteria andVarietryentnameIn(List<String> values) {
            addCriterion("varietryentname in", values, "varietryentname");
            return (Criteria) this;
        }

        public Criteria andVarietryentnameNotIn(List<String> values) {
            addCriterion("varietryentname not in", values, "varietryentname");
            return (Criteria) this;
        }

        public Criteria andVarietryentnameBetween(String value1, String value2) {
            addCriterion("varietryentname between", value1, value2, "varietryentname");
            return (Criteria) this;
        }

        public Criteria andVarietryentnameNotBetween(String value1, String value2) {
            addCriterion("varietryentname not between", value1, value2, "varietryentname");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNull() {
            addCriterion("picpath is null");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNotNull() {
            addCriterion("picpath is not null");
            return (Criteria) this;
        }

        public Criteria andPicpathEqualTo(String value) {
            addCriterion("picpath =", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotEqualTo(String value) {
            addCriterion("picpath <>", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThan(String value) {
            addCriterion("picpath >", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThanOrEqualTo(String value) {
            addCriterion("picpath >=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThan(String value) {
            addCriterion("picpath <", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThanOrEqualTo(String value) {
            addCriterion("picpath <=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLike(String value) {
            addCriterion("picpath like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotLike(String value) {
            addCriterion("picpath not like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathIn(List<String> values) {
            addCriterion("picpath in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotIn(List<String> values) {
            addCriterion("picpath not in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathBetween(String value1, String value2) {
            addCriterion("picpath between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotBetween(String value1, String value2) {
            addCriterion("picpath not between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andPopularityIsNull() {
            addCriterion("popularity is null");
            return (Criteria) this;
        }

        public Criteria andPopularityIsNotNull() {
            addCriterion("popularity is not null");
            return (Criteria) this;
        }

        public Criteria andPopularityEqualTo(Integer value) {
            addCriterion("popularity =", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityNotEqualTo(Integer value) {
            addCriterion("popularity <>", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityGreaterThan(Integer value) {
            addCriterion("popularity >", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityGreaterThanOrEqualTo(Integer value) {
            addCriterion("popularity >=", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityLessThan(Integer value) {
            addCriterion("popularity <", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityLessThanOrEqualTo(Integer value) {
            addCriterion("popularity <=", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityIn(List<Integer> values) {
            addCriterion("popularity in", values, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityNotIn(List<Integer> values) {
            addCriterion("popularity not in", values, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityBetween(Integer value1, Integer value2) {
            addCriterion("popularity between", value1, value2, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityNotBetween(Integer value1, Integer value2) {
            addCriterion("popularity not between", value1, value2, "popularity");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginIsNull() {
            addCriterion("placeorigin is null");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginIsNotNull() {
            addCriterion("placeorigin is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginEqualTo(String value) {
            addCriterion("placeorigin =", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginNotEqualTo(String value) {
            addCriterion("placeorigin <>", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginGreaterThan(String value) {
            addCriterion("placeorigin >", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginGreaterThanOrEqualTo(String value) {
            addCriterion("placeorigin >=", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginLessThan(String value) {
            addCriterion("placeorigin <", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginLessThanOrEqualTo(String value) {
            addCriterion("placeorigin <=", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginLike(String value) {
            addCriterion("placeorigin like", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginNotLike(String value) {
            addCriterion("placeorigin not like", value, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginIn(List<String> values) {
            addCriterion("placeorigin in", values, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginNotIn(List<String> values) {
            addCriterion("placeorigin not in", values, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginBetween(String value1, String value2) {
            addCriterion("placeorigin between", value1, value2, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andPlaceoriginNotBetween(String value1, String value2) {
            addCriterion("placeorigin not between", value1, value2, "placeorigin");
            return (Criteria) this;
        }

        public Criteria andLifeIsNull() {
            addCriterion("life is null");
            return (Criteria) this;
        }

        public Criteria andLifeIsNotNull() {
            addCriterion("life is not null");
            return (Criteria) this;
        }

        public Criteria andLifeEqualTo(String value) {
            addCriterion("life =", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeNotEqualTo(String value) {
            addCriterion("life <>", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeGreaterThan(String value) {
            addCriterion("life >", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeGreaterThanOrEqualTo(String value) {
            addCriterion("life >=", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeLessThan(String value) {
            addCriterion("life <", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeLessThanOrEqualTo(String value) {
            addCriterion("life <=", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeLike(String value) {
            addCriterion("life like", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeNotLike(String value) {
            addCriterion("life not like", value, "life");
            return (Criteria) this;
        }

        public Criteria andLifeIn(List<String> values) {
            addCriterion("life in", values, "life");
            return (Criteria) this;
        }

        public Criteria andLifeNotIn(List<String> values) {
            addCriterion("life not in", values, "life");
            return (Criteria) this;
        }

        public Criteria andLifeBetween(String value1, String value2) {
            addCriterion("life between", value1, value2, "life");
            return (Criteria) this;
        }

        public Criteria andLifeNotBetween(String value1, String value2) {
            addCriterion("life not between", value1, value2, "life");
            return (Criteria) this;
        }

        public Criteria andAliiasIsNull() {
            addCriterion("aliias is null");
            return (Criteria) this;
        }

        public Criteria andAliiasIsNotNull() {
            addCriterion("aliias is not null");
            return (Criteria) this;
        }

        public Criteria andAliiasEqualTo(String value) {
            addCriterion("aliias =", value, "aliias");
            return (Criteria) this;
        }

        public Criteria andAliiasNotEqualTo(String value) {
            addCriterion("aliias <>", value, "aliias");
            return (Criteria) this;
        }

        public Criteria andAliiasGreaterThan(String value) {
            addCriterion("aliias >", value, "aliias");
            return (Criteria) this;
        }

        public Criteria andAliiasGreaterThanOrEqualTo(String value) {
            addCriterion("aliias >=", value, "aliias");
            return (Criteria) this;
        }

        public Criteria andAliiasLessThan(String value) {
            addCriterion("aliias <", value, "aliias");
            return (Criteria) this;
        }

        public Criteria andAliiasLessThanOrEqualTo(String value) {
            addCriterion("aliias <=", value, "aliias");
            return (Criteria) this;
        }

        public Criteria andAliiasLike(String value) {
            addCriterion("aliias like", value, "aliias");
            return (Criteria) this;
        }

        public Criteria andAliiasNotLike(String value) {
            addCriterion("aliias not like", value, "aliias");
            return (Criteria) this;
        }

        public Criteria andAliiasIn(List<String> values) {
            addCriterion("aliias in", values, "aliias");
            return (Criteria) this;
        }

        public Criteria andAliiasNotIn(List<String> values) {
            addCriterion("aliias not in", values, "aliias");
            return (Criteria) this;
        }

        public Criteria andAliiasBetween(String value1, String value2) {
            addCriterion("aliias between", value1, value2, "aliias");
            return (Criteria) this;
        }

        public Criteria andAliiasNotBetween(String value1, String value2) {
            addCriterion("aliias not between", value1, value2, "aliias");
            return (Criteria) this;
        }

        public Criteria andFemaleheightIsNull() {
            addCriterion("femaleheight is null");
            return (Criteria) this;
        }

        public Criteria andFemaleheightIsNotNull() {
            addCriterion("femaleheight is not null");
            return (Criteria) this;
        }

        public Criteria andFemaleheightEqualTo(String value) {
            addCriterion("femaleheight =", value, "femaleheight");
            return (Criteria) this;
        }

        public Criteria andFemaleheightNotEqualTo(String value) {
            addCriterion("femaleheight <>", value, "femaleheight");
            return (Criteria) this;
        }

        public Criteria andFemaleheightGreaterThan(String value) {
            addCriterion("femaleheight >", value, "femaleheight");
            return (Criteria) this;
        }

        public Criteria andFemaleheightGreaterThanOrEqualTo(String value) {
            addCriterion("femaleheight >=", value, "femaleheight");
            return (Criteria) this;
        }

        public Criteria andFemaleheightLessThan(String value) {
            addCriterion("femaleheight <", value, "femaleheight");
            return (Criteria) this;
        }

        public Criteria andFemaleheightLessThanOrEqualTo(String value) {
            addCriterion("femaleheight <=", value, "femaleheight");
            return (Criteria) this;
        }

        public Criteria andFemaleheightLike(String value) {
            addCriterion("femaleheight like", value, "femaleheight");
            return (Criteria) this;
        }

        public Criteria andFemaleheightNotLike(String value) {
            addCriterion("femaleheight not like", value, "femaleheight");
            return (Criteria) this;
        }

        public Criteria andFemaleheightIn(List<String> values) {
            addCriterion("femaleheight in", values, "femaleheight");
            return (Criteria) this;
        }

        public Criteria andFemaleheightNotIn(List<String> values) {
            addCriterion("femaleheight not in", values, "femaleheight");
            return (Criteria) this;
        }

        public Criteria andFemaleheightBetween(String value1, String value2) {
            addCriterion("femaleheight between", value1, value2, "femaleheight");
            return (Criteria) this;
        }

        public Criteria andFemaleheightNotBetween(String value1, String value2) {
            addCriterion("femaleheight not between", value1, value2, "femaleheight");
            return (Criteria) this;
        }

        public Criteria andMaleheightIsNull() {
            addCriterion("maleheight is null");
            return (Criteria) this;
        }

        public Criteria andMaleheightIsNotNull() {
            addCriterion("maleheight is not null");
            return (Criteria) this;
        }

        public Criteria andMaleheightEqualTo(String value) {
            addCriterion("maleheight =", value, "maleheight");
            return (Criteria) this;
        }

        public Criteria andMaleheightNotEqualTo(String value) {
            addCriterion("maleheight <>", value, "maleheight");
            return (Criteria) this;
        }

        public Criteria andMaleheightGreaterThan(String value) {
            addCriterion("maleheight >", value, "maleheight");
            return (Criteria) this;
        }

        public Criteria andMaleheightGreaterThanOrEqualTo(String value) {
            addCriterion("maleheight >=", value, "maleheight");
            return (Criteria) this;
        }

        public Criteria andMaleheightLessThan(String value) {
            addCriterion("maleheight <", value, "maleheight");
            return (Criteria) this;
        }

        public Criteria andMaleheightLessThanOrEqualTo(String value) {
            addCriterion("maleheight <=", value, "maleheight");
            return (Criteria) this;
        }

        public Criteria andMaleheightLike(String value) {
            addCriterion("maleheight like", value, "maleheight");
            return (Criteria) this;
        }

        public Criteria andMaleheightNotLike(String value) {
            addCriterion("maleheight not like", value, "maleheight");
            return (Criteria) this;
        }

        public Criteria andMaleheightIn(List<String> values) {
            addCriterion("maleheight in", values, "maleheight");
            return (Criteria) this;
        }

        public Criteria andMaleheightNotIn(List<String> values) {
            addCriterion("maleheight not in", values, "maleheight");
            return (Criteria) this;
        }

        public Criteria andMaleheightBetween(String value1, String value2) {
            addCriterion("maleheight between", value1, value2, "maleheight");
            return (Criteria) this;
        }

        public Criteria andMaleheightNotBetween(String value1, String value2) {
            addCriterion("maleheight not between", value1, value2, "maleheight");
            return (Criteria) this;
        }

        public Criteria andBrifeintroIsNull() {
            addCriterion("brifeintro is null");
            return (Criteria) this;
        }

        public Criteria andBrifeintroIsNotNull() {
            addCriterion("brifeintro is not null");
            return (Criteria) this;
        }

        public Criteria andBrifeintroEqualTo(String value) {
            addCriterion("brifeintro =", value, "brifeintro");
            return (Criteria) this;
        }

        public Criteria andBrifeintroNotEqualTo(String value) {
            addCriterion("brifeintro <>", value, "brifeintro");
            return (Criteria) this;
        }

        public Criteria andBrifeintroGreaterThan(String value) {
            addCriterion("brifeintro >", value, "brifeintro");
            return (Criteria) this;
        }

        public Criteria andBrifeintroGreaterThanOrEqualTo(String value) {
            addCriterion("brifeintro >=", value, "brifeintro");
            return (Criteria) this;
        }

        public Criteria andBrifeintroLessThan(String value) {
            addCriterion("brifeintro <", value, "brifeintro");
            return (Criteria) this;
        }

        public Criteria andBrifeintroLessThanOrEqualTo(String value) {
            addCriterion("brifeintro <=", value, "brifeintro");
            return (Criteria) this;
        }

        public Criteria andBrifeintroLike(String value) {
            addCriterion("brifeintro like", value, "brifeintro");
            return (Criteria) this;
        }

        public Criteria andBrifeintroNotLike(String value) {
            addCriterion("brifeintro not like", value, "brifeintro");
            return (Criteria) this;
        }

        public Criteria andBrifeintroIn(List<String> values) {
            addCriterion("brifeintro in", values, "brifeintro");
            return (Criteria) this;
        }

        public Criteria andBrifeintroNotIn(List<String> values) {
            addCriterion("brifeintro not in", values, "brifeintro");
            return (Criteria) this;
        }

        public Criteria andBrifeintroBetween(String value1, String value2) {
            addCriterion("brifeintro between", value1, value2, "brifeintro");
            return (Criteria) this;
        }

        public Criteria andBrifeintroNotBetween(String value1, String value2) {
            addCriterion("brifeintro not between", value1, value2, "brifeintro");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNull() {
            addCriterion("history is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNotNull() {
            addCriterion("history is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryEqualTo(String value) {
            addCriterion("history =", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotEqualTo(String value) {
            addCriterion("history <>", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThan(String value) {
            addCriterion("history >", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("history >=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThan(String value) {
            addCriterion("history <", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThanOrEqualTo(String value) {
            addCriterion("history <=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLike(String value) {
            addCriterion("history like", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotLike(String value) {
            addCriterion("history not like", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryIn(List<String> values) {
            addCriterion("history in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotIn(List<String> values) {
            addCriterion("history not in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryBetween(String value1, String value2) {
            addCriterion("history between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotBetween(String value1, String value2) {
            addCriterion("history not between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andPetcharacterIsNull() {
            addCriterion("petcharacter is null");
            return (Criteria) this;
        }

        public Criteria andPetcharacterIsNotNull() {
            addCriterion("petcharacter is not null");
            return (Criteria) this;
        }

        public Criteria andPetcharacterEqualTo(String value) {
            addCriterion("petcharacter =", value, "petcharacter");
            return (Criteria) this;
        }

        public Criteria andPetcharacterNotEqualTo(String value) {
            addCriterion("petcharacter <>", value, "petcharacter");
            return (Criteria) this;
        }

        public Criteria andPetcharacterGreaterThan(String value) {
            addCriterion("petcharacter >", value, "petcharacter");
            return (Criteria) this;
        }

        public Criteria andPetcharacterGreaterThanOrEqualTo(String value) {
            addCriterion("petcharacter >=", value, "petcharacter");
            return (Criteria) this;
        }

        public Criteria andPetcharacterLessThan(String value) {
            addCriterion("petcharacter <", value, "petcharacter");
            return (Criteria) this;
        }

        public Criteria andPetcharacterLessThanOrEqualTo(String value) {
            addCriterion("petcharacter <=", value, "petcharacter");
            return (Criteria) this;
        }

        public Criteria andPetcharacterLike(String value) {
            addCriterion("petcharacter like", value, "petcharacter");
            return (Criteria) this;
        }

        public Criteria andPetcharacterNotLike(String value) {
            addCriterion("petcharacter not like", value, "petcharacter");
            return (Criteria) this;
        }

        public Criteria andPetcharacterIn(List<String> values) {
            addCriterion("petcharacter in", values, "petcharacter");
            return (Criteria) this;
        }

        public Criteria andPetcharacterNotIn(List<String> values) {
            addCriterion("petcharacter not in", values, "petcharacter");
            return (Criteria) this;
        }

        public Criteria andPetcharacterBetween(String value1, String value2) {
            addCriterion("petcharacter between", value1, value2, "petcharacter");
            return (Criteria) this;
        }

        public Criteria andPetcharacterNotBetween(String value1, String value2) {
            addCriterion("petcharacter not between", value1, value2, "petcharacter");
            return (Criteria) this;
        }

        public Criteria andFitpeopleIsNull() {
            addCriterion("fitpeople is null");
            return (Criteria) this;
        }

        public Criteria andFitpeopleIsNotNull() {
            addCriterion("fitpeople is not null");
            return (Criteria) this;
        }

        public Criteria andFitpeopleEqualTo(String value) {
            addCriterion("fitpeople =", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleNotEqualTo(String value) {
            addCriterion("fitpeople <>", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleGreaterThan(String value) {
            addCriterion("fitpeople >", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("fitpeople >=", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleLessThan(String value) {
            addCriterion("fitpeople <", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleLessThanOrEqualTo(String value) {
            addCriterion("fitpeople <=", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleLike(String value) {
            addCriterion("fitpeople like", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleNotLike(String value) {
            addCriterion("fitpeople not like", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleIn(List<String> values) {
            addCriterion("fitpeople in", values, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleNotIn(List<String> values) {
            addCriterion("fitpeople not in", values, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleBetween(String value1, String value2) {
            addCriterion("fitpeople between", value1, value2, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleNotBetween(String value1, String value2) {
            addCriterion("fitpeople not between", value1, value2, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andHaircardingIsNull() {
            addCriterion("haircarding is null");
            return (Criteria) this;
        }

        public Criteria andHaircardingIsNotNull() {
            addCriterion("haircarding is not null");
            return (Criteria) this;
        }

        public Criteria andHaircardingEqualTo(String value) {
            addCriterion("haircarding =", value, "haircarding");
            return (Criteria) this;
        }

        public Criteria andHaircardingNotEqualTo(String value) {
            addCriterion("haircarding <>", value, "haircarding");
            return (Criteria) this;
        }

        public Criteria andHaircardingGreaterThan(String value) {
            addCriterion("haircarding >", value, "haircarding");
            return (Criteria) this;
        }

        public Criteria andHaircardingGreaterThanOrEqualTo(String value) {
            addCriterion("haircarding >=", value, "haircarding");
            return (Criteria) this;
        }

        public Criteria andHaircardingLessThan(String value) {
            addCriterion("haircarding <", value, "haircarding");
            return (Criteria) this;
        }

        public Criteria andHaircardingLessThanOrEqualTo(String value) {
            addCriterion("haircarding <=", value, "haircarding");
            return (Criteria) this;
        }

        public Criteria andHaircardingLike(String value) {
            addCriterion("haircarding like", value, "haircarding");
            return (Criteria) this;
        }

        public Criteria andHaircardingNotLike(String value) {
            addCriterion("haircarding not like", value, "haircarding");
            return (Criteria) this;
        }

        public Criteria andHaircardingIn(List<String> values) {
            addCriterion("haircarding in", values, "haircarding");
            return (Criteria) this;
        }

        public Criteria andHaircardingNotIn(List<String> values) {
            addCriterion("haircarding not in", values, "haircarding");
            return (Criteria) this;
        }

        public Criteria andHaircardingBetween(String value1, String value2) {
            addCriterion("haircarding between", value1, value2, "haircarding");
            return (Criteria) this;
        }

        public Criteria andHaircardingNotBetween(String value1, String value2) {
            addCriterion("haircarding not between", value1, value2, "haircarding");
            return (Criteria) this;
        }

        public Criteria andVarietyvlaueIsNull() {
            addCriterion("varietyvlaue is null");
            return (Criteria) this;
        }

        public Criteria andVarietyvlaueIsNotNull() {
            addCriterion("varietyvlaue is not null");
            return (Criteria) this;
        }

        public Criteria andVarietyvlaueEqualTo(String value) {
            addCriterion("varietyvlaue =", value, "varietyvlaue");
            return (Criteria) this;
        }

        public Criteria andVarietyvlaueNotEqualTo(String value) {
            addCriterion("varietyvlaue <>", value, "varietyvlaue");
            return (Criteria) this;
        }

        public Criteria andVarietyvlaueGreaterThan(String value) {
            addCriterion("varietyvlaue >", value, "varietyvlaue");
            return (Criteria) this;
        }

        public Criteria andVarietyvlaueGreaterThanOrEqualTo(String value) {
            addCriterion("varietyvlaue >=", value, "varietyvlaue");
            return (Criteria) this;
        }

        public Criteria andVarietyvlaueLessThan(String value) {
            addCriterion("varietyvlaue <", value, "varietyvlaue");
            return (Criteria) this;
        }

        public Criteria andVarietyvlaueLessThanOrEqualTo(String value) {
            addCriterion("varietyvlaue <=", value, "varietyvlaue");
            return (Criteria) this;
        }

        public Criteria andVarietyvlaueLike(String value) {
            addCriterion("varietyvlaue like", value, "varietyvlaue");
            return (Criteria) this;
        }

        public Criteria andVarietyvlaueNotLike(String value) {
            addCriterion("varietyvlaue not like", value, "varietyvlaue");
            return (Criteria) this;
        }

        public Criteria andVarietyvlaueIn(List<String> values) {
            addCriterion("varietyvlaue in", values, "varietyvlaue");
            return (Criteria) this;
        }

        public Criteria andVarietyvlaueNotIn(List<String> values) {
            addCriterion("varietyvlaue not in", values, "varietyvlaue");
            return (Criteria) this;
        }

        public Criteria andVarietyvlaueBetween(String value1, String value2) {
            addCriterion("varietyvlaue between", value1, value2, "varietyvlaue");
            return (Criteria) this;
        }

        public Criteria andVarietyvlaueNotBetween(String value1, String value2) {
            addCriterion("varietyvlaue not between", value1, value2, "varietyvlaue");
            return (Criteria) this;
        }

        public Criteria andBreedIsNull() {
            addCriterion("breed is null");
            return (Criteria) this;
        }

        public Criteria andBreedIsNotNull() {
            addCriterion("breed is not null");
            return (Criteria) this;
        }

        public Criteria andBreedEqualTo(String value) {
            addCriterion("breed =", value, "breed");
            return (Criteria) this;
        }

        public Criteria andBreedNotEqualTo(String value) {
            addCriterion("breed <>", value, "breed");
            return (Criteria) this;
        }

        public Criteria andBreedGreaterThan(String value) {
            addCriterion("breed >", value, "breed");
            return (Criteria) this;
        }

        public Criteria andBreedGreaterThanOrEqualTo(String value) {
            addCriterion("breed >=", value, "breed");
            return (Criteria) this;
        }

        public Criteria andBreedLessThan(String value) {
            addCriterion("breed <", value, "breed");
            return (Criteria) this;
        }

        public Criteria andBreedLessThanOrEqualTo(String value) {
            addCriterion("breed <=", value, "breed");
            return (Criteria) this;
        }

        public Criteria andBreedLike(String value) {
            addCriterion("breed like", value, "breed");
            return (Criteria) this;
        }

        public Criteria andBreedNotLike(String value) {
            addCriterion("breed not like", value, "breed");
            return (Criteria) this;
        }

        public Criteria andBreedIn(List<String> values) {
            addCriterion("breed in", values, "breed");
            return (Criteria) this;
        }

        public Criteria andBreedNotIn(List<String> values) {
            addCriterion("breed not in", values, "breed");
            return (Criteria) this;
        }

        public Criteria andBreedBetween(String value1, String value2) {
            addCriterion("breed between", value1, value2, "breed");
            return (Criteria) this;
        }

        public Criteria andBreedNotBetween(String value1, String value2) {
            addCriterion("breed not between", value1, value2, "breed");
            return (Criteria) this;
        }

        public Criteria andDiseasepreIsNull() {
            addCriterion("diseasepre is null");
            return (Criteria) this;
        }

        public Criteria andDiseasepreIsNotNull() {
            addCriterion("diseasepre is not null");
            return (Criteria) this;
        }

        public Criteria andDiseasepreEqualTo(String value) {
            addCriterion("diseasepre =", value, "diseasepre");
            return (Criteria) this;
        }

        public Criteria andDiseasepreNotEqualTo(String value) {
            addCriterion("diseasepre <>", value, "diseasepre");
            return (Criteria) this;
        }

        public Criteria andDiseasepreGreaterThan(String value) {
            addCriterion("diseasepre >", value, "diseasepre");
            return (Criteria) this;
        }

        public Criteria andDiseasepreGreaterThanOrEqualTo(String value) {
            addCriterion("diseasepre >=", value, "diseasepre");
            return (Criteria) this;
        }

        public Criteria andDiseasepreLessThan(String value) {
            addCriterion("diseasepre <", value, "diseasepre");
            return (Criteria) this;
        }

        public Criteria andDiseasepreLessThanOrEqualTo(String value) {
            addCriterion("diseasepre <=", value, "diseasepre");
            return (Criteria) this;
        }

        public Criteria andDiseasepreLike(String value) {
            addCriterion("diseasepre like", value, "diseasepre");
            return (Criteria) this;
        }

        public Criteria andDiseasepreNotLike(String value) {
            addCriterion("diseasepre not like", value, "diseasepre");
            return (Criteria) this;
        }

        public Criteria andDiseasepreIn(List<String> values) {
            addCriterion("diseasepre in", values, "diseasepre");
            return (Criteria) this;
        }

        public Criteria andDiseasepreNotIn(List<String> values) {
            addCriterion("diseasepre not in", values, "diseasepre");
            return (Criteria) this;
        }

        public Criteria andDiseasepreBetween(String value1, String value2) {
            addCriterion("diseasepre between", value1, value2, "diseasepre");
            return (Criteria) this;
        }

        public Criteria andDiseasepreNotBetween(String value1, String value2) {
            addCriterion("diseasepre not between", value1, value2, "diseasepre");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNull() {
            addCriterion("attention is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNotNull() {
            addCriterion("attention is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionEqualTo(String value) {
            addCriterion("attention =", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotEqualTo(String value) {
            addCriterion("attention <>", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThan(String value) {
            addCriterion("attention >", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("attention >=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThan(String value) {
            addCriterion("attention <", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThanOrEqualTo(String value) {
            addCriterion("attention <=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLike(String value) {
            addCriterion("attention like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotLike(String value) {
            addCriterion("attention not like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionIn(List<String> values) {
            addCriterion("attention in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotIn(List<String> values) {
            addCriterion("attention not in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionBetween(String value1, String value2) {
            addCriterion("attention between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotBetween(String value1, String value2) {
            addCriterion("attention not between", value1, value2, "attention");
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