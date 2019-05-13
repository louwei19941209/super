package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Franchisee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 加盟商表数据访问接口
 * @author  自动生成
 * @version $Id: franchiseeMapper.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
public interface FranchiseeMapper {

    int deleteByPrimaryKey(int id);

    int insert(Franchisee record);

	int insertSelective(Franchisee record);

	Franchisee selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(Franchisee record);

    //int updateByPrimaryKey(Franchisee record);

    List<Franchisee> selectFranchiseeByPage(@Param("PageParam") PageParam param, @Param("franchisee") Franchisee franchisee);

}