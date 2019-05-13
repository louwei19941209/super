package com.springmvc.po;
/**
 * 售后保障表
 * @author  自动生成
 */
public class Protection {


    /**
     * 主键id
     */
     private Integer id;


    /**
     * 标题
     */
     private String titile;


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