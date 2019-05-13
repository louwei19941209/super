package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.ImageSpace;
import com.springmvc.po.ImageSpaceImg;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 图片空间业务层访问接口
 *
 * @author 自动生成
 * @version $Id: imageSpaceimgService.java, v 0.1  2019-4-9 15:30:38  自动生成 Exp $
 */
public interface ImageSpaceImgService {

    String addImageSpaceImg(ImageSpaceImg imageSpaceimg);

    String deleteImageSpaceImg(int id);

    String updateImageSpaceImg(ImageSpaceImg imageSpaceimg);

    DataGrid queryFullPage(PageParam param, ImageSpaceImg imageSpaceimg);

    ImageSpaceImg details(int id);


    /**
     * 上传保存图片
     *
     * @param m        {@link ImageSpaceImg}
     * @param savePath 上传路径
     * @param file     上传文件
     * @return
     */
    boolean addImg(ImageSpaceImg m, String savePath, MultipartFile file);

    /**
     * 创建系统默认目录类型，如果存在则不需要重新创建
     *
     * @param userId 用户id
     * @param type   类型：1：word图片转存
     * @param name
     * @param remark
     * @return
     */
    public String addDefaultType(String userId, int type, String name, String remark);

    /**
     * 根据用户id，查询出用户图片 类型
     *
     * @param id 用户id
     * @return id, name(相册名称)
     */
    public List<ImageSpace> selectTypeList(String id);


}