package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Product;
import org.springframework.web.multipart.MultipartFile;

/**
 * 产品表业务层访问接口
 *
 * @author 自动生成
 * @version $Id: productService.java, v 0.1  2019-4-11 12:00:20  自动生成 Exp $
 */
public interface ProductService {

    /**
     * 添加
     *
     * @param product  {@link Product}
     * @param file     {@link MultipartFile}
     * @param savePath 文件保存路径
     * @return String
     */
    String addProduct(Product product, MultipartFile file, String savePath);

    /**
     * 删除
     *
     * @param id 主键
     * @return
     */
    String deleteProduct(String[] id);

    /**
     * 修改
     *
     * @param product
     * @return
     */
    String updateProduct(Product product, MultipartFile file, String savePath);

    /**
     * 查询分页
     *
     * @param param   {@link PageParam}
     * @param product {@link Product}
     * @return DataGrid
     */
    DataGrid queryFullPage(PageParam param, Product product);

    /**
     * 详情
     *
     * @param id 主键
     * @return Product
     */
    Product details(int id);

}