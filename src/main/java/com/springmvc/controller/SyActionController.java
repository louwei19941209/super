package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.ServletUtil;
import com.springmvc.po.SyAction;
import com.springmvc.service.SyActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/*
此表与菜单表关联，用户给菜单添加一些(crud)操作权限
 */

/**
 * @program: webssm
 * @description: 菜单操作管理，控制层
 * @author: lou wei
 * @create: 2018-09-26 14:07
 **/
@Controller
@RequestMapping("action")
public class SyActionController extends BaseAction {
    @Autowired
    private SyActionService syActionService;

    /**
     * @Description: 查询action
     * @Param: [param, action]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/26
     */
    @RequestMapping("query")
    public ModelAndView queryAction(PageParam param, SyAction action) {
        return ajaxJson(syActionService.selectAction(param, action));
    }

    /**
     * @Description: 跳转到action添加页面
     * @Param: []
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "system/menu/action/add";
    }

    /**
     * @Description: action详情
     * @Param: [id, map]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @RequestMapping("updatePage")
    public String updatePage(String id, ModelMap map) {
        if (!ServletUtil.isDeveloper()) {
            return NOPOWER;
        }
        SyAction action = syActionService.selectActionById(id);
        if (action == null) {
            return NODATA;
        }
        map.addAttribute("act", action);
        return "system/menu/action/update";
    }

    /**
     * @Description: 给菜单添加action
     * @Param: [action]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @RequestMapping("add")
    public ModelAndView addAction(SyAction action) {
        if (!ServletUtil.isDeveloper()) {
            return ajaxDoneError(MsgConfig.MSG_KEY_NOPOWER);
        }
        return ajaxDone(syActionService.addAction(action));
    }

    /**
     * @Description: 修改action
     * @Param: [action]
     * @return: org.springframework.web.servlet.ModelAndView
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @RequestMapping("update")
    public ModelAndView updateAction(SyAction action) {
        if (!ServletUtil.isDeveloper()) {
            return ajaxDoneError(MsgConfig.MSG_KEY_NOPOWER);
        }
        return ajaxDone(syActionService.updateAction(action));
    }

    @RequestMapping("delete")
    public ModelAndView deleteAction(String[] ids) {
        if (!ServletUtil.isDeveloper()) {
            return ajaxDoneError(MsgConfig.MSG_KEY_NOPOWER);
        }
        return ajaxDone(syActionService.deleteAction(ids));
    }
}
