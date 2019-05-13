package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.AfterSale;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 售后表数据访问接口
 * @author  自动生成
 * @version $Id: afterSaleMapper.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
public interface AfterSaleMapper {

    int deleteByPrimaryKey(int id);

    int insert(AfterSale record);

	int insertSelective(AfterSale record);

	AfterSale selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(AfterSale record);

    //int updateByPrimaryKey(AfterSale record);

    List<AfterSale> selectAfterSaleByPage(@Param("PageParam") PageParam param, @Param("afterSale") AfterSale afterSale);

}