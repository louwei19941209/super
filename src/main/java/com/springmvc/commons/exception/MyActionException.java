package com.springmvc.commons.exception;

import com.springmvc.commons.util.ServletUtil;
import org.apache.log4j.Logger;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: webssm
 * @description: 自定义异常处理
 * @author: lou wei
 * @create: 2018-09-10 11:59
 */
public class MyActionException implements HandlerExceptionResolver
{
    private static Logger logger = Logger.getLogger(MyActionException.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e)
    {
        String url = request.getRequestURI(); //请求地址
        boolean isJson = ServletUtil.isJSONResponse(request);  //是否需要返回json
        ModelAndView model = new ModelAndView("ajaxDone");

        if (e instanceof UnauthorizedException)
        {
            UnauthorizedException ue = (UnauthorizedException) e;
            System.out.println("*****没有访问权限：" + url + "*****" + ue.getMessage());
            model.addObject("message", "抱歉，您没有操作权限！");
        }
        else if (e instanceof MyRuntimeException)
        {
            model.addObject("message", e.getMessage());
        }
        else if (e instanceof CannotCreateTransactionException)
        {
            model.addObject("message", "数据库连接不上");
            e.printStackTrace();
        }
        else
        {
            model.addObject("message", "服务器异常...请稍后再试....");//服务器异常...请稍后再试....

            logger.error("发生异常：\n\t请求："+url+"\n\t异常名称:"+e.getClass().getName()+"\n\t异常信息:"+e.getMessage()+"\n\t异常来源:"+o);
            e.printStackTrace();
        }

        //返回错误信息提示
        if (isJson)
        {
            model.addObject("statusCode", 300);
            return model;
        }
        else
        {
            model.setViewName("exception");
            return model;
        }
    }

}
