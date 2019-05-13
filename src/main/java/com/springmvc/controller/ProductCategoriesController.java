package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.ProductCategories;
import com.springmvc.service.ProductCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.Date;

/**
 * 产品类型表控制器
 *
 * @author 自动生成
 * @version $Id: productCategoriesService.java, v 0.1  2019-4-11 12:00:20  自动生成 Exp $
 */
@Controller
@RequestMapping("productcategories")
public class ProductCategoriesController extends BaseAction {

    @Autowired
    private ProductCategoriesService productCategoriesService;

    /**
     * 文件保存目录
     */
    private static final String SAVEPATH = BaseConfig.uploadPath + "types";


    /**
     * 列表页面
     *
     * @return String
     */
    @RequestMapping("load")
    public String load() {
        return "product/category/load";
    }

    /**
     * 添加页面
     *
     * @return String
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "product/category/add";
    }

    /**
     * 添加
     *
     * @param productCategories {@link ProductCategories}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(ProductCategories productCategories, MultipartFile file) {

        File savePath = new File(SAVEPATH);
        if (!savePath.isDirectory() && !savePath.exists()) {
            System.out.println("文件不存在");
            final boolean mkdir = savePath.mkdirs();
        }

        if (file != null && !file.isEmpty()) {
            ModelAndView view = FileUtils.validateFile(file, 1024L * 1024 * 500, null, new String[]{"exe"});
            if (view != null) {
                return view;
            }
        }

        productCategories.setCreateTime(new Date(System.currentTimeMillis()));
        return ajaxDone(productCategoriesService.addProductCategories(productCategories, file, SAVEPATH));
    }

    /**
     * 删除
     *
     * @param ids 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(productCategoriesService.deleteProductCategories(ids));
    }

    /**
     * 修改
     *
     * @param productCategories {@link ProductCategories}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(ProductCategories productCategories, MultipartFile file) {
        return ajaxDone(productCategoriesService.updateProductCategories(productCategories, file, SAVEPATH));
    }

    /**
     * 分页查看
     *
     * @param param             {@link PageParam}
     * @param productCategories {@link ProductCategories}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, ProductCategories productCategories) {
        return ajaxJson(productCategoriesService.queryFullPage(param, productCategories));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        ProductCategories productCategories = productCategoriesService.details(id);
        if (productCategories == null) {
            return NODATA;
        }
        map.addAttribute("productCategories", productCategories);
        return "product/category/update";
    }

}