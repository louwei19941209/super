package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.News;
import org.springframework.web.multipart.MultipartFile;

/**
 * 新闻表业务层访问接口
 * @author  自动生成
 * @version $Id: newsService.java, v 0.1  2019-4-12 9:33:11  自动生成 Exp $
 */
public interface NewsService {

	 String addNews(News news, MultipartFile file, String savePath);

	 String deleteNews(String[] ids);

	 String updateNews(News news);

	 DataGrid queryFullPage(PageParam param, News news);

	 News details(int id);

}