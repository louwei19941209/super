package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Protection;
import com.springmvc.service.ProtectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 售后保障表控制器
 *
 * @author 自动生成
 * @version $Id: protectionService.java, v 0.1  2019-4-12 9:33:11  自动生成 Exp $
 */
@Controller
@RequestMapping("protection")
public class ProtectionController extends BaseAction {

    @Autowired
    private ProtectionService protectionService;

    /**
     * 列表页面
     *
     * @return String
     */
    @RequestMapping("load")
    public String load() {
        return "protection/after_sale/load";
    }

    /**
     * 添加页面
     *
     * @return String
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "protection/after_sale/add";
    }

    /**
     * 添加
     *
     * @param protection {@link Protection}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(Protection protection) {
        return ajaxDone(protectionService.addProtection(protection));
    }

    /**
     * 删除
     *
     * @param ids 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(protectionService.deleteProtection(ids));
    }

    /**
     * 修改
     *
     * @param protection {@link Protection}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(Protection protection) {
        return ajaxDone(protectionService.updateProtection(protection));
    }

    /**
     * 分页查看
     *
     * @param param      {@link PageParam}
     * @param protection {@link Protection}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, Protection protection) {
        return ajaxJson(protectionService.queryFullPage(param, protection));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        Protection protection = protectionService.details(id);
        if (protection == null) {
            return NODATA;
        }
        map.addAttribute("protection", protection);
        return "protection/after_sale/update";
    }

}