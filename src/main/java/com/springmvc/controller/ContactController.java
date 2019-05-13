package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.Contact;
import com.springmvc.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

/**
 * 联系我们控制器
 *
 * @author 自动生成
 * @version $Id: contactService.java, v 0.1  2019-4-19 11:01:41  自动生成 Exp $
 */
@Controller
@RequestMapping("contact")
public class ContactController extends BaseAction {

    @Autowired
    private ContactService contactService;

    /**
     * 文件保存路径
     */
    private final static String SAVEPATH = BaseConfig.uploadPath + "contact";

    /**
     * 列表页面
     *
     * @return
     */
    @RequestMapping("load")
    public String load() {
        return "contact/load";
    }

    /**
     * 添加页面
     *
     * @return
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "contact/add";
    }

    /**
     * 添加
     *
     * @param contact {@link Contact}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(Contact contact, MultipartFile file) {

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

        return ajaxDone(contactService.addContact(contact, file, SAVEPATH));
    }

    /**
     * 删除
     *
     * @param id 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(contactService.deleteContact(ids));
    }

    /**
     * 修改
     *
     * @param contact {@link Contact}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(Contact contact, MultipartFile file) {
        return ajaxDone(contactService.updateContact(contact, file, SAVEPATH));
    }

    /**
     * 分页查看
     *
     * @param param   {@link PageParam}
     * @param contact {@link Contact}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, Contact contact) {
        return ajaxJson(contactService.queryFullPage(param, contact));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        Contact contact = contactService.details(id);
        if (contact == null) {
            return NODATA;
        }
        map.addAttribute("contact", contact);
        return "contact/update";
    }

}