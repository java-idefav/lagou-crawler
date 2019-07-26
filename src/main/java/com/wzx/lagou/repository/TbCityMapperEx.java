package com.wzx.lagou.repository;

import com.wzx.lagou.model.auto.TbCity;
import com.wzx.lagou.model.auto.TbCityExample;
import com.wzx.lagou.model.dto.TbCityDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbCityMapperEx {

    @Select("SELECT * FROM tb_city where city_name=#{cityName}")
    List<TbCityDto> queryCityList(@Param("cityName") String cityName);


    List<TbCityDto> queryCityList2(@Param("id") Long id,String cityName);
}