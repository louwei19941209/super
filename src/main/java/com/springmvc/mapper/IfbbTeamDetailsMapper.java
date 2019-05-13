package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.IfbbTeamDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * IFBB团队详情表数据访问接口
 * @author  自动生成
 * @version $Id: ifbbTeamDetailsMapper.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
public interface IfbbTeamDetailsMapper {

    int deleteByPrimaryKey(int id);

    int insert(IfbbTeamDetails record);

	int insertSelective(IfbbTeamDetails record);

	IfbbTeamDetails selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(IfbbTeamDetails record);

    //int updateByPrimaryKey(IfbbTeamDetails record);

    List<IfbbTeamDetails> selectIfbbTeamDetailsByPage(@Param("PageParam") PageParam param, @Param("ifbbTeamDetails") IfbbTeamDetails ifbbTeamDetails);

}