package com.springmvc.po;

import java.util.Date;

/**
 * 图片空间 图片类型
 * @author  自动生成
 */
public class ImageSpace {


    /**
     * 关联用户id
     */
     private String id;


    /**
     * 关联用户
     */
     private String userId;


    /**
     * 相册名称
     */
     private String name;


    /**
     * 创建时间
     */
     private Date createTime;


    /**
     * 备注
     */
     private String remark;


    /**
     * 类型：0：用户创建，1：word图片转存(系统创建)
     */
     private Integer type;



    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }


    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return this.userId;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }


    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }


    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return this.type;
    }


}