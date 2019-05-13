package com.springmvc.mapper;

import com.springmvc.po.SyMenu;

import java.util.List;
import java.util.Map;

public interface SyMenuMapper {
    int deleteByPrimaryKey(String id);

    int insert(SyMenu record);

    int insertSelective(SyMenu record);

    SyMenu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SyMenu record);

    int updateByPrimaryKey(SyMenu record);

    /**根据条件查询**/
    SyMenu selectByCondition(SyMenu menu);

    /**根据父id查询子菜单**/
    List<SyMenu> selectChild(String id);

    /**根据用户角色查询所有顶级菜单**/
    List selectMenusTopByUserRole(List<String> roleIds);

    /**查询所有顶级菜单**/
    List selectMenusTop();

    /**查询用户自定义菜单**/
    List selectUserCustomizeMenu(String userId);

    /**查询用户菜单列表**/
    List<SyMenu> selectMyMenus(List<String> roleIds);

    //List<SyMenu> AllMenus(List<String> roleIds);

    /**查询所有菜单列表**/
    List<SyMenu> selectAllMenus();

    /**查询详情，带父类名称**/
    Map selectDetailsById(String id);


}