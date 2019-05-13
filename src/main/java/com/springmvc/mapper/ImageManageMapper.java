package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.ImageManage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 图片管理表数据访问接口
 * @author  自动生成
 * @version $Id: imageManageMapper.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
public interface ImageManageMapper {

    int deleteByPrimaryKey(int id);

    int insert(ImageManage record);

	int insertSelective(ImageManage record);

	ImageManage selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(ImageManage record);

    //int updateByPrimaryKey(ImageManage record);

    List<ImageManage> selectImageManageByPage(@Param("PageParam") PageParam param, @Param("imageManage") ImageManage imageManage);

}