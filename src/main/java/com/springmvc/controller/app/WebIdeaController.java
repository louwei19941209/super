package com.springmvc.controller.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端产品理念 控制器
 * @author: lou wei
 * @create: 2019-04-30 16:10
 **/
@Controller
@RequestMapping("web/idea")
public class WebIdeaController {

    @RequestMapping("index")
    public String index() {
        return "app/product/idea";
    }

}
