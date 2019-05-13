package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Founder;
import org.springframework.web.multipart.MultipartFile;

/**
 * 创始人表业务层访问接口
 *
 * @author 自动生成
 * @version $Id: founderService.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
public interface FounderService {

    /**
     * 添加
     *
     * @param founder  {@link Founder}
     * @param file     {@link MultipartFile}
     * @param savePath 文件保存路径
     * @return String
     */
    String addFounder(Founder founder, MultipartFile file, String savePath);

    /**
     * 批量删除
     *
     * @param ids 主角按
     * @return String
     */
    String deleteFounder(String[] ids);

    /**
     * 修改
     *
     * @param founder  {@link Founder}
     * @param file     {@link MultipartFile}
     * @param savePath 文件保存路径
     * @return String
     */
    String updateFounder(Founder founder, MultipartFile file, String savePath);

    /**
     * 分页查询
     *
     * @param param   {@link PageParam}
     * @param founder {@link Founder}
     * @return DataGrid
     */
    DataGrid queryFullPage(PageParam param, Founder founder);

    /**
     * 详情
     *
     * @param id 主键
     * @return Founder
     */
    Founder details(int id);

}