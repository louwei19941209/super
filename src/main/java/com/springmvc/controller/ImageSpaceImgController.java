package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.commons.util.ServletUtil;
import com.springmvc.po.ImageSpaceImg;
import com.springmvc.service.ImageSpaceImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 图片空间控制器
 *
 * @author 自动生成
 * @version $Id: imageSpaceimgService.java, v 0.1  2019-4-9 15:30:38  自动生成 Exp $
 */
@Controller
@RequestMapping("imagespaceimg")
public class ImageSpaceImgController extends BaseAction {

    @Autowired
    private ImageSpaceImgService imageSpaceimgService;

    /**
     * 文件保存的目录
     */
    public static final String SAVEPATH = "image_space";
    //定义图片类型后缀,只允许上传此类型的图片
    public static final String[] IMGTYPE = new String[]{"png", "jpg", "jpeg", "gif"};
    //默认word中图片保存的类型标识
    public static final short WORD_IMG_TYPE = 1;
    //默认word中图片保存的类型 名称
    public static final String WORD_IMG_NAME = "word图片转存";
    //默认word中图片保存的类型 描述
    public static final String WORD_IMG_REMARK = "系统自动创建，word图片转存的保存目录！";


    /**
     * 添加
     *
     * @param imageSpaceimg {@link ImageSpaceImg}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(ImageSpaceImg imageSpaceimg) {
        return ajaxDone(imageSpaceimgService.addImageSpaceImg(imageSpaceimg));
    }

    /**
     * 删除
     *
     * @param id 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(int id) {
        return ajaxDone(imageSpaceimgService.deleteImageSpaceImg(id));
    }

    /**
     * 修改
     *
     * @param imageSpaceimg {@link ImageSpaceImg}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(ImageSpaceImg imageSpaceimg) {
        return ajaxDone(imageSpaceimgService.updateImageSpaceImg(imageSpaceimg));
    }

    /**
     * 分页查看
     *
     * @param param         {@link PageParam}
     * @param imageSpaceimg {@link ImageSpaceImg}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, ImageSpaceImg imageSpaceimg) {
        return ajaxJson(imageSpaceimgService.queryFullPage(param, imageSpaceimg));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        ImageSpaceImg imageSpaceimg = imageSpaceimgService.details(id);
        if (imageSpaceimg == null) {
            return NODATA;
        }
        map.addAttribute("imageSpaceimg", imageSpaceimg);
        return "";
    }


    /**
     * 百度编辑器 专用 图片上传
     *
     * @param m
     * @param errors
     * @param dir
     * @param pictitle
     * @param file
     * @return
     */
    @RequestMapping("ueditor/add")
    public ModelAndView addForUeditor(String dir, String pictitle, @RequestParam MultipartFile file) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("state", "SUCCESS");
        if (file.isEmpty()) {
            map.put("state", "未包含上传的图片");
        }
        //验证上传文件类型
        String type = file.getContentType();
        if (type == null || "application/octet-stream".equals(type)) {
            type = FileUtils.getFileExt(file.getOriginalFilename());//获取文件后缀
        }
        if (type != null) {
            boolean has = false;
            for (String t : IMGTYPE) {
                if (t.equals(type)) {
                    has = true;
                    break;
                }
            }
            if (!has) {
                map.put("state", "只能上传图片类型,例：文件后缀为:png,jpg,jpeg,gif格式的图片!");
            }
        } else {
            map.put("state", "只能上传图片类型,例：文件后缀为:png,jpg,jpeg,gif格式的图片!");
        }
        ImageSpaceImg img = new ImageSpaceImg();
        img.setName(pictitle);
        img.setType(dir);

        if (!imageSpaceimgService.addImg(img, SAVEPATH, file)) {
            map.put("state", "文件上传失败");
        }
        map.put("title", pictitle);
        map.put("original", file.getOriginalFilename());
        map.put("url", img.getSavePath());

        return ajaxJsonEscape(map);
    }


    /**
     * 百度编辑器 专用 图片上传 word图片转存
     *
     * @param pictitle
     * @param file
     * @return
     */
    @RequestMapping("ueditor/wordImage/add")
    public ModelAndView addForUeditorWordImg(String pictitle, @RequestParam MultipartFile file) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("state", "SUCCESS");
        if (file.isEmpty()) {
            map.put("state", "未包含上传的图片");
        }
        //验证上传文件类型
        String type = file.getContentType();
        if (type == null || "application/octet-stream".equals(type)) {
            type = FileUtils.getFileExt(file.getOriginalFilename());//获取文件后缀
        }
        if (type != null) {
            boolean has = false;
            for (String t : IMGTYPE) {
                if (t.equals(type)) {
                    has = true;
                    break;
                }
            }
            if (!has) {
                map.put("state", "只能上传图片类型,例：文件后缀为:png,jpg,jpeg,gif格式的图片!");
            }
        } else {
            map.put("state", "只能上传图片类型,例：文件后缀为:png,jpg,jpeg,gif格式的图片!");
        }
        ImageSpaceImg img = new ImageSpaceImg();
        img.setName(pictitle);
        img.setType(imageSpaceimgService.addDefaultType(ServletUtil.getMember().getId(), WORD_IMG_TYPE, WORD_IMG_NAME, WORD_IMG_REMARK));

        if (!imageSpaceimgService.addImg(img, SAVEPATH, file)) {
            map.put("state", "文件上传失败");
        }
        map.put("title", pictitle);
        map.put("original", file.getOriginalFilename());
        map.put("url", img.getSavePath());

        return ajaxJsonEscape(map);
    }


    /**
     * 下拉列表 查询出图库类型的名称 id
     *
     * @return
     */
    @RequestMapping("type/list")
    public ModelAndView typeList() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(MsgConfig.STATUSCODE, MsgConfig.CODE_SUCCESS);
        map.put("list", imageSpaceimgService.selectTypeList(ServletUtil.getMember().getId()));

        return ajaxJsonEscape(map);
    }

}