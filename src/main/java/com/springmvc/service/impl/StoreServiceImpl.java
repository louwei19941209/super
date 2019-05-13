package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.StoreMapper;
import com.springmvc.po.Store;
import com.springmvc.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 门店风采表业务层访问接口实现
 * @author  自动生成
 * @version $Id: storeServiceImpl.java, v 0.1  2019-4-19 10:03:56  自动生成 Exp $
 */
@Service
public class StoreServiceImpl implements StoreService {

    /**门店风采表数据层访问接口实现**/
	@Autowired
	private StoreMapper storeMapper;

    @Override
    public String addStore(Store store) {

        if (storeMapper.insert(store) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String deleteStore(int id) {

        if (storeMapper.deleteByPrimaryKey(id) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updateStore(Store store) {

        if (storeMapper.updateByPrimaryKeySelective(store) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, Store store) {

        DataGrid data = new DataGrid();

        List<Store> storeList = storeMapper.selectStoreByPage(param, store);

        data.setRows(storeList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public Store details(int id) {
        return storeMapper.selectByPrimaryKey(id);
    }
	 
}