package com.wzx.lagou.service;


import com.wzx.lagou.model.MongoDbCompanyPojo;

import java.util.Map;

public interface MongoDbService {
    MongoDbCompanyPojo findOneCompany(String companyId);
}
