package com.wzx.lagou.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * redis操作工具类.</br>
 * (基于RedisTemplate)
 *
 * @author xcbeyond  2018年7月19日下午2:56:24
 */
@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 读取缓存
     *
     * @param key the key
     * @return string
     */
    public String get(final String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 写入缓存
     *
     * @param key   the key
     * @param value the value
     * @return the boolean
     */
    public boolean set(final String key, String value) {
        boolean result = false;
        try {
            redisTemplate.opsForValue().set(key, value,1L, TimeUnit.MINUTES);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 更新缓存
     *
     * @param key   the key
     * @param value the value
     * @return the and set
     */
    public boolean getAndSet(final String key, String value) {
        boolean result = false;
        try {
            redisTemplate.opsForValue().getAndSet(key,value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 删除缓存
     *
     * @param key the key
     * @return the boolean
     */
    public boolean delete(final String key) {
        boolean result = false;
        try {
            redisTemplate.delete(key);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

