package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.ProtectionMapper;
import com.springmvc.po.Protection;
import com.springmvc.service.ProtectionService;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 售后保障表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: protectionServiceImpl.java, v 0.1  2019-4-12 9:33:11  自动生成 Exp $
 */
@Service
public class ProtectionServiceImpl implements ProtectionService {

    /**
     * 售后保障表数据层访问接口实现
     **/
    @Autowired
    private ProtectionMapper protectionMapper;

    @Override
    public String addProtection(Protection protection) {

        if (protectionMapper.insert(protection) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String deleteProtection(String[] ids) {

        try {

            for (String id : ids) {
                protectionMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }

            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public String updateProtection(Protection protection) {

        if (protectionMapper.updateByPrimaryKeySelective(protection) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, Protection protection) {

        DataGrid data = new DataGrid();

        List<Protection> protectionList = protectionMapper.selectProtectionByPage(param, protection);

        data.setRows(protectionList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public Protection details(int id) {
        Protection p = protectionMapper.selectByPrimaryKey(id);
        p.setContent(StringEscapeUtils.unescapeHtml3(p.getContent()));
        return p;
    }

}