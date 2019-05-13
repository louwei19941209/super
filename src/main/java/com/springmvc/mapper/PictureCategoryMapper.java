package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.PictureCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 图片类别表数据访问接口
 * @author  自动生成
 * @version $Id: pictureCategoryMapper.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
public interface PictureCategoryMapper {

    int deleteByPrimaryKey(int id);

    int insert(PictureCategory record);

	int insertSelective(PictureCategory record);

	PictureCategory selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(PictureCategory record);

    //int updateByPrimaryKey(PictureCategory record);

    List<PictureCategory> selectPictureCategoryByPage(@Param("PageParam") PageParam param, @Param("pictureCategory") PictureCategory pictureCategory);

}