package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.IfbbNutritionTeam;
import com.springmvc.service.IfbbNutritionTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

/**
 * IFBB营养团队表控制器
 *
 * @author 自动生成
 * @version $Id: ifbbNutritionTeamService.java, v 0.1  2019-4-23 16:43:22  自动生成 Exp $
 */
@Controller
@RequestMapping("ifbbnutritionteam")
public class IfbbNutritionTeamController extends BaseAction {

    @Autowired
    private IfbbNutritionTeamService ifbbNutritionTeamService;
    /**
     * 文件保存路径
     */
    private final static String SAVEPATH = BaseConfig.uploadPath + "nutrition_team";

    /**
     * 列表页
     *
     * @return String
     */
    @RequestMapping("load")
    public String load() {
        return "ifbb/team/load";
    }

    /**
     * 添加页面
     *
     * @return String
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "ifbb/team/add";
    }

    /**
     * 添加
     *
     * @param ifbbNutritionTeam {@link IfbbNutritionTeam}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(IfbbNutritionTeam ifbbNutritionTeam, MultipartFile file) {

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

        return ajaxDone(ifbbNutritionTeamService.addIfbbNutritionTeam(ifbbNutritionTeam, file, SAVEPATH));
    }

    /**
     * 删除
     *
     * @param ids 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(ifbbNutritionTeamService.deleteIfbbNutritionTeam(ids));
    }

    /**
     * 修改
     *
     * @param ifbbNutritionTeam {@link IfbbNutritionTeam}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(IfbbNutritionTeam ifbbNutritionTeam, MultipartFile file) {

        if (file != null && !file.isEmpty()) {
            ModelAndView view = FileUtils.validateFile(file, 1024L * 1024 * 500, null, new String[]{"exe"});
            if (view != null) {
                return view;
            }
        }

        return ajaxDone(ifbbNutritionTeamService.updateIfbbNutritionTeam(ifbbNutritionTeam, file, SAVEPATH));
    }

    /**
     * 分页查看
     *
     * @param param             {@link PageParam}
     * @param ifbbNutritionTeam {@link IfbbNutritionTeam}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, IfbbNutritionTeam ifbbNutritionTeam) {
        return ajaxJson(ifbbNutritionTeamService.queryFullPage(param, ifbbNutritionTeam));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        IfbbNutritionTeam ifbbNutritionTeam = ifbbNutritionTeamService.details(id);
        if (ifbbNutritionTeam == null) {
            return NODATA;
        }
        map.addAttribute("ifbbNutritionTeam", ifbbNutritionTeam);
        return "ifbb/team/update";
    }

}