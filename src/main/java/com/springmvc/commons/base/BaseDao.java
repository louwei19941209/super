package com.springmvc.commons.base;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: webssm
 * @description: 数据库操作封装 接口  原始dao开发
 * @author: lou wei
 * @create: 2018-09-13 17:26
 **/
@Repository
public class BaseDao extends SqlSessionDaoSupport
{
    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
    {
        super.setSqlSessionFactory(sqlSessionFactory);
    }


    public int insert(String sqlId, Object parameter)
    {
        return getSqlSession().insert(sqlId, parameter);
    }

    public List selectList(String sqlId, Object parameter)
    {
        List list = this.getSqlSession().selectList(sqlId,parameter);

        return list;
    }
}
