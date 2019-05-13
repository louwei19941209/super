package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.IfbbStrategy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * IFBB战略表数据访问接口
 * @author  自动生成
 * @version $Id: ifbbStrategyMapper.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
public interface IfbbStrategyMapper {

    int deleteByPrimaryKey(int id);

    int insert(IfbbStrategy record);

	int insertSelective(IfbbStrategy record);

	IfbbStrategy selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(IfbbStrategy record);

    //int updateByPrimaryKey(IfbbStrategy record);

    List<IfbbStrategy> selectIfbbStrategyByPage(@Param("PageParam") PageParam param, @Param("ifbbStrategy") IfbbStrategy ifbbStrategy);

}