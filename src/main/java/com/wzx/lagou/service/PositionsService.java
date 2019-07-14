package com.wzx.lagou.service;

import com.wzx.lagou.model.dto.TbPositionsDto;

public interface PositionsService {

    Boolean insertPositions(TbPositionsDto positionsDto);
    Boolean updatePosition(TbPositionsDto positionsDto);
    Boolean isHavePosition(String positionsId);
}
