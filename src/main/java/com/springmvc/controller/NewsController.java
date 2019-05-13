package com.springmvc.controller;

import com.springmvc.commons.base.BaseAction;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.po.News;
import com.springmvc.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.Date;

/**
 * 新闻表控制器
 *
 * @author 自动生成
 * @version $Id: newsService.java, v 0.1  2019-4-12 9:33:11  自动生成 Exp $
 */
@Controller
@RequestMapping("news")
public class NewsController extends BaseAction {

    @Autowired
    private NewsService newsService;

    /**
     * 文件保存路径
     */
    private static final String SAVEPATH = BaseConfig.uploadPath + "news";

    /**
     * 列表页
     *
     * @return
     */
    @RequestMapping("load")
    public String load() {
        return "news/load";
    }

    /**
     * 添加页面
     *
     * @return
     */
    @RequestMapping("addPage")
    public String addPage() {
        return "news/add";
    }

    /**
     * 添加
     *
     * @param news {@link News}
     * @return ModelAndView
     */
    @RequestMapping("/add")
    public ModelAndView add(News news, MultipartFile file) {

        File savePath = new File(SAVEPATH);

        if (!savePath.isDirectory() && !savePath.exists()) {
            savePath.mkdirs();
        }

        if (file != null && !file.isEmpty()) {
            ModelAndView view = FileUtils.validateFile(file, 1024L * 1024 * 500, null, new String[]{"exe"});
            if (view != null) {
                return view;
            }
        }

        news.setCreateTime(new Date(System.currentTimeMillis()));
        return ajaxDone(newsService.addNews(news, file, SAVEPATH));
    }

    /**
     * 删除
     *
     * @param id 主键id
     * @return ModelAndView
     */
    @RequestMapping("/delete")
    public ModelAndView delete(String[] ids) {
        return ajaxDone(newsService.deleteNews(ids));
    }

    /**
     * 修改
     *
     * @param news {@link News}
     * @return ModelAndView
     */
    @RequestMapping("/update")
    public ModelAndView update(News news, MultipartFile file) {
        return ajaxDone(newsService.updateNews(news));
    }

    /**
     * 分页查看
     *
     * @param param {@link PageParam}
     * @param news  {@link News}
     * @return ModelAndView
     */
    @RequestMapping("/select/by/page")
    public ModelAndView selectByPage(PageParam param, News news) {
        return ajaxJson(newsService.queryFullPage(param, news));
    }

    /**
     * 跳转修改页面
     *
     * @param id 主键id
     * @return String  返回的修改页面
     */
    @RequestMapping("update/page")
    public String updatePage(int id, ModelMap map) {
        News news = newsService.details(id);
        if (news == null) {
            return NODATA;
        }
        map.addAttribute("news", news);
        return "news/update";
    }

}