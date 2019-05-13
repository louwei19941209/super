package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.SyDept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SyDeptMapper {
    int deleteByPrimaryKey(String id);

    int insert(SyDept record);

    int insertSelective(SyDept record);

    SyDept selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SyDept record);

    int updateByPrimaryKey(SyDept record);

    List<SyDept> selectAll();

    List<SyDept> selectAllByPage(@Param("PageParam") PageParam param, @Param("dept") SyDept dept);

}