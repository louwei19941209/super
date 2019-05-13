package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.AfterSale;
import com.springmvc.service.AfterSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 售后表控制器
 *
 * @author 自动生成
 * @version $Id: afterSaleService.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
@Controller
@RequestMapping("aftersale")
public class AfterSaleController extends BaseAction {

    @Autowired
    private AfterSaleService afterSaleService;


    /**
     * 添加
     *
     * @param afterSale {@link AfterSale}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(AfterSale afterSale) {
        return ajaxDone(afterSaleService.addAfterSale(afterSale));
    }

    /**
     * 删除
     *
     * @param id 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(int id) {
        return ajaxDone(afterSaleService.deleteAfterSale(id));
    }

    /**
     * 修改
     *
     * @param afterSale {@link AfterSale}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(AfterSale afterSale) {
        return ajaxDone(afterSaleService.updateAfterSale(afterSale));
    }

    /**
     * 分页查看
     *
     * @param param     {@link PageParam}
     * @param afterSale {@link AfterSale}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, AfterSale afterSale) {
        return ajaxJson(afterSaleService.queryFullPage(param, afterSale));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        AfterSale afterSale = afterSaleService.details(id);
        if (afterSale == null) {
            return NODATA;
        }
        map.addAttribute("afterSale", afterSale);
        return "";
    }

}