package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.IfbbStrategy;
import com.springmvc.service.IfbbStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端ifbb战略 控制器
 * @author: lou wei
 * @create: 2019-04-26 11:01
 **/
@Controller
@RequestMapping("web/ifbb/strategy")
public class WebIfbbStrategyController {

    @Autowired
    private IfbbStrategyService ifbbStrategyService;


    @RequestMapping("index")
    public String index(PageParam param, IfbbStrategy ifbbStrategy, ModelMap map) {

        param.setRows(1);

        map.addAttribute("n", ifbbStrategyService.queryFullPage(param, ifbbStrategy));

        return "app/ifbb/IFBBzlhz";

    }

}
