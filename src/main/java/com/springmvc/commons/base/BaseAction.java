package com.springmvc.commons.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.springmvc.commons.config.MsgConfig;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: webssm
 * @description: 处理返回数据  所有controller类的父类
 * @author: lou wei
 * @create: 2018-09-25 10:10
 **/
public abstract class BaseAction
{
    public static final String NODATA = "nodata";
    public static final String NOPOWER = "nopower";

    /**
     * @Description: 自定义状态码 和自定义提示信息，
     * @Param: [statusCode, message]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    protected ModelAndView ajaxDoneText(int statusCode, String message)
    {
        ModelAndView mav = new ModelAndView(MsgConfig.PAGE_AJAXDONE);
        mav.addObject(MsgConfig.STATUSCODE, statusCode);
        mav.addObject(MsgConfig.MESSAGE, message);
        return mav;
    }

    /**
     * @Description: 操作失败，直接传入提示的错误信息
     * @Param: [message]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    public ModelAndView ajaxDoneTextError(String message)
    {
        return ajaxDoneText(MsgConfig.CODE_FAIL, message);
    }

    /**
     * @Description: 自定义状态码 和提示信息， message为国际化资源key
     * @Param: [statusCode, messageKey]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    protected ModelAndView ajaxDone(int statusCode, String messageKey)
    {
        ModelAndView mav = new ModelAndView(MsgConfig.PAGE_AJAXMESSAGE);
        mav.addObject(MsgConfig.STATUSCODE, statusCode);
        mav.addObject(MsgConfig.MESSAGE, messageKey);
        return mav;
    }

    /**
     * @Description: 传入boolean 返回操作成功 或者失败  使用默认提示信息
     * @Param: [f]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    protected ModelAndView ajaxDone(boolean f)
    {
        if (f)
        {
            return ajaxDoneSuccess();
        }
        else
        {
            return ajaxDoneError();
        }
    }

    /**
     * @Description: 传入反馈的信息  使用默认提示信息
     * @Param: [messageKey]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    protected ModelAndView ajaxDone(String messageKey)
    {
        if (MsgConfig.MSG_KEY_SUCCESS.equals(messageKey))
        {
            return ajaxDoneSuccess();
        }
        else
        {
            return ajaxDoneError(messageKey);
        }
    }

    /**
     * @Description: 操作成功 使用默认提示信息
     * @Param: []
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    protected ModelAndView ajaxDoneSuccess()
    {
        return ajaxDone(MsgConfig.CODE_SUCCESS, MsgConfig.MSG_KEY_SUCCESS);//默认信息 操作成功
    }

    /**
     * @Description: 操作成功，自定义提示信息，
     * @Param: [messageKey]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    protected ModelAndView ajaxDoneSuccess(String messageKey)
    {
        return ajaxDone(MsgConfig.CODE_SUCCESS, messageKey);
    }

    /**
     * @Description: 操作成功 使用默认提示信息
     * @Param: [map]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    protected String ajaxDoneSuccess(ModelMap map)
    {
        map.addAttribute(MsgConfig.STATUSCODE, MsgConfig.CODE_SUCCESS);
        map.addAttribute(MsgConfig.MESSAGE, MsgConfig.MSG_KEY_SUCCESS);
        return MsgConfig.PAGE_AJAXMESSAGE;
    }

    /**
     * @Description: 操作失败 使用默认提示信息
     * @Param: []
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    protected ModelAndView ajaxDoneError()
    {
        return ajaxDone(MsgConfig.CODE_FAIL, MsgConfig.MSG_KEY_FAIL);//默认信息  操作失败
    }

    /**
     * @Description: 操作失败 返回自定义信息
     * @Param: []
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    protected ModelAndView ajaxDoneError(String messageKey)
    {
        return ajaxDone(MsgConfig.CODE_FAIL, messageKey);
    }

    /**
     * @Description: 操作失败 使用默认提示信息
     * @Param: []
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    protected String ajaxDoneError(ModelMap map)
    {

        map.addAttribute(MsgConfig.STATUSCODE, MsgConfig.CODE_FAIL);
        map.addAttribute(MsgConfig.MESSAGE, MsgConfig.MSG_KEY_FAIL);
        return MsgConfig.PAGE_AJAXMESSAGE;
    }

    /**
     * @Description: 操作失败 使用默认提示信息
     * @Param: []
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    protected ModelAndView ajaxDoneNoData()
    {
        return ajaxDone(MsgConfig.CODE_FAIL, MsgConfig.MSG_KEY_NODATA);//默认信息  操作失败
    }

    /**
     * @Description: 直接输出信息
     * @Param: [message]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    protected ModelAndView ajaxText(String message)
    {
        ModelAndView mav = new ModelAndView(MsgConfig.PAGE_AJAXJSON);
        mav.addObject(MsgConfig.MSGINFO, message);
        return mav;
    }

    /**
     * @Description: 将信息格式化成json输出
     * @Param: [message]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    protected ModelAndView ajaxJson(Object message)
    {
        ModelAndView mav = new ModelAndView(MsgConfig.PAGE_AJAXJSON);
        mav.addObject(MsgConfig.MSGINFO, JSON.toJSONString(message, SerializerFeature.WriteMapNullValue));
        return mav;
    }

    /**
     * 将信息格式化成json输出 并将 <script 脚本标签转义
     * @param message
     * @return
     */
    protected ModelAndView ajaxJsonEscape(Object message) {
        ModelAndView mav = new ModelAndView(MsgConfig.PAGE_AJAXJSON);
        mav.addObject(MsgConfig.MSGINFO, JSON.toJSONString(message,SerializerFeature.WriteMapNullValue).replaceAll("<script", "&lt;script").replaceAll("</script", "&lt;/script"));

        return mav;
    }

    /**
     * 返回数据校验失败视图
     * @param errors 数据校验错误信息
     * @param excludeField 排除验证的 属性(可变参)
     * @return
     */
    protected ModelAndView getValidationMessage(Errors errors, String... excludeField)
    {

        System.out.println("错误数量" + errors.getErrorCount());

        List<FieldError> fes = errors.getFieldErrors();
        List<String> errorMessages = new ArrayList<String>();

        //遍历所有错误信息
        c:
        for (FieldError e : fes)
        {
            System.out.println("f==" + e.getField());
            System.out.println("code==" + e.getCode());
            System.out.println("msg==" + e.getDefaultMessage());
            String fileName = e.getField();
            for (String ef : excludeField)
            {
                if (fileName.equals(ef))
                {
                    //如果是不需要验证的属性，直接继续遍历下面的错误信息
                    System.out.println(ef + "不需要验证");
                    continue c;
                }
            }

            errorMessages.add(e.getDefaultMessage());
        }

        if (errorMessages.isEmpty())
        {
            //排除不需要验证的信息之后没有错误信息
            return null;
        }

        ModelAndView mav = new ModelAndView("ajaxValidationMessage");
        mav.addObject(MsgConfig.STATUSCODE, MsgConfig.CODE_FAIL);
        mav.addObject("errorCount", errorMessages.size());
        mav.addObject(MsgConfig.MESSAGE, errorMessages);
        return mav;

    }
}
