package com.wzx.lagou.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCompanyExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andApproveIsNull() {
            addCriterion("approve is null");
            return (Criteria) this;
        }

        public Criteria andApproveIsNotNull() {
            addCriterion("approve is not null");
            return (Criteria) this;
        }

        public Criteria andApproveEqualTo(Integer value) {
            addCriterion("approve =", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveNotEqualTo(Integer value) {
            addCriterion("approve <>", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveGreaterThan(Integer value) {
            addCriterion("approve >", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveGreaterThanOrEqualTo(Integer value) {
            addCriterion("approve >=", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveLessThan(Integer value) {
            addCriterion("approve <", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveLessThanOrEqualTo(Integer value) {
            addCriterion("approve <=", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveIn(List<Integer> values) {
            addCriterion("approve in", values, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveNotIn(List<Integer> values) {
            addCriterion("approve not in", values, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveBetween(Integer value1, Integer value2) {
            addCriterion("approve between", value1, value2, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveNotBetween(Integer value1, Integer value2) {
            addCriterion("approve not between", value1, value2, "approve");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityScoreIsNull() {
            addCriterion("city_score is null");
            return (Criteria) this;
        }

        public Criteria andCityScoreIsNotNull() {
            addCriterion("city_score is not null");
            return (Criteria) this;
        }

        public Criteria andCityScoreEqualTo(Integer value) {
            addCriterion("city_score =", value, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreNotEqualTo(Integer value) {
            addCriterion("city_score <>", value, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreGreaterThan(Integer value) {
            addCriterion("city_score >", value, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_score >=", value, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreLessThan(Integer value) {
            addCriterion("city_score <", value, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreLessThanOrEqualTo(Integer value) {
            addCriterion("city_score <=", value, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreIn(List<Integer> values) {
            addCriterion("city_score in", values, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreNotIn(List<Integer> values) {
            addCriterion("city_score not in", values, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreBetween(Integer value1, Integer value2) {
            addCriterion("city_score between", value1, value2, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCityScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("city_score not between", value1, value2, "cityScore");
            return (Criteria) this;
        }

        public Criteria andCompanyCombineScoreIsNull() {
            addCriterion("company_combine_score is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCombineScoreIsNotNull() {
            addCriterion("company_combine_score is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCombineScoreEqualTo(Double value) {
            addCriterion("company_combine_score =", value, "companyCombineScore");
            return (Criteria) this;
        }

        public Criteria andCompanyCombineScoreNotEqualTo(Double value) {
            addCriterion("company_combine_score <>", value, "companyCombineScore");
            return (Criteria) this;
        }

        public Criteria andCompanyCombineScoreGreaterThan(Double value) {
            addCriterion("company_combine_score >", value, "companyCombineScore");
            return (Criteria) this;
        }

        public Criteria andCompanyCombineScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("company_combine_score >=", value, "companyCombineScore");
            return (Criteria) this;
        }

        public Criteria andCompanyCombineScoreLessThan(Double value) {
            addCriterion("company_combine_score <", value, "companyCombineScore");
            return (Criteria) this;
        }

        public Criteria andCompanyCombineScoreLessThanOrEqualTo(Double value) {
            addCriterion("company_combine_score <=", value, "companyCombineScore");
            return (Criteria) this;
        }

        public Criteria andCompanyCombineScoreIn(List<Double> values) {
            addCriterion("company_combine_score in", values, "companyCombineScore");
            return (Criteria) this;
        }

        public Criteria andCompanyCombineScoreNotIn(List<Double> values) {
            addCriterion("company_combine_score not in", values, "companyCombineScore");
            return (Criteria) this;
        }

        public Criteria andCompanyCombineScoreBetween(Double value1, Double value2) {
            addCriterion("company_combine_score between", value1, value2, "companyCombineScore");
            return (Criteria) this;
        }

        public Criteria andCompanyCombineScoreNotBetween(Double value1, Double value2) {
            addCriterion("company_combine_score not between", value1, value2, "companyCombineScore");
            return (Criteria) this;
        }

        public Criteria andCompanyFeaturesIsNull() {
            addCriterion("company_features is null");
            return (Criteria) this;
        }

        public Criteria andCompanyFeaturesIsNotNull() {
            addCriterion("company_features is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyFeaturesEqualTo(String value) {
            addCriterion("company_features =", value, "companyFeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyFeaturesNotEqualTo(String value) {
            addCriterion("company_features <>", value, "companyFeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyFeaturesGreaterThan(String value) {
            addCriterion("company_features >", value, "companyFeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyFeaturesGreaterThanOrEqualTo(String value) {
            addCriterion("company_features >=", value, "companyFeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyFeaturesLessThan(String value) {
            addCriterion("company_features <", value, "companyFeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyFeaturesLessThanOrEqualTo(String value) {
            addCriterion("company_features <=", value, "companyFeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyFeaturesLike(String value) {
            addCriterion("company_features like", value, "companyFeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyFeaturesNotLike(String value) {
            addCriterion("company_features not like", value, "companyFeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyFeaturesIn(List<String> values) {
            addCriterion("company_features in", values, "companyFeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyFeaturesNotIn(List<String> values) {
            addCriterion("company_features not in", values, "companyFeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyFeaturesBetween(String value1, String value2) {
            addCriterion("company_features between", value1, value2, "companyFeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyFeaturesNotBetween(String value1, String value2) {
            addCriterion("company_features not between", value1, value2, "companyFeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameIsNull() {
            addCriterion("company_full_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameIsNotNull() {
            addCriterion("company_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameEqualTo(String value) {
            addCriterion("company_full_name =", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameNotEqualTo(String value) {
            addCriterion("company_full_name <>", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameGreaterThan(String value) {
            addCriterion("company_full_name >", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_full_name >=", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameLessThan(String value) {
            addCriterion("company_full_name <", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameLessThanOrEqualTo(String value) {
            addCriterion("company_full_name <=", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameLike(String value) {
            addCriterion("company_full_name like", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameNotLike(String value) {
            addCriterion("company_full_name not like", value, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameIn(List<String> values) {
            addCriterion("company_full_name in", values, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameNotIn(List<String> values) {
            addCriterion("company_full_name not in", values, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameBetween(String value1, String value2) {
            addCriterion("company_full_name between", value1, value2, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyFullNameNotBetween(String value1, String value2) {
            addCriterion("company_full_name not between", value1, value2, "companyFullName");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIsNull() {
            addCriterion("company_logo is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIsNotNull() {
            addCriterion("company_logo is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoEqualTo(String value) {
            addCriterion("company_logo =", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotEqualTo(String value) {
            addCriterion("company_logo <>", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoGreaterThan(String value) {
            addCriterion("company_logo >", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoGreaterThanOrEqualTo(String value) {
            addCriterion("company_logo >=", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLessThan(String value) {
            addCriterion("company_logo <", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLessThanOrEqualTo(String value) {
            addCriterion("company_logo <=", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLike(String value) {
            addCriterion("company_logo like", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotLike(String value) {
            addCriterion("company_logo not like", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIn(List<String> values) {
            addCriterion("company_logo in", values, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotIn(List<String> values) {
            addCriterion("company_logo not in", values, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoBetween(String value1, String value2) {
            addCriterion("company_logo between", value1, value2, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotBetween(String value1, String value2) {
            addCriterion("company_logo not between", value1, value2, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameIsNull() {
            addCriterion("company_short_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameIsNotNull() {
            addCriterion("company_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameEqualTo(String value) {
            addCriterion("company_short_name =", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameNotEqualTo(String value) {
            addCriterion("company_short_name <>", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameGreaterThan(String value) {
            addCriterion("company_short_name >", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_short_name >=", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameLessThan(String value) {
            addCriterion("company_short_name <", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameLessThanOrEqualTo(String value) {
            addCriterion("company_short_name <=", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameLike(String value) {
            addCriterion("company_short_name like", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameNotLike(String value) {
            addCriterion("company_short_name not like", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameIn(List<String> values) {
            addCriterion("company_short_name in", values, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameNotIn(List<String> values) {
            addCriterion("company_short_name not in", values, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameBetween(String value1, String value2) {
            addCriterion("company_short_name between", value1, value2, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameNotBetween(String value1, String value2) {
            addCriterion("company_short_name not between", value1, value2, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanySizeIsNull() {
            addCriterion("company_size is null");
            return (Criteria) this;
        }

        public Criteria andCompanySizeIsNotNull() {
            addCriterion("company_size is not null");
            return (Criteria) this;
        }

        public Criteria andCompanySizeEqualTo(String value) {
            addCriterion("company_size =", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeNotEqualTo(String value) {
            addCriterion("company_size <>", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeGreaterThan(String value) {
            addCriterion("company_size >", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeGreaterThanOrEqualTo(String value) {
            addCriterion("company_size >=", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeLessThan(String value) {
            addCriterion("company_size <", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeLessThanOrEqualTo(String value) {
            addCriterion("company_size <=", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeLike(String value) {
            addCriterion("company_size like", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeNotLike(String value) {
            addCriterion("company_size not like", value, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeIn(List<String> values) {
            addCriterion("company_size in", values, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeNotIn(List<String> values) {
            addCriterion("company_size not in", values, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeBetween(String value1, String value2) {
            addCriterion("company_size between", value1, value2, "companySize");
            return (Criteria) this;
        }

        public Criteria andCompanySizeNotBetween(String value1, String value2) {
            addCriterion("company_size not between", value1, value2, "companySize");
            return (Criteria) this;
        }

        public Criteria andCountryScoreIsNull() {
            addCriterion("country_score is null");
            return (Criteria) this;
        }

        public Criteria andCountryScoreIsNotNull() {
            addCriterion("country_score is not null");
            return (Criteria) this;
        }

        public Criteria andCountryScoreEqualTo(Integer value) {
            addCriterion("country_score =", value, "countryScore");
            return (Criteria) this;
        }

        public Criteria andCountryScoreNotEqualTo(Integer value) {
            addCriterion("country_score <>", value, "countryScore");
            return (Criteria) this;
        }

        public Criteria andCountryScoreGreaterThan(Integer value) {
            addCriterion("country_score >", value, "countryScore");
            return (Criteria) this;
        }

        public Criteria andCountryScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_score >=", value, "countryScore");
            return (Criteria) this;
        }

        public Criteria andCountryScoreLessThan(Integer value) {
            addCriterion("country_score <", value, "countryScore");
            return (Criteria) this;
        }

        public Criteria andCountryScoreLessThanOrEqualTo(Integer value) {
            addCriterion("country_score <=", value, "countryScore");
            return (Criteria) this;
        }

        public Criteria andCountryScoreIn(List<Integer> values) {
            addCriterion("country_score in", values, "countryScore");
            return (Criteria) this;
        }

        public Criteria andCountryScoreNotIn(List<Integer> values) {
            addCriterion("country_score not in", values, "countryScore");
            return (Criteria) this;
        }

        public Criteria andCountryScoreBetween(Integer value1, Integer value2) {
            addCriterion("country_score between", value1, value2, "countryScore");
            return (Criteria) this;
        }

        public Criteria andCountryScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("country_score not between", value1, value2, "countryScore");
            return (Criteria) this;
        }

        public Criteria andFinanceStageIsNull() {
            addCriterion("finance_stage is null");
            return (Criteria) this;
        }

        public Criteria andFinanceStageIsNotNull() {
            addCriterion("finance_stage is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceStageEqualTo(String value) {
            addCriterion("finance_stage =", value, "financeStage");
            return (Criteria) this;
        }

        public Criteria andFinanceStageNotEqualTo(String value) {
            addCriterion("finance_stage <>", value, "financeStage");
            return (Criteria) this;
        }

        public Criteria andFinanceStageGreaterThan(String value) {
            addCriterion("finance_stage >", value, "financeStage");
            return (Criteria) this;
        }

        public Criteria andFinanceStageGreaterThanOrEqualTo(String value) {
            addCriterion("finance_stage >=", value, "financeStage");
            return (Criteria) this;
        }

        public Criteria andFinanceStageLessThan(String value) {
            addCriterion("finance_stage <", value, "financeStage");
            return (Criteria) this;
        }

        public Criteria andFinanceStageLessThanOrEqualTo(String value) {
            addCriterion("finance_stage <=", value, "financeStage");
            return (Criteria) this;
        }

        public Criteria andFinanceStageLike(String value) {
            addCriterion("finance_stage like", value, "financeStage");
            return (Criteria) this;
        }

        public Criteria andFinanceStageNotLike(String value) {
            addCriterion("finance_stage not like", value, "financeStage");
            return (Criteria) this;
        }

        public Criteria andFinanceStageIn(List<String> values) {
            addCriterion("finance_stage in", values, "financeStage");
            return (Criteria) this;
        }

        public Criteria andFinanceStageNotIn(List<String> values) {
            addCriterion("finance_stage not in", values, "financeStage");
            return (Criteria) this;
        }

        public Criteria andFinanceStageBetween(String value1, String value2) {
            addCriterion("finance_stage between", value1, value2, "financeStage");
            return (Criteria) this;
        }

        public Criteria andFinanceStageNotBetween(String value1, String value2) {
            addCriterion("finance_stage not between", value1, value2, "financeStage");
            return (Criteria) this;
        }

        public Criteria andIndustryFieldIsNull() {
            addCriterion("industry_field is null");
            return (Criteria) this;
        }

        public Criteria andIndustryFieldIsNotNull() {
            addCriterion("industry_field is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryFieldEqualTo(String value) {
            addCriterion("industry_field =", value, "industryField");
            return (Criteria) this;
        }

        public Criteria andIndustryFieldNotEqualTo(String value) {
            addCriterion("industry_field <>", value, "industryField");
            return (Criteria) this;
        }

        public Criteria andIndustryFieldGreaterThan(String value) {
            addCriterion("industry_field >", value, "industryField");
            return (Criteria) this;
        }

        public Criteria andIndustryFieldGreaterThanOrEqualTo(String value) {
            addCriterion("industry_field >=", value, "industryField");
            return (Criteria) this;
        }

        public Criteria andIndustryFieldLessThan(String value) {
            addCriterion("industry_field <", value, "industryField");
            return (Criteria) this;
        }

        public Criteria andIndustryFieldLessThanOrEqualTo(String value) {
            addCriterion("industry_field <=", value, "industryField");
            return (Criteria) this;
        }

        public Criteria andIndustryFieldLike(String value) {
            addCriterion("industry_field like", value, "industryField");
            return (Criteria) this;
        }

        public Criteria andIndustryFieldNotLike(String value) {
            addCriterion("industry_field not like", value, "industryField");
            return (Criteria) this;
        }

        public Criteria andIndustryFieldIn(List<String> values) {
            addCriterion("industry_field in", values, "industryField");
            return (Criteria) this;
        }

        public Criteria andIndustryFieldNotIn(List<String> values) {
            addCriterion("industry_field not in", values, "industryField");
            return (Criteria) this;
        }

        public Criteria andIndustryFieldBetween(String value1, String value2) {
            addCriterion("industry_field between", value1, value2, "industryField");
            return (Criteria) this;
        }

        public Criteria andIndustryFieldNotBetween(String value1, String value2) {
            addCriterion("industry_field not between", value1, value2, "industryField");
            return (Criteria) this;
        }

        public Criteria andInterviewRemarkNumIsNull() {
            addCriterion("interview_remark_num is null");
            return (Criteria) this;
        }

        public Criteria andInterviewRemarkNumIsNotNull() {
            addCriterion("interview_remark_num is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewRemarkNumEqualTo(Integer value) {
            addCriterion("interview_remark_num =", value, "interviewRemarkNum");
            return (Criteria) this;
        }

        public Criteria andInterviewRemarkNumNotEqualTo(Integer value) {
            addCriterion("interview_remark_num <>", value, "interviewRemarkNum");
            return (Criteria) this;
        }

        public Criteria andInterviewRemarkNumGreaterThan(Integer value) {
            addCriterion("interview_remark_num >", value, "interviewRemarkNum");
            return (Criteria) this;
        }

        public Criteria andInterviewRemarkNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_remark_num >=", value, "interviewRemarkNum");
            return (Criteria) this;
        }

        public Criteria andInterviewRemarkNumLessThan(Integer value) {
            addCriterion("interview_remark_num <", value, "interviewRemarkNum");
            return (Criteria) this;
        }

        public Criteria andInterviewRemarkNumLessThanOrEqualTo(Integer value) {
            addCriterion("interview_remark_num <=", value, "interviewRemarkNum");
            return (Criteria) this;
        }

        public Criteria andInterviewRemarkNumIn(List<Integer> values) {
            addCriterion("interview_remark_num in", values, "interviewRemarkNum");
            return (Criteria) this;
        }

        public Criteria andInterviewRemarkNumNotIn(List<Integer> values) {
            addCriterion("interview_remark_num not in", values, "interviewRemarkNum");
            return (Criteria) this;
        }

        public Criteria andInterviewRemarkNumBetween(Integer value1, Integer value2) {
            addCriterion("interview_remark_num between", value1, value2, "interviewRemarkNum");
            return (Criteria) this;
        }

        public Criteria andInterviewRemarkNumNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_remark_num not between", value1, value2, "interviewRemarkNum");
            return (Criteria) this;
        }

        public Criteria andIsHasValidPositionIsNull() {
            addCriterion("is_has_valid_position is null");
            return (Criteria) this;
        }

        public Criteria andIsHasValidPositionIsNotNull() {
            addCriterion("is_has_valid_position is not null");
            return (Criteria) this;
        }

        public Criteria andIsHasValidPositionEqualTo(String value) {
            addCriterion("is_has_valid_position =", value, "isHasValidPosition");
            return (Criteria) this;
        }

        public Criteria andIsHasValidPositionNotEqualTo(String value) {
            addCriterion("is_has_valid_position <>", value, "isHasValidPosition");
            return (Criteria) this;
        }

        public Criteria andIsHasValidPositionGreaterThan(String value) {
            addCriterion("is_has_valid_position >", value, "isHasValidPosition");
            return (Criteria) this;
        }

        public Criteria andIsHasValidPositionGreaterThanOrEqualTo(String value) {
            addCriterion("is_has_valid_position >=", value, "isHasValidPosition");
            return (Criteria) this;
        }

        public Criteria andIsHasValidPositionLessThan(String value) {
            addCriterion("is_has_valid_position <", value, "isHasValidPosition");
            return (Criteria) this;
        }

        public Criteria andIsHasValidPositionLessThanOrEqualTo(String value) {
            addCriterion("is_has_valid_position <=", value, "isHasValidPosition");
            return (Criteria) this;
        }

        public Criteria andIsHasValidPositionLike(String value) {
            addCriterion("is_has_valid_position like", value, "isHasValidPosition");
            return (Criteria) this;
        }

        public Criteria andIsHasValidPositionNotLike(String value) {
            addCriterion("is_has_valid_position not like", value, "isHasValidPosition");
            return (Criteria) this;
        }

        public Criteria andIsHasValidPositionIn(List<String> values) {
            addCriterion("is_has_valid_position in", values, "isHasValidPosition");
            return (Criteria) this;
        }

        public Criteria andIsHasValidPositionNotIn(List<String> values) {
            addCriterion("is_has_valid_position not in", values, "isHasValidPosition");
            return (Criteria) this;
        }

        public Criteria andIsHasValidPositionBetween(String value1, String value2) {
            addCriterion("is_has_valid_position between", value1, value2, "isHasValidPosition");
            return (Criteria) this;
        }

        public Criteria andIsHasValidPositionNotBetween(String value1, String value2) {
            addCriterion("is_has_valid_position not between", value1, value2, "isHasValidPosition");
            return (Criteria) this;
        }

        public Criteria andMatchPositionCountIsNull() {
            addCriterion("match_position_count is null");
            return (Criteria) this;
        }

        public Criteria andMatchPositionCountIsNotNull() {
            addCriterion("match_position_count is not null");
            return (Criteria) this;
        }

        public Criteria andMatchPositionCountEqualTo(Integer value) {
            addCriterion("match_position_count =", value, "matchPositionCount");
            return (Criteria) this;
        }

        public Criteria andMatchPositionCountNotEqualTo(Integer value) {
            addCriterion("match_position_count <>", value, "matchPositionCount");
            return (Criteria) this;
        }

        public Criteria andMatchPositionCountGreaterThan(Integer value) {
            addCriterion("match_position_count >", value, "matchPositionCount");
            return (Criteria) this;
        }

        public Criteria andMatchPositionCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("match_position_count >=", value, "matchPositionCount");
            return (Criteria) this;
        }

        public Criteria andMatchPositionCountLessThan(Integer value) {
            addCriterion("match_position_count <", value, "matchPositionCount");
            return (Criteria) this;
        }

        public Criteria andMatchPositionCountLessThanOrEqualTo(Integer value) {
            addCriterion("match_position_count <=", value, "matchPositionCount");
            return (Criteria) this;
        }

        public Criteria andMatchPositionCountIn(List<Integer> values) {
            addCriterion("match_position_count in", values, "matchPositionCount");
            return (Criteria) this;
        }

        public Criteria andMatchPositionCountNotIn(List<Integer> values) {
            addCriterion("match_position_count not in", values, "matchPositionCount");
            return (Criteria) this;
        }

        public Criteria andMatchPositionCountBetween(Integer value1, Integer value2) {
            addCriterion("match_position_count between", value1, value2, "matchPositionCount");
            return (Criteria) this;
        }

        public Criteria andMatchPositionCountNotBetween(Integer value1, Integer value2) {
            addCriterion("match_position_count not between", value1, value2, "matchPositionCount");
            return (Criteria) this;
        }

        public Criteria andMatchScoreIsNull() {
            addCriterion("match_score is null");
            return (Criteria) this;
        }

        public Criteria andMatchScoreIsNotNull() {
            addCriterion("match_score is not null");
            return (Criteria) this;
        }

        public Criteria andMatchScoreEqualTo(Double value) {
            addCriterion("match_score =", value, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreNotEqualTo(Double value) {
            addCriterion("match_score <>", value, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreGreaterThan(Double value) {
            addCriterion("match_score >", value, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("match_score >=", value, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreLessThan(Double value) {
            addCriterion("match_score <", value, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreLessThanOrEqualTo(Double value) {
            addCriterion("match_score <=", value, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreIn(List<Double> values) {
            addCriterion("match_score in", values, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreNotIn(List<Double> values) {
            addCriterion("match_score not in", values, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreBetween(Double value1, Double value2) {
            addCriterion("match_score between", value1, value2, "matchScore");
            return (Criteria) this;
        }

        public Criteria andMatchScoreNotBetween(Double value1, Double value2) {
            addCriterion("match_score not between", value1, value2, "matchScore");
            return (Criteria) this;
        }

        public Criteria andOtherLabelIsNull() {
            addCriterion("other_label is null");
            return (Criteria) this;
        }

        public Criteria andOtherLabelIsNotNull() {
            addCriterion("other_label is not null");
            return (Criteria) this;
        }

        public Criteria andOtherLabelEqualTo(String value) {
            addCriterion("other_label =", value, "otherLabel");
            return (Criteria) this;
        }

        public Criteria andOtherLabelNotEqualTo(String value) {
            addCriterion("other_label <>", value, "otherLabel");
            return (Criteria) this;
        }

        public Criteria andOtherLabelGreaterThan(String value) {
            addCriterion("other_label >", value, "otherLabel");
            return (Criteria) this;
        }

        public Criteria andOtherLabelGreaterThanOrEqualTo(String value) {
            addCriterion("other_label >=", value, "otherLabel");
            return (Criteria) this;
        }

        public Criteria andOtherLabelLessThan(String value) {
            addCriterion("other_label <", value, "otherLabel");
            return (Criteria) this;
        }

        public Criteria andOtherLabelLessThanOrEqualTo(String value) {
            addCriterion("other_label <=", value, "otherLabel");
            return (Criteria) this;
        }

        public Criteria andOtherLabelLike(String value) {
            addCriterion("other_label like", value, "otherLabel");
            return (Criteria) this;
        }

        public Criteria andOtherLabelNotLike(String value) {
            addCriterion("other_label not like", value, "otherLabel");
            return (Criteria) this;
        }

        public Criteria andOtherLabelIn(List<String> values) {
            addCriterion("other_label in", values, "otherLabel");
            return (Criteria) this;
        }

        public Criteria andOtherLabelNotIn(List<String> values) {
            addCriterion("other_label not in", values, "otherLabel");
            return (Criteria) this;
        }

        public Criteria andOtherLabelBetween(String value1, String value2) {
            addCriterion("other_label between", value1, value2, "otherLabel");
            return (Criteria) this;
        }

        public Criteria andOtherLabelNotBetween(String value1, String value2) {
            addCriterion("other_label not between", value1, value2, "otherLabel");
            return (Criteria) this;
        }

        public Criteria andPositionNumIsNull() {
            addCriterion("position_num is null");
            return (Criteria) this;
        }

        public Criteria andPositionNumIsNotNull() {
            addCriterion("position_num is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNumEqualTo(Integer value) {
            addCriterion("position_num =", value, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumNotEqualTo(Integer value) {
            addCriterion("position_num <>", value, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumGreaterThan(Integer value) {
            addCriterion("position_num >", value, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_num >=", value, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumLessThan(Integer value) {
            addCriterion("position_num <", value, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumLessThanOrEqualTo(Integer value) {
            addCriterion("position_num <=", value, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumIn(List<Integer> values) {
            addCriterion("position_num in", values, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumNotIn(List<Integer> values) {
            addCriterion("position_num not in", values, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumBetween(Integer value1, Integer value2) {
            addCriterion("position_num between", value1, value2, "positionNum");
            return (Criteria) this;
        }

        public Criteria andPositionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("position_num not between", value1, value2, "positionNum");
            return (Criteria) this;
        }

        public Criteria andProcessRateIsNull() {
            addCriterion("process_rate is null");
            return (Criteria) this;
        }

        public Criteria andProcessRateIsNotNull() {
            addCriterion("process_rate is not null");
            return (Criteria) this;
        }

        public Criteria andProcessRateEqualTo(Integer value) {
            addCriterion("process_rate =", value, "processRate");
            return (Criteria) this;
        }

        public Criteria andProcessRateNotEqualTo(Integer value) {
            addCriterion("process_rate <>", value, "processRate");
            return (Criteria) this;
        }

        public Criteria andProcessRateGreaterThan(Integer value) {
            addCriterion("process_rate >", value, "processRate");
            return (Criteria) this;
        }

        public Criteria andProcessRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_rate >=", value, "processRate");
            return (Criteria) this;
        }

        public Criteria andProcessRateLessThan(Integer value) {
            addCriterion("process_rate <", value, "processRate");
            return (Criteria) this;
        }

        public Criteria andProcessRateLessThanOrEqualTo(Integer value) {
            addCriterion("process_rate <=", value, "processRate");
            return (Criteria) this;
        }

        public Criteria andProcessRateIn(List<Integer> values) {
            addCriterion("process_rate in", values, "processRate");
            return (Criteria) this;
        }

        public Criteria andProcessRateNotIn(List<Integer> values) {
            addCriterion("process_rate not in", values, "processRate");
            return (Criteria) this;
        }

        public Criteria andProcessRateBetween(Integer value1, Integer value2) {
            addCriterion("process_rate between", value1, value2, "processRate");
            return (Criteria) this;
        }

        public Criteria andProcessRateNotBetween(Integer value1, Integer value2) {
            addCriterion("process_rate not between", value1, value2, "processRate");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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