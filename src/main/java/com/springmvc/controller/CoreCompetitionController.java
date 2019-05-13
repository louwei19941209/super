package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.CoreCompetition;
import com.springmvc.service.CoreCompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

/**
 * 核心竞争表控制器
 *
 * @author 自动生成
 * @version $Id: corecompetitionService.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
@Controller
@RequestMapping("corecompetition")
public class CoreCompetitionController extends BaseAction {

    @Autowired
    private CoreCompetitionService corecompetitionService;

    /**
     * 文件保存路径
     */
    public static final String SAVEPATH = BaseConfig.uploadPath + "protection";


    /**
     * 列表页面
     *
     * @return String
     */
    @RequestMapping("/load")
    public String load() {
        return "protection/core_competition/load";
    }

    /**
     * 添加页面
     *
     * @return String
     */
    @RequestMapping("/addPage")
    public String addPage() {
        return "protection/core_competition/add";
    }

    /**
     * 添加
     *
     * @param corecompetition {@link CoreCompetition}
     * @param file            {@link MultipartFile}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(CoreCompetition corecompetition, MultipartFile file) {

        File pathFile = new File(SAVEPATH);

        if (!pathFile.exists() && !pathFile.isDirectory()) {
            boolean mkdirs = pathFile.mkdirs();
        }

        if (file != null && !file.isEmpty()) {
            ModelAndView view = FileUtils.validateFile(file, 1024L * 1024 * 500, null, new String[]{"exe"});
            if (view != null) {
                return view;
            }
        }

        return ajaxDone(corecompetitionService.addCoreCompetition(corecompetition, file, SAVEPATH));
    }

    /**
     * 删除
     *
     * @param ids 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(corecompetitionService.deleteCoreCompetition(ids));
    }

    /**
     * 修改
     *
     * @param corecompetition {@link CoreCompetition}
     * @param file            {@link MultipartFile}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(CoreCompetition corecompetition, MultipartFile file) {

        File pathFile = new File(SAVEPATH);

        if (!pathFile.exists() && !pathFile.isDirectory()) {
            boolean mkdirs = pathFile.mkdirs();
        }

        if (file != null && !file.isEmpty()) {
            ModelAndView view = FileUtils.validateFile(file, 1024L * 1024 * 500, null, new String[]{"exe"});
            if (view != null) {
                return view;
            }
        }

        return ajaxDone(corecompetitionService.updateCoreCompetition(corecompetition, file, SAVEPATH));
    }

    /**
     * 分页查看
     *
     * @param param           {@link PageParam}
     * @param corecompetition {@link CoreCompetition}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, CoreCompetition corecompetition) {
        return ajaxJson(corecompetitionService.queryFullPage(param, corecompetition));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        CoreCompetition corecompetition = corecompetitionService.details(id);
        if (corecompetition == null) {
            return NODATA;
        }
        map.addAttribute("corecompetition", corecompetition);
        return "protection/core_competition/update";
    }

}