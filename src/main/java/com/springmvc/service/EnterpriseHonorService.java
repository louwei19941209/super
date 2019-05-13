package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.FileList;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.EnterpriseHonor;

import java.util.List;
import java.util.Map;

/**
 * 企业荣誉业务层访问接口
 *
 * @author 自动生成
 * @version $Id: enterpriseHonorService.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
public interface EnterpriseHonorService {

    /**
     * 添加
     *
     * @param enterpriseHonor {@link EnterpriseHonor}
     * @param files            {@link FileList}
     * @param savePath        文件保存路径
     * @return String
     */
    String addEnterpriseHonor(EnterpriseHonor enterpriseHonor, FileList files, String savePath);

    /**
     * 删除
     *
     * @param ids 主键
     * @return String
     */
    String deleteEnterpriseHonor(String[] ids);

    /**
     * 修改
     *
     * @param enterpriseHonor {@link EnterpriseHonor}
     * @param files            {@link FileList}
     * @param savePath        文件保存路径
     * @return String
     */
    String updateEnterpriseHonor(EnterpriseHonor enterpriseHonor, FileList files, String savePath);

    /**
     * 分页查询
     *
     * @param param           {@link PageParam}
     * @param enterpriseHonor {@link EnterpriseHonor}
     * @return DataGrid
     */
    DataGrid queryFullPage(PageParam param, EnterpriseHonor enterpriseHonor);

    /**
     * 详情
     *
     * @param id 主机那
     * @return EnterpriseHonor
     */
    EnterpriseHonor details(int id);

    /**
     * 根据 honorId 查询图片
     * @param honorId 企业荣誉id
     * @return List<Map<String, Object>>
     */
    List<Map<String, Object>> queryFiles(int honorId);

}