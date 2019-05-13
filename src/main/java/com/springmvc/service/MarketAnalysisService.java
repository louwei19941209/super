package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.MarketAnalysis;
 
/**
 * 市场分析表业务层访问接口
 * @author  自动生成
 * @version $Id: marketAnalysisService.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
public interface MarketAnalysisService {

	 String addMarketAnalysis(MarketAnalysis marketAnalysis);

	 String deleteMarketAnalysis(String[] ids);

	 String updateMarketAnalysis(MarketAnalysis marketAnalysis);

	 DataGrid queryFullPage(PageParam param, MarketAnalysis marketAnalysis);

	 MarketAnalysis details(int id);

}