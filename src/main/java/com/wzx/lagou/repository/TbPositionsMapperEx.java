package com.wzx.lagou.repository;

import com.wzx.lagou.model.auto.TbPositions;
import com.wzx.lagou.model.auto.TbPositionsExample;
import com.wzx.lagou.model.dto.TbCompanyDto;
import com.wzx.lagou.model.dto.TbPositionTypeDto;
import com.wzx.lagou.model.dto.TbPositionsDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPositionsMapperEx {

    TbPositionsDto queryOne(@Param("id") Long id);

    List<TbPositionsDto> selectAllCompany();
}