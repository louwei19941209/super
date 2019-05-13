package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.CompanyCulture;
import com.springmvc.service.CompanyCultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

/**
 * 企业文化表控制器
 *
 * @author 自动生成
 * @version $Id: companycultureService.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
@Controller
@RequestMapping("companyculture")
public class CompanyCultureController extends BaseAction {

    @Autowired
    private CompanyCultureService companycultureService;

    /**
     * 图片保存路径
     */
    private static final String SAVEPATH = BaseConfig.uploadPath + "culture";

    /**
     * 跳转列表页面
     *
     * @return String 列表页面
     */
    @RequestMapping("/load")
    public String load() {
        return "company/culture/load";
    }

    /**
     * 跳转添加页面
     *
     * @return String 添加页面
     */
    @RequestMapping("/addPage")
    public String addPage() {
        return "company/culture/add";
    }

    /**
     * 添加
     *
     * @param companyculture {@link CompanyCulture}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(CompanyCulture companyculture, MultipartFile file) {

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

        return ajaxDone(companycultureService.addCompanyCulture(companyculture, file, SAVEPATH));
    }

    /**
     * 删除
     *
     * @param ids 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String ids) {
        return ajaxDone(companycultureService.deleteCompanyCulture(ids));
    }

    /**
     * 修改
     *
     * @param companyculture {@link CompanyCulture}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(CompanyCulture companyculture, MultipartFile file) {
        return ajaxDone(companycultureService.updateCompanyCulture(companyculture, file , SAVEPATH));
    }

    /**
     * 分页查看
     *
     * @param param          {@link PageParam}
     * @param companyculture {@link CompanyCulture}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, CompanyCulture companyculture) {
        return ajaxJson(companycultureService.queryFullPage(param, companyculture));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("/update/page")
    public String updatePage(Long id, ModelMap map) {
        CompanyCulture companyculture = companycultureService.details(id);
        if (companyculture == null) {
            return NODATA;
        }
        map.addAttribute("companyculture", companyculture);
        return "company/culture/update";
    }

}