package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.SyUsers;

import java.util.Collection;
import java.util.Map;

public interface SyUsersService
{
    /**查询用户id ,查询拥有的角色id，和可以访问的urls**/
    Map<String,Collection<String>> selectByUserAllPower(String userId);

    /**查询所有用户**/
    DataGrid selectAllUser(PageParam param, SyUsers users);

    /**根据id查询详情**/
    SyUsers selectByPrimaryKey(String id);

    /**添加用户**/
    String addUser(SyUsers users);

    /**修改用户**/
    String updateUser(SyUsers users);

    /**删除用户**/
    boolean deleteUser(String[] ids);

    /**查询出所有角色，和用户已有角色，用于用户角色更新**/
    Map selectUserRolesAndIds(String userId);

    /**查询用户所有权限**/
    Map selectUserPowers(String userId);

    /**修改用户角色**/
    Boolean updateUserRoles(String userId, String[] addRoleIds, String[] delRoleIds);

    /**修改用户密码**/
    Boolean updatePassword(String id, String userPassword, String pwd);
}
