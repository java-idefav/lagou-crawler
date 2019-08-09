package com.wzx.lagou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzx.lagou.model.auto.TbCity;
import com.wzx.lagou.model.auto.TbCityExample;
import com.wzx.lagou.model.dto.TbCityDto;
import com.wzx.lagou.repository.auto.TbCityMapper;
import com.wzx.lagou.service.CityService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Console;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private TbCityMapper cityMapper;

    @Autowired
    private MapperFacade mapperFacade;

    public PageInfo<TbCityDto> selectCityDto(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbCityExample example = new TbCityExample();
        try {
            List<TbCity> cities = cityMapper.selectByExample(example);
            PageInfo pageInfo = new PageInfo(cities);
            pageInfo.setList(mapperFacade.mapAsList(cityMapper.selectByExample(example), TbCityDto.class));
//        Map<String,Object> map = new HashMap<String, Object>();
//        map.put("pageInfo", pageInfo);
//        map.put("objList", cities);
            return pageInfo;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<TbCityDto> selectCityDto() {
        TbCityExample example = new TbCityExample();
        List<TbCity> cities = cityMapper.selectByExample(example);
        return mapperFacade.mapAsList(cities, TbCityDto.class);
    }

    @Override
    public PageInfo<TbCityDto> selectCityDto(String order,Boolean desc,Integer pageNum,Integer pageSize) {
        if (desc){
            order = order + " desc";
        }
        PageHelper.startPage(pageNum, pageSize);
        TbCityExample example = new TbCityExample();
        example.setOrderByClause(order);
        List<TbCity> cities = cityMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(cities);
        List<TbCityDto> cityDtos = mapperFacade.mapAsList(cities,TbCityDto.class);
        pageInfo.setList(cityDtos);
        return pageInfo;
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

    public TbCityDto selectCityDtoByCityName(String cityName) {
        TbCityExample example = new TbCityExample();
        TbCityExample.Criteria criteria = example.createCriteria();
        criteria.andCityNameEqualTo(cityName);
        TbCity city = cityMapper.selectByExample(example).get(0);
        return mapperFacade.map(city, TbCityDto.class);
    }

    public Boolean isHaveCity(String cityName) {
        TbCityExample example = new TbCityExample();
        TbCityExample.Criteria criteria = example.createCriteria();
        criteria.andCityNameEqualTo(cityName);
        return cityMapper.countByExample(example) > 0;
    }

    public Integer countCityNum() {
        TbCityExample example = new TbCityExample();
        return (int)cityMapper.countByExample(example);
    }
}
