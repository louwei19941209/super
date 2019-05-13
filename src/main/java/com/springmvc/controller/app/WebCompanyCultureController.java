package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.CompanyCulture;
import com.springmvc.service.CompanyCultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端公司文化控制器
 * @author: lou wei
 * @create: 2019-04-17 09:13
 **/
@Controller
@RequestMapping("web/companyCulture")
public class WebCompanyCultureController {

    @Autowired
    private CompanyCultureService companyCultureService;

    /**
     * 跳转 公司文化
     *
     * @return
     */
    @RequestMapping("culture")
    public String culture(ModelMap map) {

        PageParam pageParam = new PageParam();
        pageParam.setDefaultUseFlag(false);

        CompanyCulture culture = new CompanyCulture();

        map.addAttribute("culture", companyCultureService.queryFullPage(pageParam, culture));

        return "app/company/culture/corporateCulture";
    }

}
