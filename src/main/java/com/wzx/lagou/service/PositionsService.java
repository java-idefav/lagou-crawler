package com.wzx.lagou.service;

import com.wzx.lagou.model.dto.TbPositionsDto;

import java.util.List;
import java.util.Map;

public interface PositionsService {
    Map<String,Object> selectAllPositionPaging(Integer pageNum, Integer pageSize);
    Boolean insertPositions(TbPositionsDto positionsDto);
    Boolean updatePosition(TbPositionsDto positionsDto);
    Boolean isHavePosition(String positionsId);
    Integer countPositionNum();
    Map<String,Object> selectAllPositionByCity(String cityName, Integer pageNum, Integer pageSize);
    Map<String,Object> selectAllPositionByType(String positionTypeId, Integer pageNum, Integer pageSize);
    Map<String,Object> selectAllPositionByCompany(String companyId, Integer pageNum, Integer pageSize);
    Map<String,Object> selectAllPositionByEducation(String education, Integer pageNum, Integer pageSize);
    List<TbPositionsDto> selectAllCompanys();
}
