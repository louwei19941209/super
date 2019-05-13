package com.springmvc.po;

/**
 * 创始人表
 *
 * @author 自动生成
 */
public class Founder {


    /**
     * 主键
     */
    private Integer id;


    /**
     * 名称
     */
    private String name;


    /**
     * 人物简介
     */
    private String biography;

    /**
     * 人物图片
     */
    private String image;


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


    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getBiography() {
        return this.biography;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}