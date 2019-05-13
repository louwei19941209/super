package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.SportsTeam;
import com.springmvc.service.SportsTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

/**
 * 运动团队控制器
 *
 * @author 自动生成
 * @version $Id: sportsTeamService.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
@Controller
@RequestMapping("sportsteam")
public class SportsTeamController extends BaseAction {

    @Autowired
    private SportsTeamService sportsTeamService;
    /**
     * 文件储存路径
     */
    private final static String SAVEPATH = BaseConfig.uploadPath + "founder";

    /**
     * 列表
     *
     * @return
     */
    @RequestMapping("load")
    public String load() {
        return "company/steam/load";
    }

    /**
     * 添加
     *
     * @return
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "company/steam/add";
    }

    /**
     * 添加
     *
     * @param sportsTeam {@link SportsTeam}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(SportsTeam sportsTeam, MultipartFile file, MultipartFile dFile) {

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

        if (dFile != null && !dFile.isEmpty()) {
            ModelAndView view = FileUtils.validateFile(dFile, 1024L * 1024 * 500, null, new String[]{"exe"});
            if (view != null) {
                return view;
            }
        }

        return ajaxDone(sportsTeamService.addSportsTeam(sportsTeam, file, SAVEPATH, dFile));
    }

    /**
     * 删除
     *
     * @param ids 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(sportsTeamService.deleteSportsTeam(ids));
    }

    /**
     * 修改
     *
     * @param sportsTeam {@link SportsTeam}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(SportsTeam sportsTeam, MultipartFile file, MultipartFile dFile) {
        return ajaxDone(sportsTeamService.updateSportsTeam(sportsTeam, file, SAVEPATH, dFile));
    }

    /**
     * 分页查看
     *
     * @param param      {@link PageParam}
     * @param sportsTeam {@link SportsTeam}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, SportsTeam sportsTeam) {
        return ajaxJson(sportsTeamService.queryFullPage(param, sportsTeam));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        SportsTeam sportsTeam = sportsTeamService.details(id);
        if (sportsTeam == null) {
            return NODATA;
        }
        map.addAttribute("sportsTeam", sportsTeam);
        return "company/steam/update";
    }

}