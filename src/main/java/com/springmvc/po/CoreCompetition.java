package com.springmvc.po;

/**
 * 核心竞争表
 *
 * @author 自动生成
 */
public class CoreCompetition {


    /**
     * 主键
     */
    private Long id;


    /**
     * 序号 用于排序
     */
    private Integer number;


    /**
     * 标题
     */
    private String title;


    /**
     * 内容
     */
    private String content;


    /**
     * 序号图片 与排序序号一致
     */
    private String image;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }


    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return this.number;
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


    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return this.image;
    }


}