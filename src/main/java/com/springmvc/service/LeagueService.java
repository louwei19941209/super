package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.League;

import java.util.List;
import java.util.Map;

/**
 * 申请加盟表业务层访问接口
 *
 * @author 自动生成
 * @version $Id: leagueService.java, v 0.1  2019-4-19 10:03:56  自动生成 Exp $
 */
public interface LeagueService {

    /**
     * 添加
     *
     * @param league {@link League}
     * @return String
     */
    String addLeague(League league);

    /**
     * 删除
     *
     * @param id 主键
     * @return String
     */
    String deleteLeague(int id);

    /**
     * 修改
     *
     * @param league {@link League}
     * @return String
     */
    String updateLeague(League league);

    /**
     * 查询 分页
     *
     * @param param  {@link PageParam}
     * @param league {@link League}
     * @return DataGrid
     */
    DataGrid queryFullPage(PageParam param, League league);

    /**
     * 详情
     *
     * @param id 主键
     * @return League
     */
    League details(int id);

    /**
     * 查询城市
     *
     * @param id 省份id
     * @return List<Map   <   String   ,       Object>>
     */
    List<Map<String, Object>> selectCity(String id);

}