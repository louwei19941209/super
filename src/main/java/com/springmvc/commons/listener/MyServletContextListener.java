package com.springmvc.commons.listener;

import com.springmvc.commons.model.OnLineUser;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: webssm
 * @description: 监听servletContext
 * @author: lou wei
 * @create: 2018-09-14 13:53
 **/
public class MyServletContextListener implements ServletContextListener
{

    /**
     * @Description:  上下文初始化，生成servletContext对象后调用
     * @Param: [event]
     * @return: void
     * @Author: lou wei
     * @Date: 2018/9/16
     */
    @Override
    public void contextInitialized(ServletContextEvent event)
    {
        System.out.println("********服务器开启******");
        ServletContext servletContext = event.getServletContext();

        //保存在线用户的Map
        Map<String, OnLineUser> usersMap=new HashMap<String,OnLineUser>();
        servletContext.setAttribute("onLineUsers", usersMap);//放入全局保存

    }

    /**
    * @Description: 销毁上下文，
    * @Param: [event]
    * @return: void
    * @Author: lou wei
    * @Date: 2018/9/16
    */
    @Override
    public void contextDestroyed(ServletContextEvent event)
    {
        System.out.println("********服务器关闭******");
    }
}
