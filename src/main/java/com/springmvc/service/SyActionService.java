package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.SyAction;

public interface SyActionService
{
    /**
     * 查询action
     **/
    DataGrid selectAction(PageParam param, SyAction action);

    /**
     * 添加action
     **/
    String addAction(SyAction action);

    /**
     * 根据id查看详情
     */
    SyAction selectActionById(String id);

    /**
     * 修改action
     */
    String updateAction(SyAction action);

    /**
     * 删除action
     */
    String deleteAction(String[] ids);
}
