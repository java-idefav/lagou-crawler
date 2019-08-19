package com.wzx.lagou.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzx.lagou.common.Response;
import com.wzx.lagou.common.ResponseFactory;
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

import java.io.Console;
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
    public PageInfo<TbPositionsDto> selectAllPositionPaging(Integer pageNum, Integer pageSize) {
//        RedisCacheService redisCacheService = new RedisCacheServiceImpl();
        try {
            PageInfo pageInfo = redisCacheService.redisRead("positions:"+pageNum+"_"+pageSize);
            if (pageInfo!=null) {
                System.out.println("Redis缓存...........");
                return pageInfo;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
        PageHelper.startPage(pageNum, pageSize);
        TbPositionsExample example = new TbPositionsExample();
        PageInfo<TbPositionsDto> pageInfo = doSelect(example);
        try {
            redisCacheService.redisAdd("positions", pageNum+"_"+pageSize, pageInfo);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
            return null;
        }
        System.out.println("数据库查询...........");
        return pageInfo;
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
        try {
            TbPositionsExample example = new TbPositionsExample();
            return (int)positionsMapper.countByExample(example);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return -1;
        }
    }

    //@Cacheable(value = "all",keyGenerator = "keyGenerator")
    public PageInfo<TbPositionsDto> selectAllPositionByCity(String cityName, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbPositionsExample example = new TbPositionsExample();
        TbPositionsExample.Criteria criteria = example.createCriteria();
        criteria.andCityEqualTo(cityName);
        return doSelect(example);
    }

    public PageInfo<TbPositionsDto> selectAllPositionByType(String positionTypeId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbPositionsExample example = new TbPositionsExample();
        TbPositionsExample.Criteria criteria = example.createCriteria();
        criteria.andTypeIdEqualTo(positionTypeId);
        return doSelect(example);
    }

    public PageInfo<TbPositionsDto> selectAllPositionByCompany(String companyId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbPositionsExample example = new TbPositionsExample();
        TbPositionsExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyIdEqualTo(companyId);
        return doSelect(example);
    }

    public PageInfo<TbPositionsDto> selectAllPositionByEducation(String education, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbPositionsExample example = new TbPositionsExample();
        TbPositionsExample.Criteria criteria = example.createCriteria();
        criteria.andEducationEqualTo(education);
        return doSelect(example);
    }

    private PageInfo<TbPositionsDto> doSelect(TbPositionsExample example) {
        try {
            List<TbPositions> positionList = positionsMapper.selectByExample(example);
            PageInfo pageInfo = new PageInfo(positionList);
            pageInfo.setList(mapperFacade.mapAsList(positionList, TbPositionsDto.class));
//        Map<String,Object> map = new HashMap<String, Object>();
//        map.put("pageInfo", pageInfo);
//        map.put("objList", positionList);
            return pageInfo;
        }catch (Exception e){
            return null;
        }
    }
    public List<TbPositionsDto> selectAllCompanys() {
        return positionsMapperEx.selectAllCompany();
    }
}
