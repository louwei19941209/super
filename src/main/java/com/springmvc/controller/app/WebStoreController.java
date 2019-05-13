package com.springmvc.controller.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端门店风采 控制器
 * @author: lou wei
 * @create: 2019-04-17 16:24
 **/
@Controller
@RequestMapping("web/store")
public class WebStoreController {


    @RequestMapping("index")
    public String index() {
        return "app/join/shopStyle";
    }

}
