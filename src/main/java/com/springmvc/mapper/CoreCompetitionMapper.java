package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.CoreCompetition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 核心竞争表数据访问接口
 * @author  自动生成
 * @version $Id: corecompetitionMapper.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
public interface CoreCompetitionMapper {

    int deleteByPrimaryKey(int id);

    int insert(CoreCompetition record);

	int insertSelective(CoreCompetition record);

	CoreCompetition selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(CoreCompetition record);

    //int updateByPrimaryKey(CoreCompetition record);

    List<CoreCompetition> selectCoreCompetitionByPage(@Param("PageParam") PageParam param, @Param("corecompetition") CoreCompetition corecompetition);

}