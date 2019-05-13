package com.springmvc.po;
/**
 * 发展历程表
 * @author  自动生成
 */
public class DevelopmentPath {


    /**
     * 主键
     */
     private Long id;


    /**
     * 内容
     */
     private String content;


    /**
     * 年份图片
     */
     private String image;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
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