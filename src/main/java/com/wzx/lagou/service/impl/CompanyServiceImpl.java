package com.wzx.lagou.service.impl;

import com.wzx.lagou.model.auto.TbCompany;
import com.wzx.lagou.model.auto.TbCompanyExample;
import com.wzx.lagou.model.dto.TbCompanyDto;
import com.wzx.lagou.repository.auto.TbCompanyMapper;
import com.wzx.lagou.service.CompanyService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private TbCompanyMapper companyMapper;

    @Autowired
    private MapperFacade mapperFacade;

    public Boolean insertCompany(TbCompany company) {
        return companyMapper.insertSelective(company) > 0;
    }

    public List<TbCompanyDto> selectCompanyByCompanyId(String companyId) {
        TbCompanyExample example = new TbCompanyExample();
        TbCompanyExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyIdEqualTo(companyId);
        List<TbCompany> companies = companyMapper.selectByExample(example);
        return mapperFacade.mapAsList(companies, TbCompanyDto.class);
    }

    public Boolean updateCompany(TbCompany company) {
        TbCompanyExample example = new TbCompanyExample();
        TbCompanyExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyIdEqualTo(company.getCompanyId());
        return companyMapper.updateByExampleSelective(company, example) > 0;
    }
}
