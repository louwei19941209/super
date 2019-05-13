package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.IfbbTeamDetailsMapper;
import com.springmvc.po.IfbbTeamDetails;
import com.springmvc.service.IfbbTeamDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * IFBB团队详情表业务层访问接口实现
 * @author  自动生成
 * @version $Id: ifbbTeamDetailsServiceImpl.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
@Service
public class IfbbTeamDetailsServiceImpl implements IfbbTeamDetailsService {

    /**IFBB团队详情表数据层访问接口实现**/
	@Autowired
	private IfbbTeamDetailsMapper ifbbTeamDetailsMapper;

    @Override
    public String addIfbbTeamDetails(IfbbTeamDetails ifbbTeamDetails) {

        if (ifbbTeamDetailsMapper.insert(ifbbTeamDetails) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String deleteIfbbTeamDetails(int id) {

        if (ifbbTeamDetailsMapper.deleteByPrimaryKey(id) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updateIfbbTeamDetails(IfbbTeamDetails ifbbTeamDetails) {

        if (ifbbTeamDetailsMapper.updateByPrimaryKeySelective(ifbbTeamDetails) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, IfbbTeamDetails ifbbTeamDetails) {

        DataGrid data = new DataGrid();

        List<IfbbTeamDetails> ifbbTeamDetailsList = ifbbTeamDetailsMapper.selectIfbbTeamDetailsByPage(param, ifbbTeamDetails);

        data.setRows(ifbbTeamDetailsList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public IfbbTeamDetails details(int id) {
        return ifbbTeamDetailsMapper.selectByPrimaryKey(id);
    }
	 
}