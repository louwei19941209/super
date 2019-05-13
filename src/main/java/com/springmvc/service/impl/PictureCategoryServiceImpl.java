package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.PictureCategoryMapper;
import com.springmvc.po.PictureCategory;
import com.springmvc.service.PictureCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 图片类别表业务层访问接口实现
 * @author  自动生成
 * @version $Id: pictureCategoryServiceImpl.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
@Service
public class PictureCategoryServiceImpl implements PictureCategoryService {

    /**图片类别表数据层访问接口实现**/
	@Autowired
	private PictureCategoryMapper pictureCategoryMapper;

    @Override
    public String addPictureCategory(PictureCategory pictureCategory) {

        if (pictureCategoryMapper.insert(pictureCategory) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String deletePictureCategory(int id) {

        if (pictureCategoryMapper.deleteByPrimaryKey(id) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updatePictureCategory(PictureCategory pictureCategory) {

        if (pictureCategoryMapper.updateByPrimaryKeySelective(pictureCategory) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, PictureCategory pictureCategory) {

        DataGrid data = new DataGrid();

        List<PictureCategory> pictureCategoryList = pictureCategoryMapper.selectPictureCategoryByPage(param, pictureCategory);

        data.setRows(pictureCategoryList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public PictureCategory details(int id) {
        return pictureCategoryMapper.selectByPrimaryKey(id);
    }
	 
}