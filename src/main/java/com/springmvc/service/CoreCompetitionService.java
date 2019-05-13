package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.CoreCompetition;
import org.springframework.web.multipart.MultipartFile;

/**
 * 核心竞争表业务层访问接口
 *
 * @author 自动生成
 * @version $Id: corecompetitionService.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
public interface CoreCompetitionService {

    /**
     * 添加
     *
     * @param corecompetition {@link CoreCompetition}
     * @param file            {@link MultipartFile}
     * @param savePath        文件保存路径
     * @return String
     */
    String addCoreCompetition(CoreCompetition corecompetition, MultipartFile file, String savePath);

    /**
     * 删除
     *
     * @param ids 主键
     * @return String
     */
    String deleteCoreCompetition(String[] ids);

    /**
     * 修改
     *
     * @param corecompetition {@link CoreCompetition}
     * @param file            {@link MultipartFile}
     * @param savePath        文件保存路径
     * @return String
     */
    String updateCoreCompetition(CoreCompetition corecompetition, MultipartFile file, String savePath);

    /**
     * 查询 分页
     *
     * @param param           {@link PageParam}
     * @param corecompetition {@link CoreCompetition}
     * @return
     */
    DataGrid queryFullPage(PageParam param, CoreCompetition corecompetition);

    /**
     * 详情
     *
     * @param id 主键
     * @return CoreCompetition
     */
    CoreCompetition details(int id);

}