package com.springmvc.po;
/**
 * 售后表
 * @author  自动生成
 */
public class AfterSale {


    /**
     * 主键
     */
     private Long id;


    /**
     * 标题
     */
     private String titile;


    /**
     * 内容
     */
     private String content;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }


    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getTitile() {
        return this.titile;
    }


    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }


}