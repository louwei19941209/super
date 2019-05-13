package com.springmvc.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * @program: webssm
 * @description: 用户 实体
 * @author: lou wei
 * @create: 2018-09-14 14:47
 **/
@ApiModel
public class SyUsers {

    @ApiModelProperty("用户ID 自动生成")
    private String id;

    @ApiModelProperty("[必填] 用户账号")
    private String userName;

    @ApiModelProperty("[必填] 用户真实姓名")
    private String trueName;

    @ApiModelProperty("[必填] 用户密码")
    private String userPassword;

    @ApiModelProperty("注册时间自动生成")
    private Date registerTime;

    @ApiModelProperty("[不需要填写] 最后登录时间由后台控制")
    private Date lastLoginTime;

    private String lastLoginIp;

    private Date errorTime;

    private Integer errorCount;

    private Short userStatus;

    @ApiModelProperty("[必填] 部门ID")
    private String deptId;

    @ApiModelProperty("[非必填] 用户说明")
    private String userDesc;

    @ApiModelProperty("[非必填] 用户性别")
    private Short userSex;

    private String registerUid;

    @ApiModelProperty("[必填] 用户手机号")
    private String mobilePhoneNumber;

    private String regions;

    private Integer type;

    //用户在返回时记录部门名称
    private String deptName;

    //用户角色查询
    private List<String> ids;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Date getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(Date errorTime) {
        this.errorTime = errorTime;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public Short getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Short userStatus) {
        this.userStatus = userStatus;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }

    public Short getUserSex() {
        return userSex;
    }

    public void setUserSex(Short userSex) {
        this.userSex = userSex;
    }

    public String getRegisterUid() {
        return registerUid;
    }

    public void setRegisterUid(String registerUid) {
        this.registerUid = registerUid == null ? null : registerUid.trim();
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber == null ? null : mobilePhoneNumber.trim();
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions == null ? null : regions.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

}