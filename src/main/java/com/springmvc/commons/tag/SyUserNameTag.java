package com.springmvc.commons.tag;

import com.springmvc.commons.cache.MyCache;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * @program: webssm
 * @description: 根据用户id，获取用户名称
 * @author: lou wei
 * @create: 2018-09-04 10:50
 */
public class SyUserNameTag extends SimpleTagSupport
{

    private String id;

    public void doTag() throws JspException, IOException
    {
        JspWriter out = getJspContext().getOut();
        out.print(MyCache.getInstance().getUserName(id));

    }


    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
}
