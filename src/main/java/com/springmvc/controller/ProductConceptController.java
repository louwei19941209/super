package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.ProductConcept;
import com.springmvc.service.ProductConceptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 产品理念表控制器
 * @author   自动生成
 * @version $Id: productConceptService.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
@Controller
@RequestMapping("productconcept")
public class ProductConceptController extends BaseAction {

    @Autowired
    private ProductConceptService productConceptService;


    /**
     * 添加
     * @param productConcept  {@link ProductConcept}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(ProductConcept productConcept) {
        return ajaxDone(productConceptService.addProductConcept(productConcept));
    }

    /**
     * 删除
     * @param id  主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(int id) {
        return ajaxDone(productConceptService.deleteProductConcept(id));
    }

    /**
     * 修改
     * @param productConcept  {@link ProductConcept}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(ProductConcept productConcept) {
        return ajaxDone(productConceptService.updateProductConcept(productConcept));
    }

    /**
     * 分页查看
     * @param  param {@link PageParam}
     * @param  productConcept  {@link ProductConcept}
     * @return ModelAndView
     */
     @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, ProductConcept productConcept) {
        return ajaxJson(productConceptService.queryFullPage(param, productConcept));
    }

    /**
     * 跳转修改页面
     * @param  id 主键id
     * @return String  返回的修改页面
     */
     @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        ProductConcept productConcept = productConceptService.details(id);
        if (productConcept == null) {
            return NODATA;
        }
        map.addAttribute("productConcept", productConcept);
        return "";
    }

}