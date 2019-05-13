package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 产品表数据访问接口
 * @author  自动生成
 * @version $Id: productMapper.java, v 0.1  2019-4-11 12:00:20  自动生成 Exp $
 */
public interface ProductMapper {

    int deleteByPrimaryKey(int id);

    int insert(Product record);

	int insertSelective(Product record);

	Product selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(Product record);

    //int updateByPrimaryKey(Product record);

    List<Product> selectProductByPage(@Param("PageParam") PageParam param, @Param("product") Product product);

}