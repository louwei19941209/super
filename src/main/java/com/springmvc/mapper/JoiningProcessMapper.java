package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.JoiningProcess;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 加盟流程表数据访问接口
 * @author  自动生成
 * @version $Id: joiningProcessMapper.java, v 0.1  2019-4-19 10:03:55  自动生成 Exp $
 */
public interface JoiningProcessMapper {

    int deleteByPrimaryKey(int id);

    int insert(JoiningProcess record);

	int insertSelective(JoiningProcess record);

	JoiningProcess selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(JoiningProcess record);

    //int updateByPrimaryKey(JoiningProcess record);

    List<JoiningProcess> selectJoiningProcessByPage(@Param("PageParam") PageParam param, @Param("joiningProcess") JoiningProcess joiningProcess);

}