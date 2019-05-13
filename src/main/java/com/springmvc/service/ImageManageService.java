package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.ImageManage;
 
/**
 * 图片管理表业务层访问接口
 * @author  自动生成
 * @version $Id: imageManageService.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
public interface ImageManageService {

	 String addImageManage(ImageManage imageManage);

	 String deleteImageManage(int id);

	 String updateImageManage(ImageManage imageManage);

	 DataGrid queryFullPage(PageParam param, ImageManage imageManage);

	 ImageManage details(int id);

}