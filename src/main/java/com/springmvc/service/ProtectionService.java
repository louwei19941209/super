package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Protection;

/**
 * 售后保障表业务层访问接口
 *
 * @author 自动生成
 * @version $Id: protectionService.java, v 0.1  2019-4-12 9:33:11  自动生成 Exp $
 */
public interface ProtectionService {

    /**
     * 添加
     *
     * @param protection {@link Protection}
     * @return String
     */
    String addProtection(Protection protection);

    /**
     * 删除
     *
     * @param ids 主键id
     * @return String
     */
    String deleteProtection(String[] ids);

    /**
     * 修改
     *
     * @param protection {@link Protection}
     * @return
     */
    String updateProtection(Protection protection);

    /**
     * 查询分页
     *
     * @param param      {@link PageParam}
     * @param protection {@link Protection}
     * @return DataGrid
     */
    DataGrid queryFullPage(PageParam param, Protection protection);

    /**
     * 详情
     *
     * @param id 主键id
     * @return Protection
     */
    Protection details(int id);

}