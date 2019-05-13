package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.CompanyCulture;
import org.springframework.web.multipart.MultipartFile;

/**
 * 企业文化表业务层访问接口
 *
 * @author 自动生成
 * @version $Id: companycultureService.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
public interface CompanyCultureService {

    /**
     * 添加
     *
     * @param companyculture {@link CompanyCulture}
     * @return String
     */
    String addCompanyCulture(CompanyCulture companyculture, MultipartFile file, String savePath);

    /**
     * 根据id删除
     *
     * @param id 主键id
     * @return String
     */
    String deleteCompanyCulture(String id);

    /**
     * 修改
     *
     * @param companyculture {@link CompanyCulture}
     * @return String
     */
    String updateCompanyCulture(CompanyCulture companyculture, MultipartFile file, String savePath);

    /**
     * 查询全部并分页
     *
     * @param param          {@link PageParam}
     * @param companyculture {@link CompanyCulture}
     * @return DataGrid
     */
    DataGrid queryFullPage(PageParam param, CompanyCulture companyculture);

    /**
     * 详情
     *
     * @param id 主键
     * @return CompanyCulture
     */
    CompanyCulture details(Long id);

}