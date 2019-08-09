package com.wzx.lagou.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mongodb.client.FindIterable;
import com.wzx.lagou.model.auto.TbCompany;
import com.wzx.lagou.model.auto.TbCompanyExample;
import com.wzx.lagou.model.dto.TbCompanyDto;
import com.wzx.lagou.repository.auto.TbCompanyMapper;
import com.wzx.lagou.service.CompanyService;
import ma.glasnost.orika.MapperFacade;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private TbCompanyMapper companyMapper;

    @Autowired
    private MongoTemplate mongoTemplate;

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


    public PageInfo selectAllCompanyOnMongodb(Boolean desc,Integer pageNum, Integer pageSize) {
//        Aggregation agg = Aggregation.newAggregation(
//                //选择属性
//                Aggregation.project("company_name","minSalary","maxSalary"),
//                Aggregation.sort(Sort.Direction.DESC,"minSalary"),
//                Aggregation.limit(pageSize),
//                Aggregation.skip((long)((pageNum - 1) * pageSize))
//        );
        Sort.Direction isDesc;
        if (desc){
            isDesc = Sort.Direction.DESC;
        }else {
            isDesc = Sort.Direction.ASC;
        }
        List<JSONObject> companyList = mongoTemplate.find(new Query().limit(pageSize).with(new Sort(isDesc, "minSalary")).skip((long) ((pageNum - 1) * pageSize)), JSONObject.class, "company");
//        AggregationResults<JSONObject> results = mongoTemplate.aggregate(agg, "company", JSONObject.class);
//        List<JSONObject> companyList = results.getMappedResults();
        long count = mongoTemplate.count(new Query(), "company");
        PageInfo pageInfo = new PageInfo(companyList);
        pageInfo.setTotal(count);
        Integer pages = (int) Math.ceil((double) count / (double) pageSize);
        pageInfo.setPages(pages);
        pageInfo.setPageNum(pageNum);
        pageInfo.setPrePage(pageNum<=1?1:pageNum-1);
        pageInfo.setNextPage(pageNum>=pages?pages:pageNum+1);

//        PageHelper.startPage(pageNum, pageSize);
//        TbCompanyExample example = new TbCompanyExample();
//        List<TbCompany> companyList = companyMapper.selectByExample(example);
//        PageInfo pageInfo = new PageInfo(companyList);
//        pageInfo.setList(mapperFacade.mapAsList(companyList, TbCompanyDto.class));
        return pageInfo;
    }

    public PageInfo selectAllCompany(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbCompanyExample example = new TbCompanyExample();
        List<TbCompany> companyList = companyMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(companyList);
        pageInfo.setList(mapperFacade.mapAsList(companyList, TbCompanyDto.class));
        return pageInfo;
    }

    public PageInfo<TbCompanyDto> selectCompanyDto(String order, Boolean desc, Integer pageNum, Integer pageSize) {
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
