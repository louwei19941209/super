package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.MarketAnalysisMapper;
import com.springmvc.po.MarketAnalysis;
import com.springmvc.service.MarketAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 市场分析表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: marketAnalysisServiceImpl.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
@Service
public class MarketAnalysisServiceImpl implements MarketAnalysisService {

    /**
     * 市场分析表数据层访问接口实现
     **/
    @Autowired
    private MarketAnalysisMapper marketAnalysisMapper;

    @Override
    public String addMarketAnalysis(MarketAnalysis marketAnalysis) {

        if (marketAnalysisMapper.insert(marketAnalysis) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String deleteMarketAnalysis(String[] ids) {

        try {

            for (String id : ids) {
                marketAnalysisMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }
            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updateMarketAnalysis(MarketAnalysis marketAnalysis) {

        if (marketAnalysisMapper.updateByPrimaryKeySelective(marketAnalysis) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, MarketAnalysis marketAnalysis) {

        DataGrid data = new DataGrid();

        List<MarketAnalysis> marketAnalysisList = marketAnalysisMapper.selectMarketAnalysisByPage(param, marketAnalysis);

        data.setRows(marketAnalysisList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public MarketAnalysis details(int id) {
        return marketAnalysisMapper.selectByPrimaryKey(id);
    }

}