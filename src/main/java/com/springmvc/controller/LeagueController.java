package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.League;
import com.springmvc.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 申请加盟表控制器
 *
 * @author 自动生成
 * @version $Id: leagueService.java, v 0.1  2019-4-19 10:03:56  自动生成 Exp $
 */
@Controller
@RequestMapping("league")
public class LeagueController extends BaseAction {

    @Autowired
    private LeagueService leagueService;


    /**
     * 列表页面
     *
     * @return String
     */
    @RequestMapping("load")
    public String load() {
        return "join/league/load";
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
     * 删除
     *
     * @param id 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(int id) {
        return ajaxDone(leagueService.deleteLeague(id));
    }

    /**
     * 修改
     *
     * @param league {@link League}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(League league) {
        return ajaxDone(leagueService.updateLeague(league));
    }

    /**
     * 分页查看
     *
     * @param param  {@link PageParam}
     * @param league {@link League}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, League league) {
        return ajaxJson(leagueService.queryFullPage(param, league));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        League league = leagueService.details(id);
        if (league == null) {
            return NODATA;
        }
        map.addAttribute("league", league);
        return "join/league/add";
    }


}