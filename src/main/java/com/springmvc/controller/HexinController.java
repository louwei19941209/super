package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.Hexin;
import com.springmvc.service.HexinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

/**
 * 核心竞争控制器
 *
 * @author 自动生成
 * @version $Id: hexinService.java, v 0.1  2019-5-13 9:36:43  自动生成 Exp $
 */
@Controller
@RequestMapping("hexin")
public class HexinController extends BaseAction {

    @Autowired
    private HexinService hexinService;

    /**
     * 文件保存路径
     */
    public static final String SAVEPATH = BaseConfig.uploadPath + "jiameng";


    /**
     * 列表页面
     *
     * @return
     */
    @RequestMapping("load")
    public String load() {
        return "join/process/load";
    }

    /**
     * 添加页面
     *
     * @return
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "join/process/add";
    }


    /**
     * 添加
     *
     * @param hexin {@link Hexin}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(Hexin hexin, MultipartFile file) {

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


        return ajaxDone(hexinService.addHexin(hexin, file, SAVEPATH));
    }

    /**
     * 删除
     *
     * @param ids 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(hexinService.deleteHexin(ids));
    }

    /**
     * 修改
     *
     * @param hexin {@link Hexin}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(Hexin hexin, MultipartFile file) {
        return ajaxDone(hexinService.updateHexin(hexin, file, SAVEPATH));
    }

    /**
     * 分页查看
     *
     * @param param {@link PageParam}
     * @param hexin {@link Hexin}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, Hexin hexin) {
        return ajaxJson(hexinService.queryFullPage(param, hexin));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        Hexin hexin = hexinService.details(id);
        if (hexin == null) {
            return NODATA;
        }
        map.addAttribute("hexin", hexin);
        return "join/process/update";
    }

}