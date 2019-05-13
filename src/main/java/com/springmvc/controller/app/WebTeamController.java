package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.SportsTeam;
import com.springmvc.service.SportsTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端运动团队 控制器
 * @author: lou wei
 * @create: 2019-04-25 14:32
 **/
@Controller
@RequestMapping("web/team")
public class WebTeamController {

    @Autowired
    private SportsTeamService sportsTeamService;

    @RequestMapping("index")
    public String index(PageParam param, SportsTeam sportsTeam, ModelMap map) {

        map.addAttribute("team", sportsTeamService.queryFullPage(param, sportsTeam));

        return "app/company/team/team";
    }

    @RequestMapping("details")
    public String detail(int id, ModelMap map) {
        map.addAttribute("team", sportsTeamService.details(id));
        return "app/company/team/teamDetail";
    }

}
