package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Hexin;
import org.springframework.web.multipart.MultipartFile;

/**
 * 核心竞争业务层访问接口
 * @author  自动生成
 * @version $Id: hexinService.java, v 0.1  2019-5-13 9:36:43  自动生成 Exp $
 */
public interface HexinService {

	 String addHexin(Hexin hexin, MultipartFile file, String savePath);

	 String deleteHexin(String[] id);

	 String updateHexin(Hexin hexin, MultipartFile file, String savePath);

	 DataGrid queryFullPage(PageParam param, Hexin hexin);

	 Hexin details(int id);

}