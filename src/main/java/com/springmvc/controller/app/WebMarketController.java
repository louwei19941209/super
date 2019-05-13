package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.MarketAnalysis;
import com.springmvc.service.MarketAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端市场分析 控制器
 * @author: lou wei
 * @create: 2019-04-17 16:13
 **/
@Controller
@RequestMapping("web/market")
public class WebMarketController {

    @Autowired
    private MarketAnalysisService marketAnalysisService;

    /**
     * 市场分析 页面
     * @return
     */
    @RequestMapping("index")
    public String index(ModelMap map) {

        PageParam pageParam = new PageParam();

        pageParam.setDefaultUseFlag(false);

        MarketAnalysis marketAnalysis = new MarketAnalysis();

        map.addAttribute("market", marketAnalysisService.queryFullPage(pageParam, marketAnalysis));

        return "app/join/marketAnalysis";
    }

}
