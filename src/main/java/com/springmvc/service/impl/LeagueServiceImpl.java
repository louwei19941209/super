package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.LeagueMapper;
import com.springmvc.po.League;
import com.springmvc.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * 申请加盟表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: leagueServiceImpl.java, v 0.1  2019-4-19 10:03:56  自动生成 Exp $
 */
@Service
public class LeagueServiceImpl implements LeagueService {

    /**
     * 申请加盟表数据层访问接口实现
     **/
    @Autowired
    private LeagueMapper leagueMapper;

    @Override
    public String addLeague(League league) {

        if (leagueMapper.insert(league) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String deleteLeague(int id) {

        if (leagueMapper.deleteByPrimaryKey(id) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updateLeague(League league) {

        if (leagueMapper.updateByPrimaryKeySelective(league) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, League league) {

        DataGrid data = new DataGrid();

        List<League> leagueList = leagueMapper.selectLeagueByPage(param, league);

        data.setRows(leagueList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public League details(int id) {
        return leagueMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Map<String, Object>> selectCity(String id) {
        return leagueMapper.selectCity(id);
    }
}