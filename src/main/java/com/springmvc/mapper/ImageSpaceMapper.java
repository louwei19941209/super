package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.ImageSpace;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 图片空间 图片类型数据访问接口
 *
 * @author 自动生成
 * @version $Id: imageSpaceMapper.java, v 0.1  2019-4-9 16:00:01  自动生成 Exp $
 */
public interface ImageSpaceMapper {

    int deleteByPrimaryKey(int id);

    int insert(ImageSpace record);

    int insertSelective(ImageSpace record);

    ImageSpace selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(ImageSpace record);

    //int updateByPrimaryKey(ImageSpace record);

    List<ImageSpace> selectImageSpaceByPage(@Param("PageParam") PageParam param, @Param("imageSpace") ImageSpace imageSpace);

    /**
     * 根据条件查询
     *
     * @param userId
     * @param type
     * @return
     */
    ImageSpace queryByCondition(@Param("userId")String userId, @Param("type") Integer type);


    List<ImageSpace> queryAllByCondition(@Param("userId")String userId, @Param("type") Integer type);


}