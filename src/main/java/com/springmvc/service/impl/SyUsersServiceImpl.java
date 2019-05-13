package com.springmvc.service.impl;

import com.springmvc.commons.cache.MyCache;
import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.Member;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.MD5Util;
import com.springmvc.commons.util.ServletUtil;
import com.springmvc.mapper.*;
import com.springmvc.po.*;
import com.springmvc.service.SyUsersService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;

/**
 * @program: webssm
 * @description: 用户，实现层
 * @author: lou wei
 * @create: 2018-09-07 10:14
 */
@Service
public class SyUsersServiceImpl implements SyUsersService {
    @Autowired
    private SyUsersMapper syUsersMapper;

    @Autowired
    private SyUserRoleMapper syUserRoleMapper;

    @Autowired
    private SyRoleMapper syRoleMapper;

    @Autowired
    private SyMenuMapper syMenuMapper;

    @Autowired
    private SyActionMapper syActionMapper;


    /**
     * @Description: 查询用户id ,查询拥有的角色id，和可以访问的urls
     * @Param: [userId]
     * @return: java.util.Map<java.lang.String   ,   java.util.Collection   <   java.lang.String>>
     * @Author: lou wei
     * @Date: 2018/9/13
     */
    @Override
    public Map<String, Collection<String>> selectByUserAllPower(String userId) {
        Map<String, Collection<String>> map = new HashMap<String, Collection<String>>();

        List<String> roleList = syUsersMapper.selectByUserAllRole(userId);
        //用户可以访问的url集合
        Set<String> urls = new HashSet<String>();

        for (String s : roleList) {
            List<String> menuUrls = syUsersMapper.selectByUserAllMenu(s);
            for (String url : menuUrls) {
                if (StringUtils.isNotBlank(url)) {
                    urls.add(url.split("\\?")[0]);
                }
            }
        }

        //获取操作url
        for (String s : roleList) {
            List<String> actUrl = syUsersMapper.selectByUserAllAction(s);
            for (String url : actUrl) {
                if (StringUtils.isNotBlank(url)) {
                    urls.addAll(Arrays.asList(url.split(",")));
                }
            }
        }
        map.put("roleIds", roleList);
        map.put("powers", urls);
        return map;
    }


    /**
     * @Description: 查询所有用户
     * @Param: [user]
     * @return: java.util.List
     * @Author: lou wei
     * @Date: 2018/9/13
     */
    @Override
    //@Cacheable(value = "myCache", key = "#user.id")
    public DataGrid selectAllUser(PageParam param, SyUsers user) {
        DataGrid data = new DataGrid();

        List<SyUsers> usersList = syUsersMapper.selectAllUsers(param, user);
        for (SyUsers u : usersList) {
            u.setDeptName(MyCache.getInstance().getDeptName(u.getDeptId()));
        }
        data.setRows(usersList);
        data.setTotal(param.getTotle());
        return data;
    }

    /**
     * @Description: 根据id查询用户信息
     * @Param: [id]
     * @return: com.springmvc.po.SyUsers
     * @Author: lou wei
     * @Date: 2018/9/17
     */
    @Override
    public SyUsers selectByPrimaryKey(String id) {
        return syUsersMapper.selectByPrimaryKey(id);
    }

    /**
     * @Description: 添加用户
     * @Param: [users]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @Override
    public String addUser(SyUsers users) {
        SyUsers syUsers = syUsersMapper.selectByParameter(users);
        if (syUsers == null) {
            Member me = ServletUtil.getMember();
            users.setType(1);
            users.setErrorCount(0);
            users.setLastLoginIp("x.x.x.x");//设置用户最后登录ip，可以根据此ip判断用户是否为第一次登录系统
            users.setRegisterUid(me.getId());
            users.setUserPassword(MD5Util.MD5(users.getUserPassword()));
            users.setRegisterTime(new Timestamp(new Date().getTime()));

            if (syUsersMapper.insert(users) > 0) {
                return MsgConfig.MSG_KEY_SUCCESS;
            } else {
                return MsgConfig.MSG_KEY_FAIL;
            }
        } else {
            return "msg.username.unique";
        }

    }

    /**
     * @Description: 修改用户
     * @Param: [users]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @Override
    public String updateUser(SyUsers users) {
        SyUsers u = syUsersMapper.selectByPrimaryKey(users.getId());
        if (u == null) {
            return MsgConfig.MSG_KEY_NODATA;
        }

        SyUsers obj = syUsersMapper.selectByParameter(users);
        if (obj != null) {
            return "msg.username.unique";//用户名已被占用
        }
        if (StringUtils.isNotBlank(users.getUserPassword())) {
            u.setUserPassword(MD5Util.MD5(users.getUserPassword()));
        }

        u.setDeptId(users.getDeptId());
        u.setUserSex(users.getUserSex());
        u.setUserName(users.getUserName());
        u.setTrueName(users.getTrueName());
        u.setUserDesc(users.getUserDesc());
        u.setUserStatus(users.getUserStatus());
        u.setMobilePhoneNumber(users.getMobilePhoneNumber());
        if (syUsersMapper.updateByPrimaryKey(u) > 0) {
            MyCache.getInstance().removeCache(MyCache.USERID2INFO, u.getId());  //删除缓存
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    /**
     * @Description: 删除用户
     * @Param: [ids]
     * @return: boolean
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @Override
    public boolean deleteUser(String[] ids) {
        try {
            for (String id : ids) {
                SyUsers users = syUsersMapper.selectByPrimaryKey(id);
                if (!users.getUserName().equals(BaseConfig.getInstance().getDevName()) &&
                        !users.getUserName().equals(BaseConfig.getInstance().getSaName())) {
                    syUsersMapper.deleteByPrimaryKey(id);
                    //syUserRoleMapper.deleteByPrimaryKey(id);
                    MyCache.getInstance().removeCache(MyCache.USERID2INFO, id);  //删除缓存
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    /**
     * @Description: 查询出所有角色，和用户已有角色，用于用户角色更新
     * @Param: [userId]
     * @return: java.util.Map
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @Override
    public Map selectUserRolesAndIds(String userId) {
        Map<String, Object> map = new HashMap<>();
        SyRole role = new SyRole();
        PageParam param = new PageParam();
        param.setDefaultUseFlag(false);
        List<SyRole> allRoles = syRoleMapper.selectAllRole(param, role);
        List<String> roleIds = syUserRoleMapper.selectByUserAllRole(userId);
        map.put("hasRoles", roleIds);
        map.put("roles", allRoles);
        return map;
    }

    /**
     * @Description: 查询用户所有权限
     * @Param: [userId]
     * @return: java.util.Map
     * @Author: lou wei
     * @Date: 2018/9/28
     */
    @Override
    public Map selectUserPowers(String userId) {
        //查询某用户所有角色id
        List<String> roleIds = syUserRoleMapper.selectByUserAllRole(userId);
        Map<String, Object> map = new HashMap<String, Object>();
        if (!roleIds.isEmpty()) {
            List<SyMenu> menus = syMenuMapper.selectMyMenus(roleIds);
            List<SyAction> actions = syActionMapper.selectMyAction(roleIds);

            map.put("menus", menus);
            map.put("actions", actions);
        } else {
            map.put("noRole", true);
        }
        return map;
    }

    /**
     * @Description: 修改用户角色
     * @Param: [userId, addRoleIds, delRoleIds]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @Override
    public Boolean updateUserRoles(String userId, String[] addRoleIds, String[] delRoleIds) {

        try {
            //添加用户角色关联
            for (String id : addRoleIds) {
                SyUserRole userRole = new SyUserRole();
                userRole.setRoleId(id);
                userRole.setUserId(userId);
                syUserRoleMapper.insert(userRole);
            }

            //删除用户角色关联
            for (String id : delRoleIds) {
                SyUserRole userRole = new SyUserRole();
                userRole.setRoleId(id);
                userRole.setUserId(userId);
                syUserRoleMapper.deleteByParameter(userRole);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    /**
     * @Description: 修改用户密码
     * @Param: [id, userPassword, pwd]
     * @return: java.lang.Boolean
     * @Author: lou wei
     * @Date: 2018/9/29
     */
    @Override
    public Boolean updatePassword(String id, String userPassword, String pwd) {
        SyUsers user = new SyUsers();
        user.setId(id);
        user.setUserPassword(MD5Util.MD5(userPassword));
        return syUsersMapper.updateByPrimaryKeySelective(user) > 0;
    }
}
