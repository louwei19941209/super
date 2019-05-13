package com.springmvc.controller.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端加盟流程 控制器
 * @author: lou wei
 * @create: 2019-04-17 16:05
 **/
@Controller
@RequestMapping("web/process")
public class WebProcessController {

    /**
     * 跳转加盟流程 页面
     *
     * @return
     */
    @RequestMapping("index")
    public String index() {
        return "app/join/franchiseProcess";
    }

}
