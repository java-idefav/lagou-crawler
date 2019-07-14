package com.wzx.lagou.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TbPositionDto {
    private Integer id;

    private Integer adAfterDetailPv;

    private Integer adAfterReceivedCount;

    private Integer adBeforeDetailPv;

    private Integer adBeforeReceivedCount;

    private Integer adTimes;

    private Integer adWord;

    private String city;

    private String companyFullName;

    private Integer companyId;

    private String companyLabelList;

    private String companyLogo;

    private String companyName;

    private String companySize;

    private Date createTime;

    private String district;

    private String education;

    private String financeStage;

    private String haveDeliver;

    private String industryField;

    private String isCalcScore;

    private String jobNature;

    private String logger;

    private String positionAdvantage;

    private String positionId;

    private String positionName;

    private String salary;

    private Integer score;

    private Integer searchScore;

    private String userId;

    private String workYear;

}