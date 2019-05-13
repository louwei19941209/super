package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.mapper.ImageSpaceMapper;
import com.springmvc.po.ImageSpace;
import com.springmvc.service.ImageSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 图片空间 图片类型业务层访问接口实现
 * @author  自动生成
 * @version $Id: imageSpaceServiceImpl.java, v 0.1  2019-4-9 16:00:01  自动生成 Exp $
 */
@Service
public class ImageSpaceServiceImpl implements ImageSpaceService {

    /**图片空间 图片类型数据层访问接口实现**/
	@Autowired
	private ImageSpaceMapper imageSpaceMapper;

    @Override
    public String addImageSpace(ImageSpace imageSpace) {

        if (imageSpaceMapper.insert(imageSpace) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String deleteImageSpace(int id) {

        if (imageSpaceMapper.deleteByPrimaryKey(id) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updateImageSpace(ImageSpace imageSpace) {

        if (imageSpaceMapper.updateByPrimaryKeySelective(imageSpace) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, ImageSpace imageSpace) {

        DataGrid data = new DataGrid();

        List<ImageSpace> imageSpaceList = imageSpaceMapper.selectImageSpaceByPage(param, imageSpace);

        data.setRows(imageSpaceList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public ImageSpace details(int id) {
        return imageSpaceMapper.selectByPrimaryKey(id);
    }
	 
}