package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.SportsTeam;
import org.springframework.web.multipart.MultipartFile;

/**
 * 运动团队业务层访问接口
 *
 * @author 自动生成
 * @version $Id: sportsTeamService.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
public interface SportsTeamService {

    /**
     * 添加
     *
     * @param sportsTeam {@link SportsTeam}
     * @param file       {@link MultipartFile}
     * @param savePath   保存路径
     * @return String
     */
    String addSportsTeam(SportsTeam sportsTeam, MultipartFile file, String savePath, MultipartFile dFile);

    /**
     * 批量删除
     *
     * @param ids 主键
     * @return String
     */
    String deleteSportsTeam(String[] ids);

    /**
     * 修改
     *
     * @param sportsTeam {@link SportsTeam}
     * @param file       {@link MultipartFile}
     * @param savePath   保存路径
     * @return String
     */
    String updateSportsTeam(SportsTeam sportsTeam, MultipartFile file, String savePath, MultipartFile dFile);

    /**
     * 分页查询
     *
     * @param param      {@link PageParam}
     * @param sportsTeam {@link SportsTeam}
     * @return DataGrid
     */
    DataGrid queryFullPage(PageParam param, SportsTeam sportsTeam);

    /**
     * 详情
     *
     * @param id 主键
     * @return SportsTeam
     */
    SportsTeam details(int id);

}