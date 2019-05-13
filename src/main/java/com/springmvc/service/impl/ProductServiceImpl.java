package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.ProductMapper;
import com.springmvc.po.Product;
import com.springmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * 产品表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: productServiceImpl.java, v 0.1  2019-4-11 12:00:20  自动生成 Exp $
 */
@Service
public class ProductServiceImpl implements ProductService {

    /**
     * 产品表数据层访问接口实现
     **/
    @Autowired
    private ProductMapper productMapper;

    @Override
    public String addProduct(Product product, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {

                String uuid = FileUtils.getUUID();

                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File saveFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(saveFile);

                product.setImage(BaseConfig.url + "tmp/product/" + uuid + "." + ext);

            }

            if (productMapper.insert(product) > 0) {
                return MsgConfig.MSG_KEY_SUCCESS;
            } else {
                return MsgConfig.MSG_KEY_FAIL;
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public String deleteProduct(String[] ids) {

        try {

            for (String id : ids) {
                productMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }

            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updateProduct(Product product, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {

                String uuid = FileUtils.getUUID();

                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File saveFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(saveFile);

                product.setImage(BaseConfig.url + "tmp/product/" + uuid + "." + ext);

            }

            if (productMapper.updateByPrimaryKeySelective(product) > 0) {
                return MsgConfig.MSG_KEY_SUCCESS;
            } else {
                return MsgConfig.MSG_KEY_FAIL;
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, Product product) {

        DataGrid data = new DataGrid();

        List<Product> productList = productMapper.selectProductByPage(param, product);

        data.setRows(productList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public Product details(int id) {
        return productMapper.selectByPrimaryKey(id);
    }

}