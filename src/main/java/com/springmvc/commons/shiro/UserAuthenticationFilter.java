package com.springmvc.commons.shiro;

import com.springmvc.commons.model.LoginInfo;
import com.springmvc.commons.model.OnLineUser;
import com.springmvc.commons.util.ServletUtil;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.UserFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @program: webssm
 * @description: 验证用户是否在线
 * @author: lou wei
 * @create: 2018-09-09 16:59
 */
public class UserAuthenticationFilter extends UserFilter
{
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
    {
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("验证用户登陆信息=="+req.getRequestURI());
        System.out.println("sessionId=="+req.getSession().getId());

        if (isLoginRequest(request, response))
        {
            return true;
        }
        else
        {
            Subject subject = getSubject(request, response);
            //验证是否有用户登陆
            if (subject.getPrincipal() != null && subject.isAuthenticated())
            {
                String userId = (String) subject.getPrincipal(); //获取用户id

                Map<String, OnLineUser> userMap = ServletUtil.getOnLineUsers();
                OnLineUser onLineUser = userMap.get(userId);

                if (onLineUser == null)
                {
                    return false;
                }
                else
                {
                    Map<String, LoginInfo> loginInfoMap = onLineUser.getLoginInfos();
                    if (loginInfoMap.containsKey(req.getSession().getId()))
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }

            }
            else
            {
                return false;
            }
        }
    }
}
