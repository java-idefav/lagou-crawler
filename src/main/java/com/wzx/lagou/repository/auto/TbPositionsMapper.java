package com.wzx.lagou.repository.auto;

import com.wzx.lagou.model.auto.TbPositions;
import com.wzx.lagou.model.auto.TbPositionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPositionsMapper {
    long countByExample(TbPositionsExample example);

    int deleteByExample(TbPositionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPositions record);

    int insertSelective(TbPositions record);

    List<TbPositions> selectByExample(TbPositionsExample example);

    TbPositions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPositions record, @Param("example") TbPositionsExample example);

    int updateByExample(@Param("record") TbPositions record, @Param("example") TbPositionsExample example);

    int updateByPrimaryKeySelective(TbPositions record);

    int updateByPrimaryKey(TbPositions record);
}