package com.wzx.lagou.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPositionExample() {
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

        public Criteria andAdAfterDetailPvIsNull() {
            addCriterion("ad_after_detail_pv is null");
            return (Criteria) this;
        }

        public Criteria andAdAfterDetailPvIsNotNull() {
            addCriterion("ad_after_detail_pv is not null");
            return (Criteria) this;
        }

        public Criteria andAdAfterDetailPvEqualTo(Integer value) {
            addCriterion("ad_after_detail_pv =", value, "adAfterDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdAfterDetailPvNotEqualTo(Integer value) {
            addCriterion("ad_after_detail_pv <>", value, "adAfterDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdAfterDetailPvGreaterThan(Integer value) {
            addCriterion("ad_after_detail_pv >", value, "adAfterDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdAfterDetailPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_after_detail_pv >=", value, "adAfterDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdAfterDetailPvLessThan(Integer value) {
            addCriterion("ad_after_detail_pv <", value, "adAfterDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdAfterDetailPvLessThanOrEqualTo(Integer value) {
            addCriterion("ad_after_detail_pv <=", value, "adAfterDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdAfterDetailPvIn(List<Integer> values) {
            addCriterion("ad_after_detail_pv in", values, "adAfterDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdAfterDetailPvNotIn(List<Integer> values) {
            addCriterion("ad_after_detail_pv not in", values, "adAfterDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdAfterDetailPvBetween(Integer value1, Integer value2) {
            addCriterion("ad_after_detail_pv between", value1, value2, "adAfterDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdAfterDetailPvNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_after_detail_pv not between", value1, value2, "adAfterDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdAfterReceivedCountIsNull() {
            addCriterion("ad_after_received_count is null");
            return (Criteria) this;
        }

        public Criteria andAdAfterReceivedCountIsNotNull() {
            addCriterion("ad_after_received_count is not null");
            return (Criteria) this;
        }

        public Criteria andAdAfterReceivedCountEqualTo(Integer value) {
            addCriterion("ad_after_received_count =", value, "adAfterReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdAfterReceivedCountNotEqualTo(Integer value) {
            addCriterion("ad_after_received_count <>", value, "adAfterReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdAfterReceivedCountGreaterThan(Integer value) {
            addCriterion("ad_after_received_count >", value, "adAfterReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdAfterReceivedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_after_received_count >=", value, "adAfterReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdAfterReceivedCountLessThan(Integer value) {
            addCriterion("ad_after_received_count <", value, "adAfterReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdAfterReceivedCountLessThanOrEqualTo(Integer value) {
            addCriterion("ad_after_received_count <=", value, "adAfterReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdAfterReceivedCountIn(List<Integer> values) {
            addCriterion("ad_after_received_count in", values, "adAfterReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdAfterReceivedCountNotIn(List<Integer> values) {
            addCriterion("ad_after_received_count not in", values, "adAfterReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdAfterReceivedCountBetween(Integer value1, Integer value2) {
            addCriterion("ad_after_received_count between", value1, value2, "adAfterReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdAfterReceivedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_after_received_count not between", value1, value2, "adAfterReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdBeforeDetailPvIsNull() {
            addCriterion("ad_before_detail_pv is null");
            return (Criteria) this;
        }

        public Criteria andAdBeforeDetailPvIsNotNull() {
            addCriterion("ad_before_detail_pv is not null");
            return (Criteria) this;
        }

        public Criteria andAdBeforeDetailPvEqualTo(Integer value) {
            addCriterion("ad_before_detail_pv =", value, "adBeforeDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdBeforeDetailPvNotEqualTo(Integer value) {
            addCriterion("ad_before_detail_pv <>", value, "adBeforeDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdBeforeDetailPvGreaterThan(Integer value) {
            addCriterion("ad_before_detail_pv >", value, "adBeforeDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdBeforeDetailPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_before_detail_pv >=", value, "adBeforeDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdBeforeDetailPvLessThan(Integer value) {
            addCriterion("ad_before_detail_pv <", value, "adBeforeDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdBeforeDetailPvLessThanOrEqualTo(Integer value) {
            addCriterion("ad_before_detail_pv <=", value, "adBeforeDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdBeforeDetailPvIn(List<Integer> values) {
            addCriterion("ad_before_detail_pv in", values, "adBeforeDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdBeforeDetailPvNotIn(List<Integer> values) {
            addCriterion("ad_before_detail_pv not in", values, "adBeforeDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdBeforeDetailPvBetween(Integer value1, Integer value2) {
            addCriterion("ad_before_detail_pv between", value1, value2, "adBeforeDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdBeforeDetailPvNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_before_detail_pv not between", value1, value2, "adBeforeDetailPv");
            return (Criteria) this;
        }

        public Criteria andAdBeforeReceivedCountIsNull() {
            addCriterion("ad_before_received_count is null");
            return (Criteria) this;
        }

        public Criteria andAdBeforeReceivedCountIsNotNull() {
            addCriterion("ad_before_received_count is not null");
            return (Criteria) this;
        }

        public Criteria andAdBeforeReceivedCountEqualTo(Integer value) {
            addCriterion("ad_before_received_count =", value, "adBeforeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdBeforeReceivedCountNotEqualTo(Integer value) {
            addCriterion("ad_before_received_count <>", value, "adBeforeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdBeforeReceivedCountGreaterThan(Integer value) {
            addCriterion("ad_before_received_count >", value, "adBeforeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdBeforeReceivedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_before_received_count >=", value, "adBeforeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdBeforeReceivedCountLessThan(Integer value) {
            addCriterion("ad_before_received_count <", value, "adBeforeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdBeforeReceivedCountLessThanOrEqualTo(Integer value) {
            addCriterion("ad_before_received_count <=", value, "adBeforeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdBeforeReceivedCountIn(List<Integer> values) {
            addCriterion("ad_before_received_count in", values, "adBeforeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdBeforeReceivedCountNotIn(List<Integer> values) {
            addCriterion("ad_before_received_count not in", values, "adBeforeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdBeforeReceivedCountBetween(Integer value1, Integer value2) {
            addCriterion("ad_before_received_count between", value1, value2, "adBeforeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdBeforeReceivedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_before_received_count not between", value1, value2, "adBeforeReceivedCount");
            return (Criteria) this;
        }

        public Criteria andAdTimesIsNull() {
            addCriterion("ad_times is null");
            return (Criteria) this;
        }

        public Criteria andAdTimesIsNotNull() {
            addCriterion("ad_times is not null");
            return (Criteria) this;
        }

        public Criteria andAdTimesEqualTo(Integer value) {
            addCriterion("ad_times =", value, "adTimes");
            return (Criteria) this;
        }

        public Criteria andAdTimesNotEqualTo(Integer value) {
            addCriterion("ad_times <>", value, "adTimes");
            return (Criteria) this;
        }

        public Criteria andAdTimesGreaterThan(Integer value) {
            addCriterion("ad_times >", value, "adTimes");
            return (Criteria) this;
        }

        public Criteria andAdTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_times >=", value, "adTimes");
            return (Criteria) this;
        }

        public Criteria andAdTimesLessThan(Integer value) {
            addCriterion("ad_times <", value, "adTimes");
            return (Criteria) this;
        }

        public Criteria andAdTimesLessThanOrEqualTo(Integer value) {
            addCriterion("ad_times <=", value, "adTimes");
            return (Criteria) this;
        }

        public Criteria andAdTimesIn(List<Integer> values) {
            addCriterion("ad_times in", values, "adTimes");
            return (Criteria) this;
        }

        public Criteria andAdTimesNotIn(List<Integer> values) {
            addCriterion("ad_times not in", values, "adTimes");
            return (Criteria) this;
        }

        public Criteria andAdTimesBetween(Integer value1, Integer value2) {
            addCriterion("ad_times between", value1, value2, "adTimes");
            return (Criteria) this;
        }

        public Criteria andAdTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_times not between", value1, value2, "adTimes");
            return (Criteria) this;
        }

        public Criteria andAdWordIsNull() {
            addCriterion("ad_word is null");
            return (Criteria) this;
        }

        public Criteria andAdWordIsNotNull() {
            addCriterion("ad_word is not null");
            return (Criteria) this;
        }

        public Criteria andAdWordEqualTo(Integer value) {
            addCriterion("ad_word =", value, "adWord");
            return (Criteria) this;
        }

        public Criteria andAdWordNotEqualTo(Integer value) {
            addCriterion("ad_word <>", value, "adWord");
            return (Criteria) this;
        }

        public Criteria andAdWordGreaterThan(Integer value) {
            addCriterion("ad_word >", value, "adWord");
            return (Criteria) this;
        }

        public Criteria andAdWordGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_word >=", value, "adWord");
            return (Criteria) this;
        }

        public Criteria andAdWordLessThan(Integer value) {
            addCriterion("ad_word <", value, "adWord");
            return (Criteria) this;
        }

        public Criteria andAdWordLessThanOrEqualTo(Integer value) {
            addCriterion("ad_word <=", value, "adWord");
            return (Criteria) this;
        }

        public Criteria andAdWordIn(List<Integer> values) {
            addCriterion("ad_word in", values, "adWord");
            return (Criteria) this;
        }

        public Criteria andAdWordNotIn(List<Integer> values) {
            addCriterion("ad_word not in", values, "adWord");
            return (Criteria) this;
        }

        public Criteria andAdWordBetween(Integer value1, Integer value2) {
            addCriterion("ad_word between", value1, value2, "adWord");
            return (Criteria) this;
        }

        public Criteria andAdWordNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_word not between", value1, value2, "adWord");
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

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelListIsNull() {
            addCriterion("company_label_list is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelListIsNotNull() {
            addCriterion("company_label_list is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelListEqualTo(String value) {
            addCriterion("company_label_list =", value, "companyLabelList");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelListNotEqualTo(String value) {
            addCriterion("company_label_list <>", value, "companyLabelList");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelListGreaterThan(String value) {
            addCriterion("company_label_list >", value, "companyLabelList");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelListGreaterThanOrEqualTo(String value) {
            addCriterion("company_label_list >=", value, "companyLabelList");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelListLessThan(String value) {
            addCriterion("company_label_list <", value, "companyLabelList");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelListLessThanOrEqualTo(String value) {
            addCriterion("company_label_list <=", value, "companyLabelList");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelListLike(String value) {
            addCriterion("company_label_list like", value, "companyLabelList");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelListNotLike(String value) {
            addCriterion("company_label_list not like", value, "companyLabelList");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelListIn(List<String> values) {
            addCriterion("company_label_list in", values, "companyLabelList");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelListNotIn(List<String> values) {
            addCriterion("company_label_list not in", values, "companyLabelList");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelListBetween(String value1, String value2) {
            addCriterion("company_label_list between", value1, value2, "companyLabelList");
            return (Criteria) this;
        }

        public Criteria andCompanyLabelListNotBetween(String value1, String value2) {
            addCriterion("company_label_list not between", value1, value2, "companyLabelList");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
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

        public Criteria andHaveDeliverIsNull() {
            addCriterion("have_deliver is null");
            return (Criteria) this;
        }

        public Criteria andHaveDeliverIsNotNull() {
            addCriterion("have_deliver is not null");
            return (Criteria) this;
        }

        public Criteria andHaveDeliverEqualTo(String value) {
            addCriterion("have_deliver =", value, "haveDeliver");
            return (Criteria) this;
        }

        public Criteria andHaveDeliverNotEqualTo(String value) {
            addCriterion("have_deliver <>", value, "haveDeliver");
            return (Criteria) this;
        }

        public Criteria andHaveDeliverGreaterThan(String value) {
            addCriterion("have_deliver >", value, "haveDeliver");
            return (Criteria) this;
        }

        public Criteria andHaveDeliverGreaterThanOrEqualTo(String value) {
            addCriterion("have_deliver >=", value, "haveDeliver");
            return (Criteria) this;
        }

        public Criteria andHaveDeliverLessThan(String value) {
            addCriterion("have_deliver <", value, "haveDeliver");
            return (Criteria) this;
        }

        public Criteria andHaveDeliverLessThanOrEqualTo(String value) {
            addCriterion("have_deliver <=", value, "haveDeliver");
            return (Criteria) this;
        }

        public Criteria andHaveDeliverLike(String value) {
            addCriterion("have_deliver like", value, "haveDeliver");
            return (Criteria) this;
        }

        public Criteria andHaveDeliverNotLike(String value) {
            addCriterion("have_deliver not like", value, "haveDeliver");
            return (Criteria) this;
        }

        public Criteria andHaveDeliverIn(List<String> values) {
            addCriterion("have_deliver in", values, "haveDeliver");
            return (Criteria) this;
        }

        public Criteria andHaveDeliverNotIn(List<String> values) {
            addCriterion("have_deliver not in", values, "haveDeliver");
            return (Criteria) this;
        }

        public Criteria andHaveDeliverBetween(String value1, String value2) {
            addCriterion("have_deliver between", value1, value2, "haveDeliver");
            return (Criteria) this;
        }

        public Criteria andHaveDeliverNotBetween(String value1, String value2) {
            addCriterion("have_deliver not between", value1, value2, "haveDeliver");
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

        public Criteria andIsCalcScoreIsNull() {
            addCriterion("is_calc_score is null");
            return (Criteria) this;
        }

        public Criteria andIsCalcScoreIsNotNull() {
            addCriterion("is_calc_score is not null");
            return (Criteria) this;
        }

        public Criteria andIsCalcScoreEqualTo(String value) {
            addCriterion("is_calc_score =", value, "isCalcScore");
            return (Criteria) this;
        }

        public Criteria andIsCalcScoreNotEqualTo(String value) {
            addCriterion("is_calc_score <>", value, "isCalcScore");
            return (Criteria) this;
        }

        public Criteria andIsCalcScoreGreaterThan(String value) {
            addCriterion("is_calc_score >", value, "isCalcScore");
            return (Criteria) this;
        }

        public Criteria andIsCalcScoreGreaterThanOrEqualTo(String value) {
            addCriterion("is_calc_score >=", value, "isCalcScore");
            return (Criteria) this;
        }

        public Criteria andIsCalcScoreLessThan(String value) {
            addCriterion("is_calc_score <", value, "isCalcScore");
            return (Criteria) this;
        }

        public Criteria andIsCalcScoreLessThanOrEqualTo(String value) {
            addCriterion("is_calc_score <=", value, "isCalcScore");
            return (Criteria) this;
        }

        public Criteria andIsCalcScoreLike(String value) {
            addCriterion("is_calc_score like", value, "isCalcScore");
            return (Criteria) this;
        }

        public Criteria andIsCalcScoreNotLike(String value) {
            addCriterion("is_calc_score not like", value, "isCalcScore");
            return (Criteria) this;
        }

        public Criteria andIsCalcScoreIn(List<String> values) {
            addCriterion("is_calc_score in", values, "isCalcScore");
            return (Criteria) this;
        }

        public Criteria andIsCalcScoreNotIn(List<String> values) {
            addCriterion("is_calc_score not in", values, "isCalcScore");
            return (Criteria) this;
        }

        public Criteria andIsCalcScoreBetween(String value1, String value2) {
            addCriterion("is_calc_score between", value1, value2, "isCalcScore");
            return (Criteria) this;
        }

        public Criteria andIsCalcScoreNotBetween(String value1, String value2) {
            addCriterion("is_calc_score not between", value1, value2, "isCalcScore");
            return (Criteria) this;
        }

        public Criteria andJobNatureIsNull() {
            addCriterion("job_nature is null");
            return (Criteria) this;
        }

        public Criteria andJobNatureIsNotNull() {
            addCriterion("job_nature is not null");
            return (Criteria) this;
        }

        public Criteria andJobNatureEqualTo(String value) {
            addCriterion("job_nature =", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureNotEqualTo(String value) {
            addCriterion("job_nature <>", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureGreaterThan(String value) {
            addCriterion("job_nature >", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureGreaterThanOrEqualTo(String value) {
            addCriterion("job_nature >=", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureLessThan(String value) {
            addCriterion("job_nature <", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureLessThanOrEqualTo(String value) {
            addCriterion("job_nature <=", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureLike(String value) {
            addCriterion("job_nature like", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureNotLike(String value) {
            addCriterion("job_nature not like", value, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureIn(List<String> values) {
            addCriterion("job_nature in", values, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureNotIn(List<String> values) {
            addCriterion("job_nature not in", values, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureBetween(String value1, String value2) {
            addCriterion("job_nature between", value1, value2, "jobNature");
            return (Criteria) this;
        }

        public Criteria andJobNatureNotBetween(String value1, String value2) {
            addCriterion("job_nature not between", value1, value2, "jobNature");
            return (Criteria) this;
        }

        public Criteria andLoggerIsNull() {
            addCriterion("logger is null");
            return (Criteria) this;
        }

        public Criteria andLoggerIsNotNull() {
            addCriterion("logger is not null");
            return (Criteria) this;
        }

        public Criteria andLoggerEqualTo(String value) {
            addCriterion("logger =", value, "logger");
            return (Criteria) this;
        }

        public Criteria andLoggerNotEqualTo(String value) {
            addCriterion("logger <>", value, "logger");
            return (Criteria) this;
        }

        public Criteria andLoggerGreaterThan(String value) {
            addCriterion("logger >", value, "logger");
            return (Criteria) this;
        }

        public Criteria andLoggerGreaterThanOrEqualTo(String value) {
            addCriterion("logger >=", value, "logger");
            return (Criteria) this;
        }

        public Criteria andLoggerLessThan(String value) {
            addCriterion("logger <", value, "logger");
            return (Criteria) this;
        }

        public Criteria andLoggerLessThanOrEqualTo(String value) {
            addCriterion("logger <=", value, "logger");
            return (Criteria) this;
        }

        public Criteria andLoggerLike(String value) {
            addCriterion("logger like", value, "logger");
            return (Criteria) this;
        }

        public Criteria andLoggerNotLike(String value) {
            addCriterion("logger not like", value, "logger");
            return (Criteria) this;
        }

        public Criteria andLoggerIn(List<String> values) {
            addCriterion("logger in", values, "logger");
            return (Criteria) this;
        }

        public Criteria andLoggerNotIn(List<String> values) {
            addCriterion("logger not in", values, "logger");
            return (Criteria) this;
        }

        public Criteria andLoggerBetween(String value1, String value2) {
            addCriterion("logger between", value1, value2, "logger");
            return (Criteria) this;
        }

        public Criteria andLoggerNotBetween(String value1, String value2) {
            addCriterion("logger not between", value1, value2, "logger");
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

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andSearchScoreIsNull() {
            addCriterion("search_score is null");
            return (Criteria) this;
        }

        public Criteria andSearchScoreIsNotNull() {
            addCriterion("search_score is not null");
            return (Criteria) this;
        }

        public Criteria andSearchScoreEqualTo(Integer value) {
            addCriterion("search_score =", value, "searchScore");
            return (Criteria) this;
        }

        public Criteria andSearchScoreNotEqualTo(Integer value) {
            addCriterion("search_score <>", value, "searchScore");
            return (Criteria) this;
        }

        public Criteria andSearchScoreGreaterThan(Integer value) {
            addCriterion("search_score >", value, "searchScore");
            return (Criteria) this;
        }

        public Criteria andSearchScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_score >=", value, "searchScore");
            return (Criteria) this;
        }

        public Criteria andSearchScoreLessThan(Integer value) {
            addCriterion("search_score <", value, "searchScore");
            return (Criteria) this;
        }

        public Criteria andSearchScoreLessThanOrEqualTo(Integer value) {
            addCriterion("search_score <=", value, "searchScore");
            return (Criteria) this;
        }

        public Criteria andSearchScoreIn(List<Integer> values) {
            addCriterion("search_score in", values, "searchScore");
            return (Criteria) this;
        }

        public Criteria andSearchScoreNotIn(List<Integer> values) {
            addCriterion("search_score not in", values, "searchScore");
            return (Criteria) this;
        }

        public Criteria andSearchScoreBetween(Integer value1, Integer value2) {
            addCriterion("search_score between", value1, value2, "searchScore");
            return (Criteria) this;
        }

        public Criteria andSearchScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("search_score not between", value1, value2, "searchScore");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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