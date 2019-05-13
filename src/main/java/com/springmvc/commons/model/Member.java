package com.springmvc.commons.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: webssm
 * @description: session中存储用户信息model
 * @author: lou wei
 * @create: 2018-09-08 18:01
 */
public class Member implements Serializable
{
    /**
     * @Fields serialVersionUID :
     */

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String id;

    /**
     * 用户真是名称
     */
    private String trueName;

    /**
     * 登录时间
     */
    private Date loginTime;

    private String deptId;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTrueName()
    {
        return trueName;
    }

    public void setTrueName(String trueName)
    {
        this.trueName = trueName;
    }

    public Date getLoginTime()
    {
        return loginTime;
    }

    public void setLoginTime(Date loginTime)
    {
        this.loginTime = loginTime;
    }

    public String getDeptId()
    {
        return deptId;
    }

    public void setDeptId(String deptId)
    {
        this.deptId = deptId;
    }
}
