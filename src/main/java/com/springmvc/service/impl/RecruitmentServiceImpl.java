package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.RecruitmentMapper;
import com.springmvc.po.Recruitment;
import com.springmvc.service.RecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 招聘信息表表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: recruitmentServiceImpl.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
@Service
public class RecruitmentServiceImpl implements RecruitmentService {

    /**
     * 招聘信息表表数据层访问接口实现
     **/
    @Autowired
    private RecruitmentMapper recruitmentMapper;

    @Override
    public String addRecruitment(Recruitment recruitment) {

        if (recruitmentMapper.insert(recruitment) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String deleteRecruitment(String[] ids) {

        try {

            for (String id : ids) {
                recruitmentMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }
            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updateRecruitment(Recruitment recruitment) {

        if (recruitmentMapper.updateByPrimaryKeySelective(recruitment) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, Recruitment recruitment) {

        DataGrid data = new DataGrid();

        List<Recruitment> recruitmentList = recruitmentMapper.selectRecruitmentByPage(param, recruitment);

        data.setRows(recruitmentList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public Recruitment details(int id) {
        return recruitmentMapper.selectByPrimaryKey(id);
    }

}