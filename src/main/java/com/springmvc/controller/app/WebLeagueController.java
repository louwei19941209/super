package com.springmvc.controller.app;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.po.League;
import com.springmvc.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: super
 * @description: 前端加盟 控制器
 * @author: lou wei
 * @create: 2019-04-18 15:49
 **/
@Controller
@RequestMapping("web/league")
public class WebLeagueController extends BaseAction {

    @Autowired
    private LeagueService leagueService;

    @RequestMapping("index")
    public String index() {
        return "app/join/league";
    }

    /**
     * 添加
     *
     * @param league {@link League}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(League league) {
        return ajaxDone(leagueService.addLeague(league));
    }

    /**
     * 查询城市
     *
     * @param id 省id
     * @return ModelAndView
     */
    @RequestMapping("select/city")
    public ModelAndView selectCity(String id) {
        return ajaxJson(leagueService.selectCity(id));
    }


}
