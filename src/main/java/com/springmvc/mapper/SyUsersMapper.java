package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.SyUsers;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SyUsersMapper
{
    int deleteByPrimaryKey(String id);

    int insert(SyUsers record);

    int insertSelective(SyUsers record);

    SyUsers selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SyUsers record);

    int updateByPrimaryKey(SyUsers record);

    //查询所有用户
    /*List<SyUsers> selectAllUsers();*/
    List<SyUsers> selectAllUsers(@Param("PageParam") PageParam pageParam, @Param("user") SyUsers users);

    List<SyUsers> queryAllUsers(Map map);

    //根据条件查询
    SyUsers selectByParameter(SyUsers record);

    /**
     * 查询用户所有角色
     **/
    List<String> selectByUserAllRole(String userId);

    //查询用户可访问的url
    List<String> selectByUserAllMenu(String roleId);

    //获取操作url
    List<String> selectByUserAllAction(String roleId);
}