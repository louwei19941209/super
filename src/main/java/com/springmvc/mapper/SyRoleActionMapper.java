package com.springmvc.mapper;

import com.springmvc.po.SyRoleAction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SyRoleActionMapper {
    int deleteByPrimaryKey(String id);

    int insert(SyRoleAction record);

    int insertSelective(SyRoleAction record);

    SyRoleAction selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SyRoleAction record);

    int updateByPrimaryKey(SyRoleAction record);

    /**根据条件查询**/
    List<String> selectByParameter(@Param("roleId")String roleId);

    /**根据角色id和菜单id删除**/
    boolean deleteByParameter(SyRoleAction record);
}