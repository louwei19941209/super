package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Recruitment;
import com.springmvc.service.RecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 招聘信息表表控制器
 *
 * @author 自动生成
 * @version $Id: recruitmentService.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
@Controller
@RequestMapping("recruitment")
public class RecruitmentController extends BaseAction {

    @Autowired
    private RecruitmentService recruitmentService;


    /**
     * 列表页面
     *
     * @return
     */
    @RequestMapping("load")
    public String load() {
        return "contact/recruitment/load";
    }

    /**
     * 添加页面
     *
     * @return
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "contact/recruitment/add";
    }

    /**
     * 添加
     *
     * @param recruitment {@link Recruitment}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(Recruitment recruitment) {
        return ajaxDone(recruitmentService.addRecruitment(recruitment));
    }

    /**
     * 删除
     *
     * @param ids 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(recruitmentService.deleteRecruitment(ids));
    }

    /**
     * 修改
     *
     * @param recruitment {@link Recruitment}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(Recruitment recruitment) {
        return ajaxDone(recruitmentService.updateRecruitment(recruitment));
    }

    /**
     * 分页查看
     *
     * @param param       {@link PageParam}
     * @param recruitment {@link Recruitment}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, Recruitment recruitment) {
        return ajaxJson(recruitmentService.queryFullPage(param, recruitment));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        Recruitment recruitment = recruitmentService.details(id);
        if (recruitment == null) {
            return NODATA;
        }
        map.addAttribute("recruitment", recruitment);
        return "contact/recruitment/update";
    }

}