package com.wzx.lagou.service;

import com.github.pagehelper.PageInfo;
import com.wzx.lagou.model.auto.TbCompany;
import com.wzx.lagou.model.dto.TbCompanyDto;

import java.util.List;

public interface CompanyService {
    Boolean insertCompany(TbCompany company);
    List<TbCompanyDto> selectCompanyByCompanyId(String companyId);
    PageInfo selectAllCompany(Integer pageNum,Integer pageSize);
    PageInfo selectCompanyDto(String order,Boolean desc,Integer pageNum,Integer pageSize);
    Boolean updateCompany(TbCompany company);
}
