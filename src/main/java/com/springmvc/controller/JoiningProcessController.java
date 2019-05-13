package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.JoiningProcess;
import com.springmvc.service.JoiningProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 加盟流程表控制器
 * @author   自动生成
 * @version $Id: joiningProcessService.java, v 0.1  2019-4-19 10:03:55  自动生成 Exp $
 */
@Controller
@RequestMapping("joiningprocess")
public class JoiningProcessController extends BaseAction {

    @Autowired
    private JoiningProcessService joiningProcessService;


    /**
     * 添加
     * @param joiningProcess  {@link JoiningProcess}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(JoiningProcess joiningProcess) {
        return ajaxDone(joiningProcessService.addJoiningProcess(joiningProcess));
    }

    /**
     * 删除
     * @param id  主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(int id) {
        return ajaxDone(joiningProcessService.deleteJoiningProcess(id));
    }

    /**
     * 修改
     * @param joiningProcess  {@link JoiningProcess}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(JoiningProcess joiningProcess) {
        return ajaxDone(joiningProcessService.updateJoiningProcess(joiningProcess));
    }

    /**
     * 分页查看
     * @param  param {@link PageParam}
     * @param  joiningProcess  {@link JoiningProcess}
     * @return ModelAndView
     */
     @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, JoiningProcess joiningProcess) {
        return ajaxJson(joiningProcessService.queryFullPage(param, joiningProcess));
    }

    /**
     * 跳转修改页面
     * @param  id 主键id
     * @return String  返回的修改页面
     */
     @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        JoiningProcess joiningProcess = joiningProcessService.details(id);
        if (joiningProcess == null) {
            return NODATA;
        }
        map.addAttribute("joiningProcess", joiningProcess);
        return "";
    }

}