package com.baitu.cloud.utils;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author cj@baitutech.com
 * @since 2021.07.22 12:37
 * 缓存服务工具类
 */
@Component
@RequiredArgsConstructor
public class RedisOperation {

    private final StringRedisTemplate redisTemplate;

    public void set(String key, String val) {
        if (StringUtils.isNotBlank(key)) {
            redisTemplate.opsForValue().set(key, val);
        }
    }

    public void set(String key, String val, Integer minutes) {
        if (StringUtils.isNotBlank(key)) {
            redisTemplate.opsForValue().set(key, val, minutes, TimeUnit.MINUTES);
        }
    }

    public boolean hasKey(String key) {
        if (StringUtils.isBlank(key)) {
            return false;
        }
        return Boolean.TRUE.equals(redisTemplate.hasKey(key));
    }

    public void deleteKey(String key) {
        if (StringUtils.isNotBlank(key)) {
            redisTemplate.delete(key);
        }
    }

    public void deleteKeys(List<String> keys) {
        if (!keys.isEmpty() && !keys.contains(null)) {
            redisTemplate.delete(keys);
        }
    }

    public String get(String key) {
        if (StringUtils.isNotBlank(key)) {
            return redisTemplate.opsForValue().get(key);
        }
        return null;
    }

}
