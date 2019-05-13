package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Hexin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 核心竞争数据访问接口
 * @author  自动生成
 * @version $Id: hexinMapper.java, v 0.1  2019-5-13 9:36:43  自动生成 Exp $
 */
public interface HexinMapper {

    int deleteByPrimaryKey(int id);

    int insert(Hexin record);

	int insertSelective(Hexin record);

	Hexin selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(Hexin record);

    //int updateByPrimaryKey(Hexin record);

    List<Hexin> selectHexinByPage(@Param("PageParam") PageParam param, @Param("hexin") Hexin hexin);

}