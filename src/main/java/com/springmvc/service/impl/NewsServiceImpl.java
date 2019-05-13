package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.NewsMapper;
import com.springmvc.po.News;
import com.springmvc.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * 新闻表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: newsServiceImpl.java, v 0.1  2019-4-12 9:33:11  自动生成 Exp $
 */
@Service
public class NewsServiceImpl implements NewsService {

    /**
     * 新闻表数据层访问接口实现
     **/
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public String addNews(News news, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {

                String uuid = FileUtils.getUUID();

                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                news.setImage(BaseConfig.url + "tmp/news/" + uuid + "." + ext);

            }

            if (newsMapper.insert(news) > 0) {
                return MsgConfig.MSG_KEY_SUCCESS;
            } else {
                return MsgConfig.MSG_KEY_FAIL;
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public String deleteNews(String[] ids) {

        try {

            for (String id : ids) {
                newsMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }
            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public String updateNews(News news) {

        if (newsMapper.updateByPrimaryKeySelective(news) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, News news) {

        DataGrid data = new DataGrid();

        List<News> newsList = newsMapper.selectNewsByPage(param, news);

        data.setRows(newsList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public News details(int id) {
        return newsMapper.selectByPrimaryKey(id);
    }

}