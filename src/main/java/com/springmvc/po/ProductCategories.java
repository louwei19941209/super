package com.springmvc.po;

import java.util.Date;

/**
 * 产品类型表
 *
 * @author 自动生成
 */
public class ProductCategories {


    /**
     *
     */
    private Integer id;


    /**
     * 类别名称
     */
    private String type;


    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 图片
     */
    private String image;

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


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }


}