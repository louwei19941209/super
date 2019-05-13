package com.springmvc.controller.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端项目前景优势 控制层
 * @author: lou wei
 * @create: 2019-04-17 14:05
 **/
@Controller
@RequestMapping("web/prospect")
public class WebProspectController {

    /**
     * 跳转项目前景优势页面
     * @return String
     */
    @RequestMapping("detail")
    public String prospect() {
        return "app/protection/prospect/foregroundAdvantage";
    }

}
