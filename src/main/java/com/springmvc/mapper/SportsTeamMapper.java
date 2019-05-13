package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.SportsTeam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 运动团队数据访问接口
 * @author  自动生成
 * @version $Id: sportsTeamMapper.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
public interface SportsTeamMapper {

    int deleteByPrimaryKey(int id);

    int insert(SportsTeam record);

	int insertSelective(SportsTeam record);

	SportsTeam selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(SportsTeam record);

    //int updateByPrimaryKey(SportsTeam record);

    List<SportsTeam> selectSportsTeamByPage(@Param("PageParam") PageParam param, @Param("sportsTeam") SportsTeam sportsTeam);

}