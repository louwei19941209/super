package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.SyAction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SyActionMapper {
    int deleteByPrimaryKey(String id);

    int insert(SyAction record);

    int insertSelective(SyAction record);

    SyAction selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SyAction record);

    int updateByPrimaryKey(SyAction record);

    /**查询action**/
    List<SyAction> selectAction(@Param("PageParam")PageParam param, @Param("SyAction")SyAction action);

    /**根据用户角色id查询所有action**/
    List<SyAction> selectMyAction(List<String> roleIds);

}