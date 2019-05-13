package com.springmvc.po;

import java.io.Serializable;

public class User implements Serializable
{
    private static final long serialVersionUID = -6579533328390250520L;

    private int id;
    private String name;
    private String passwrod;
    private int age;
    private String sex;
    private String img;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPasswrod()
    {
        return passwrod;
    }

    public void setPasswrod(String passwrod)
    {
        this.passwrod = passwrod;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getImg()
    {
        return img;
    }

    public void setImg(String img)
    {
        this.img = img;
    }
}
