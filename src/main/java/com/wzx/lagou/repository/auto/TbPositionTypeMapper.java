package com.wzx.lagou.repository.auto;

import com.wzx.lagou.model.auto.TbPositionType;
import com.wzx.lagou.model.auto.TbPositionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPositionTypeMapper {
    long countByExample(TbPositionTypeExample example);

    int deleteByExample(TbPositionTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPositionType record);

    int insertSelective(TbPositionType record);

    List<TbPositionType> selectByExample(TbPositionTypeExample example);

    TbPositionType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPositionType record, @Param("example") TbPositionTypeExample example);

    int updateByExample(@Param("record") TbPositionType record, @Param("example") TbPositionTypeExample example);

    int updateByPrimaryKeySelective(TbPositionType record);

    int updateByPrimaryKey(TbPositionType record);
}