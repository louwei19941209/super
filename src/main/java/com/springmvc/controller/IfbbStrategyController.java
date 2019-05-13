package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.IfbbStrategy;
import com.springmvc.service.IfbbStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

/**
 * IFBB战略表控制器
 *
 * @author 自动生成
 * @version $Id: ifbbStrategyService.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
@Controller
@RequestMapping("ifbbstrategy")
public class IfbbStrategyController extends BaseAction {

    @Autowired
    private IfbbStrategyService ifbbStrategyService;
    /**
     * 文件保存路径
     */
    private final static String SAVEPATH = BaseConfig.uploadPath + "strategy";

    /**
     * 列表
     *
     * @return String
     */
    @RequestMapping("load")
    public String load() {
        return "ifbb/strategy/load";
    }

    /**
     * 添加页面
     *
     * @return String
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "ifbb/strategy/add";
    }

    /**
     * 添加
     *
     * @param ifbbStrategy {@link IfbbStrategy}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(IfbbStrategy ifbbStrategy, MultipartFile file) {

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

        return ajaxDone(ifbbStrategyService.addIfbbStrategy(ifbbStrategy, file, SAVEPATH));
    }

    /**
     * 删除
     *
     * @param ids 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(ifbbStrategyService.deleteIfbbStrategy(ids));
    }

    /**
     * 修改
     *
     * @param ifbbStrategy {@link IfbbStrategy}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(IfbbStrategy ifbbStrategy, MultipartFile file) {
        return ajaxDone(ifbbStrategyService.updateIfbbStrategy(ifbbStrategy, file, SAVEPATH));
    }

    /**
     * 分页查看
     *
     * @param param        {@link PageParam}
     * @param ifbbStrategy {@link IfbbStrategy}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, IfbbStrategy ifbbStrategy) {
        return ajaxJson(ifbbStrategyService.queryFullPage(param, ifbbStrategy));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        IfbbStrategy ifbbStrategy = ifbbStrategyService.details(id);
        if (ifbbStrategy == null) {
            return NODATA;
        }
        map.addAttribute("ifbbStrategy", ifbbStrategy);
        return "ifbb/strategy/update";
    }

}