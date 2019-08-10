package com.wzx.lagou.controllers.api;

import com.github.pagehelper.PageInfo;
import com.wzx.lagou.common.Login;
import com.wzx.lagou.common.Response;
import com.wzx.lagou.common.ResponseFactory;
import com.wzx.lagou.model.MongoDbCompanyPojo;
import com.wzx.lagou.model.dto.TbCityDto;
import com.wzx.lagou.model.dto.TbCompanyDto;
import com.wzx.lagou.model.dto.TbPositionTypeDto;
import com.wzx.lagou.model.dto.TbPositionsDto;
import com.wzx.lagou.repository.TbPositionsMapperEx;
import com.wzx.lagou.service.CityService;
import com.wzx.lagou.service.CompanyService;
import com.wzx.lagou.service.PositionsService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("/lagou/position")
public class PositionController {
    @Autowired
    private PositionsService positionsService;

    @Autowired
    private TbPositionsMapperEx positionsMapperEx;

    @Autowired
    private CityService cityService;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private MapperFacade mapperFacade;

    @RequestMapping("/getlist")
    @Login
    public Response<PageInfo<TbPositionsDto>> getPositionList(String pageNum, String pageSize){
        PageInfo<TbPositionsDto> pageInfo = positionsService.selectAllPositionPaging(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        if (pageInfo==null){
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("数据请求失败!");
        }
        return ResponseFactory.success(pageInfo);
    }

    @RequestMapping("/getlist_city")
    @Login
    public Response<PageInfo<TbPositionsDto>> getPositionByCity(String cityName, Integer pageNum, Integer pageSize){
        PageInfo<TbPositionsDto> pageInfo = positionsService.selectAllPositionByCity(cityName, pageNum, pageSize);
        if (pageInfo==null){
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("数据请求失败!");
        }
        return ResponseFactory.success(pageInfo);
    }

    @RequestMapping("/getlist_type")
    @Login
    public Response<PageInfo<TbPositionsDto>> getPositionByType(String positionTypeId, Integer pageNum, Integer pageSize){
        PageInfo<TbPositionsDto> pageInfo = positionsService.selectAllPositionByType(positionTypeId, pageNum, pageSize);
        if (pageInfo==null){
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("数据请求失败!");
        }
        return ResponseFactory.success(pageInfo);
    }

    @RequestMapping("/getlist_company")
    @Login
    public Response<PageInfo<TbPositionsDto>> getPositionByCompany(String companyId, Integer pageNum, Integer pageSize){
        PageInfo<TbPositionsDto> pageInfo = positionsService.selectAllPositionByCompany(companyId, pageNum, pageSize);
        if (pageInfo==null){
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("数据请求失败!");
        }
        return ResponseFactory.success(pageInfo);
    }

    @RequestMapping("/getlist_edu")
    @Login
    public Response<PageInfo<TbPositionsDto>> getPositionByEducation(String education, Integer pageNum, Integer pageSize){
        PageInfo<TbPositionsDto> pageInfo = positionsService.selectAllPositionByEducation(education, pageNum, pageSize);
        if (pageInfo==null){
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("数据请求失败!");
        }
        return ResponseFactory.success(pageInfo);
    }

    @RequestMapping("/ishave")
    public Response<Boolean> getPositionByEducation(String positionsId){
        try {
            Boolean isHavePosition = positionsService.isHavePosition(positionsId);
            return ResponseFactory.success(isHavePosition);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("数据请求失败!");
        }
    }

    @RequestMapping("/count")
    public Response<Integer> countPositionNum(){
        Integer count = positionsService.countPositionNum();
        if (count<0){
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("数据请求失败!");
        }
        return ResponseFactory.success(count);
    }

    @RequestMapping("/avgsalarybycity")
    @Login
    public Response<PageInfo<TbCityDto>> sortAvgSalaryByCity(String order,Boolean desc,Integer pageNum,Integer pageSize){
        PageInfo<TbCityDto> pageInfo = cityService.selectCityDto(order, desc, pageNum, pageSize);
        if (pageInfo==null){
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("请求数据失败!");
        }
        return ResponseFactory.success(pageInfo);
    }

    @RequestMapping("/avgsalarybycompany")
    @Login
    public Response<PageInfo<TbCompanyDto>> sortAvgSalaryByCompany(String order, Boolean desc, Integer pageNum, Integer pageSize){
        PageInfo<TbCompanyDto> pageInfo = companyService.selectCompanyDto(order, desc, pageNum, pageSize);
        if (pageInfo==null){
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("请求数据失败!");
        }
        return ResponseFactory.success(pageInfo);
    }

    @RequestMapping("/mongodb/avgsalarybycompany")
    @Login
    public Response<PageInfo<MongoDbCompanyPojo>> sortAvgSalaryMongodbByCompany(String order, Boolean desc, Integer pageNum, Integer pageSize){
        try {
            PageInfo<MongoDbCompanyPojo> pageInfo = companyService.selectAllCompanyOnMongodb(desc, pageNum, pageSize);
            return ResponseFactory.success(pageInfo);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("请求数据错误!");
        }
    }

    @GetMapping("/query")
    public TbPositionsDto query(Long id){
        TbPositionsDto positionsDto = positionsMapperEx.queryOne(id);
        return positionsDto;
    }
}
