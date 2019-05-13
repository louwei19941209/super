package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Store;
 
/**
 * 门店风采表业务层访问接口
 * @author  自动生成
 * @version $Id: storeService.java, v 0.1  2019-4-19 10:03:56  自动生成 Exp $
 */
public interface StoreService {

	 String addStore(Store store);

	 String deleteStore(int id);

	 String updateStore(Store store);

	 DataGrid queryFullPage(PageParam param, Store store);

	 Store details(int id);

}