package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.ImageSpace;
import com.springmvc.service.ImageSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 图片空间 图片类型控制器
 * @author   自动生成
 * @version $Id: imageSpaceService.java, v 0.1  2019-4-9 16:00:01  自动生成 Exp $
 */
@Controller
@RequestMapping("imagespace")
public class ImageSpaceController extends BaseAction {

    @Autowired
    private ImageSpaceService imageSpaceService;


    /**
     * 添加
     * @param imageSpace  {@link ImageSpace}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(ImageSpace imageSpace) {
        return ajaxDone(imageSpaceService.addImageSpace(imageSpace));
    }

    /**
     * 删除
     * @param id  主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(int id) {
        return ajaxDone(imageSpaceService.deleteImageSpace(id));
    }

    /**
     * 修改
     * @param imageSpace  {@link ImageSpace}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(ImageSpace imageSpace) {
        return ajaxDone(imageSpaceService.updateImageSpace(imageSpace));
    }

    /**
     * 分页查看
     * @param  param {@link PageParam}
     * @param  imageSpace  {@link ImageSpace}
     * @return ModelAndView
     */
     @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, ImageSpace imageSpace) {
        return ajaxJson(imageSpaceService.queryFullPage(param, imageSpace));
    }

    /**
     * 跳转修改页面
     * @param  id 主键id
     * @return String  返回的修改页面
     */
     @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        ImageSpace imageSpace = imageSpaceService.details(id);
        if (imageSpace == null) {
            return NODATA;
        }
        map.addAttribute("imageSpace", imageSpace);
        return "";
    }

}