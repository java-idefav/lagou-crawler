package com.wzx.lagou.service.impl;

import com.wzx.lagou.model.auto.TbPositionsExample;
import com.wzx.lagou.model.auto.TbPositions;
import com.wzx.lagou.model.dto.TbPositionsDto;
import com.wzx.lagou.repository.auto.TbPositionsMapper;
import com.wzx.lagou.service.PositionsService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionsServiceImpl implements PositionsService{

    @Autowired
    private TbPositionsMapper positionsMapper;

    @Autowired
    private MapperFacade mapperFacade;

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
}
