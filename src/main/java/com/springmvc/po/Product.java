package com.springmvc.po;

import java.util.Date;

/**
 * 产品表
 *
 * @author 自动生成
 */
public class Product {


    /**
     * 主键id
     */
    private Integer id;


    /**
     * 产品名称
     */
    private String name;


    /**
     * 产品详情
     */
    private String details;

    /**
     * 产品类型
     */
    private String type;

    /**
     * 产品图
     */
    private String image;


    /**
     * 创建时间
     */
    private Date createTime;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setDetails(String details) {
        this.details = details;
    }

    public String getDetails() {
        return this.details;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }


}