package com.springmvc.po;

/**
 * 联系我们
 *
 * @author 自动生成
 */
public class Contact {


    /**
     *
     */
    private Integer id;


    /**
     * 公司名称
     */
    private String company;


    /**
     * 地址
     */
    private String address;

    /**
     * 电话
     */
    private String phone;


    /**
     * 网址
     */
    private String url;


    /**
     * 邮箱
     */
    private String email;


    /**
     * 公众号
     */
    private String noPublic;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }


    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }


    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }


    public void setNoPublic(String noPublic) {
        this.noPublic = noPublic;
    }

    public String getNoPublic() {
        return this.noPublic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}