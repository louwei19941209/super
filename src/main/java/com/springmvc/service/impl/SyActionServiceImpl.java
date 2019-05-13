package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.SyActionMapper;
import com.springmvc.po.SyAction;
import com.springmvc.service.SyActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: webssm
 * @description: 操作管理，业务层
 * @author: lou wei
 * @create: 2018-09-26 14:10
 **/
@Service
public class SyActionServiceImpl implements SyActionService {
    @Autowired
    private SyActionMapper syActionMapper;

    /**
     * @Description: 查询action
     * @Param: []
     * @return: java.util.List<com.springmvc.po.SyAction>
     * @Author: lou wei
     * @Date: 2018/9/26
     */
    @Override
    public DataGrid selectAction(PageParam param, SyAction action) {
        DataGrid data = new DataGrid();
        data.setRows(syActionMapper.selectAction(param, action));
        data.setTotal(param.getTotle());
        return data;
    }

    /**
     * @Description: 添加action
     * @Param: [action]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @Override
    public String addAction(SyAction action) {
        if (syActionMapper.insert(action) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }
    }

    /**
     * @Description: 详情
     * @Param: [id]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @Override
    public SyAction selectActionById(String id) {
        return syActionMapper.selectByPrimaryKey(id);
    }

    /**
     * @Description: 修改action
     * @Param: [action]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @Override
    public String updateAction(SyAction action) {
        if (syActionMapper.updateByPrimaryKey(action) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }
    }

    /**
     * @Description: 删除action
     * @Param: [id]
     * @return: java.lang.String
     * @Author: lou wei
     * @Date: 2018/9/27
     */
    @Override
    public String deleteAction(String[] ids) {
        for (String id : ids) {
            syActionMapper.deleteByPrimaryKey(id);
        }
        return MsgConfig.MSG_KEY_SUCCESS;
    }
}
