package com.springmvc.po;

import java.util.List;

/**
 * 企业荣誉
 *
 * @author 自动生成
 */
public class EnterpriseHonor {


    /**
     * 主键
     */
    private Integer id;


    /**
     * 内容
     */
    private String content;


    /**
     * 年限图
     */
    private String image;

    /**
     * 图片
     */
    private List images;


    public List getImages() {
        return images;
    }

    public void setImages(List images) {
        this.images = images;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }


    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }


    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return this.image;
    }


}