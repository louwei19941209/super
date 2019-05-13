package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.IfbbNutritionTeam;
import com.springmvc.service.IfbbNutritionTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端ifbb营养师团队 控制器
 * @author: lou wei
 * @create: 2019-04-26 10:44
 **/
@Controller
@RequestMapping("web/ifbb/team")
public class WebIfbbTeamController {

    @Autowired
    private IfbbNutritionTeamService ifbbNutritionTeamService;

    @RequestMapping("index")
    public String index(PageParam param, ModelMap map, IfbbNutritionTeam nutritionTeam) {

        param.setRows(1);

        map.addAttribute("team", ifbbNutritionTeamService.queryFullPage(param, nutritionTeam));

        return "app/ifbb/IFBByystd1";
    }


}
