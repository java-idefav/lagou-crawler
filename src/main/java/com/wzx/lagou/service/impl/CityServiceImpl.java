package com.wzx.lagou.service.impl;

import com.wzx.lagou.model.auto.TbCity;
import com.wzx.lagou.model.auto.TbCityExample;
import com.wzx.lagou.model.dto.TbCityDto;
import com.wzx.lagou.repository.auto.TbCityMapper;
import com.wzx.lagou.service.CityService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private TbCityMapper cityMapper;

    @Autowired
    private MapperFacade mapperFacade;

    public List<TbCityDto> selectCityDto() {
        TbCityExample example = new TbCityExample();
        List<TbCity> cities = cityMapper.selectByExample(example);
        return mapperFacade.mapAsList(cities, TbCityDto.class);
    }

    public Boolean insertCity(TbCityDto cityDto) {
        return cityMapper.insertSelective(mapperFacade.map(cityDto, TbCity.class)) > 0;
    }

    public Boolean updateCity(TbCityDto cityDto) {
        TbCityExample example = new TbCityExample();
        TbCityExample.Criteria criteria = example.createCriteria();
        criteria.andCityNameEqualTo(cityDto.getCityName());
        return cityMapper.updateByExampleSelective(mapperFacade.map(cityDto, TbCity.class), example) > 0;
    }
}
