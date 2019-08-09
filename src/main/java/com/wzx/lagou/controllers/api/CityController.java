package com.wzx.lagou.controllers.api;

import com.github.pagehelper.PageInfo;
import com.wzx.lagou.common.Login;
import com.wzx.lagou.common.Response;
import com.wzx.lagou.common.ResponseFactory;
import com.wzx.lagou.model.dto.TbCityDto;
import com.wzx.lagou.service.CityService;
import ma.glasnost.orika.MapperFacade;
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
@RequestMapping("/lagou/city")
@ResponseBody
public class CityController extends BaseController{

    @Autowired
    private CityService cityService;

    @Autowired
    private MapperFacade mapperFacade;

    @RequestMapping("/getlist")
    @Login
    public Response<PageInfo<TbCityDto>> getCityList(String pageNum, String pageSize){
        PageInfo<TbCityDto> pageInfo = cityService.selectCityDto(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        if (pageInfo==null){
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("未知错误!");
        }
        return ResponseFactory.success(pageInfo);

    }

    @RequestMapping("/getcity")
    @Login
    public Response<TbCityDto> getCity(String cityName){
        TbCityDto cityDto = cityService.selectCityDtoByCityName(cityName);
        if (cityDto==null){
            HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResponseFactory.fail("未知错误!");
        }
        return ResponseFactory.success(cityDto);
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
