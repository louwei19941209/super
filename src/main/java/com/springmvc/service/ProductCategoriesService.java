package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.ProductCategories;
import org.springframework.web.multipart.MultipartFile;

/**
 * 产品类型表业务层访问接口
 *
 * @author 自动生成
 * @version $Id: productCategoriesService.java, v 0.1  2019-4-11 12:00:20  自动生成 Exp $
 */
public interface ProductCategoriesService {

    /**
     * 添加
     *
     * @param productCategories {@link ProductCategories}
     * @return String
     */
    String addProductCategories(ProductCategories productCategories, MultipartFile file, String savePath);

    /**
     * 删除
     *
     * @param ids 主键id
     * @return String
     */
    String deleteProductCategories(String[] ids);

    /**
     * 修改
     *
     * @param productCategories {@link ProductCategories}
     * @return String
     */
    String updateProductCategories(ProductCategories productCategories, MultipartFile file, String savePath);

    /**
     * 查询列表分页
     *
     * @param param             {@link PageParam}
     * @param productCategories {@link ProductCategories}
     * @return DataGrid
     */
    DataGrid queryFullPage(PageParam param, ProductCategories productCategories);

    /**
     * 查询详情
     *
     * @param id 主键id
     * @return ProductCategories
     */
    ProductCategories details(int id);

}