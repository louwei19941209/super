package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Store;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 门店风采表数据访问接口
 * @author  自动生成
 * @version $Id: storeMapper.java, v 0.1  2019-4-19 10:03:56  自动生成 Exp $
 */
public interface StoreMapper {

    int deleteByPrimaryKey(int id);

    int insert(Store record);

	int insertSelective(Store record);

	Store selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(Store record);

    //int updateByPrimaryKey(Store record);

    List<Store> selectStoreByPage(@Param("PageParam") PageParam param, @Param("store") Store store);

}