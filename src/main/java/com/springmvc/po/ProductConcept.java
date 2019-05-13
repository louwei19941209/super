package com.springmvc.po;
/**
 * 产品理念表
 * @author  自动生成
 */
public class ProductConcept {


    /**
     * 主键
     */
     private Integer id;


    /**
     * 内容
     */
     private String content;


    /**
     * 图片展示
     */
     private String image;



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