package com.springmvc.mapper;

import com.springmvc.po.SyUserRole;

import java.util.List;

public interface SyUserRoleMapper
{
    int deleteByPrimaryKey(String id);

    int insert(SyUserRole record);

    int insertSelective(SyUserRole record);

    SyUserRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SyUserRole record);

    int updateByPrimaryKey(SyUserRole record);

    //查询用户所有角色
    List<String> selectByUserAllRole(String userId);

    /**删除用户角色关联**/
    boolean deleteByParameter(SyUserRole record);
}