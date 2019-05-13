package com.springmvc.commons.tag;

import com.springmvc.commons.cache.MyCache;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * @program: webssm
 * @description: 根据部门id，获取部门名称
 * @author: lou wei
 * @create: 2018-09-27 16:21
 **/
public class SyDeptNameTag extends SimpleTagSupport
{
    private String id;

    public void doTag() throws JspException, IOException
    {
        JspWriter out = getJspContext().getOut();
        out.print(MyCache.getInstance().getDeptName(id));

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
