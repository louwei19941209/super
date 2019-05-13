package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.DevelopmentPath;
import com.springmvc.service.DevelopmentPathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端发展历程 控制器
 * @author: lou wei
 * @create: 2019-04-17 10:19
 **/
@Controller
@RequestMapping("web/develop")
public class WebDevelopingController {

    @Autowired
    private DevelopmentPathService developmentPathService;

    @RequestMapping("develop")
    public String develop(ModelMap map) {

        PageParam pageParam = new PageParam();
        pageParam.setDefaultUseFlag(false);

        DevelopmentPath event = new DevelopmentPath();

        map.addAttribute("event", developmentPathService.queryFullPage(pageParam, event));

        return "app/company/course/event";
    }

}
