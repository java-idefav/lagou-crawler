package com.wzx.lagou.service;

import com.wzx.lagou.model.auto.TbCompany;
import com.wzx.lagou.model.dto.TbCompanyDto;

import java.util.List;

public interface CompanyService {
    Boolean insertCompany(TbCompany company);
    List<TbCompanyDto> selectCompanyByCompanyId(String companyId);
    Boolean updateCompany(TbCompany company);
}
