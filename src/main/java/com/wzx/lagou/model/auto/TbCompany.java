package com.wzx.lagou.model.auto;

import java.util.Date;

public class TbCompany {
    private Integer id;

    private Integer approve;

    private String city;

    private Integer cityScore;

    private Double companyCombineScore;

    private String companyFeatures;

    private String companyFullName;

    private String companyId;

    private String companyLogo;

    private String companyShortName;

    private String companySize;

    private Integer countryScore;

    private String financeStage;

    private String industryField;

    private Integer interviewRemarkNum;

    private String isHasValidPosition;

    private Integer matchPositionCount;

    private Double matchScore;

    private String otherLabel;

    private Integer positionNum;

    private Integer processRate;

    private Date updateTime;

    private Double avgSalaryMin;

    private Double avgSalaryMax;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApprove() {
        return approve;
    }

    public void setApprove(Integer approve) {
        this.approve = approve;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getCityScore() {
        return cityScore;
    }

    public void setCityScore(Integer cityScore) {
        this.cityScore = cityScore;
    }

    public Double getCompanyCombineScore() {
        return companyCombineScore;
    }

    public void setCompanyCombineScore(Double companyCombineScore) {
        this.companyCombineScore = companyCombineScore;
    }

    public String getCompanyFeatures() {
        return companyFeatures;
    }

    public void setCompanyFeatures(String companyFeatures) {
        this.companyFeatures = companyFeatures == null ? null : companyFeatures.trim();
    }

    public String getCompanyFullName() {
        return companyFullName;
    }

    public void setCompanyFullName(String companyFullName) {
        this.companyFullName = companyFullName == null ? null : companyFullName.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo == null ? null : companyLogo.trim();
    }

    public String getCompanyShortName() {
        return companyShortName;
    }

    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName == null ? null : companyShortName.trim();
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize == null ? null : companySize.trim();
    }

    public Integer getCountryScore() {
        return countryScore;
    }

    public void setCountryScore(Integer countryScore) {
        this.countryScore = countryScore;
    }

    public String getFinanceStage() {
        return financeStage;
    }

    public void setFinanceStage(String financeStage) {
        this.financeStage = financeStage == null ? null : financeStage.trim();
    }

    public String getIndustryField() {
        return industryField;
    }

    public void setIndustryField(String industryField) {
        this.industryField = industryField == null ? null : industryField.trim();
    }

    public Integer getInterviewRemarkNum() {
        return interviewRemarkNum;
    }

    public void setInterviewRemarkNum(Integer interviewRemarkNum) {
        this.interviewRemarkNum = interviewRemarkNum;
    }

    public String getIsHasValidPosition() {
        return isHasValidPosition;
    }

    public void setIsHasValidPosition(String isHasValidPosition) {
        this.isHasValidPosition = isHasValidPosition == null ? null : isHasValidPosition.trim();
    }

    public Integer getMatchPositionCount() {
        return matchPositionCount;
    }

    public void setMatchPositionCount(Integer matchPositionCount) {
        this.matchPositionCount = matchPositionCount;
    }

    public Double getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(Double matchScore) {
        this.matchScore = matchScore;
    }

    public String getOtherLabel() {
        return otherLabel;
    }

    public void setOtherLabel(String otherLabel) {
        this.otherLabel = otherLabel == null ? null : otherLabel.trim();
    }

    public Integer getPositionNum() {
        return positionNum;
    }

    public void setPositionNum(Integer positionNum) {
        this.positionNum = positionNum;
    }

    public Integer getProcessRate() {
        return processRate;
    }

    public void setProcessRate(Integer processRate) {
        this.processRate = processRate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Double getAvgSalaryMin() {
        return avgSalaryMin;
    }

    public void setAvgSalaryMin(Double avgSalaryMin) {
        this.avgSalaryMin = avgSalaryMin;
    }

    public Double getAvgSalaryMax() {
        return avgSalaryMax;
    }

    public void setAvgSalaryMax(Double avgSalaryMax) {
        this.avgSalaryMax = avgSalaryMax;
    }
}