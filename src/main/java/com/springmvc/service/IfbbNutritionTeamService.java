package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.IfbbNutritionTeam;
import org.springframework.web.multipart.MultipartFile;

/**
 * IFBB营养团队表业务层访问接口
 *
 * @author 自动生成
 * @version $Id: ifbbNutritionTeamService.java, v 0.1  2019-4-23 16:43:22  自动生成 Exp $
 */
public interface IfbbNutritionTeamService {

    /**
     * 添加
     *
     * @param ifbbNutritionTeam {@link IfbbNutritionTeam}
     * @param file              {@link MultipartFile}
     * @param savePath          储存路径
     * @return String
     */
    String addIfbbNutritionTeam(IfbbNutritionTeam ifbbNutritionTeam, MultipartFile file, String savePath);

    /**
     * 删除
     *
     * @param ids 主键id
     * @return
     */
    String deleteIfbbNutritionTeam(String[] ids);

    /**
     * 修改
     *
     * @param ifbbNutritionTeam {@link IfbbNutritionTeam}
     * @param file              {@link MultipartFile}
     * @param savePath          储存路径
     * @return String
     */
    String updateIfbbNutritionTeam(IfbbNutritionTeam ifbbNutritionTeam, MultipartFile file, String savePath);

    /**
     * 分页查询
     *
     * @param param             {@link PageParam}
     * @param ifbbNutritionTeam {@link IfbbNutritionTeam}
     * @return DataGrid
     */
    DataGrid queryFullPage(PageParam param, IfbbNutritionTeam ifbbNutritionTeam);

    /**
     * 详情
     *
     * @param id 主键id
     * @return IfbbNutritionTeam
     */
    IfbbNutritionTeam details(int id);

}