package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Store;
import com.springmvc.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 门店风采表控制器
 * @author   自动生成
 * @version $Id: storeService.java, v 0.1  2019-4-19 10:03:56  自动生成 Exp $
 */
@Controller
@RequestMapping("store")
public class StoreController extends BaseAction {

    @Autowired
    private StoreService storeService;


    /**
     * 添加
     * @param store  {@link Store}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(Store store) {
        return ajaxDone(storeService.addStore(store));
    }

    /**
     * 删除
     * @param id  主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(int id) {
        return ajaxDone(storeService.deleteStore(id));
    }

    /**
     * 修改
     * @param store  {@link Store}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(Store store) {
        return ajaxDone(storeService.updateStore(store));
    }

    /**
     * 分页查看
     * @param  param {@link PageParam}
     * @param  store  {@link Store}
     * @return ModelAndView
     */
     @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, Store store) {
        return ajaxJson(storeService.queryFullPage(param, store));
    }

    /**
     * 跳转修改页面
     * @param  id 主键id
     * @return String  返回的修改页面
     */
     @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        Store store = storeService.details(id);
        if (store == null) {
            return NODATA;
        }
        map.addAttribute("store", store);
        return "";
    }

}