package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.ImageSpace;
 
/**
 * 图片空间 图片类型业务层访问接口
 * @author  自动生成
 * @version $Id: imageSpaceService.java, v 0.1  2019-4-9 16:00:01  自动生成 Exp $
 */
public interface ImageSpaceService {

	 String addImageSpace(ImageSpace imageSpace);

	 String deleteImageSpace(int id);

	 String updateImageSpace(ImageSpace imageSpace);

	 DataGrid queryFullPage(PageParam param, ImageSpace imageSpace);

	 ImageSpace details(int id);

}