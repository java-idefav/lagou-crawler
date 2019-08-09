package com.wzx.lagou.service;

import com.github.pagehelper.PageInfo;
import com.wzx.lagou.common.Response;
import com.wzx.lagou.model.dto.TbPositionsDto;

import java.util.List;
import java.util.Map;

public interface PositionsService {
    PageInfo<TbPositionsDto> selectAllPositionPaging(Integer pageNum, Integer pageSize);
    Boolean insertPositions(TbPositionsDto positionsDto);
    Boolean updatePosition(TbPositionsDto positionsDto);
    Boolean isHavePosition(String positionsId);
    Integer countPositionNum();
    PageInfo<TbPositionsDto> selectAllPositionByCity(String cityName, Integer pageNum, Integer pageSize);
    PageInfo<TbPositionsDto> selectAllPositionByType(String positionTypeId, Integer pageNum, Integer pageSize);
    PageInfo<TbPositionsDto> selectAllPositionByCompany(String companyId, Integer pageNum, Integer pageSize);
    PageInfo<TbPositionsDto> selectAllPositionByEducation(String education, Integer pageNum, Integer pageSize);
    List<TbPositionsDto> selectAllCompanys();
}
