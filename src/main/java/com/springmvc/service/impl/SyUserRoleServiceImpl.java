package com.springmvc.service.impl;

import com.springmvc.mapper.SyUserRoleMapper;
import com.springmvc.service.SyUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: webssm
 * @description: 用户角色，实现层
 * @author: lou wei
 * @create: 2018-09-07 10:41
 */
@Service
public class SyUserRoleServiceImpl implements SyUserRoleService
{
    @Autowired
    private SyUserRoleMapper syUserRoleMapper;

    /**
    * @Description: 根据用户id获取所有角色ids
    * @Param: [userId]
    * @return: java.util.List<java.lang.String>
    * @Author: lou wei
    * @Date: 2018/9/20
    */
    @Override
    public List<String> selectByUserAllRole(String userId)
    {
        return syUserRoleMapper.selectByUserAllRole(userId);
    }
}
