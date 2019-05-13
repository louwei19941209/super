package com.springmvc.commons.model;

import java.io.Serializable;
import java.util.Map;

/**
 * @program: webssm
 * @description: 全局变量存储用户在线基本信息
 * @author: lou wei
 * @create: 2018-09-09 17:15
 */
public class OnLineUser implements Serializable
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
     * 真是姓名
     */
    private String trueName;

    /**
     * 用户登录集合信息
     */
    private Map<String, LoginInfo> loginInfos;

    /**
     * 性别 1:男,0:女
     */
    private Short sex;
    /**
     * 部门id
     */
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

    public Map<String, LoginInfo> getLoginInfos()
    {
        return loginInfos;
    }

    public void setLoginInfos(Map<String, LoginInfo> loginInfos)
    {
        this.loginInfos = loginInfos;
    }

    public Short getSex()
    {
        return sex;
    }

    public void setSex(Short sex)
    {
        this.sex = sex;
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
