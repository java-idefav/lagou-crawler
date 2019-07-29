package com.wzx.lagou.service.impl;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wzx.lagou.common.RedisUtils;
import com.wzx.lagou.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;

@Service
public class RedisCacheServiceImpl implements RedisCacheService {

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private ObjectMapper mapper;

    @Override
    public Boolean redisAdd(String folder, String key, Object value) throws JsonProcessingException {
        String str = JSON.toJSONString(value);
//        mapper.writeValueAsString(value);
        boolean set = redisUtils.set(folder+":"+key, str);
//        redisUtils.set("redis_key", new Date().toString());
        return set;
    }

    @Override
    public Boolean redisAdd(String key, Object value) throws JsonProcessingException {
        return redisUtils.set(key, mapper.writeValueAsString(value));
    }

    @Override
    public Boolean redisUpate(String key, Object value) throws JsonProcessingException {
        return redisUtils.getAndSet(key, mapper.writeValueAsString(value));
    }

    @Override
    public Object redisRead(String key) throws IOException {
        String s = redisUtils.get(key);
        if (s!=null) {
            return mapper.readValue(s, Object.class);
        }else {
            return  null;
        }
    }

}
