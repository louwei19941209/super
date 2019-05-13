package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.ProductConceptMapper;
import com.springmvc.po.ProductConcept;
import com.springmvc.service.ProductConceptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 产品理念表业务层访问接口实现
 * @author  自动生成
 * @version $Id: productConceptServiceImpl.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
@Service
public class ProductConceptServiceImpl implements ProductConceptService {

    /**产品理念表数据层访问接口实现**/
	@Autowired
	private ProductConceptMapper productConceptMapper;

    @Override
    public String addProductConcept(ProductConcept productConcept) {

        if (productConceptMapper.insert(productConcept) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String deleteProductConcept(int id) {

        if (productConceptMapper.deleteByPrimaryKey(id) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updateProductConcept(ProductConcept productConcept) {

        if (productConceptMapper.updateByPrimaryKeySelective(productConcept) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, ProductConcept productConcept) {

        DataGrid data = new DataGrid();

        List<ProductConcept> productConceptList = productConceptMapper.selectProductConceptByPage(param, productConcept);

        data.setRows(productConceptList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public ProductConcept details(int id) {
        return productConceptMapper.selectByPrimaryKey(id);
    }
	 
}