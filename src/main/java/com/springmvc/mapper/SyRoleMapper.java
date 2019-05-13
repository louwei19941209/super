package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.SyRole;
import com.springmvc.po.SyUsers;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SyRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(SyRole record);

    int insertSelective(SyRole record);

    SyRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SyRole record);

    int updateByPrimaryKey(SyRole record);

    /**根据条件查询**/
    SyRole selectByParameter(SyRole record);

    /**查询所有角色分页**/
    List<SyRole> selectAllRole(@Param("PageParam")PageParam param, @Param("role") SyRole role);

    /**查询用户该角色的所有用户**/
    List<SyUsers> selectRoleUsers(@Param("PageParam")PageParam param, @Param("roleId")String roleId, @Param("user")SyUsers users);

    /**查询用户该角色的所有用户**/
    List<String> queryRoleUsers(String roleId);


}