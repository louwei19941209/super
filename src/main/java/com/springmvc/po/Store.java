package com.springmvc.po;
/**
 * 门店风采表
 * @author  自动生成
 */
public class Store {


    /**
     * 主键id
     */
     private Integer id;


    /**
     * 标题
     */
     private String title;


    /**
     * 内容
     */
     private String content;



    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }


    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }


}