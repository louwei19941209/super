package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.JoiningProcessMapper;
import com.springmvc.po.JoiningProcess;
import com.springmvc.service.JoiningProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 加盟流程表业务层访问接口实现
 * @author  自动生成
 * @version $Id: joiningProcessServiceImpl.java, v 0.1  2019-4-19 10:03:55  自动生成 Exp $
 */
@Service
public class JoiningProcessServiceImpl implements JoiningProcessService {

    /**加盟流程表数据层访问接口实现**/
	@Autowired
	private JoiningProcessMapper joiningProcessMapper;

    @Override
    public String addJoiningProcess(JoiningProcess joiningProcess) {

        if (joiningProcessMapper.insert(joiningProcess) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String deleteJoiningProcess(int id) {

        if (joiningProcessMapper.deleteByPrimaryKey(id) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updateJoiningProcess(JoiningProcess joiningProcess) {

        if (joiningProcessMapper.updateByPrimaryKeySelective(joiningProcess) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, JoiningProcess joiningProcess) {

        DataGrid data = new DataGrid();

        List<JoiningProcess> joiningProcessList = joiningProcessMapper.selectJoiningProcessByPage(param, joiningProcess);

        data.setRows(joiningProcessList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public JoiningProcess details(int id) {
        return joiningProcessMapper.selectByPrimaryKey(id);
    }
	 
}