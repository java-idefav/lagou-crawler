package com.wzx.lagou.repository.auto;

import com.wzx.lagou.model.auto.TbPosition;
import com.wzx.lagou.model.auto.TbPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPositionMapper {
    long countByExample(TbPositionExample example);

    int deleteByExample(TbPositionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPosition record);

    int insertSelective(TbPosition record);

    List<TbPosition> selectByExample(TbPositionExample example);

    TbPosition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPosition record, @Param("example") TbPositionExample example);

    int updateByExample(@Param("record") TbPosition record, @Param("example") TbPositionExample example);

    int updateByPrimaryKeySelective(TbPosition record);

    int updateByPrimaryKey(TbPosition record);
}