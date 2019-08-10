package com.wzx.lagou.controllers.api;

import com.wzx.lagou.common.Login;
import com.wzx.lagou.common.Response;
import com.wzx.lagou.common.ResponseFactory;
import com.wzx.lagou.model.MongoDbCompanyPojo;
import com.wzx.lagou.service.MongoDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("/lagou/mongodb")
public class MongoDbController {

    @Autowired
    private MongoDbService mongoDbService;

    @RequestMapping("/findOneCompany")
    @Login
    public Response<MongoDbCompanyPojo> findOneCompany(String companyId){
        try {
            MongoDbCompanyPojo company = mongoDbService.findOneCompany(companyId);
            return ResponseFactory.success(company);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("请求数据失败!");
        }
    }
}
