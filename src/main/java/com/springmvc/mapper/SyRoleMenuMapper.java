package com.springmvc.mapper;

import com.springmvc.po.SyRoleMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SyRoleMenuMapper
{
    int deleteByPrimaryKey(String id);

    int insert(SyRoleMenu record);

    int insertSelective(SyRoleMenu record);

    SyRoleMenu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SyRoleMenu record);

    int updateByPrimaryKey(SyRoleMenu record);

    /**根据条件查询**/
    List<String> selectByParameter(@Param("roleId")String roleId);

    /**根据角色id和菜单id删除**/
    boolean deleteByParameter(SyRoleMenu record);

}