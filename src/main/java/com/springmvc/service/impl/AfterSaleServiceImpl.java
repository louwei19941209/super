package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.AfterSaleMapper;
import com.springmvc.po.AfterSale;
import com.springmvc.service.AfterSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 售后表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: afterSaleServiceImpl.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
@Service
public class AfterSaleServiceImpl implements AfterSaleService {

    /**
     * 售后表数据层访问接口实现
     **/
    @Autowired
    private AfterSaleMapper afterSaleMapper;

    @Override
    public String addAfterSale(AfterSale afterSale) {

        if (afterSaleMapper.insert(afterSale) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String deleteAfterSale(int id) {

        if (afterSaleMapper.deleteByPrimaryKey(id) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updateAfterSale(AfterSale afterSale) {

        if (afterSaleMapper.updateByPrimaryKeySelective(afterSale) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, AfterSale afterSale) {

        DataGrid data = new DataGrid();

        List<AfterSale> afterSaleList = afterSaleMapper.selectAfterSaleByPage(param, afterSale);

        data.setRows(afterSaleList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public AfterSale details(int id) {
        return afterSaleMapper.selectByPrimaryKey(id);
    }

}