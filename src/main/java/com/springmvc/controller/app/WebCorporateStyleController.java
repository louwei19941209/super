package com.springmvc.controller.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端企业风采 控制器
 * @author: lou wei
 * @create: 2019-04-25 13:57
 **/
@Controller
@RequestMapping("web/style")
public class WebCorporateStyleController {

    @RequestMapping("index")
    public String index() {
        return "app/news/news_new";
    }

}
