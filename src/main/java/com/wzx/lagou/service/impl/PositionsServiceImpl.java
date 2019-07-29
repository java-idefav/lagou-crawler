package com.wzx.lagou.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzx.lagou.model.auto.TbPositionsExample;
import com.wzx.lagou.model.auto.TbPositions;
import com.wzx.lagou.model.dto.TbPositionsDto;
import com.wzx.lagou.repository.TbPositionsMapperEx;
import com.wzx.lagou.repository.auto.TbPositionsMapper;
import com.wzx.lagou.service.PositionsService;
import com.wzx.lagou.service.RedisCacheService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PositionsServiceImpl implements PositionsService{

    @Autowired
    private TbPositionsMapper positionsMapper;

    @Autowired
    private TbPositionsMapperEx positionsMapperEx;

    @Autowired
    private RedisCacheService redisCacheService;

    @Autowired
    private MapperFacade mapperFacade;

//    @Cacheable(cacheNames = {"posituons"})
    public Map<String, Object> selectAllPositionPaging(Integer pageNum, Integer pageSize) {
//        RedisCacheService redisCacheService = new RedisCacheServiceImpl();
        try {
            Object obj = redisCacheService.redisRead("positions:"+pageNum+"_"+pageSize);
            if (obj!=null) {
                return (Map<String, Object>)obj;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        PageHelper.startPage(pageNum, pageSize);
        TbPositionsExample example = new TbPositionsExample();
        List<TbPositions> positionList = positionsMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(positionList);
        pageInfo.setList(mapperFacade.mapAsList(positionList, TbPositionsDto.class));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("pageInfo", pageInfo);
        map.put("objList", positionList);
        try {
            redisCacheService.redisAdd("positions", pageNum+"_"+pageSize, map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("数据库查询...........");
        return map;
    }

    public Boolean insertPositions(TbPositionsDto positionsDto) {
        return positionsMapper.insertSelective(mapperFacade.map(positionsDto, TbPositions.class)) > 0;
    }

    public Boolean updatePosition(TbPositionsDto positionsDto) {
        TbPositionsExample example = new TbPositionsExample();
        TbPositionsExample.Criteria criteria = example.createCriteria();
        criteria.andPositionIdEqualTo(positionsDto.getPositionId());
        return positionsMapper.updateByExampleSelective(mapperFacade.map(positionsDto, TbPositions.class), example) > 0;
    }

    public Boolean isHavePosition(String positionsId) {
        TbPositionsExample example = new TbPositionsExample();
        TbPositionsExample.Criteria criteria = example.createCriteria();
        criteria.andPositionIdEqualTo(positionsId);
        return positionsMapper.countByExample(example) > 0;
    }

    public Integer countPositionNum() {
        TbPositionsExample example = new TbPositionsExample();
        return (int)positionsMapper.countByExample(example);
    }

    @Cacheable(value = "all",keyGenerator = "keyGenerator")
    public Map<String, Object> selectAllPositionByCity(String cityName, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbPositionsExample example = new TbPositionsExample();
        TbPositionsExample.Criteria criteria = example.createCriteria();
        criteria.andCityEqualTo(cityName);
        List<TbPositions> positionList = positionsMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(positionList);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("pageInfo", pageInfo);
        map.put("objList", positionList);
        return map;
    }

    public Map<String, Object> selectAllPositionByType(String positionTypeId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbPositionsExample example = new TbPositionsExample();
        TbPositionsExample.Criteria criteria = example.createCriteria();
        criteria.andTypeIdEqualTo(positionTypeId);
        List<TbPositions> positionList = positionsMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(positionList);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("pageInfo", pageInfo);
        map.put("objList", positionList);
        return map;
    }

    public Map<String, Object> selectAllPositionByCompany(String companyId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbPositionsExample example = new TbPositionsExample();
        TbPositionsExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyIdEqualTo(companyId);
        List<TbPositions> positionList = positionsMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(positionList);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("pageInfo", pageInfo);
        map.put("objList", positionList);
        return map;
    }

    public Map<String, Object> selectAllPositionByEducation(String education, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbPositionsExample example = new TbPositionsExample();
        TbPositionsExample.Criteria criteria = example.createCriteria();
        criteria.andEducationEqualTo(education);
        List<TbPositions> positionList = positionsMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(positionList);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("pageInfo", pageInfo);
        map.put("objList", positionList);
        return map;
    }

    public List<TbPositionsDto> selectAllCompanys() {
        return positionsMapperEx.selectAllCompany();
    }
}
