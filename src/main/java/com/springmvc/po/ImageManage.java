package com.springmvc.po;
/**
 * 图片管理表
 * @author  自动生成
 */
public class ImageManage {


    /**
     * 主键
     */
     private Long id;


    /**
     * 类别
     */
     private String type;


    /**
     * 图片地址
     */
     private String url;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }


    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }


}