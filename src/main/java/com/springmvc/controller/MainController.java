package com.springmvc.controller;

import com.springmvc.commons.cache.MyCache;
import com.springmvc.commons.model.Member;
import com.springmvc.commons.util.ServletUtil;
import com.springmvc.service.SyMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @program: webssm
 * @description: 系统主界面
 * @author: lou wei
 * @create: 2018-09-20 11:36
 **/
@Controller
@RequestMapping("main")
public class MainController {

    @Autowired
    private SyMenuService syMenuService;

    /**
     * @Description: 跳转系统主页
     * @Param: []
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/20
     */
    @RequestMapping("")
    @SuppressWarnings({"rawtypes", "unchecked"})
    public String main(ModelMap map) {
        //查出顶部一级菜单
        map.addAttribute("menus", syMenuService.selectMenusTop());
        //查询用户自定义菜单
        List<Map<String, Object>> menus = syMenuService.selectUserCustomizeMenu(ServletUtil.getMember().getId());
        for (Map<String, Object> m : menus) {
            m.put("url", ((String) m.get("url")).replaceAll("rel=", "rel=my_"));//统一追加前缀 防止和正常菜单rel冲突
        }
        map.addAttribute("mymenus", menus);

        //用户基本信息
        Member me = ServletUtil.getMember();
        map.addAttribute("userId", me.getId());
        map.addAttribute("trueName", MyCache.getInstance().getUserName(me.getId()));
        map.addAttribute("deptId", me.getDeptId());
        map.addAttribute("deptName", MyCache.getInstance().getDeptName(me.getDeptId()));
        return "main/main";
    }
}
