/**  
 * @Project: jxoa
 * @Title: StringToDateConverter.java
 * @Package com.oa.commons.converter
 * @date 2018-5-23 下午4:26:45
 * @Copyright: 2018
 */
package com.springmvc.commons.converter;

import com.springmvc.commons.util.DateUtil;
import org.springframework.core.convert.converter.Converter;

import java.util.Date;

/**
 * 
 * 类名：StringToDateConverter
 * 功能：Spring MVC 参数格式化 字符串转换Date
 * 详细：
 * 作者：LiuJincheng
 * 版本：1.0
 * 日期：2018-5-23 下午4:26:45
 *
 */
public class StringToDateConverter implements Converter<String,Date> {
	
	
	public Date convert(String source) {
		
		return DateUtil.string2Date(source);
	}
}
