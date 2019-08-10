package com.wzx.lagou.service;

import com.github.pagehelper.PageInfo;
import com.wzx.lagou.model.dto.TbPositionTypeDto;

import java.util.List;
import java.util.Map;

public interface PositionTypeService {
    List<TbPositionTypeDto> selectPositionTypes();
    PageInfo<TbPositionTypeDto> selectPositionTypes(Integer pageNum, Integer pageSize);
    Boolean insertPositionType(TbPositionTypeDto positionTypeDto);
    Boolean updatePositionType(TbPositionTypeDto positionTypeDto);
    TbPositionTypeDto selectPositionTypeByTypeId(String typeId);
    TbPositionTypeDto selectPositionTypeById(String id);
    Boolean isHavePositionType(String typeId);
    Integer countPositionTypeNum();
}
