package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.AfterSale;
 
/**
 * 售后表业务层访问接口
 * @author  自动生成
 * @version $Id: afterSaleService.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
public interface AfterSaleService {

	 String addAfterSale(AfterSale afterSale);

	 String deleteAfterSale(int id);

	 String updateAfterSale(AfterSale afterSale);

	 DataGrid queryFullPage(PageParam param, AfterSale afterSale);

	 AfterSale details(int id);

}