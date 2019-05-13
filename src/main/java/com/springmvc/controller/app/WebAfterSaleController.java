package com.springmvc.controller.app;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Protection;
import com.springmvc.service.ProtectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: super
 * @description: 前端售后保障 控制器
 * @author: lou wei
 * @create: 2019-04-17 14:13
 **/
@Controller
@RequestMapping("web/after")
public class WebAfterSaleController {

    @Autowired
    private ProtectionService protectionService;

    /**
     * 跳转 售后保障页面
     *
     * @return String
     */
    @RequestMapping("index")
    public String index(ModelMap map) {

        PageParam pageParam = new PageParam();
        pageParam.setDefaultUseFlag(false);

        Protection afterSale = new Protection();

        map.addAttribute("after", protectionService.queryFullPage(pageParam, afterSale));

        return "app/protection/after_sale/after_sales";
    }

}
