package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.ImageManage;
import com.springmvc.service.ImageManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 图片管理表控制器
 * @author   自动生成
 * @version $Id: imageManageService.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
@Controller
@RequestMapping("imagemanage")
public class ImageManageController extends BaseAction {

    @Autowired
    private ImageManageService imageManageService;


    /**
     * 添加
     * @param imageManage  {@link ImageManage}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(ImageManage imageManage) {
        return ajaxDone(imageManageService.addImageManage(imageManage));
    }

    /**
     * 删除
     * @param id  主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(int id) {
        return ajaxDone(imageManageService.deleteImageManage(id));
    }

    /**
     * 修改
     * @param imageManage  {@link ImageManage}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(ImageManage imageManage) {
        return ajaxDone(imageManageService.updateImageManage(imageManage));
    }

    /**
     * 分页查看
     * @param  param {@link PageParam}
     * @param  imageManage  {@link ImageManage}
     * @return ModelAndView
     */
     @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, ImageManage imageManage) {
        return ajaxJson(imageManageService.queryFullPage(param, imageManage));
    }

    /**
     * 跳转修改页面
     * @param  id 主键id
     * @return String  返回的修改页面
     */
     @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        ImageManage imageManage = imageManageService.details(id);
        if (imageManage == null) {
            return NODATA;
        }
        map.addAttribute("imageManage", imageManage);
        return "";
    }

}