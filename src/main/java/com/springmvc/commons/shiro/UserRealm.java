package com.springmvc.commons.shiro;

import com.springmvc.service.SyUsersService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Map;

/**
 * @program: webssm
 * @description: shiro获取用户的角色和权限信息
 * @author: lou wei
 * @create: 2018-09-06 16:53
 */
public class UserRealm extends AuthorizingRealm {
    @Autowired
    private SyUsersService userService;

    /**
     * 提供用户信息返回权限信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("开始授权查询");
        String userId = (String) principalCollection.getPrimaryPrincipal();
        Map<String, Collection<String>> map = userService.selectByUserAllPower(userId);
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addRoles(map.get("roleIds"));
        authorizationInfo.addStringPermissions(map.get("powers"));
        return authorizationInfo;
    }

    /**
     * 提供账户信息返回认证信息
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        System.out.println("登录认证" + getName());

        return new SimpleAuthenticationInfo(token.getUsername(), new String(token.getPassword()), getName());
    }
}
