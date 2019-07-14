package com.wzx.lagou.model.auto;

public class TbPositionType {
    private Integer id;

    private String typeId;

    private String type;

    private String branch;

    private String largeType;

    private String typeUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getLargeType() {
        return largeType;
    }

    public void setLargeType(String largeType) {
        this.largeType = largeType == null ? null : largeType.trim();
    }

    public String getTypeUrl() {
        return typeUrl;
    }

    public void setTypeUrl(String typeUrl) {
        this.typeUrl = typeUrl == null ? null : typeUrl.trim();
    }
}