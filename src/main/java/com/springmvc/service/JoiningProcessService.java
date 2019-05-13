package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.JoiningProcess;
 
/**
 * 加盟流程表业务层访问接口
 * @author  自动生成
 * @version $Id: joiningProcessService.java, v 0.1  2019-4-19 10:03:55  自动生成 Exp $
 */
public interface JoiningProcessService {

	 String addJoiningProcess(JoiningProcess joiningProcess);

	 String deleteJoiningProcess(int id);

	 String updateJoiningProcess(JoiningProcess joiningProcess);

	 DataGrid queryFullPage(PageParam param, JoiningProcess joiningProcess);

	 JoiningProcess details(int id);

}