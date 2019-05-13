package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 新闻表数据访问接口
 * @author  自动生成
 * @version $Id: newsMapper.java, v 0.1  2019-4-12 9:33:11  自动生成 Exp $
 */
public interface NewsMapper {

    int deleteByPrimaryKey(int id);

    int insert(News record);

	int insertSelective(News record);

	News selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(News record);

    //int updateByPrimaryKey(News record);

    List<News> selectNewsByPage(@Param("PageParam") PageParam param, @Param("news") News news);

}