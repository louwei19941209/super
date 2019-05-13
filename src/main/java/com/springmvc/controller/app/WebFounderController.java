package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Founder;
import com.springmvc.service.FounderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端创始人 控制器
 * @author: lou wei
 * @create: 2019-04-25 13:44
 **/
@Controller
@RequestMapping("web/founder")
public class WebFounderController {

    @Autowired
    private FounderService founderService;

    /**
     * 创始人 前端页面
     *
     * @return
     */
    @RequestMapping("index")
    public String index(PageParam param, Founder founder, ModelMap map) {

        map.addAttribute("founder", founderService.queryFullPage(param, founder));

        return "app/company/founder/founder";
    }

    /**
     * 详情页
     *
     * @param id  主键id
     * @param map {@link ModelMap}
     * @return
     */
    @RequestMapping("detail")
    public String detail(int id, ModelMap map) {

        map.addAttribute("founder", founderService.details(id));

        return "app/company/founder/founderDetail";

    }

}
