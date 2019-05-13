package com.springmvc.commons.redis;

import org.apache.ibatis.cache.Cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import redis.clients.jedis.exceptions.JedisConnectionException;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @program: webssm
 * @description: 使用第三方内存数据库Redis作为二级缓存
 * @author: lou wei
 * @create: 2018-09-19 10:23
 **/
public class RedisCache implements Cache
{
    private static final Logger logger = LoggerFactory.getLogger(RedisCache.class);

    private static JedisConnectionFactory jedisConnectionFactory;

    private final String id;

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public RedisCache(final String id) {
        if (id == null) {
            throw new IllegalArgumentException("Cache instances require an ID");
        }
        logger.debug("MybatisRedisCache:id=" + id);
        this.id = id;
    }

    @Override
    public String getId()
    {
        return this.id;
    }

    /** 
    * @Description: 新增对象 
    * @Param: [key, value] 
    * @return: void 
    * @Author: lou wei
    * @Date: 2018/9/19
    */ 
    @Override
    public void putObject(Object key, Object value)
    {
        JedisConnection connection = null;

        try
        {
            connection = jedisConnectionFactory.getConnection();
            RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer();
            connection.set(serializer.serialize(key), serializer.serialize(value)); //新增redis键值对
            logger.debug("新增键值对：key====" + key + "value====" + value);
        }
        catch (JedisConnectionException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (connection != null) 
            {
                connection.close();
            }
        }
    }

    /** 
    * @Description: 根据key 获取对象
    * @Param: [key] 
    * @return: java.lang.Object 
    * @Author: lou wei
    * @Date: 2018/9/19 
    */ 
    @Override
    public Object getObject(Object key)
    {
        Object result = null;
        JedisConnection connection = null;

        try
        {
            connection = jedisConnectionFactory.getConnection(); //获取连接
            RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer(); //序列化
            result = serializer.deserialize(connection.get(serializer.serialize(key))); //根据key，获取内容
            logger.debug("获取key键对应的值：====== " + result);
        }
        catch (JedisConnectionException  e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (connection != null) 
            {
                connection.close();
            }
        }
        return result;
    }

    /**
    * @Description: 根据key 删除对象
    * @Param: [key]
    * @return: java.lang.Object
    * @Author: lou wei
    * @Date: 2018/9/19
    */
    @Override
    public Object removeObject(Object key)
    {
        JedisConnection connection = null;
        Object result = null;

        try
        {
            connection = jedisConnectionFactory.getConnection(); //获取连接
            RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer();
            result = connection.expire(serializer.serialize(key), 0); //设置过期时间
        }
        catch (JedisConnectionException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (connection != null)
            {
                connection.close();
            }
        }
        return result;
    }
    
    /** 
    * @Description: 清除redis 缓存 
    * @Param: [] 
    * @return: void
    * @Author: lou wei
    * @Date: 2018/9/19 
    */ 
    @Override
    public void clear()
    {
        JedisConnection connection = null;
        try
        {
            connection = jedisConnectionFactory.getConnection();  //获取jedis连接
            connection.flushDb(); //flushDb 命令用于清空当前数据库中的所有 key。
            connection.flushAll(); //flushDb 命令用于清空整个 Redis 服务器的数据(删除所有数据库的所有 key )。
            logger.debug("*****清除redis数据库*****");
        }
        catch (JedisConnectionException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (connection != null) {
                connection.close();  //关闭连接
            }
        }


    }

    /**
    * @Description: 返回当前数据库的 key 的数量
    * @Param: []
    * @return: int
    * @Author: lou wei
    * @Date: 2018/9/19
    */
    @Override
    public int getSize()
    {
        int result = 0;
        JedisConnection connection = null;

        try
        {
            connection = jedisConnectionFactory.getConnection();
            result = Integer.valueOf(connection.dbSize().toString()); //返回当前数据库的 key 的数量。
        }
        catch (JedisConnectionException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (connection != null)
            {
                connection.close();
            }
        }
        return result;
    }

    @Override
    public ReadWriteLock getReadWriteLock()
    {
        return this.readWriteLock;
    }

    public static void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
        RedisCache.jedisConnectionFactory = jedisConnectionFactory;
    }
}
