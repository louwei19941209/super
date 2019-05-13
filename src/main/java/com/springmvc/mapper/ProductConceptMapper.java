package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.ProductConcept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 产品理念表数据访问接口
 * @author  自动生成
 * @version $Id: productConceptMapper.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
public interface ProductConceptMapper {

    int deleteByPrimaryKey(int id);

    int insert(ProductConcept record);

	int insertSelective(ProductConcept record);

	ProductConcept selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(ProductConcept record);

    //int updateByPrimaryKey(ProductConcept record);

    List<ProductConcept> selectProductConceptByPage(@Param("PageParam") PageParam param, @Param("productConcept") ProductConcept productConcept);

}