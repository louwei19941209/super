package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.IfbbTeamDetails;
 
/**
 * IFBB团队详情表业务层访问接口
 * @author  自动生成
 * @version $Id: ifbbTeamDetailsService.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
public interface IfbbTeamDetailsService {

	 String addIfbbTeamDetails(IfbbTeamDetails ifbbTeamDetails);

	 String deleteIfbbTeamDetails(int id);

	 String updateIfbbTeamDetails(IfbbTeamDetails ifbbTeamDetails);

	 DataGrid queryFullPage(PageParam param, IfbbTeamDetails ifbbTeamDetails);

	 IfbbTeamDetails details(int id);

}