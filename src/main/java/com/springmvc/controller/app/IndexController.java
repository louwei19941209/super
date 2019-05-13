package com.springmvc.controller.app;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.News;
import com.springmvc.po.ProductCategories;
import com.springmvc.service.NewsService;
import com.springmvc.service.ProductCategoriesService;
import com.springmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端首页控制器
 * @author: lou wei
 * @create: 2019-04-16 15:35
 **/
@Controller
@RequestMapping("web/index")
public class IndexController extends BaseAction {

    @Autowired
    private ProductCategoriesService productCategoriesService;
    @Autowired
    private ProductService productService;
    @Autowired
    private NewsService newsService;

    /**
     * 首页
     *
     * @param map
     * @return
     */
    @RequestMapping("home")
    public String index(ModelMap map) {

        //商品类型
        PageParam pageParam = new PageParam();

        pageParam.setRows(5);

        ProductCategories productCategories = new ProductCategories();

        map.addAttribute("type", productCategoriesService.queryFullPage(pageParam, productCategories));

        //新闻
        PageParam pageParam2 = new PageParam();

        pageParam2.setRows(1);

        News news = new News();
        news.setType("2");

        map.addAttribute("news", newsService.queryFullPage(pageParam2, news));

        return "app/index";
    }

    /**
     * 导航栏
     *
     * @return
     */
    @RequestMapping("head")
    public String head(ModelMap map) {

        PageParam pageParam = new PageParam();
        pageParam.setDefaultUseFlag(false);

        ProductCategories productCategories = new ProductCategories();

        map.addAttribute("type", productCategoriesService.queryFullPage(pageParam, productCategories));

        return "app/head";
    }



}
