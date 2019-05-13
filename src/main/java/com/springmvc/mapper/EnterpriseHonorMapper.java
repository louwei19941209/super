package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.EnterpriseHonor;
import com.springmvc.po.HonorFile;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 企业荣誉数据访问接口
 *
 * @author 自动生成
 * @version $Id: enterpriseHonorMapper.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
public interface EnterpriseHonorMapper {

    int deleteByPrimaryKey(int id);

    int insert(EnterpriseHonor record);

    int insertSelective(EnterpriseHonor record);

    EnterpriseHonor selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(EnterpriseHonor record);

    //int updateByPrimaryKey(EnterpriseHonor record);

    List<EnterpriseHonor> selectEnterpriseHonorByPage(@Param("PageParam") PageParam param, @Param("enterpriseHonor") EnterpriseHonor enterpriseHonor);

    /**
     * 添加附件
     *
     * @param honorFile
     * @return
     */
    int insertFile(HonorFile honorFile);

    /**
     * 根据企业荣誉id 查询文件
     *
     * @param honorId 企业荣誉id
     * @return List<Map   <   String   ,       Object>>
     */
    List<Map<String, Object>> selectFiles(int honorId);

    /**
     * 根据honorId 删除 文件
     * @param honorId 企业荣誉id
     * @return int
     */
    int deleteFile(int honorId);
}