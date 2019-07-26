package com.wzx.lagou.model.auto;

import java.util.ArrayList;
import java.util.List;

public class TbPositionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPositionsExample() {
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

        public Criteria andPositionLabelListIsNull() {
            addCriterion("position_label_list is null");
            return (Criteria) this;
        }

        public Criteria andPositionLabelListIsNotNull() {
            addCriterion("position_label_list is not null");
            return (Criteria) this;
        }

        public Criteria andPositionLabelListEqualTo(String value) {
            addCriterion("position_label_list =", value, "positionLabelList");
            return (Criteria) this;
        }

        public Criteria andPositionLabelListNotEqualTo(String value) {
            addCriterion("position_label_list <>", value, "positionLabelList");
            return (Criteria) this;
        }

        public Criteria andPositionLabelListGreaterThan(String value) {
            addCriterion("position_label_list >", value, "positionLabelList");
            return (Criteria) this;
        }

        public Criteria andPositionLabelListGreaterThanOrEqualTo(String value) {
            addCriterion("position_label_list >=", value, "positionLabelList");
            return (Criteria) this;
        }

        public Criteria andPositionLabelListLessThan(String value) {
            addCriterion("position_label_list <", value, "positionLabelList");
            return (Criteria) this;
        }

        public Criteria andPositionLabelListLessThanOrEqualTo(String value) {
            addCriterion("position_label_list <=", value, "positionLabelList");
            return (Criteria) this;
        }

        public Criteria andPositionLabelListLike(String value) {
            addCriterion("position_label_list like", value, "positionLabelList");
            return (Criteria) this;
        }

        public Criteria andPositionLabelListNotLike(String value) {
            addCriterion("position_label_list not like", value, "positionLabelList");
            return (Criteria) this;
        }

        public Criteria andPositionLabelListIn(List<String> values) {
            addCriterion("position_label_list in", values, "positionLabelList");
            return (Criteria) this;
        }

        public Criteria andPositionLabelListNotIn(List<String> values) {
            addCriterion("position_label_list not in", values, "positionLabelList");
            return (Criteria) this;
        }

        public Criteria andPositionLabelListBetween(String value1, String value2) {
            addCriterion("position_label_list between", value1, value2, "positionLabelList");
            return (Criteria) this;
        }

        public Criteria andPositionLabelListNotBetween(String value1, String value2) {
            addCriterion("position_label_list not between", value1, value2, "positionLabelList");
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("\" location\" is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("\" location\" is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("\" location\" =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("\" location\" <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("\" location\" >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("\" location\" >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("\" location\" <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("\" location\" <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("\" location\" like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("\" location\" not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("\" location\" in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("\" location\" not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("\" location\" between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("\" location\" not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
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

        public Criteria andPositionAdvantageIsNull() {
            addCriterion("position_advantage is null");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageIsNotNull() {
            addCriterion("position_advantage is not null");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageEqualTo(String value) {
            addCriterion("position_advantage =", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageNotEqualTo(String value) {
            addCriterion("position_advantage <>", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageGreaterThan(String value) {
            addCriterion("position_advantage >", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageGreaterThanOrEqualTo(String value) {
            addCriterion("position_advantage >=", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageLessThan(String value) {
            addCriterion("position_advantage <", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageLessThanOrEqualTo(String value) {
            addCriterion("position_advantage <=", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageLike(String value) {
            addCriterion("position_advantage like", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageNotLike(String value) {
            addCriterion("position_advantage not like", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageIn(List<String> values) {
            addCriterion("position_advantage in", values, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageNotIn(List<String> values) {
            addCriterion("position_advantage not in", values, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageBetween(String value1, String value2) {
            addCriterion("position_advantage between", value1, value2, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageNotBetween(String value1, String value2) {
            addCriterion("position_advantage not between", value1, value2, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNull() {
            addCriterion("position_id is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("position_id is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(String value) {
            addCriterion("position_id =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(String value) {
            addCriterion("position_id <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(String value) {
            addCriterion("position_id >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(String value) {
            addCriterion("position_id >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(String value) {
            addCriterion("position_id <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(String value) {
            addCriterion("position_id <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLike(String value) {
            addCriterion("position_id like", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotLike(String value) {
            addCriterion("position_id not like", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<String> values) {
            addCriterion("position_id in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<String> values) {
            addCriterion("position_id not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(String value1, String value2) {
            addCriterion("position_id between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(String value1, String value2) {
            addCriterion("position_id not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNull() {
            addCriterion("position_name is null");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNotNull() {
            addCriterion("position_name is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNameEqualTo(String value) {
            addCriterion("position_name =", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotEqualTo(String value) {
            addCriterion("position_name <>", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThan(String value) {
            addCriterion("position_name >", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThanOrEqualTo(String value) {
            addCriterion("position_name >=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThan(String value) {
            addCriterion("position_name <", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThanOrEqualTo(String value) {
            addCriterion("position_name <=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLike(String value) {
            addCriterion("position_name like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotLike(String value) {
            addCriterion("position_name not like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameIn(List<String> values) {
            addCriterion("position_name in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotIn(List<String> values) {
            addCriterion("position_name not in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameBetween(String value1, String value2) {
            addCriterion("position_name between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotBetween(String value1, String value2) {
            addCriterion("position_name not between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(String value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(String value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(String value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(String value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(String value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLike(String value) {
            addCriterion("salary like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotLike(String value) {
            addCriterion("salary not like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<String> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<String> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(String value1, String value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(String value1, String value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andWorkYearIsNull() {
            addCriterion("work_year is null");
            return (Criteria) this;
        }

        public Criteria andWorkYearIsNotNull() {
            addCriterion("work_year is not null");
            return (Criteria) this;
        }

        public Criteria andWorkYearEqualTo(String value) {
            addCriterion("work_year =", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotEqualTo(String value) {
            addCriterion("work_year <>", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearGreaterThan(String value) {
            addCriterion("work_year >", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearGreaterThanOrEqualTo(String value) {
            addCriterion("work_year >=", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearLessThan(String value) {
            addCriterion("work_year <", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearLessThanOrEqualTo(String value) {
            addCriterion("work_year <=", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearLike(String value) {
            addCriterion("work_year like", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotLike(String value) {
            addCriterion("work_year not like", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearIn(List<String> values) {
            addCriterion("work_year in", values, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotIn(List<String> values) {
            addCriterion("work_year not in", values, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearBetween(String value1, String value2) {
            addCriterion("work_year between", value1, value2, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotBetween(String value1, String value2) {
            addCriterion("work_year not between", value1, value2, "workYear");
            return (Criteria) this;
        }

        public Criteria andHrIdIsNull() {
            addCriterion("hr_id is null");
            return (Criteria) this;
        }

        public Criteria andHrIdIsNotNull() {
            addCriterion("hr_id is not null");
            return (Criteria) this;
        }

        public Criteria andHrIdEqualTo(String value) {
            addCriterion("hr_id =", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdNotEqualTo(String value) {
            addCriterion("hr_id <>", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdGreaterThan(String value) {
            addCriterion("hr_id >", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdGreaterThanOrEqualTo(String value) {
            addCriterion("hr_id >=", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdLessThan(String value) {
            addCriterion("hr_id <", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdLessThanOrEqualTo(String value) {
            addCriterion("hr_id <=", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdLike(String value) {
            addCriterion("hr_id like", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdNotLike(String value) {
            addCriterion("hr_id not like", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdIn(List<String> values) {
            addCriterion("hr_id in", values, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdNotIn(List<String> values) {
            addCriterion("hr_id not in", values, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdBetween(String value1, String value2) {
            addCriterion("hr_id between", value1, value2, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdNotBetween(String value1, String value2) {
            addCriterion("hr_id not between", value1, value2, "hrId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("type_id like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("type_id not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlIsNull() {
            addCriterion("company_url is null");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlIsNotNull() {
            addCriterion("company_url is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlEqualTo(String value) {
            addCriterion("company_url =", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlNotEqualTo(String value) {
            addCriterion("company_url <>", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlGreaterThan(String value) {
            addCriterion("company_url >", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("company_url >=", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlLessThan(String value) {
            addCriterion("company_url <", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlLessThanOrEqualTo(String value) {
            addCriterion("company_url <=", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlLike(String value) {
            addCriterion("company_url like", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlNotLike(String value) {
            addCriterion("company_url not like", value, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlIn(List<String> values) {
            addCriterion("company_url in", values, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlNotIn(List<String> values) {
            addCriterion("company_url not in", values, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlBetween(String value1, String value2) {
            addCriterion("company_url between", value1, value2, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlNotBetween(String value1, String value2) {
            addCriterion("company_url not between", value1, value2, "companyUrl");
            return (Criteria) this;
        }

        public Criteria andPositionUrlIsNull() {
            addCriterion("position_url is null");
            return (Criteria) this;
        }

        public Criteria andPositionUrlIsNotNull() {
            addCriterion("position_url is not null");
            return (Criteria) this;
        }

        public Criteria andPositionUrlEqualTo(String value) {
            addCriterion("position_url =", value, "positionUrl");
            return (Criteria) this;
        }

        public Criteria andPositionUrlNotEqualTo(String value) {
            addCriterion("position_url <>", value, "positionUrl");
            return (Criteria) this;
        }

        public Criteria andPositionUrlGreaterThan(String value) {
            addCriterion("position_url >", value, "positionUrl");
            return (Criteria) this;
        }

        public Criteria andPositionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("position_url >=", value, "positionUrl");
            return (Criteria) this;
        }

        public Criteria andPositionUrlLessThan(String value) {
            addCriterion("position_url <", value, "positionUrl");
            return (Criteria) this;
        }

        public Criteria andPositionUrlLessThanOrEqualTo(String value) {
            addCriterion("position_url <=", value, "positionUrl");
            return (Criteria) this;
        }

        public Criteria andPositionUrlLike(String value) {
            addCriterion("position_url like", value, "positionUrl");
            return (Criteria) this;
        }

        public Criteria andPositionUrlNotLike(String value) {
            addCriterion("position_url not like", value, "positionUrl");
            return (Criteria) this;
        }

        public Criteria andPositionUrlIn(List<String> values) {
            addCriterion("position_url in", values, "positionUrl");
            return (Criteria) this;
        }

        public Criteria andPositionUrlNotIn(List<String> values) {
            addCriterion("position_url not in", values, "positionUrl");
            return (Criteria) this;
        }

        public Criteria andPositionUrlBetween(String value1, String value2) {
            addCriterion("position_url between", value1, value2, "positionUrl");
            return (Criteria) this;
        }

        public Criteria andPositionUrlNotBetween(String value1, String value2) {
            addCriterion("position_url not between", value1, value2, "positionUrl");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIsNull() {
            addCriterion("company_mark is null");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIsNotNull() {
            addCriterion("company_mark is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkEqualTo(String value) {
            addCriterion("company_mark =", value, "companyMark");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkNotEqualTo(String value) {
            addCriterion("company_mark <>", value, "companyMark");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkGreaterThan(String value) {
            addCriterion("company_mark >", value, "companyMark");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkGreaterThanOrEqualTo(String value) {
            addCriterion("company_mark >=", value, "companyMark");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkLessThan(String value) {
            addCriterion("company_mark <", value, "companyMark");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkLessThanOrEqualTo(String value) {
            addCriterion("company_mark <=", value, "companyMark");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkLike(String value) {
            addCriterion("company_mark like", value, "companyMark");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkNotLike(String value) {
            addCriterion("company_mark not like", value, "companyMark");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIn(List<String> values) {
            addCriterion("company_mark in", values, "companyMark");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkNotIn(List<String> values) {
            addCriterion("company_mark not in", values, "companyMark");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkBetween(String value1, String value2) {
            addCriterion("company_mark between", value1, value2, "companyMark");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkNotBetween(String value1, String value2) {
            addCriterion("company_mark not between", value1, value2, "companyMark");
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