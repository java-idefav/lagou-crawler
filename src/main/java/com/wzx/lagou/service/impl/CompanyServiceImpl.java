package com.wzx.lagou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    public PageInfo selectAllCompany(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbCompanyExample example = new TbCompanyExample();
        List<TbCompany> companyList = companyMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(companyList);
        pageInfo.setList(mapperFacade.mapAsList(companyList, TbCompanyDto.class));
        return pageInfo;
    }

    public PageInfo selectCompanyDto(String order, Boolean desc, Integer pageNum, Integer pageSize) {
        if (desc){
            order = order+" desc";
        }
        PageHelper.startPage(pageNum, pageSize);
        TbCompanyExample example = new TbCompanyExample();
        example.setOrderByClause(order);
        List<TbCompany> companyList = companyMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(companyList);
        pageInfo.setList(mapperFacade.mapAsList(companyList, TbCompanyDto.class));
        return pageInfo;
    }

    public Boolean updateCompany(TbCompany company) {
        TbCompanyExample example = new TbCompanyExample();
        TbCompanyExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyIdEqualTo(company.getCompanyId());
        return companyMapper.updateByExampleSelective(mapperFacade.map(company, TbCompany.class), example) > 0;
    }
}
