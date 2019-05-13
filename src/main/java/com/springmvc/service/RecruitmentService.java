package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Recruitment;
 
/**
 * 招聘信息表表业务层访问接口
 * @author  自动生成
 * @version $Id: recruitmentService.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
public interface RecruitmentService {

	 String addRecruitment(Recruitment recruitment);

	 String deleteRecruitment(String[] ids);

	 String updateRecruitment(Recruitment recruitment);

	 DataGrid queryFullPage(PageParam param, Recruitment recruitment);

	 Recruitment details(int id);

}