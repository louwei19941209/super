package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.MarketAnalysis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 市场分析表数据访问接口
 * @author  自动生成
 * @version $Id: marketAnalysisMapper.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
public interface MarketAnalysisMapper {

    int deleteByPrimaryKey(int id);

    int insert(MarketAnalysis record);

	int insertSelective(MarketAnalysis record);

	MarketAnalysis selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(MarketAnalysis record);

    //int updateByPrimaryKey(MarketAnalysis record);

    List<MarketAnalysis> selectMarketAnalysisByPage(@Param("PageParam") PageParam param, @Param("marketAnalysis") MarketAnalysis marketAnalysis);

}