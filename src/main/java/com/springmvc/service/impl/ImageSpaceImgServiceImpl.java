package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.exception.MyRuntimeException;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.DateUtil;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.commons.util.ServletUtil;
import com.springmvc.mapper.ImageSpaceImgMapper;
import com.springmvc.mapper.ImageSpaceMapper;
import com.springmvc.po.ImageSpace;
import com.springmvc.po.ImageSpaceImg;
import com.springmvc.service.ImageSpaceImgService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;


/**
 * 图片空间业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: imageSpaceimgServiceImpl.java, v 0.1  2019-4-9 15:30:38  自动生成 Exp $
 */
@Service
public class ImageSpaceImgServiceImpl implements ImageSpaceImgService {

    /**
     * 图片空间数据层访问接口实现
     **/
    @Autowired
    private ImageSpaceImgMapper imageSpaceimgMapper;

    @Autowired
    private ImageSpaceMapper imageSpaceMapper;

    @Override
    public String addImageSpaceImg(ImageSpaceImg imageSpaceimg) {

        if (imageSpaceimgMapper.insert(imageSpaceimg) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String deleteImageSpaceImg(int id) {

        if (imageSpaceimgMapper.deleteByPrimaryKey(id) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updateImageSpaceImg(ImageSpaceImg imageSpaceimg) {

        if (imageSpaceimgMapper.updateByPrimaryKeySelective(imageSpaceimg) > 0) {
            return MsgConfig.MSG_KEY_SUCCESS;
        } else {
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public DataGrid queryFullPage(PageParam param, ImageSpaceImg imageSpaceimg) {

        DataGrid data = new DataGrid();

        List<ImageSpaceImg> imageSpaceimgList = imageSpaceimgMapper.selectImageSpaceImgByPage(param, imageSpaceimg);

        data.setRows(imageSpaceimgList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public ImageSpaceImg details(int id) {
        return imageSpaceimgMapper.selectByPrimaryKey(id);
    }

    /**
     * 上传保存图片
     *
     * @param m        {@link ImageSpaceImg}
     * @param savePath 上传路径
     * @param file     上传文件
     * @return
     */
    @Override
    public boolean addImg(ImageSpaceImg m, String savePath, MultipartFile file) {
        try {
            String uuid = FileUtils.getUUID();//uuid作为保存时的文件名
            String ext = FileUtils.getFileExt(file.getOriginalFilename());//获取文件后缀
            if (StringUtils.isBlank(m.getName())) {

                m.setName(file.getOriginalFilename());//如果用户没有输入文件名，则以上传的图片名为文件名
            }
            m.setCreateTime(DateUtil.currentTimestamp());
            m.setExt(ext);
            m.setSize((int) file.getSize());
            m.setUserId(ServletUtil.getMember().getId());
            m.setSavePath(BaseConfig.url + "tmp/" + savePath + "/" + uuid + "." + ext);
            //保存文件
            File newFile = new File(BaseConfig.uploadPath + savePath + "/" + uuid + "." + ext);

            if (!newFile.exists() && !newFile.isDirectory()) {
                System.out.println("文件不存在");
                final boolean mkdir = newFile.mkdirs();
            }

            file.transferTo(newFile);

            return imageSpaceimgMapper.insert(m) > 0;
        } catch (IOException e) {
            e.printStackTrace();
            throw new MyRuntimeException("图片保存失败！");
        }
    }

    /**
     * 创建系统默认目录类型，如果存在则不需要重新创建
     *
     * @param userId 用户id
     * @param type   类型：1：word图片转存
     * @param name
     * @param remark
     * @return
     */
    @Override
    public String addDefaultType(String userId, int type, String name, String remark) {

        ImageSpace imageSpace = imageSpaceMapper.queryByCondition(userId, type);

        if (imageSpace == null) {
            //不存在则创建一个
            imageSpace = new ImageSpace();
            imageSpace.setCreateTime(DateUtil.currentTimestamp());
            imageSpace.setName(name);
            imageSpace.setRemark(remark);
            imageSpace.setType(type);
            imageSpace.setUserId(userId);
            imageSpaceMapper.insert(imageSpace);
        }

        return imageSpace.getId();
    }

    /**
     * 根据用户id，查询出用户图片 类型
     *
     * @param id 用户id
     * @return id, name(相册名称)
     */
    @Override
    public List<ImageSpace> selectTypeList(String id) {
        return imageSpaceMapper.queryAllByCondition(id, null);
    }
}