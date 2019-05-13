package com.springmvc.service.impl;

import com.springmvc.commons.model.LoginInfo;
import com.springmvc.commons.model.Member;
import com.springmvc.commons.model.OnLineUser;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.MD5Util;
import com.springmvc.commons.util.ServletUtil;
import com.springmvc.commons.util.UUIDUtil;
import com.springmvc.mapper.SyUsersMapper;
import com.springmvc.po.SyUsers;
import com.springmvc.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: webssm
 * @description: 用户登录，实现
 * @author: lou wei
 * @create: 2018-09-07 15:20
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private SyUsersMapper syUsersMapper;

    /**
     * 用户登陆
     *
     * @param [syUsers, passWord]
     * @return java.util.Map
     * @author louwei
     * @date 2018/9/7 15:24
     */
    @Override
    public Map updateLogin(SyUsers syUsers, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Map<String, Object> msg = new HashMap<>();
        SyUsers users = syUsersMapper.selectByParameter(syUsers);
        if (users == null) {
            msg.put("success", false);
            msg.put("msg", "用户不存在");
        }

        assert users != null;
        if (MD5Util.MD5Validate(syUsers.getUserPassword(), users.getUserPassword())) {
            Subject currentUser = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(users.getId(), users.getUserPassword());
            currentUser.login(token);//登录认证 记录登陆信息
            System.out.println("****登陆成功*****");

            //6.1 登录成功 保持一些用户信息到session中
            Member me = new Member(); //需要放入当前session 的用户信息
            me.setId(users.getId());
            me.setLoginTime(new Date());
            me.setTrueName(users.getTrueName());
            session.setAttribute("minfo", me);

            if (syUsers.getUserName().equals(BaseConfig.getInstance().getDevName())) {
                session.setAttribute("dev", true);//当前登陆用户是开发者，拥有所有权限
            } else {
                session.setAttribute("dev", false);
            }
            if (syUsers.getUserName().equals(BaseConfig.getInstance().getSaName())) {
                session.setAttribute("sa", true);//当前登陆用户是系统超级管理员
            } else {
                session.setAttribute("sa", false);
            }

            //6.2 保持一些用户登陆信息 到全局在线用户列表
            //获取全局 用户列表 将此次登录用户添加到用户在线列表中
            Map<String, OnLineUser> userMap = ServletUtil.getOnLineUsers();

            OnLineUser onLineUser = userMap.get(users.getId());
            if (onLineUser == null) {
                onLineUser = new OnLineUser();
            }
            onLineUser.setId(users.getId());
            onLineUser.setSex(users.getUserSex());
            onLineUser.setDeptId(users.getDeptId());
            onLineUser.setTrueName(users.getTrueName());

            Map<String, LoginInfo> loginInfoMap = onLineUser.getLoginInfos();
            if (loginInfoMap == null) {
                loginInfoMap = new HashMap<String, LoginInfo>();
            }
            LoginInfo loginInfo = new LoginInfo();
            loginInfo.setId(UUIDUtil.getUUID());
            loginInfo.setLoginTime(new Timestamp(new Date().getTime()));
            loginInfoMap.put(session.getId(), loginInfo);
            onLineUser.setLoginInfos(loginInfoMap);
            userMap.put(users.getId(), onLineUser); //将用户信息放入在线列表中

            msg.put("success", true);
            msg.put("msg", "登陆成功");
            return msg;
        } else {
            msg.put("success", false);
            msg.put("msg", "账号密码错误");
            return msg;
        }

    }
}
