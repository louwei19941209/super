package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.CompanyProfile;
import org.springframework.web.multipart.MultipartFile;

/**
 * 企业简介表业务层访问接口
 *
 * @author 自动生成
 * @version $Id: companyProfileService.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
public interface CompanyProfileService {

    /**
     * 添加
     *
     * @param companyProfile {@link CompanyProfile}
     * @param file           {@link MultipartFile}
     * @param savePath       保存文件路径
     * @return String
     */
    String addCompanyProfile(CompanyProfile companyProfile, MultipartFile file, String savePath);

    /**
     * 批量删除
     *
     * @param ids 主键id数组
     * @return String
     */
    String deleteCompanyProfile(String[] ids);

    /**
     * 修改
     *
     * @param companyProfile {@link CompanyProfile}
     * @param file           {@link MultipartFile}
     * @param savePath       保存文件路径
     * @return String
     */
    String updateCompanyProfile(CompanyProfile companyProfile, MultipartFile file, String savePath);

    /**
     * 查询分页
     *
     * @param param          {@link PageParam}
     * @param companyProfile {@link CompanyProfile}
     * @return DataGrid {@link DataGrid}
     */
    DataGrid queryFullPage(PageParam param, CompanyProfile companyProfile);

    /**
     * 查询详情
     *
     * @param companyProfile {@link CompanyProfile}
     * @return CompanyProfile
     */
    CompanyProfile details(CompanyProfile companyProfile);

}