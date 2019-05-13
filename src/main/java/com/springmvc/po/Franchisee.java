package com.springmvc.po;

/**
 * 加盟商表
 *
 * @author 自动生成
 */
public class Franchisee {


    /**
     * 主键
     */
    private Long id;


    /**
     * 标题
     */
    private String title;


    /**
     * 专访人物
     */
    private String characters;


    /**
     * 人物身份
     */
    private String identity;


    /**
     * 详情
     */
    private String details;

    /**
     * 人物描述
     */
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }


    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public String getCharacters() {
        return this.characters;
    }


    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getIdentity() {
        return this.identity;
    }


    public void setDetails(String details) {
        this.details = details;
    }

    public String getDetails() {
        return this.details;
    }


}