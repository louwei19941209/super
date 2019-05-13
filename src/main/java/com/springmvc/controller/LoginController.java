package com.springmvc.controller;

import com.springmvc.commons.model.LoginInfo;
import com.springmvc.commons.model.Member;
import com.springmvc.commons.model.OnLineUser;
import com.springmvc.commons.util.ServletUtil;
import com.springmvc.po.SyUsers;
import com.springmvc.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @program: webssm
 * @description: 用户登陆
 * @author: lou wei
 * @create: 2018-09-07 15:11
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginService loginService;


    @RequestMapping("")
    public String toLogin(HttpSession session) {
        Member me = ServletUtil.getMember();
        if (me != null) {
            Map<String, OnLineUser> userMap = ServletUtil.getOnLineUsers();
            OnLineUser onLineUser = userMap.get(me.getId());
            if (onLineUser != null) {
                Map<String, LoginInfo> loginInfoMap = onLineUser.getLoginInfos();
                if (loginInfoMap.containsKey(session.getId())) {
                    return "has_login";
                }
            }
        }
        return "login";
    }

    /**
     * 登陆
     *
     * @param users   {@link SyUsers}
     * @param request {@link HttpServletRequest}
     * @return Map
     */
    @ResponseBody
    @RequestMapping("go")
    public Map login(SyUsers users, HttpServletRequest request) {
        return loginService.updateLogin(users, request);
    }

    /**
     * 注销登陆
     *
     * @return String
     */
    @RequestMapping("out")
    public String out() {
        System.out.println("********注销登录******");
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.getSession().setAttribute("isOut", true);
        currentUser.logout();
        return "redirect:/login.do";
    }
}
