package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.Menu;
import com.springmvc.commons.util.ServletUtil;
import com.springmvc.po.SyMenu;
import com.springmvc.service.SyMenuService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * @program: webssm
 * @description: 菜单管理 控制层
 * @author: lou wei
 * @create: 2018-09-21 15:09
 **/
@Controller
@RequestMapping("menu")
public class SyMenuController extends BaseAction {
    @Autowired
    private SyMenuService syMenuService;

    /**
     * @Description: 获取用户可以使用的菜单和一些用户基本信息
     * @Param: [id, map]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    @RequestMapping("my_menu")
    public String selectMenusById(String id, ModelMap map) {
        SyMenu m = syMenuService.selectMenuById(id);
        if (m != null) {
            map.addAttribute("name", m.getMenuName());
        }

        Menu menu = new Menu();
        syMenuService.getChildrenMenusBySuperId(syMenuService.selectMyMenus(), menu, id);
        List<Menu> list = menu.getChildrenMenus();
        StringBuffer sb = new StringBuffer();
        for (Menu l : list) {
            sb.append("<li><a ");
            if (l.getUrl() != null && !"".equals(l.getUrl())) {
                sb.append("href=\"");
                sb.append(l.getUrl());
                sb.append("\" target=\"").append(l.getTarget()).append("\" rel=\"").append(l.getRel()).append("\" external=\"");
                sb.append(l.getExternal()).append("\" fresh=\"false\" title=\"").append(l.getName()).append("\" ");
            } else {
                sb.append(" style=\"color: black;\" ");
            }
            sb.append(" ><img src=\"").append(l.getIcon()).append("\" />&nbsp;&nbsp;");
            sb.append(l.getName());
            sb.append("</a>");
            List<Menu> cs = l.getChildrenMenus();
            if (cs != null && !cs.isEmpty()) {
                sb.append("<ul class=\"ul-submenu\">");
                appendMenus(cs, sb);
                sb.append("</ul>");
            }
            sb.append("</li>");
        }
        map.addAttribute("menus", sb.toString());

        return "main/middle";
    }

    //递归拼接子菜单
    private void appendMenus(List<Menu> list, StringBuffer sb) {
        for (Menu l : list) {
            sb.append("<li><a ");

            if (l.getUrl() != null && !"".equals(l.getUrl())) {
                sb.append("href=\"");
                sb.append(l.getUrl());
                sb.append("\" target=\"").append(l.getTarget()).append("\" rel=\"").append(l.getRel()).append("\" external=\"");
                sb.append(l.getExternal()).append("\" fresh=\"false\" title=\"").append(l.getName()).append("\" ");
            } else {
                sb.append(" style=\"color: black;\" ");
            }
            sb.append(" ><img src=\"").append(l.getIcon()).append("\" />&nbsp;&nbsp;");
            sb.append(l.getName());
            sb.append("</a>");
            List<Menu> cs = l.getChildrenMenus();
            if (cs != null && !cs.isEmpty()) {
                sb.append("<ul class=\"ul-submenu\">");
                appendMenus(cs, sb);
                sb.append("</ul>");
            }
            sb.append("</li>");
        }
    }


    /**
     * @Description: 跳转到菜单管理页面 查询出所有菜单
     * @Param: []
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/24
     */
    @RequestMapping("load")
    @RequiresPermissions("menu:read")
    public String load() {
        return "system/menu/load";
    }

    /**
     * @Description: 查询所有菜单
     * @Param: [param]
     * @return: java.util.List<com.springmvc.po.SyMenu>
     * @Author: lou wei
     * @Date: 2018/9/24
     */
    @ResponseBody
    @RequestMapping("query")
    public List<SyMenu> query() {
        return syMenuService.selectAllMenus();
    }

    /**
     * @Description: 根据id获取菜单详情
     * @Param: [id]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/24
     */
    @RequestMapping("updatePage")
    @RequiresPermissions("menu:read")
    public String updatePage(String id, ModelMap map) {
        Map menu = syMenuService.selectMenusById(id);
        if (menu == null) {
            return NODATA;
        }
        map.addAttribute("m", menu);
        return "system/menu/update";
    }

    /**
     * @Description: 跳转到菜单添加页面
     * @Param: []
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    @RequestMapping("addPage")
    @RequiresPermissions("menu:read")
    public String addPage() {
        return "system/menu/add";
    }

    /**
     * @Description: 查询菜单图标
     * @Param: [map]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    @RequestMapping("icons")
    public String queryIcons(ModelMap map) {
        map.addAttribute("icons", syMenuService.selectMenusIcons());
        return "system/menu/icon_lookup";
    }

    /**
     * @Description: 添加菜单
     * @Param: [menu]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    @RequestMapping("add/menu")
    public ModelAndView addMenu(SyMenu menu) {
        if (!ServletUtil.isDeveloper()) {
            return ajaxDoneError(MsgConfig.MSG_KEY_NOPOWER);
        }
        return ajaxDone(syMenuService.addMenu(menu));
    }

    /**
     * @Description: 修改菜单
     * @Param: [menu]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    @RequestMapping("update/menu")
    @RequiresPermissions("menu:update")
    public ModelAndView updateMenu(SyMenu menu) {
        return ajaxDone(syMenuService.updateMenu(menu));
    }

    /**
     * @Description: 删除菜单
     * @Param: [id]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/25
     */
    @RequestMapping("delete/menu")
    public ModelAndView deleteMenu(String id) {
        if (!ServletUtil.isDeveloper()) {
            return ajaxDoneError(MsgConfig.MSG_KEY_NOPOWER);
        }
        return ajaxDone(syMenuService.deleteMenu(id));
    }

    /**
     * @Description: 菜单查找带回
     * @Param: []
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/26
     */
    @RequestMapping("lookUpPage")
    public String lookUp() {
        return "system/menu/lookup";
    }


}
