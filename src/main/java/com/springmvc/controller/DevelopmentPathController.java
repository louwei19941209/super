package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.DevelopmentPath;
import com.springmvc.service.DevelopmentPathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

/**
 * 发展历程表控制器
 *
 * @author 自动生成
 * @version $Id: developmentPathService.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
@Controller
@RequestMapping("developmentpath")
public class DevelopmentPathController extends BaseAction {

    @Autowired
    private DevelopmentPathService developmentPathService;

    /**
     * 文件保存路径
     */
    private static final String SAVEPATH = BaseConfig.uploadPath + "course";


    /**
     * 跳转 列表页面
     *
     * @return String
     */
    @RequestMapping("/load")
    public String load() {
        return "company/course/load";
    }

    /**
     * 跳转 添加页面
     *
     * @return String
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "company/course/add";
    }

    /**
     * 添加
     *
     * @param developmentPath {@link DevelopmentPath}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(DevelopmentPath developmentPath, MultipartFile file) {

        File savePath = new File(SAVEPATH);
        if (!savePath.isDirectory() && !savePath.exists()) {
            final boolean mkdirs = savePath.mkdirs();
        }

        if (file != null && !file.isEmpty()) {
            ModelAndView view = FileUtils.validateFile(file, 1024L * 1024 * 500, null, new String[]{"exe"});
            if (view != null) {
                return view;
            }
        }

        return ajaxDone(developmentPathService.addDevelopmentPath(developmentPath, file, SAVEPATH));
    }

    /**
     * 删除
     *
     * @param id 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(developmentPathService.deleteDevelopmentPath(ids));
    }

    /**
     * 修改
     *
     * @param developmentPath {@link DevelopmentPath}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(DevelopmentPath developmentPath, MultipartFile file) {

        File savePath = new File(SAVEPATH);
        if (!savePath.isDirectory() && !savePath.exists()) {
            final boolean mkdirs = savePath.mkdirs();
        }

        if (file != null && !file.isEmpty()) {
            ModelAndView view = FileUtils.validateFile(file, 1024L * 1024 * 500, null, new String[]{"exe"});
            if (view != null) {
                return view;
            }
        }

        return ajaxDone(developmentPathService.updateDevelopmentPath(developmentPath, file, SAVEPATH));
    }

    /**
     * 分页查看
     *
     * @param param           {@link PageParam}
     * @param developmentPath {@link DevelopmentPath}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, DevelopmentPath developmentPath) {
        return ajaxJson(developmentPathService.queryFullPage(param, developmentPath));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        DevelopmentPath developmentPath = developmentPathService.details(id);
        if (developmentPath == null) {
            return NODATA;
        }
        map.addAttribute("developmentPath", developmentPath);
        return "company/course/update";
    }

}