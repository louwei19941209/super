package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.SyRole;
import com.springmvc.po.SyUsers;
import com.springmvc.service.SyRoleService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: webssm
 * @description: 角色，控制层
 * @author: lou wei
 * @create: 2018-09-29 15:10
 **/
@Controller
@RequestMapping("role")
public class SyRoleController extends BaseAction {
    @Autowired
    private SyRoleService syRoleService;

    @RequestMapping("load")
    @RequiresPermissions("role:read")
    public String load() {
        return "system/organize/role/load";
    }

    /**
     * @Description: 查询所有角色 分页
     * @Param: [param, role]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @RequestMapping("query/all")
    @RequiresPermissions("role:read")
    public ModelAndView queryAllRole(PageParam param, SyRole role) {
        return ajaxJson(syRoleService.selectAllRoleByPage(param, role));
    }

    /**
     * @Description: 跳转添加页面
     * @Param: []
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @RequestMapping("addPage")
    @RequiresPermissions("role:add")
    public String addPage() {
        return "system/organize/role/add";
    }

    @RequestMapping("add")
    @RequiresPermissions("role:add")
    public ModelAndView addRole(SyRole role) {
        return ajaxDone(syRoleService.addRole(role));
    }

    /**
     * @Description: 跳转修改页面
     * @Param: []
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @RequestMapping("updatePage")
    @RequiresPermissions("role:update")
    public String updatePage(String id, ModelMap map) {
        SyRole role = syRoleService.selectRole(id);
        if (role == null) {
            return NODATA;
        }
        map.addAttribute("r", role);
        return "system/organize/role/update";
    }

    /**
     * @Description: 修改角色
     * @Param: [role]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @RequestMapping("update")
    @RequiresPermissions("role:update")
    public ModelAndView updateRole(SyRole role) {
        return ajaxDone(syRoleService.updateRole(role));
    }

    /**
     * @Description: 删除角色
     * @Param: [ids]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @RequestMapping("delete")
    @RequiresPermissions("role:delete")
    public ModelAndView deleteRole(String[] ids) {
        return ajaxDone(syRoleService.deleteRole(ids));
    }

    /**
     * @Description: 跳转到 角色--修改权限页面 ，并 查询出所有的权限，和已有的权限
     * @Param: []
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @RequestMapping("power/updatePage")
    public String updatePowerPage() {
        return "system/organize/role/power/update";
    }

    /**
     * @Description: 跳转到 角色--修改权限页面 ，并 查询出所有的权限，和已有的权限
     * @Param: [id]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @RequestMapping("power/updatePage/query")
    public ModelAndView queryPower(String id) {
        return ajaxJson(syRoleService.selectPowers(id));
    }

    /**
     * @Description: 修改角色的权限
     * @Param: [roleId, addMenuIds, delMenuIds, addActionIds, delActionIds]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/10/6
     */
    @RequestMapping("power/update")
    @RequiresPermissions("role:updatePower")
    public ModelAndView updatePowers(String roleId, String addMenuIds, String delMenuIds,
                                     String addActionIds, String delActionIds) {
        return ajaxDone(syRoleService.updatePowers(roleId, addMenuIds, delMenuIds, addActionIds, delActionIds));
    }

    /**
     * @Description: 查询角色已有的用户
     * @Param: [roleId, map]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/10/7
     */
    @RequestMapping("roleUsers/load")
    @RequiresPermissions("role:hasUser")
    public String roleUsersLoad(String roleId, ModelMap map) {
        SyRole role = syRoleService.selectRole(roleId);
        if (role == null) {
            map.addAttribute("name", "角色不存在");
        } else {
            map.addAttribute("name", role.getRoleName());
        }
        return "system/organize/role/select_role_users";
    }

    /**
     * @Description: 分配管理，条件查询 已具有此角色的用户，
     * @Param: [param, roleId, users]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/10/7
     */
    @RequestMapping("roleUsers/query")
    @RequiresPermissions("role:hasUser")
    public ModelAndView queryRoleUsers(PageParam param, String roleId, SyUsers users) {
        return ajaxJson(syRoleService.selectRoleUsers(param, roleId, users));
    }

    /**
     * @Description: 批量删除角色分配的用户
     * @Param: [userIds]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/10/7
     */
    @RequestMapping("delRoleUsers")
    @RequiresPermissions("role:deleteUser")
    public ModelAndView deleteRoleUsers(String[] ids) {
        return ajaxDone(syRoleService.deleteRoleUsers(ids));
    }

    /**
     * @Description: 查询角色已有的用户
     * @Param: [roleId, map]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/10/7
     */
    @RequestMapping("users/load")
    @RequiresPermissions("role:readUser")
    public String userLoad(String roleId, ModelMap map) {
        SyRole role = syRoleService.selectRole(roleId);
        if (role == null) {
            map.addAttribute("name", "角色不存在");
        } else {
            map.addAttribute("name", role.getRoleName());
        }
        return "system/organize/role/select_users";
    }

    /**
     * @Description: 条件查询 用户， 用于角色分配
     * @Param: [param, roleId, users]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/10/7
     */
    @RequestMapping("users/query")
    @RequiresPermissions("role:readUser")
    public ModelAndView queryUsers(PageParam param, String roleId, SyUsers users) {
        return ajaxJson(syRoleService.selectUsers(param, roleId, users));
    }

    /**
     * @Description: 给用户添加角色
     * @Param: [roleId, ids]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/10/8
     */
    @RequestMapping("roleAddUsers")
    @RequiresPermissions("role:addUser")
    public ModelAndView addRoleUsers(String roleId, String[] ids) {
        return ajaxDone(syRoleService.addUserRoles(roleId, ids));
    }
}
