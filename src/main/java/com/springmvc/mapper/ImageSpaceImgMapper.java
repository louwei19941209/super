package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.ImageSpaceImg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 图片空间数据访问接口
 * @author  自动生成
 * @version $Id: imageSpaceimgMapper.java, v 0.1  2019-4-9 15:30:38  自动生成 Exp $
 */
public interface ImageSpaceImgMapper {

    int deleteByPrimaryKey(int id);

    int insert(ImageSpaceImg record);

	int insertSelective(ImageSpaceImg record);

	ImageSpaceImg selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(ImageSpaceImg record);

    //int updateByPrimaryKey(ImageSpaceImg record);

    List<ImageSpaceImg> selectImageSpaceImgByPage(@Param("PageParam") PageParam param, @Param("imageSpaceimg") ImageSpaceImg imageSpaceimg);

}