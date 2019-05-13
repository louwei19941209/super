package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.News;
import com.springmvc.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端新闻 控制器
 * @author: lou wei
 * @create: 2019-04-17 14:28
 **/
@Controller
@RequestMapping("web/news")
public class WebNewsController {

    @Autowired
    private NewsService newsService;

    /**
     * 公司快讯
     *
     * @return
     */
    @RequestMapping("news")
    public String news(PageParam param, ModelMap map, News news) {

        param.setDefaultUseFlag(false);

        news.setType("1");

        map.addAttribute("news", newsService.queryFullPage(param, news));

        return "app/news/news";
    }

    /**
     * 媒体报道
     *
     * @return
     */
    @RequestMapping("media")
    public String media(PageParam param, ModelMap map, News news) {

        param.setDefaultUseFlag(false);

        news.setType("2");

        map.addAttribute("news", newsService.queryFullPage(param, news));

        return "app/news/mediaCoverage";
    }

    /**
     * 新闻 详情
     * @return
     */
    @RequestMapping("details")
    public String mediaDetails(int id, ModelMap map) {

        map.addAttribute("news", newsService.details(id));

        return "app/news/newsDetail";
    }

}
