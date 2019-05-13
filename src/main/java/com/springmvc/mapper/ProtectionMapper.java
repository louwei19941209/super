package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Protection;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 售后保障表数据访问接口
 *
 * @author 自动生成
 * @version $Id: protectionMapper.java, v 0.1  2019-4-12 9:33:11  自动生成 Exp $
 */
public interface ProtectionMapper {

    /**
     * 删除
     *
     * @param id 主键id
     * @return int
     */
    int deleteByPrimaryKey(int id);

    /**
     * 添加
     *
     * @param record {@link Protection}
     * @return int
     */
    int insert(Protection record);

    /**
     * 选择添加
     *
     * @param record {@link Protection}
     * @return int
     */
    int insertSelective(Protection record);

    /**
     * 根据id查询
     *
     * @param id 主键id
     * @return Protection
     */
    Protection selectByPrimaryKey(int id);

    /**
     * 按添加修改
     *
     * @param record {@link Protection}
     * @return int
     */
    int updateByPrimaryKeySelective(Protection record);

    /**
     * @param param      {@link PageParam}
     * @param protection {@link Protection}
     * @return List<Protection>
     */
    List<Protection> selectProtectionByPage(@Param("PageParam") PageParam param, @Param("protection") Protection protection);

}