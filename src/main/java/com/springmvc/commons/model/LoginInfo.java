package com.springmvc.commons.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @program: webssm
 * @description: 用户登陆时信息
 * @author: lou wei
 * @create: 2018-09-09 17:24
 */
public class LoginInfo implements Serializable
{
    /**
     * @Fields serialVersionUID :
     */

    private static final long serialVersionUID = 1L;
    /**
     * id uuid 自定义，用于一些业务操作
     */
    private String id;
    /**
     * 登录类型 1：网页 2：安卓客户端
     */
    private int loginType;
    /**
     * 登陆时间
     */
    private Timestamp loginTime;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public int getLoginType()
    {
        return loginType;
    }

    public void setLoginType(int loginType)
    {
        this.loginType = loginType;
    }

    public Timestamp getLoginTime()
    {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime)
    {
        this.loginTime = loginTime;
    }
}
