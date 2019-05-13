package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.Product;
import com.springmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.Date;

/**
 * 产品表控制器
 *
 * @author 自动生成
 * @version $Id: productService.java, v 0.1  2019-4-11 12:00:20  自动生成 Exp $
 */
@Controller
@RequestMapping("product")
public class ProductController extends BaseAction {

    @Autowired
    private ProductService productService;

    /**
     * 文件保存地址
     */
    private static final String SAVEPATH = BaseConfig.uploadPath + "product";

    /**
     * 跳转 列表页
     *
     * @return String
     */
    @RequestMapping("load")
    public String load() {
        return "product/load";
    }

    /**
     * 跳转 添加页面
     *
     * @return String
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "product/add";
    }

    /**
     * 添加
     *
     * @param product {@link Product}
     * @param file    {@link MultipartFile}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(Product product, MultipartFile file) {

        File saveFile = new File(SAVEPATH);

        if (!saveFile.exists() && !saveFile.isDirectory()) {
            boolean mkdirs = saveFile.mkdirs();
        }

        if (file != null && !file.isEmpty()) {
            ModelAndView view = FileUtils.validateFile(file, 1024L * 1024 * 500, null, new String[]{"exe"});
            if (view != null) {
                return view;
            }
        }

        product.setCreateTime(new Date(System.currentTimeMillis()));

        return ajaxDone(productService.addProduct(product, file, SAVEPATH));
    }

    /**
     * 删除
     *
     * @param id 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(productService.deleteProduct(ids));
    }

    /**
     * 修改
     *
     * @param product {@link Product}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(Product product, MultipartFile file) {

        File saveFile = new File(SAVEPATH);

        if (!saveFile.exists() && !saveFile.isDirectory()) {
            boolean mkdirs = saveFile.mkdirs();
        }

        if (file != null && !file.isEmpty()) {
            ModelAndView view = FileUtils.validateFile(file, 1024L * 1024 * 500, null, new String[]{"exe"});
            if (view != null) {
                return view;
            }
        }

        return ajaxDone(productService.updateProduct(product, file, SAVEPATH));
    }

    /**
     * 分页查看
     *
     * @param param   {@link PageParam}
     * @param product {@link Product}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, Product product) {
        return ajaxJson(productService.queryFullPage(param, product));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        Product product = productService.details(id);
        if (product == null) {
            return NODATA;
        }
        map.addAttribute("product", product);
        return "product/update";
    }

}