package com.wzx.lagou.service;

import com.wzx.lagou.model.dto.TbCityDto;

import java.util.List;

public interface CityService {
    List<TbCityDto> selectCityDto();
    Boolean insertCity(TbCityDto cityDto);
    Boolean updateCity(TbCityDto cityDto);
}
