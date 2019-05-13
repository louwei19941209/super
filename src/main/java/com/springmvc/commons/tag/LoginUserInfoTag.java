package com.springmvc.commons.tag;

import com.springmvc.commons.util.ServletUtil;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * @program: webssm
 * @description: 获取登陆用户信息
 * @author: lou wei
 * @create: 2018-09-12 11:32
 **/
public class LoginUserInfoTag extends SimpleTagSupport
{
    private String type;

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void doTag() throws IOException
    {
        JspWriter out = getJspContext().getOut();
        if ("trueName".equals(type))
        {
            out.print(ServletUtil.getMember().getTrueName());
        }
    }
}
