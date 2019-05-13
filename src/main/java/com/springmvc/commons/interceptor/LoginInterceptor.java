package com.springmvc.commons.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @program: webssm
 * @description: 请求拦截器，每次请求都会执行
 * @author: lou wei
 * @create: 2018-09-07 10:12
 */
public class LoginInterceptor implements HandlerInterceptor
{
    private long startTime=0;

    @Override
    // 在业务处理器处理请求之前被调用
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception
    {
//        //获取session信息
//        User user = (User) httpServletRequest.getSession().getAttribute("user");
//        //获取请求地址
//        String url = httpServletRequest.getRequestURL().toString();
//        if (url.indexOf("login.do") >= 0)
//        {
//            return true;
//        }
//        if (user != null)
//        {
//            return true;
//        }
//        httpServletRequest.getRequestDispatcher("/index.jsp").forward(httpServletRequest, httpServletResponse);

        startTime = System.currentTimeMillis();  //当前时间
        Map<String, String[]> params = httpServletRequest.getParameterMap();  //获取请求参数
        for (String key : params.keySet())
        {
            Object value = params.get(key);
            if (value != null)
            {
                String[] obj = (String[]) value;
                for (String anObj : obj)
                {
                    System.out.println("===参数===" + key + " : " + anObj);
                }
            }
        }

        return true;
    }

    @Override
    // 在业务处理器处理请求完成之后，生成视图之前执行
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception
    {

    }

    @Override
    // 在DispatcherServlet完全处理完请求之后被调用，可用于清理资源
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception
    {
        String path = httpServletRequest.getContextPath();//当前工程名

        System.out.println("***请求处理完成***"+httpServletRequest.getRequestURI().substring(path.length()+1)+"耗时:"+(System.currentTimeMillis()-startTime));

    }
}
