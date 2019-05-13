package com.springmvc.controller.app;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.po.CompanyProfile;
import com.springmvc.service.CompanyProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端页面、公司简介控制器
 * @author: lou wei
 * @create: 2019-04-16 15:19
 **/
@Controller
@RequestMapping("web/companyProfile")
public class WebCompanyProfileController extends BaseAction {

    @Autowired
    private CompanyProfileService companyProfileService;

    /**
     * 跳转公司简介页面
     *
     * @return
     */
    @RequestMapping("about")
    public String about(ModelMap map) {
        CompanyProfile companyProfile = new CompanyProfile();
        companyProfile.setStatus(1);
        map.addAttribute("about",companyProfileService.details(companyProfile));
        companyProfile.setStatus(2);
        map.addAttribute("about2",companyProfileService.details(companyProfile));
        return "app/company/profile/about";
    }


}
