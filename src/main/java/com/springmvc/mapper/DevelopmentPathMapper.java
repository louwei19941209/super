package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.DevelopmentPath;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 发展历程表数据访问接口
 * @author  自动生成
 * @version $Id: developmentPathMapper.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
public interface DevelopmentPathMapper {

    int deleteByPrimaryKey(int id);

    int insert(DevelopmentPath record);

	int insertSelective(DevelopmentPath record);

	DevelopmentPath selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(DevelopmentPath record);

    //int updateByPrimaryKey(DevelopmentPath record);

    List<DevelopmentPath> selectDevelopmentPathByPage(@Param("PageParam") PageParam param, @Param("developmentPath") DevelopmentPath developmentPath);

}