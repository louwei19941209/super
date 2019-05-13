package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Contact;
import com.springmvc.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端联系我们 控制器
 * @author: lou wei
 * @create: 2019-04-17 15:52
 **/
@Controller
@RequestMapping("web/contact")
public class WebContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("index")
    public String index(ModelMap map) {

        PageParam pageParam = new PageParam();
        pageParam.setRows(1);

        Contact contact = new Contact();

        map.addAttribute("contact", contactService.queryFullPage(pageParam, contact));

        return "app/contact/contactInfo";
    }

}
