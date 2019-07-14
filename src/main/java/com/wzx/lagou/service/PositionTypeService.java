package com.wzx.lagou.service;

import com.wzx.lagou.model.dto.TbPositionTypeDto;

import java.util.List;

public interface PositionTypeService {
    List<TbPositionTypeDto> selectPositionTypes();
    Boolean insertPositionType(TbPositionTypeDto positionTypeDto);
    Boolean updatePositionType(TbPositionTypeDto positionTypeDto);
}
