package com.wzx.lagou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzx.lagou.model.auto.TbPositionType;
import com.wzx.lagou.model.auto.TbPositionTypeExample;
import com.wzx.lagou.model.dto.TbPositionTypeDto;
import com.wzx.lagou.repository.auto.TbPositionTypeMapper;
import com.wzx.lagou.service.PositionTypeService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PositionTypeServiceImpl implements PositionTypeService {
    @Autowired
    private TbPositionTypeMapper positionTypeMapper;

    @Autowired
    private MapperFacade mapperFacade;

    public List<TbPositionTypeDto> selectPositionTypes(){
        TbPositionTypeExample example = new TbPositionTypeExample();
        List<TbPositionType> positionTypes = positionTypeMapper.selectByExample(example);
        return mapperFacade.mapAsList(positionTypes,TbPositionTypeDto.class );
    }

    public Map<String, Object> selectPositionTypes(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbPositionTypeExample example = new TbPositionTypeExample();
        List<TbPositionTypeDto> positionTypes = mapperFacade.mapAsList(positionTypeMapper.selectByExample(example), TbPositionTypeDto.class);
        PageInfo pageInfo = new PageInfo(positionTypes);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("pageInfo", pageInfo);
        map.put("objList", positionTypes);
        return map;
    }

    public Boolean insertPositionType(TbPositionTypeDto positionTypeDto) {
        return positionTypeMapper.insertSelective(mapperFacade.map(positionTypeDto, TbPositionType.class)) > 0;
    }

    public Boolean updatePositionType(TbPositionTypeDto positionTypeDto) {
        TbPositionType positionType = mapperFacade.map(positionTypeDto, TbPositionType.class);
        TbPositionTypeExample example = new TbPositionTypeExample();
        TbPositionTypeExample.Criteria criteria = example.createCriteria();
        criteria.andTypeIdEqualTo(positionTypeDto.getTypeId());
        return  positionTypeMapper.updateByExampleSelective(positionType, example) > 0;
    }

    public TbPositionTypeDto selectPositionTypeByTypeId(String typeId) {
        TbPositionTypeExample example = new TbPositionTypeExample();
        TbPositionTypeExample.Criteria criteria = example.createCriteria();
        criteria.andTypeIdEqualTo(typeId);
        TbPositionType positionType = positionTypeMapper.selectByExample(example).get(0);
        return mapperFacade.map(positionType, TbPositionTypeDto.class);
    }

    public TbPositionTypeDto selectPositionTypeById(String id) {
        TbPositionTypeExample example = new TbPositionTypeExample();
        TbPositionTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(Integer.parseInt(id));
        TbPositionType positionType = positionTypeMapper.selectByExample(example).get(0);
        return mapperFacade.map(positionType, TbPositionTypeDto.class);
    }

    public Boolean isHavePositionType(String typeId) {
        TbPositionTypeExample example = new TbPositionTypeExample();
        TbPositionTypeExample.Criteria criteria = example.createCriteria();
        criteria.andTypeIdEqualTo(typeId);
        return positionTypeMapper.countByExample(example) > 0;
    }

    public Integer countPositionTypeNum() {
        TbPositionTypeExample example = new TbPositionTypeExample();
        return (int)positionTypeMapper.countByExample(example);
    }
}
