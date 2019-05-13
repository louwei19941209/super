package com.springmvc.mapper;

import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Contact;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 联系我们数据访问接口
 * @author  自动生成
 * @version $Id: contactMapper.java, v 0.1  2019-4-19 11:01:41  自动生成 Exp $
 */
public interface ContactMapper {

    int deleteByPrimaryKey(int id);

    int insert(Contact record);

	int insertSelective(Contact record);

	Contact selectByPrimaryKey(int id);

	int updateByPrimaryKeySelective(Contact record);

    //int updateByPrimaryKey(Contact record);

    List<Contact> selectContactByPage(@Param("PageParam") PageParam param, @Param("contact") Contact contact);

}