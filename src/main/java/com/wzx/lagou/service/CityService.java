package com.wzx.lagou.service;

import com.github.pagehelper.PageInfo;
import com.wzx.lagou.model.dto.TbCityDto;

import java.util.List;
import java.util.Map;

public interface CityService {
    List<TbCityDto> selectCityDto();
    PageInfo selectCityDto(String order,Boolean desc,Integer pageNum,Integer pageSize);
    Map<String,Object> selectCityDto(Integer pageNum, Integer pageSize);
    Boolean insertCity(TbCityDto cityDto);
    Boolean updateCity(TbCityDto cityDto);
    TbCityDto selectCityDtoByCityName(String cityName);
    Boolean isHaveCity(String cityName);
    Integer countCityNum();
}
