package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.ProductCategoriesMapper;
import com.springmvc.po.ProductCategories;
import com.springmvc.service.ProductCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * 产品类型表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: productCategoriesServiceImpl.java, v 0.1  2019-4-11 12:00:20  自动生成 Exp $
 */
@Service
public class ProductCategoriesServiceImpl implements ProductCategoriesService {

    /**
     * 产品类型表数据层访问接口实现
     **/
    @Autowired
    private ProductCategoriesMapper productCategoriesMapper;

    @Override
    public String addProductCategories(ProductCategories productCategories, MultipartFile file, String savePath) {


        try {

            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                productCategories.setImage(BaseConfig.url + "tmp/types/" + uuid + "." + ext);
            }

            if (productCategoriesMapper.insert(productCategories) > 0) {
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
    public String deleteProductCategories(String[] ids) {

        try {

            for (String id : ids) {
                productCategoriesMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }

            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public String updateProductCategories(ProductCategories productCategories, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                productCategories.setImage(BaseConfig.url + "tmp/types/" + uuid + "." + ext);
            }

            if (productCategoriesMapper.updateByPrimaryKeySelective(productCategories) > 0) {
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
    public DataGrid queryFullPage(PageParam param, ProductCategories productCategories) {

        DataGrid data = new DataGrid();

        List<ProductCategories> productCategoriesList = productCategoriesMapper.selectProductCategoriesByPage(param, productCategories);

        data.setRows(productCategoriesList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public ProductCategories details(int id) {
        return productCategoriesMapper.selectByPrimaryKey(id);
    }

}