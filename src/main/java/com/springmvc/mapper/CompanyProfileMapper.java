package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.CompanyProfile;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 企业简介表数据访问接口
 *
 * @author 自动生成
 * @version $Id: companyProfileMapper.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
public interface CompanyProfileMapper {

    /**
     * 根据id删除
     *
     * @param id 主键id
     * @return int
     */
    int deleteByPrimaryKey(int id);

    /**
     * 添加
     *
     * @param record {@link CompanyProfile}
     * @return int
     */
    int insert(CompanyProfile record);

    /**
     * 选择性添加
     *
     * @param record {@link CompanyProfile}
     * @return int
     */
    int insertSelective(CompanyProfile record);

    /**
     * 根据条件查询详情查询详情
     *
     * @param record {@link CompanyProfile}
     * @return CompanyProfile {@link CompanyProfile}
     */
    CompanyProfile selectByPrimaryKey(@Param("companyProfile") CompanyProfile record);

    /**
     * 根据条件修改
     *
     * @param record {@link CompanyProfile}
     * @return int
     */
    int updateByPrimaryKeySelective(CompanyProfile record);

    /**
     * @param param          {@link PageParam}
     * @param companyProfile {@link CompanyProfile}
     * @return List<CompanyProfile>
     */
    List<CompanyProfile> selectCompanyProfileByPage(@Param("PageParam") PageParam param, @Param("companyProfile") CompanyProfile companyProfile);

}