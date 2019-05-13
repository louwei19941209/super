package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Recruitment;
import com.springmvc.service.RecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端人才招聘 控制器
 * @author: lou wei
 * @create: 2019-04-17 15:59
 **/
@Controller
@RequestMapping("web/job")
public class WebJobController {

    @Autowired
    private RecruitmentService recruitmentService;


    @RequestMapping("index")
    public String index(ModelMap map, PageParam param, Recruitment recruitment) {

        map.addAttribute("recruitment", recruitmentService.queryFullPage(param, recruitment));

        return "app/contact/job";
    }

}
