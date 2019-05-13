package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.IfbbTeamDetails;
import com.springmvc.service.IfbbTeamDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * IFBB团队详情表控制器
 * @author   自动生成
 * @version $Id: ifbbTeamDetailsService.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
@Controller
@RequestMapping("ifbbteamdetails")
public class IfbbTeamDetailsController extends BaseAction {

    @Autowired
    private IfbbTeamDetailsService ifbbTeamDetailsService;


    /**
     * 添加
     * @param ifbbTeamDetails  {@link IfbbTeamDetails}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(IfbbTeamDetails ifbbTeamDetails) {
        return ajaxDone(ifbbTeamDetailsService.addIfbbTeamDetails(ifbbTeamDetails));
    }

    /**
     * 删除
     * @param id  主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(int id) {
        return ajaxDone(ifbbTeamDetailsService.deleteIfbbTeamDetails(id));
    }

    /**
     * 修改
     * @param ifbbTeamDetails  {@link IfbbTeamDetails}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(IfbbTeamDetails ifbbTeamDetails) {
        return ajaxDone(ifbbTeamDetailsService.updateIfbbTeamDetails(ifbbTeamDetails));
    }

    /**
     * 分页查看
     * @param  param {@link PageParam}
     * @param  ifbbTeamDetails  {@link IfbbTeamDetails}
     * @return ModelAndView
     */
     @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, IfbbTeamDetails ifbbTeamDetails) {
        return ajaxJson(ifbbTeamDetailsService.queryFullPage(param, ifbbTeamDetails));
    }

    /**
     * 跳转修改页面
     * @param  id 主键id
     * @return String  返回的修改页面
     */
     @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        IfbbTeamDetails ifbbTeamDetails = ifbbTeamDetailsService.details(id);
        if (ifbbTeamDetails == null) {
            return NODATA;
        }
        map.addAttribute("ifbbTeamDetails", ifbbTeamDetails);
        return "";
    }

}