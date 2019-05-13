package com.springmvc.po;

import java.util.Date;

/**
 * 新闻表
 *
 * @author 自动生成
 */
public class News {


    /**
     * 主键id
     */
    private Integer id;


    /**
     * 标题
     */
    private String titile;


    /**
     * 类别
     */
    private String type;


    /**
     * 内容
     */
    private String content;


    /**
     * 图片
     */
    private String image;


    /**
     * 视频
     */
    private String video;

    /**
     * 创建时间
     */
    private Date createTime;


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

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


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
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


    public void setVideo(String video) {
        this.video = video;
    }

    public String getVideo() {
        return this.video;
    }


}