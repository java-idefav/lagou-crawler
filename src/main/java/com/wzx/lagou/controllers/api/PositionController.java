package com.wzx.lagou.controllers.api;

import com.github.pagehelper.PageInfo;
import com.wzx.lagou.model.dto.TbCityDto;
import com.wzx.lagou.model.dto.TbPositionTypeDto;
import com.wzx.lagou.model.dto.TbPositionsDto;
import com.wzx.lagou.repository.TbPositionsMapperEx;
import com.wzx.lagou.service.CityService;
import com.wzx.lagou.service.CompanyService;
import com.wzx.lagou.service.PositionsService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public Map<String,Object> getPositionList(String pageNum,String pageSize){
        return positionsService.selectAllPositionPaging(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
    }

    @RequestMapping("/getlist_city")
    public Map<String,Object> getPositionByCity(String cityName, Integer pageNum, Integer pageSize){
        return positionsService.selectAllPositionByCity(cityName, pageNum, pageSize);
    }

    @RequestMapping("/getlist_type")
    public Map<String,Object> getPositionByType(String positionTypeId, Integer pageNum, Integer pageSize){
        return positionsService.selectAllPositionByType(positionTypeId, pageNum, pageSize);
    }

    @RequestMapping("/getlist_company")
    public Map<String,Object> getPositionByCompany(String companyId, Integer pageNum, Integer pageSize){
        return positionsService.selectAllPositionByCompany(companyId, pageNum, pageSize);
    }

    @RequestMapping("/getlist_edu")
    public Map<String,Object> getPositionByEducation(String education, Integer pageNum, Integer pageSize){
        return positionsService.selectAllPositionByEducation(education, pageNum, pageSize);
    }

    @RequestMapping("/ishave")
    public Boolean getPositionByEducation(String positionsId){
        return positionsService.isHavePosition(positionsId);
    }

    @RequestMapping("/count")
    public Integer countPositionNum(){
        return positionsService.countPositionNum();
    }

    @RequestMapping("/avgsalarybycity")
    public PageInfo sortAvgSalaryByCity(String order,Boolean desc,Integer pageNum,Integer pageSize){
        return cityService.selectCityDto(order, desc, pageNum, pageSize);
    }

    @RequestMapping("/avgsalarybycompany")
    public PageInfo sortAvgSalaryByCompany(String order,Boolean desc,Integer pageNum,Integer pageSize){
        return companyService.selectCompanyDto(order, desc, pageNum, pageSize);
    }

    @RequestMapping("/mongodb/avgsalarybycompany")
    public PageInfo sortAvgSalaryMongodbByCompany(String order,Boolean desc,Integer pageNum,Integer pageSize){
        return companyService.selectAllCompanyOnMongodb(desc, pageNum, pageSize);
    }

    @GetMapping("/query")
    public TbPositionsDto query(Long id){
        TbPositionsDto positionsDto = positionsMapperEx.queryOne(id);
        return positionsDto;
    }
}
