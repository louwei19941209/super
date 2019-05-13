package com.springmvc.service;

import java.util.List;

public interface SyUserRoleService
{
    //查询用户所有角色
    List<String> selectByUserAllRole(String userId);
}
