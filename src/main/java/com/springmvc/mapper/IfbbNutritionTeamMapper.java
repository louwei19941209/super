package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.IfbbNutritionTeam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * IFBB营养团队表数据访问接口
 * @author  自动生成
 * @version $Id: ifbbNutritionTeamMapper.java, v 0.1  2019-4-23 16:43:22  自动生成 Exp $
 */
public interface IfbbNutritionTeamMapper {

    int deleteByPrimaryKey(int id);

    int insert(IfbbNutritionTeam record);

	int insertSelective(IfbbNutritionTeam record);

	IfbbNutritionTeam selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(IfbbNutritionTeam record);

    //int updateByPrimaryKey(IfbbNutritionTeam record);

    List<IfbbNutritionTeam> selectIfbbNutritionTeamByPage(@Param("PageParam") PageParam param, @Param("ifbbNutritionTeam") IfbbNutritionTeam ifbbNutritionTeam);

}