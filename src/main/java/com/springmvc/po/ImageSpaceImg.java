package com.springmvc.po;

import java.util.Date;

/**
 * 图片空间
 * @author  自动生成
 */
public class ImageSpaceImg {


    /**
     * 
     */
     private String id;


    /**
     * 用户id
     */
     private String userId;


    /**
     * 图片类型id，关联image_space
     */
     private String type;


    /**
     * 图片名称
     */
     private String name;


    /**
     * 后缀
     */
     private String ext;


    /**
     * 图片大小
     */
     private Integer size;


    /**
     * 上传时间
     */
     private Date createTime;


    /**
     * 保存地址
     */
     private String savePath;



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


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getExt() {
        return this.ext;
    }


    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return this.size;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }


    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getSavePath() {
        return this.savePath;
    }


}