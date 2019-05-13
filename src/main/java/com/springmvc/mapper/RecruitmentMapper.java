package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Recruitment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 招聘信息表表数据访问接口
 * @author  自动生成
 * @version $Id: recruitmentMapper.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
public interface RecruitmentMapper {

    int deleteByPrimaryKey(int id);

    int insert(Recruitment record);

	int insertSelective(Recruitment record);

	Recruitment selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(Recruitment record);

    //int updateByPrimaryKey(Recruitment record);

    List<Recruitment> selectRecruitmentByPage(@Param("PageParam") PageParam param, @Param("recruitment") Recruitment recruitment);

}