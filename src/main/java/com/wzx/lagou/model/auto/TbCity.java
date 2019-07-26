package com.wzx.lagou.model.auto;

public class TbCity {
    private Integer id;

    private String cityId;

    private String cityName;

    private String url;

    private Double avgSalaryMin;

    private Double avgSalaryMax;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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