package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Founder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 创始人表数据访问接口
 * @author  自动生成
 * @version $Id: founderMapper.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
public interface FounderMapper {

    int deleteByPrimaryKey(int id);

    int insert(Founder record);

	int insertSelective(Founder record);

	Founder selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(Founder record);

    //int updateByPrimaryKey(Founder record);

    List<Founder> selectFounderByPage(@Param("PageParam") PageParam param, @Param("founder") Founder founder);

}