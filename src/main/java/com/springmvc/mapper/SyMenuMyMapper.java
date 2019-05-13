package com.springmvc.mapper;

import com.springmvc.po.SyMenuMy;

public interface SyMenuMyMapper {
    int deleteByPrimaryKey(String id);

    int insert(SyMenuMy record);

    int insertSelective(SyMenuMy record);

    SyMenuMy selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SyMenuMy record);

    int updateByPrimaryKey(SyMenuMy record);

}