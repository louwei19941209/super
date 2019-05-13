package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.DevelopmentPath;
import org.springframework.web.multipart.MultipartFile;

/**
 * 发展历程表业务层访问接口
 *
 * @author 自动生成
 * @version $Id: developmentPathService.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
public interface DevelopmentPathService {

    /**
     * 添加
     *
     * @param developmentPath {@link DevelopmentPath}
     * @param file            {@link MultipartFile}
     * @param savePath        保存路径
     * @return String
     */
    String addDevelopmentPath(DevelopmentPath developmentPath, MultipartFile file, String savePath);

    /**
     * 根据id 批量删除
     *
     * @param ids id
     * @return String
     */
    String deleteDevelopmentPath(String[] ids);

    /**
     * 修改
     *
     * @param developmentPath {@link DevelopmentPath}
     * @param file            {@link MultipartFile}
     * @param savePath        文件保存路径
     * @return String
     */
    String updateDevelopmentPath(DevelopmentPath developmentPath, MultipartFile file, String savePath);

    /**
     * 查询全部 分页
     *
     * @param param           {@link PageParam}
     * @param developmentPath {@link DevelopmentPath}
     * @return DataGrid
     */
    DataGrid queryFullPage(PageParam param, DevelopmentPath developmentPath);

    /**
     * 根据id查询详情
     *
     * @param id 主键id
     * @return DevelopmentPath
     */
    DevelopmentPath details(int id);

}