package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.Founder;
import com.springmvc.service.FounderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

/**
 * 创始人表控制器
 *
 * @author 自动生成
 * @version $Id: founderService.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
@Controller
@RequestMapping("founder")
public class FounderController extends BaseAction {

    @Autowired
    private FounderService founderService;
    /**
     * 文件储存路径
     */
    private final static String SAVEPATH = BaseConfig.uploadPath + "founder";

    /**
     * 列表页面
     *
     * @return
     */
    @RequestMapping("load")
    public String load() {
        return "company/founder/load";
    }

    /**
     * 添加页面
     *
     * @return
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "company/founder/add";
    }

    /**
     * 添加
     *
     * @param founder {@link Founder}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(Founder founder, MultipartFile file) {

        File savePath = new File(SAVEPATH);
        if (!savePath.isDirectory() && !savePath.exists()) {
            savePath.mkdirs();
        }

        if (file != null && !file.isEmpty()) {
            ModelAndView view = FileUtils.validateFile(file, 1024L * 1024 * 500, null, new String[]{"exe"});
            if (view != null) {
                return view;
            }
        }

        return ajaxDone(founderService.addFounder(founder, file, SAVEPATH));
    }

    /**
     * 删除
     *
     * @param ids 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(founderService.deleteFounder(ids));
    }

    /**
     * 修改
     *
     * @param founder {@link Founder}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(Founder founder, MultipartFile file) {
        return ajaxDone(founderService.updateFounder(founder, file, SAVEPATH));
    }

    /**
     * 分页查看
     *
     * @param param   {@link PageParam}
     * @param founder {@link Founder}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, Founder founder) {
        return ajaxJson(founderService.queryFullPage(param, founder));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        Founder founder = founderService.details(id);
        if (founder == null) {
            return NODATA;
        }
        map.addAttribute("founder", founder);
        return "company/founder/update";
    }

}