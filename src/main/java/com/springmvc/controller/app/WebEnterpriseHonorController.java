package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.EnterpriseHonor;
import com.springmvc.service.EnterpriseHonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端企业荣誉 控制器
 * @author: lou wei
 * @create: 2019-04-25 09:42
 **/
@Controller
@RequestMapping("web/honor")
public class WebEnterpriseHonorController {

    @Autowired
    private EnterpriseHonorService honorService;

    @RequestMapping("index")
    public String index(PageParam param, EnterpriseHonor honor, ModelMap map) {
        param.setDefaultUseFlag(false);
        map.addAttribute("honor", honorService.queryFullPage(param, honor));
        return "app/company/honor/qyry";
    }

}
