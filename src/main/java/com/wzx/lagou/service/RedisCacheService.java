package com.wzx.lagou.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.pagehelper.PageInfo;
import com.wzx.lagou.model.dto.TbPositionsDto;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface RedisCacheService {
    Boolean redisAdd(String folder,String key,Object value) throws JsonProcessingException;
    Boolean redisAdd(String key,Object value) throws JsonProcessingException;
    Boolean redisUpate(String key,Object value) throws JsonProcessingException;
    PageInfo redisRead(String key) throws IOException;
}
