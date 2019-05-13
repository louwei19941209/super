package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.CompanyProfile;
import com.springmvc.service.CompanyProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

/**
 * 企业简介表控制器
 *
 * @author 自动生成
 * @version $Id: companyProfileService.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
@Controller
@RequestMapping("companyprofile")
public class CompanyProfileController extends BaseAction {

    @Autowired
    private CompanyProfileService companyProfileService;

    /**
     * 文件保存目录
     */
    private static final String SAVEPATH = BaseConfig.uploadPath + "profile";

    /**
     * 列表页面
     *
     * @return String 列表页
     */
    @RequestMapping("/load")
    public String load() {
        return "company/profile/load";
    }

    /**
     * 添加页面
     *
     * @return String 添加页面
     */
    @RequestMapping("/addPage")
    public String addPage() {
        return "company/profile/add";
    }

    /**
     * 添加
     *
     * @param companyProfile {@link CompanyProfile}
     * @param file           {@link MultipartFile}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(MultipartFile file, CompanyProfile companyProfile) {

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

        return ajaxDone(companyProfileService.addCompanyProfile(companyProfile, file, SAVEPATH));
    }

    /**
     * 删除
     *
     * @param ids 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(companyProfileService.deleteCompanyProfile(ids));
    }

    /**
     * 修改
     *
     * @param companyProfile {@link CompanyProfile}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(MultipartFile file, CompanyProfile companyProfile) {
        return ajaxDone(companyProfileService.updateCompanyProfile(companyProfile, file, SAVEPATH));
    }

    /**
     * 分页查看
     *
     * @param param          {@link PageParam}
     * @param companyProfile {@link CompanyProfile}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, CompanyProfile companyProfile) {
        return ajaxJson(companyProfileService.queryFullPage(param, companyProfile));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(CompanyProfile record, ModelMap map) {
        CompanyProfile companyProfile = companyProfileService.details(record);
        if (companyProfile == null) {
            return NODATA;
        }
        map.addAttribute("companyProfile", companyProfile);
        return "company/profile/update";
    }

}