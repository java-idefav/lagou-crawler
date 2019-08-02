package com.wzx.lagou.service;


import java.util.Map;

public interface MongoDbService {
    Map<String,Object> findOneCompany(String companyId);
}
