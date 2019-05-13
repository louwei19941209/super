package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.ImageManageMapper;
import com.springmvc.po.ImageManage;
import com.springmvc.service.ImageManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 图片管理表业务层访问接口实现
 * @author  自动生成
 * @version $Id: imageManageServiceImpl.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
@Service
public class ImageManageServiceImpl implements ImageManageService {

    /**图片管理表数据层访问接口实现**/
	@Autowired
	private ImageManageMapper imageManageMapper;

    @Override
    public String addImageManage(ImageManage imageManage) {

        if (imageManageMapper.insert(imageManage) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String deleteImageManage(int id) {

        if (imageManageMapper.deleteByPrimaryKey(id) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updateImageManage(ImageManage imageManage) {

        if (imageManageMapper.updateByPrimaryKeySelective(imageManage) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, ImageManage imageManage) {

        DataGrid data = new DataGrid();

        List<ImageManage> imageManageList = imageManageMapper.selectImageManageByPage(param, imageManage);

        data.setRows(imageManageList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public ImageManage details(int id) {
        return imageManageMapper.selectByPrimaryKey(id);
    }
	 
}