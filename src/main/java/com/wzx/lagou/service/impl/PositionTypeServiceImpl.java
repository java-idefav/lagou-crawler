package com.wzx.lagou.service.impl;

import com.wzx.lagou.model.auto.TbPositionType;
import com.wzx.lagou.model.auto.TbPositionTypeExample;
import com.wzx.lagou.model.dto.TbPositionTypeDto;
import com.wzx.lagou.repository.auto.TbPositionTypeMapper;
import com.wzx.lagou.service.PositionTypeService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
