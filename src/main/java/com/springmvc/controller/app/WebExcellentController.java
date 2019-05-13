package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Franchisee;
import com.springmvc.service.FranchiseeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端优秀加盟 控制器
 * @author: lou wei
 * @create: 2019-04-17 16:18
 **/
@Controller
@RequestMapping("web/excellent")
public class WebExcellentController {

    @Autowired
    private FranchiseeService franchiseeService;


    @RequestMapping("index")
    public String index(PageParam param, ModelMap map, Franchisee franchisee) {

        map.addAttribute("franchisee", franchiseeService.queryFullPage(param, franchisee));

        return "app/join/excellent";
    }

    @RequestMapping("detail")
    public String detail(int id, ModelMap map) {

        map.addAttribute("franchisee", franchiseeService.details(id));

        return "app/join/aboutDetail";
    }

}
