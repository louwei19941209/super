package com.springmvc.commons.util;

import com.springmvc.commons.model.Member;
import com.springmvc.commons.model.OnLineUser;
import com.springmvc.mapper.SyUserRoleMapper;
import com.springmvc.po.SyUserRole;
import com.springmvc.service.SyRoleService;
import com.springmvc.service.SyUserRoleService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public class ServletUtil implements ServletContextAware
{
    private static ServletContext servletContext;

    /**
     *
     * 获取ServletContext
     * @author louwei
     * @date 2018/9/9 17:33
     * @param []
     * @return javax.servlet.ServletContext
     */
    public static ServletContext getServletContext(){

        return servletContext;
    }

   /**
    *
    * 获取ApplicationContext
    * @author louwei
    * @date 2018/9/9 17:33
    * @param []
    * @return org.springframework.context.ApplicationContext
    */
    public static ApplicationContext getApplicationContext()
    {
        return WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
    }

   /**
    *
    * 获取ServletContext保存的数据
    * @author louwei
    * @date 2018/9/9 17:33
    * @param [name]
    * @return java.lang.Object
    */
    public static Object getServletContextAttribute(String name)
    {
        return servletContext.getAttribute(name);
    }

   /**
    *
    * 获取在线用户Map
    * @author louwei
    * @date 2018/9/9 17:34
    * @param []
    * @return java.util.Map<java.lang.String,com.springmvc.commons.model.OnLineUser>
    */
    @SuppressWarnings("unchecked")
    public static Map<String, OnLineUser> getOnLineUsers(){

        return (Map<String,OnLineUser>)getServletContextAttribute("onLineUsers");
    }

    /**
     *
     * 获取session
     * @author louwei
     * @date 2018/9/9 18:48
     * @param: []
     * @return org.apache.shiro.session.Session
     */
    public static Session getSession(){

        return SecurityUtils.getSubject().getSession();
    }

    /**
     *
     * 获取 Session保存的数据
     * @author louwei
     * @date 2018/9/9 18:48
     * @param [name]
     * @return java.lang.Object
     */
    public static Object getSessionAttribute(String name)
    {
        return getSession().getAttribute(name);
    }

    /**
     *
     * 获取用户对象
     * @author louwei
     * @date 2018/9/9 18:49
     * @param []
     * @return com.springmvc.commons.model.Member
     */
    public static Member getMember()
    {
        return (Member) getSessionAttribute("minfo");
    }


    /**
    * @Description: 判断用户是否是开发者
    * @Param: []
    * @return: boolean
    * @Author: lou wei
    * @Date: 2018/9/21
    */
    public static boolean isDeveloper()
    {
        return (Boolean) getSession().getAttribute("dev");
    }

    /**
    * @Description: 通过用户id获取当前角色ids
    * @Param: [userId]
    * @return: java.util.List<java.lang.String>
    * @Author: lou wei
    * @Date: 2018/9/20
    */
    public static List<String> getRoleIdsByUserId(String userId)
    {
        SyUserRoleService syUserRoleService = getApplicationContext().getBean(SyUserRoleService.class);
        return syUserRoleService.selectByUserAllRole(userId);
    }


    /** 
    * @Description: 判断是否是需要返回json数据 
    * @Param: [request]
    * @return: boolean 
    * @Author: lou wei
    * @Date: 2018/9/11 
    */ 
    public static boolean isJSONResponse(HttpServletRequest request)
    {
        String accept = request.getHeader("Accept");
        if (accept == null)
        {
            return true;
        }
        else
        {
            if (accept.contains("application/json"))
            {
                return true;
            }
            else return "1".equals(request.getParameter("ajax"));

        }
    }

    @Override
    public void setServletContext(ServletContext arg0)
    {
        servletContext = arg0;
    }
}
