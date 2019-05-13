package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.ProductConcept;
 
/**
 * 产品理念表业务层访问接口
 * @author  自动生成
 * @version $Id: productConceptService.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
public interface ProductConceptService {

	 String addProductConcept(ProductConcept productConcept);

	 String deleteProductConcept(int id);

	 String updateProductConcept(ProductConcept productConcept);

	 DataGrid queryFullPage(PageParam param, ProductConcept productConcept);

	 ProductConcept details(int id);

}