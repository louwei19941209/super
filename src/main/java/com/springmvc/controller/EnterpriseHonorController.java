package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.FileList;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.EnterpriseHonor;
import com.springmvc.service.EnterpriseHonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.List;

/**
 * 企业荣誉控制器
 *
 * @author 自动生成
 * @version $Id: enterpriseHonorService.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
@Controller
@RequestMapping("enterprisehonor")
public class EnterpriseHonorController extends BaseAction {

    @Autowired
    private EnterpriseHonorService enterpriseHonorService;
    /**
     * 文件储存路径
     */
    private final static String SAVEPATH = BaseConfig.uploadPath + "honor";

    /**
     * 列表页面
     *
     * @return String
     */
    @RequestMapping("load")
    public String load() {
        return "company/honor/load";
    }

    /**
     * 添加页面
     *
     * @return
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "company/honor/add";
    }

    /**
     * 添加
     *
     * @param enterpriseHonor {@link EnterpriseHonor}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(EnterpriseHonor enterpriseHonor, FileList files) {

        File savePath = new File(SAVEPATH);
        if (!savePath.isDirectory() && !savePath.exists()) {
            savePath.mkdirs();
        }

        List<MultipartFile> getFile = files.getFile();
        if (getFile != null) {
            for (MultipartFile f : getFile) {
                if (f != null && !f.isEmpty()) {
                    ModelAndView view = FileUtils.validateFile(f, 1024L * 1024 * 500, null, new String[]{"exe"});
                    if (view != null) {
                        return view;
                    }
                }
            }
        }

        return ajaxDone(enterpriseHonorService.addEnterpriseHonor(enterpriseHonor, files, SAVEPATH));
    }

    /**
     * 删除
     *
     * @param ids 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(enterpriseHonorService.deleteEnterpriseHonor(ids));
    }

    /**
     * 修改
     *
     * @param enterpriseHonor {@link EnterpriseHonor}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(EnterpriseHonor enterpriseHonor, FileList files) {

        List<MultipartFile> getFile = files.getFile();
        if (getFile != null) {
            for (MultipartFile f : getFile) {
                if (f != null && !f.isEmpty()) {
                    ModelAndView view = FileUtils.validateFile(f, 1024L * 1024 * 500, null, new String[]{"exe"});
                    if (view != null) {
                        return view;
                    }
                }
            }
        }


        return ajaxDone(enterpriseHonorService.updateEnterpriseHonor(enterpriseHonor, files, SAVEPATH));
    }

    /**
     * 分页查看
     *
     * @param param           {@link PageParam}
     * @param enterpriseHonor {@link EnterpriseHonor}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, EnterpriseHonor enterpriseHonor) {
        return ajaxJson(enterpriseHonorService.queryFullPage(param, enterpriseHonor));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        EnterpriseHonor enterpriseHonor = enterpriseHonorService.details(id);
        if (enterpriseHonor == null) {
            return NODATA;
        }
        map.addAttribute("enterpriseHonor", enterpriseHonor);
        map.addAttribute("files", enterpriseHonorService.queryFiles(id));
        return "company/honor/update";
    }

}