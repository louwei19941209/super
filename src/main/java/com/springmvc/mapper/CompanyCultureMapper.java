package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.CompanyCulture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 企业文化表数据访问接口
 *
 * @author 自动生成
 * @version $Id: companycultureMapper.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
public interface CompanyCultureMapper {

    /**
     * 根据id删除
     *
     * @param id 主键id
     * @return int
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 添加
     *
     * @param record {@link CompanyCulture}
     * @return int
     */
    int insert(CompanyCulture record);

    /**
     * 选择添加
     *
     * @param record {@link CompanyCulture}
     * @return int
     */
    int insertSelective(CompanyCulture record);

    /**
     * 根据id查询
     *
     * @param id 主键id
     * @return CompanyCulture {@link CompanyCulture}
     */
    CompanyCulture selectByPrimaryKey(Long id);

    /**
     * 根据条件查询
     *
     * @param record {@link CompanyCulture}
     * @return CompanyCulture {@link CompanyCulture}
     */
    int updateByPrimaryKeySelective(CompanyCulture record);

    /**
     * 查询分页
     *
     * @param param          {@link PageParam}
     * @param companyculture {@link CompanyCulture}
     * @return
     */
    List<CompanyCulture> selectCompanyCultureByPage(@Param("PageParam") PageParam param, @Param("companyculture") CompanyCulture companyculture);

}