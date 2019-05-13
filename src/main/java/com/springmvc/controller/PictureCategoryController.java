package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.PictureCategory;
import com.springmvc.service.PictureCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 图片类别表控制器
 * @author   自动生成
 * @version $Id: pictureCategoryService.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
@Controller
@RequestMapping("picturecategory")
public class PictureCategoryController extends BaseAction {

    @Autowired
    private PictureCategoryService pictureCategoryService;


    /**
     * 添加
     * @param pictureCategory  {@link PictureCategory}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(PictureCategory pictureCategory) {
        return ajaxDone(pictureCategoryService.addPictureCategory(pictureCategory));
    }

    /**
     * 删除
     * @param id  主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(int id) {
        return ajaxDone(pictureCategoryService.deletePictureCategory(id));
    }

    /**
     * 修改
     * @param pictureCategory  {@link PictureCategory}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(PictureCategory pictureCategory) {
        return ajaxDone(pictureCategoryService.updatePictureCategory(pictureCategory));
    }

    /**
     * 分页查看
     * @param  param {@link PageParam}
     * @param  pictureCategory  {@link PictureCategory}
     * @return ModelAndView
     */
     @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, PictureCategory pictureCategory) {
        return ajaxJson(pictureCategoryService.queryFullPage(param, pictureCategory));
    }

    /**
     * 跳转修改页面
     * @param  id 主键id
     * @return String  返回的修改页面
     */
     @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        PictureCategory pictureCategory = pictureCategoryService.details(id);
        if (pictureCategory == null) {
            return NODATA;
        }
        map.addAttribute("pictureCategory", pictureCategory);
        return "";
    }

}