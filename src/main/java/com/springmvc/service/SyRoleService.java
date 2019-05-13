package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.SyRole;
import com.springmvc.po.SyUsers;

import java.util.Map;

public interface SyRoleService
{
    /**查询所有角色 分页 **/
    DataGrid selectAllRoleByPage(PageParam param, SyRole role);

    /**添加角色**/
    String addRole(SyRole role);

    /**查看角色详情**/
    SyRole selectRole(String id);

    /**修改角色**/
    String updateRole(SyRole role);

    /**删除角色**/
    boolean deleteRole(String[] ids);

    /**查询出所有的权限，和已有的权限**/
    Map selectPowers(String id);

    /**修改角色权限**/
    boolean updatePowers(String roleId, String addMenuIds, String delMenuIds,
                         String addActionIds, String delActionIds);

    /**查看已拥有该角色的所用用户**/
    DataGrid selectRoleUsers(PageParam param, String roleId, SyUsers users);

    /**批量删除角色分配的用户**/
    boolean deleteRoleUsers(String[] ids);

    /**查询用户**/
    DataGrid selectUsers(PageParam param, String roleId, SyUsers users);

    /**给用户添加角色**/
    boolean addUserRoles(String roleId, String[] ids);
}
