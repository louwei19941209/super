package com.springmvc.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 企业简介表
 *
 * @author 自动生成
 */
public class CompanyProfile {


    /**
     * 主键
     */
    private Long id;


    /**
     * 公司名称
     */
    private String name;


    /**
     * 公司简介
     */
    private String introduction;

    /**
     * 公司展示 状态 1、首页 2、详情上半部 3、详情下半部分
     */
    private Integer status;


    /**
     * 成立时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date established;


    /**
     * 公司图片
     */
    private String image;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }


    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getIntroduction() {
        return this.introduction;
    }


    public void setEstablished(Date established) {
        this.established = established;
    }

    public Date getEstablished() {
        return this.established;
    }


    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return this.image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}