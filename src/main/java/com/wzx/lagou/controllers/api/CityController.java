package com.wzx.lagou.controllers.api;

import com.wzx.lagou.model.dto.TbCityDto;
import com.wzx.lagou.service.CityService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/lagou/city")
@ResponseBody
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private MapperFacade mapperFacade;

    @RequestMapping("/getlist")
    public Map<String, Object> getCityList(String pageNum,String pageSize){
        Map<String, Object> map = cityService.selectCityDto(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        return map;
    }

    @RequestMapping("/getcity")
    public TbCityDto getCity(String cityName){
        TbCityDto cityDto = cityService.selectCityDtoByCityName(cityName);
        return cityDto;
    }

    @RequestMapping("/ishave")
    public Boolean isHaveCity(String cityName){
        return cityService.isHaveCity(cityName);
    }

    @RequestMapping("/citynum")
    public Integer getCityNum(){
        return cityService.countCityNum();
    }

}
