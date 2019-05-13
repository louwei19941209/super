package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.CoreCompetition;
import com.springmvc.service.CoreCompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端核心竞争力 控制器
 * @author: lou wei
 * @create: 2019-04-17 13:44
 **/
@Controller
@RequestMapping("web/coreCompetence")
public class WebCoreCompetenceController {

    @Autowired
    private CoreCompetitionService coreCompetitionService;

    /**
     * 跳转核心竞争 页面
     *
     * @return String
     */
    @RequestMapping("core")
    public String core(PageParam param, ModelMap map) {

        param.setDefaultUseFlag(false);
        CoreCompetition coreCompetition = new CoreCompetition();

        map.addAttribute("core", coreCompetitionService.queryFullPage(param, coreCompetition));

        return "app/protection/core_competition/coreCompetence";
    }

}
