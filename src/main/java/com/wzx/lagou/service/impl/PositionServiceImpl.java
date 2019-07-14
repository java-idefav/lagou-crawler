package com.wzx.lagou.service.impl;

import com.wzx.lagou.model.dto.TbPositionDto;
import com.wzx.lagou.repository.auto.TbPositionMapper;
import com.wzx.lagou.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements PositionService{

    @Autowired
    private TbPositionMapper tbPositionMapper;

    public TbPositionDto selectPositions() {
        return null;
    }
}
