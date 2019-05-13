package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.Franchisee;
import com.springmvc.service.FranchiseeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

/**
 * 加盟商表控制器
 *
 * @author 自动生成
 * @version $Id: franchiseeService.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
@Controller
@RequestMapping("franchisee")
public class FranchiseeController extends BaseAction {

    @Autowired
    private FranchiseeService franchiseeService;

    /**
     * 文件保存路径
     */
    private static final String SAVEPATH = BaseConfig.uploadPath + "franchisee";

    /**
     * 跳转列表页面
     *
     * @return String
     */
    @RequestMapping("load")
    public String load() {
        return "join/franchisee/load";
    }

    /**
     * 跳转添加页面
     *
     * @return
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "join/franchisee/add";
    }


    /**
     * 添加
     *
     * @param franchisee {@link Franchisee}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(Franchisee franchisee, MultipartFile file) {

        File savePath = new File(SAVEPATH);
        if (!savePath.isDirectory() && !savePath.exists()) {
            System.out.println("文件不存在");
            final boolean mkdir = savePath.mkdirs();
        }

        if (file != null && !file.isEmpty()) {
            ModelAndView view = FileUtils.validateFile(file, 1024L * 1024 * 500, null, new String[]{"exe"});
            if (view != null) {
                return view;
            }
        }

        return ajaxDone(franchiseeService.addFranchisee(franchisee, file, SAVEPATH));
    }

    /**
     * 删除
     *
     * @param ids 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(franchiseeService.deleteFranchisee(ids));
    }

    /**
     * 修改
     *
     * @param franchisee {@link Franchisee}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(Franchisee franchisee, MultipartFile file) {
        return ajaxDone(franchiseeService.updateFranchisee(franchisee, file, SAVEPATH));
    }

    /**
     * 分页查看
     *
     * @param param      {@link PageParam}
     * @param franchisee {@link Franchisee}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, Franchisee franchisee) {
        return ajaxJson(franchiseeService.queryFullPage(param, franchisee));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        Franchisee franchisee = franchiseeService.details(id);
        if (franchisee == null) {
            return NODATA;
        }
        map.addAttribute("franchisee", franchisee);
        return "join/franchisee/update";
    }

}