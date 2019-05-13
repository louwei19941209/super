package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Franchisee;
import org.springframework.web.multipart.MultipartFile;

/**
 * 加盟商表业务层访问接口
 * @author  自动生成
 * @version $Id: franchiseeService.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
public interface FranchiseeService {

	 String addFranchisee(Franchisee franchisee, MultipartFile file, String savePath);

	 String deleteFranchisee(String[] ids);

	 String updateFranchisee(Franchisee franchisee, MultipartFile file, String savePath);

	 DataGrid queryFullPage(PageParam param, Franchisee franchisee);

	 Franchisee details(int id);

}