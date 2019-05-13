package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Hexin;
import com.springmvc.service.HexinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端加盟 控制器
 * @author: lou wei
 * @create: 2019-05-13 10:17
 **/
@Controller
@RequestMapping("web/jiameng")
public class WebJiaMengController {

    @Autowired
    private HexinService hexinService;


    @RequestMapping("index")
    public String index(ModelMap map, PageParam param) {

        param.setDefaultUseFlag(false);
        Hexin hexin = new Hexin();

        map.addAttribute("core", hexinService.queryFullPage(param, hexin));

        return "app/join/jiameng";
    }

}
