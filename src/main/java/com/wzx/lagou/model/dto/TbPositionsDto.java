package com.wzx.lagou.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TbPositionsDto implements Serializable{
    private Integer id;

    private String city;

    private String companyFullName;

    private String companyId;

    private String positionLabelList;

    private String companyLogo;

    private String companyName;

    private String companySize;

    private String createTime;

    private String location;

    private String education;

    private String financeStage;

    private String industryField;

    private String positionAdvantage;

    private String positionId;

    private String positionName;

    private String salary;

    private String workYear;

    private String hrId;

    private String typeId;

    private String companyUrl;

    private String positionUrl;

    private String companyMark;

    private TbCompanyDto company;
}