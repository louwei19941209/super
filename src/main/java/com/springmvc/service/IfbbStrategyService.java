package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.IfbbStrategy;
import org.springframework.web.multipart.MultipartFile;

/**
 * IFBB战略表业务层访问接口
 *
 * @author 自动生成
 * @version $Id: ifbbStrategyService.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
public interface IfbbStrategyService {

    /**
     * 添加
     *
     * @param ifbbStrategy {@link IfbbStrategy}
     * @param file         {@link MultipartFile}
     * @param savePath     保存路径
     * @return String
     */
    String addIfbbStrategy(IfbbStrategy ifbbStrategy, MultipartFile file, String savePath);

    /**
     * 删除
     *
     * @param ids 主键
     * @return String
     */
    String deleteIfbbStrategy(String[] ids);

    /**
     * 修改
     *
     * @param ifbbStrategy {@link IfbbStrategy}
     * @param file         {@link MultipartFile}
     * @param savePath     保存路径
     * @return String
     */
    String updateIfbbStrategy(IfbbStrategy ifbbStrategy, MultipartFile file, String savePath);

    /**
     * 分页查询
     *
     * @param param        {@link PageParam}
     * @param ifbbStrategy {@link IfbbStrategy}
     * @return DataGrid
     */
    DataGrid queryFullPage(PageParam param, IfbbStrategy ifbbStrategy);

    /**
     * 详情
     *
     * @param id 主键
     * @return IfbbStrategy
     */
    IfbbStrategy details(int id);

}