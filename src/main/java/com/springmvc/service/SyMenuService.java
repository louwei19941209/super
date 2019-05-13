package com.springmvc.service;

import com.springmvc.commons.model.Menu;
import com.springmvc.po.SyMenu;

import java.util.List;
import java.util.Map;

public interface SyMenuService
{
    /**
     * 查询所有顶级菜单
     */
    List selectMenusTop();

    /**
     * 查询用户自定义菜单
     */
    List selectUserCustomizeMenu(String userId);

    /**
     * 根据id获取菜单信息
     * @return
     */
    SyMenu selectMenuById(String menuId);

    /**
     * 查询用户菜单列表
     * @return
     */
    List<SyMenu> selectMyMenus();

    /**
     * 获取菜单的子菜单
     * @param list
     * @param menu
     * @param superId
     */
    void getChildrenMenusBySuperId(List<SyMenu> list, Menu menu, String superId);

    /**
     * 查询所有菜单
     * @return
     */
    List<SyMenu> selectAllMenus();

    /**
     * 查询菜单详情，带父类名称
     * @param id
     * @return
     */
    Map selectMenusById(String id);

    /**
     * 修改菜单
     * @param menu
     * @return
     */
    String updateMenu(SyMenu menu);

    /**
     * 查询菜单图标
     * @return
     */
    String[] selectMenusIcons();

    /**
     * 添加菜单
     * @param menu
     * @return
     */
    String addMenu(SyMenu menu);

    /**
     * 删除菜单
     * @param id
     * @return
     */
    String deleteMenu(String id);

}
