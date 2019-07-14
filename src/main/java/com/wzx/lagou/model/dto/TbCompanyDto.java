package com.wzx.lagou.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class TbCompanyDto {
    private String companyId;

    private Integer id;

    private Integer approve;

    private String city;

    private Integer cityScore;

    private Double companyCombineScore;

    private String companyFeatures;

    private String companyFullName;

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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}