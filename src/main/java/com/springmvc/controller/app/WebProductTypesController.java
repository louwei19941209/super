package com.springmvc.controller.app;

import com.springmvc.service.ProductCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端商品分类 控制器
 * @author: lou wei
 * @create: 2019-04-17 10:39
 **/
@Controller
@RequestMapping("web/product/type")
public class WebProductTypesController {

    @Autowired
    private ProductCategoriesService productCategoriesService;



}
