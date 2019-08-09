package com.wzx.lagou.controllers.api;

import com.wzx.lagou.common.Login;
import com.wzx.lagou.service.MongoDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("/lagou/mongodb")
public class MongoDbController {

    @Autowired
    private MongoDbService mongoDbService;

    @RequestMapping("/findOneCompany")
    @Login
    public Object findOneCompany(String companyId){
        Map<String, Object> map = mongoDbService.findOneCompany(companyId);
        return map.get("company_info");
    }
}
