package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.ProductCategories;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 产品类型表数据访问接口
 *
 * @author 自动生成
 * @version $Id: productCategoriesMapper.java, v 0.1  2019-4-11 12:00:20  自动生成 Exp $
 */
public interface ProductCategoriesMapper {

    /**
     * 根据主键删除
     *
     * @param id 主键id
     * @return int
     */
    int deleteByPrimaryKey(int id);

    /**
     * 添加
     *
     * @param record {@link ProductCategories}
     * @return int
     */
    int insert(ProductCategories record);

    /**
     * 选择添加
     *
     * @param record {@link ProductCategories}
     * @return int
     */
    int insertSelective(ProductCategories record);

    /**
     * 查看详情
     *
     * @param id 主键id
     * @return ProductCategories
     */
    ProductCategories selectByPrimaryKey(int id);

    /**
     * 按条件修改
     *
     * @param record {@link ProductCategories}
     * @return int
     */
    int updateByPrimaryKeySelective(ProductCategories record);

    /**
     * 查询 分页
     *
     * @param param             {@link PageParam}
     * @param productCategories {@link ProductCategories}
     * @return List<ProductCategories>
     */
    List<ProductCategories> selectProductCategoriesByPage(@Param("PageParam") PageParam param, @Param("productCategories") ProductCategories productCategories);

}