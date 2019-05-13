package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.MarketAnalysis;
import com.springmvc.service.MarketAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 市场分析表控制器
 *
 * @author 自动生成
 * @version $Id: marketAnalysisService.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
@Controller
@RequestMapping("marketanalysis")
public class MarketAnalysisController extends BaseAction {

    @Autowired
    private MarketAnalysisService marketAnalysisService;


    /**
     * 跳转列表页面
     *
     * @return String
     */
    @RequestMapping("load")
    public String load() {
        return "join/market/load";
    }

    /**
     * 跳转 添加页面
     *
     * @return String
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "join/market/add";
    }

    /**
     * 添加
     *
     * @param marketAnalysis {@link MarketAnalysis}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(MarketAnalysis marketAnalysis) {
        return ajaxDone(marketAnalysisService.addMarketAnalysis(marketAnalysis));
    }

    /**
     * 删除
     *
     * @param ids 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(marketAnalysisService.deleteMarketAnalysis(ids));
    }

    /**
     * 修改
     *
     * @param marketAnalysis {@link MarketAnalysis}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(MarketAnalysis marketAnalysis) {
        return ajaxDone(marketAnalysisService.updateMarketAnalysis(marketAnalysis));
    }

    /**
     * 分页查看
     *
     * @param param          {@link PageParam}
     * @param marketAnalysis {@link MarketAnalysis}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, MarketAnalysis marketAnalysis) {
        return ajaxJson(marketAnalysisService.queryFullPage(param, marketAnalysis));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        MarketAnalysis marketAnalysis = marketAnalysisService.details(id);
        if (marketAnalysis == null) {
            return NODATA;
        }
        map.addAttribute("marketAnalysis", marketAnalysis);
        return "join/market/update";
    }

}