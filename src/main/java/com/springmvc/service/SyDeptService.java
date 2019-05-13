package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.SyDept;

import java.util.List;

public interface SyDeptService
{
    /**
     * 根据部门id获取部门名称
     */
    SyDept selectDeptNameByDeptId(String deptId);

    /**查询所有部门,不分页**/
    List<SyDept> selectAllDept();

    /**查询所有部门,分页**/
    DataGrid selectAllDeptByPage(PageParam param, SyDept dept);

    SyDept selectDeptById(String id);

}
