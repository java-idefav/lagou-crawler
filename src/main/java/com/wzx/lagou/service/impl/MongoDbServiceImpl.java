package com.wzx.lagou.service.impl;

import com.wzx.lagou.model.MongoDbCompanyPojo;
import com.wzx.lagou.service.MongoDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * MongoDB 服务层
 */
@Service
public class MongoDbServiceImpl implements MongoDbService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public MongoDbCompanyPojo findOneCompany(String companyId) {
        Query query = new Query(Criteria.where("company_info.companyId").is(companyId));
        MongoDbCompanyPojo company = mongoTemplate.findOne(query, MongoDbCompanyPojo.class, "company");
        return company;
    }
}
