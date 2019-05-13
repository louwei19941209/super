package com.springmvc.controller.app;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Product;
import com.springmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: super
 * @description: 前端商品 控制器
 * @author: lou wei
 * @create: 2019-04-17 11:13
 **/
@Controller
@RequestMapping("web/product")
public class WebProductController extends BaseAction {

    @Autowired
    private ProductService productService;

    /**
     * 产品列表页
     *
     * @param param   {@link PageParam}
     * @param product {@link Product}
     * @param map     {@link ModelMap}
     * @return String
     */
    @RequestMapping("list")
    public String product(PageParam param, Product product, ModelMap map) {
        param.setDefaultUseFlag(false);
        map.addAttribute("product", productService.queryFullPage(param, product));
        return "app/product/product";
    }

    /**
     * 产品列表页2
     *
     * @param param   {@link PageParam}
     * @param product {@link Product}
     * @param map     {@link ModelMap}
     * @return String
     */
    @RequestMapping("index")
    public String index(PageParam param, Product product, ModelMap map) {

        List list = new ArrayList();

        //卷
        param.setRows(2);
        product.setType("4");
        list.addAll(productService.queryFullPage(param, product).getRows());

        //凉面
        param.setRows(3);
        product.setType("6");
        list.addAll(productService.queryFullPage(param, product).getRows());

        //杂粮饭
        param.setRows(3);
        product.setType("5");
        list.addAll(productService.queryFullPage(param, product).getRows());

        //沙拉
        param.setRows(3);
        product.setType("2");
        list.addAll(productService.queryFullPage(param, product).getRows());

        //饮品
        param.setDefaultUseFlag(false);
        product.setType("7");
        list.addAll(productService.queryFullPage(param, product).getRows());


        map.addAttribute("product", list);
        return "app/product/product_new";
    }

    /**
     * 产品详情
     *
     * @param id  主键id
     * @param map {@link ModelMap}
     * @return
     */
    @RequestMapping("detail")
    public String detail(int id, ModelMap map) {

        map.addAttribute("product", productService.details(id));

        return "app/product/productDetail";
    }

}
