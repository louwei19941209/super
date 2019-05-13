package com.springmvc.commons.model;

import java.io.Serializable;

/**
 * @program: webssm
 * @description: 缓存用户对象
 * @author: lou wei
 * @create: 2018-09-17 11:51
 **/
public class UserInfo implements Serializable
{
    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String userName;
    /**
     * 真实姓名
     */
    private String tureName;
    /**
     * 部门id
     */
    private String deptId;

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getTureName()
    {
        return tureName;
    }

    public void setTureName(String tureName)
    {
        this.tureName = tureName;
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
