package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.PictureCategory;
 
/**
 * 图片类别表业务层访问接口
 * @author  自动生成
 * @version $Id: pictureCategoryService.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
public interface PictureCategoryService {

	 String addPictureCategory(PictureCategory pictureCategory);

	 String deletePictureCategory(int id);

	 String updatePictureCategory(PictureCategory pictureCategory);

	 DataGrid queryFullPage(PageParam param, PictureCategory pictureCategory);

	 PictureCategory details(int id);

}