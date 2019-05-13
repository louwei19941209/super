package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.SyUsers;
import com.springmvc.service.SyUsersService;
import io.swagger.annotations.Api;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.annotations.ApiIgnore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @program: webssm
 * @description: 用户
 * @author: lou wei
 * @create: 2018-09-07 10:12
 */
@Api(value = "用户接口", description = "用户操作", tags = {"用户相关操作"})
@Controller
@RequestMapping("user")
public class SyUsersController extends BaseAction {
    @Autowired
    private SyUsersService syUsersService;

    /**
     * @Description: 跳转用户管理页面
     * @Param: []
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @ApiIgnore
    @RequestMapping("load")
    @RequiresPermissions("user:read")
    public String load() {
        return "system/organize/user/load";
    }

    /**
     * @Description: 跳转添加页面
     * @Param: []
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @ApiIgnore
    @RequestMapping("addPage")
    public String addPage() {
        return "system/organize/user/add";
    }

    /**
     * @Description: 查询所有用户
     * @Param: [param, users]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @RequestMapping(value = "queryUser")
    @RequiresPermissions("user:read")
    public ModelAndView queryUser(PageParam param, SyUsers users) {
        return ajaxJson(syUsersService.selectAllUser(param, users));
    }

    /**
     * @Description: 添加用户
     * @Param: [users]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @ApiIgnore
    @RequestMapping("add")
    @RequiresPermissions("user:add")
    public ModelAndView addUser(SyUsers users) {
        return ajaxDone(syUsersService.addUser(users));
    }

    /**
     * @Description: 跳转修改页面
     * @Param: [id]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @ApiIgnore
    @RequestMapping("updatePage")
    @RequiresPermissions("user:update")
    public String updatePage(String id, ModelMap map) {
        SyUsers users = syUsersService.selectByPrimaryKey(id);
        if (users == null) {
            return NODATA;
        }
        users.setUserPassword("");
        map.addAttribute("u", users);
        return "system/organize/user/update";
    }

    /**
     * @Description: 查看用户详情
     * @Param: [id, map]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @ApiIgnore
    @RequestMapping("show")
    @RequiresPermissions("user:update")
    public String showUser(String id, ModelMap map) {
        SyUsers users = syUsersService.selectByPrimaryKey(id);
        if (users == null) {
            return NODATA;
        }
        map.addAttribute("u", users);
        return "system/organize/user/show";
    }

    /**
     * @Description: 修改用户
     * @Param: [users]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @ApiIgnore
    @RequestMapping("update")
    @RequiresPermissions("user:update")
    public ModelAndView updateUser(SyUsers users) {
        return ajaxDone(syUsersService.updateUser(users));
    }

    /**
     * @Description: 删除用户
     * @Param: [ids]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @ApiIgnore
    @RequestMapping("delete")
    @RequiresPermissions("user:delete")
    public ModelAndView deleteUser(String[] ids) {
        return ajaxDone(syUsersService.deleteUser(ids));
    }

    /**
     * @Description: 跳转到 用户--角色--修改页面 ，并 查询出所有的角色，和用户已有的角色
     * @Param: []
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @ApiIgnore
    @RequestMapping("updateRolePage")
    @RequiresPermissions("user:readRole")
    public String rolesPage() {
        return "system/organize/user/update_role";
    }

    /**
     * @Description:
     * @Param: []
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @ApiIgnore
    @RequestMapping("updateRoleQuery")
    @RequiresPermissions("user:readRole")
    public ModelAndView updateRoleQuery(String id) {
        return ajaxJson(syUsersService.selectUserRolesAndIds(id));
    }

    /**
     * @Description: 跳转查看权限的页面
     * @Param: []
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @ApiIgnore
    @RequestMapping("showPowersPage")
    @RequiresPermissions("user:readPower")
    public String showPowersPage() {
        return "system/organize/user/show_powers";
    }

    /**
     * @Description: 修改用户角色
     * @Param: []
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @ApiIgnore
    @RequestMapping("updateRole")
    @RequiresPermissions("user:updateRole")
    public ModelAndView updateRole(String userId, String[] addRoleIds, String[] delRoleIds) {
        return ajaxDone(syUsersService.updateUserRoles(userId, addRoleIds, delRoleIds));
    }

    /**
     * @Description: 查询某用户拥有的所有权限
     * @Param: []
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @ApiIgnore
    @RequestMapping("showPowers")
    @RequiresPermissions("user:readPower")
    public ModelAndView showUserPower(String id) {
        return ajaxJsonEscape(syUsersService.selectUserPowers(id));
    }

    /**
     * @Description: 跳转修改密码页面
     * @Param: []
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @ApiIgnore
    @RequestMapping("updatePwPage")
    @RequiresPermissions("user:resetPassword")
    public String updateUserPasswordPage() {
        return "system/organize/user/update_password";
    }

    @ApiIgnore
    @RequestMapping("updatePw")
    @RequiresPermissions("user:resetPassword")
    public ModelAndView updateUserPassword(String id, String userPassword, String pwd) {
        if (!userPassword.equals(pwd)) {
            List<String> errorMessages = new ArrayList<String>();
            errorMessages.add("两次输入的新密码不一致！");
            ModelAndView mav = new ModelAndView("ajaxValidationMessage");
            mav.addObject(MsgConfig.STATUSCODE, MsgConfig.CODE_FAIL);
            mav.addObject("errorCount", 1);
            mav.addObject(MsgConfig.MESSAGE, errorMessages);
            return mav;
        }
        return ajaxDone(syUsersService.updatePassword(id, userPassword, pwd));
    }

    /**
     * @Description: 查询某用户拥有的所有权限
     * @Param: [userId]
     * @return: java.util.Map
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @ApiIgnore
    @ResponseBody
    @RequiresPermissions("user:readPower")
    @RequestMapping("power")
    public Map userPower(String userId) {
        return syUsersService.selectByUserAllPower(userId);
    }

    /**
     * @Description:
     * @Param: []
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/11/14
     */
    @ApiIgnore
    @RequestMapping("lookUpPage")
    public String lookUpPage(Integer type) {
        return "system/organize/user/lookup";
    }

    /**
     * @Description:
     * @Param: []
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/11/14
     */
    @ApiIgnore
    @RequestMapping("lookUp")
    public ModelAndView lookUp(PageParam param, SyUsers user, int type) {
        return ajaxJsonEscape(syUsersService.selectAllUser(param, user));
    }

}
