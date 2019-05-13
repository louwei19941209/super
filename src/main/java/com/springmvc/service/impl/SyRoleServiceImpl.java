package com.springmvc.service.impl;

import com.springmvc.commons.cache.MyCache;
import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.*;
import com.springmvc.po.*;
import com.springmvc.service.SyRoleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: webssm
 * @description: 角色管理 业务层
 * @author: lou wei
 * @create: 2018-09-20 17:31
 **/
@Service
public class SyRoleServiceImpl implements SyRoleService
{
    @Autowired
    private SyRoleMapper syRoleMapper;

    @Autowired
    private SyMenuMapper syMenuMapper;

    @Autowired
    private SyActionMapper syActionMapper;

    @Autowired
    private SyRoleMenuMapper syRoleMenuMapper;

    @Autowired
    private SyRoleActionMapper syRoleActionMapper;

    @Autowired
    private SyUserRoleMapper syUserRoleMapper;

    @Autowired
    private SyUsersMapper syUsersMapper;


    /**
     * @Description: 查询所有角色 分页
     * @Param: [param, role]
     * @return: com.springmvc.commons.model.DataGrid
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @Override
    public DataGrid selectAllRoleByPage(PageParam param, SyRole role)
    {
        DataGrid data = new DataGrid();
        data.setRows(syRoleMapper.selectAllRole(param, role));
        data.setTotal(param.getTotle());
        return data;
    }

    /**
     * @Description: 添加角色
     * @Param: [role]
     * @return: boolean
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @Override
    public String addRole(SyRole role)
    {
        SyRole r = syRoleMapper.selectByParameter(role);
        if (r == null)
        {
            if (syRoleMapper.insert(role) > 0)
            {
                return MsgConfig.MSG_KEY_SUCCESS;
            }
            else
            {
                return MsgConfig.MSG_KEY_FAIL;
            }
        }
        else
        {
            return "msg.role.unique";//此角色名称已存在
        }

    }

    /**
     * @Description: 查看详情
     * @Param: [id]
     * @return: com.springmvc.po.SyRole
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @Override
    public SyRole selectRole(String id)
    {
        return syRoleMapper.selectByPrimaryKey(id);
    }

    /**
     * @Description: 修改角色
     * @Param: [role]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @Override
    public String updateRole(SyRole role)
    {
        SyRole r = syRoleMapper.selectByParameter(role);
        if (r == null)
        {
            if (syRoleMapper.updateByPrimaryKey(role) > 0)
            {
                return MsgConfig.MSG_KEY_SUCCESS;
            }
            else
            {
                return MsgConfig.MSG_KEY_FAIL;
            }
        }
        else
        {
            return "msg.role.unique";//此角色名称已存在
        }

    }

    /**
     * @Description: 删除角色
     * @Param: [ids]
     * @return: boolean
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @Override
    public boolean deleteRole(String[] ids)
    {
        try
        {
            for (String id : ids)
            {
                SyRole role = syRoleMapper.selectByPrimaryKey(id);
                if (role != null)
                {
                    syRoleMapper.deleteByPrimaryKey(id);
                }
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @Description: 查询出所有的权限，和已有的权限
     * @Param: [id]
     * @return: java.util.Map
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @Override
    public Map selectPowers(String id)
    {
        //所有菜单
        List<SyMenu> menuList = syMenuMapper.selectAllMenus();

        PageParam param = new PageParam();
        param.setDefaultUseFlag(false);
        SyAction action = new SyAction();
        List<SyAction> actionList = syActionMapper.selectAction(param, action);  //所有action
        List<String> myMenus = syRoleMenuMapper.selectByParameter(id);  //根据角色id查询菜单
        List<String> myAction = syRoleActionMapper.selectByParameter(id); //根据角色id查询action

        Map<String, Object> map = new HashMap<>();
        map.put("menus", menuList);
        map.put("actions", actionList);
        map.put("hasMenus", myMenus);
        map.put("hasActions", myAction);
        return map;
    }

    /**
     * @Description: 修改角色权限
     * @Param: [roleId, addMenuIds, delMenuIds, addActionIds, delActionIds]
     * @return: boolean
     * @Author: lou wei
     * @Date: 2018/10/6
     */
    @Override
    public boolean updatePowers(String roleId, String addMenuIds, String delMenuIds, String addActionIds, String delActionIds)
    {
        //添加菜单关联
        if (StringUtils.isNotBlank(addMenuIds))
        {

            String[] list_addMenuIds = list_addMenuIds = addMenuIds.split(",");

            try
            {
                for (String id : list_addMenuIds)
                {
                    SyRoleMenu roleMenu = new SyRoleMenu();
                    roleMenu.setRoleId(roleId);
                    roleMenu.setMenuId(id);

                    syRoleMenuMapper.insert(roleMenu);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
                return false;
            }


        }

        //删除菜单关联
        if (StringUtils.isNotBlank(delMenuIds))
        {
            String[] list_delMenuIds = delMenuIds.split(",");

            try
            {
                for (String id : list_delMenuIds)
                {
                    SyRoleMenu roleMenu = new SyRoleMenu();
                    roleMenu.setRoleId(roleId);
                    roleMenu.setMenuId(id);

                    syRoleMenuMapper.deleteByParameter(roleMenu);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
                return false;
            }
        }

        //添加操作关联
        if (StringUtils.isNotBlank(addActionIds))
        {
            String[] list_addActionIds = addActionIds.split(",");

            try
            {
                for (String id : list_addActionIds)
                {
                    SyRoleAction roleAction = new SyRoleAction();
                    roleAction.setRoleId(roleId);
                    roleAction.setActionId(id);

                    syRoleActionMapper.insert(roleAction);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
                return false;
            }
        }

        //删除操作关联
        if (StringUtils.isNotBlank(delActionIds))
        {
            String[] list_delActionIds = delActionIds.split(",");

            try
            {
                for (String id : list_delActionIds)
                {
                    SyRoleAction roleAction = new SyRoleAction();
                    roleAction.setRoleId(roleId);
                    roleAction.setActionId(id);

                    syRoleActionMapper.deleteByParameter(roleAction);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    /**
     * @Description: 分配管理，条件查询 已具有此角色的用户，
     * @Param: [param, roleId, users]
     * @return: com.springmvc.commons.model.DataGrid
     * @Author: lou wei
     * @Date: 2018/10/7
     */
    @Override
    public DataGrid selectRoleUsers(PageParam param, String roleId, SyUsers users)
    {
        DataGrid data = new DataGrid();
        List<SyUsers> allUser = syRoleMapper.selectRoleUsers(param, roleId, users);
        for (SyUsers u : allUser)
        {
            u.setDeptName(MyCache.getInstance().getDeptName(u.getDeptId()));
        }
        data.setRows(allUser);
        data.setTotal(param.getTotle());
        return data;
    }

    /**
     * @Description: 批量删除角色分配的用户
     * @Param: [ids]
     * @return: boolean
     * @Author: lou wei
     * @Date: 2018/10/7
     */
    @Override
    public boolean deleteRoleUsers(String[] ids)
    {

        try
        {
            for (String id : ids)
            {
                syUserRoleMapper.deleteByPrimaryKey(id);
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @Description: 根据条件查询用户，
     * @Param: [param, roleId, users]
     * @return: com.springmvc.commons.model.DataGrid
     * @Author: lou wei
     * @Date: 2018/10/7
     */
    @Override
    public DataGrid selectUsers(PageParam param, String roleId, SyUsers users)
    {
        DataGrid data = new DataGrid();
        List<String> ids = syRoleMapper.queryRoleUsers(roleId);
        Map<String, Object> params = new HashMap<>();
        params.put("param", param);
        params.put("user", users);
        params.put("ids", ids);
        List<SyUsers> allUser = syUsersMapper.queryAllUsers(params);
        for (SyUsers u : allUser)
        {
            u.setDeptName(MyCache.getInstance().getDeptName(u.getDeptId()));
        }
        data.setRows(allUser);
        data.setTotal(param.getTotle());
        return data;
    }

    /**
    * @Description: 给用户添加角色
    * @Param: [roleId, ids]
    * @return: boolean
    * @Author: lou wei
    * @Date: 2018/10/8
    */
    @Override
    public boolean addUserRoles(String roleId, String[] ids)
    {

        try
        {
            for (String id : ids)
            {
                if (StringUtils.isNotBlank(id))
                {
                    SyUserRole userRole = new SyUserRole();
                    userRole.setRoleId(roleId);
                    userRole.setUserId(id);
                    syUserRoleMapper.insert(userRole);
                }
            }
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }

    }
}
