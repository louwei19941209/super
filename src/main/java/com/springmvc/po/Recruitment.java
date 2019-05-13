package com.springmvc.po;
/**
 * 招聘信息表表
 * @author  自动生成
 */
public class Recruitment {


    /**
     * 主键
     */
     private Long id;


    /**
     * 职务
     */
     private String position;


    /**
     * 人数  招聘人数
     */
     private String number;


    /**
     * 招聘限制
     */
     private String restricts;


    /**
     * 任职资格
     */
     private String qualifications;


    /**
     * 工资待遇
     */
     private String treatment;

    /**
     * 发送简历地址
     */
    private String resume;


    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }


    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }


    public void setRestricts(String restricts) {
        this.restricts = restricts;
    }

    public String getRestricts() {
        return this.restricts;
    }


    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getQualifications() {
        return this.qualifications;
    }


    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getTreatment() {
        return this.treatment;
    }


}