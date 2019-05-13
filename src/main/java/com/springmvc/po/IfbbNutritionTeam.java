package com.springmvc.po;
/**
 * IFBB营养团队表
 * @author  自动生成
 */
public class IfbbNutritionTeam {


    /**
     * 主键
     */
     private Integer id;


    /**
     * 名称
     */
     private String name;


    /**
     * 身份
     */
     private String identity;


    /**
     * 简介
     */
     private String introduction;


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


    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getIdentity() {
        return this.identity;
    }


    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getIntroduction() {
        return this.introduction;
    }


    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return this.image;
    }


}