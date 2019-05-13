package com.springmvc.commons.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

/**
 * @program: webssm
 * @description: 使用中间类解决RedisCache.jedisConnectionFactory的静态注入，从而使MyBatis实现第三方缓存
 * @author: lou wei
 * @create: 2018-09-19 10:20
 **/
public class RedisCacheTransfer
{
    @Autowired
    public void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory)
    {
        RedisCache.setJedisConnectionFactory(jedisConnectionFactory);
    }
}
