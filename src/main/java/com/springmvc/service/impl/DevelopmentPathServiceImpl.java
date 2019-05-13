package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.DevelopmentPathMapper;
import com.springmvc.po.DevelopmentPath;
import com.springmvc.service.DevelopmentPathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * 发展历程表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: developmentPathServiceImpl.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
@Service
public class DevelopmentPathServiceImpl implements DevelopmentPathService {

    /**
     * 发展历程表数据层访问接口实现
     **/
    @Autowired
    private DevelopmentPathMapper developmentPathMapper;

    @Override
    public String addDevelopmentPath(DevelopmentPath developmentPath, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {

                //文件命重名
                String uuid = FileUtils.getUUID();

                //获取文件后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File saveFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(saveFile);

                developmentPath.setImage(BaseConfig.url + "tmp/course/" + uuid + "." + ext);

            }

            if (developmentPathMapper.insert(developmentPath) > 0) {
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
    public String deleteDevelopmentPath(String[] ids) {

        try {

            for (String id : ids) {
                developmentPathMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }
            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public String updateDevelopmentPath(DevelopmentPath developmentPath, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {

                //uuid 文件名
                String uuid = FileUtils.getUUID();

                //文件后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File saveFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(saveFile);

                developmentPath.setImage(BaseConfig.url + "tmp/course/" + uuid + "." + ext);

            }

            if (developmentPathMapper.updateByPrimaryKeySelective(developmentPath) > 0) {
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
    public DataGrid queryFullPage(PageParam param, DevelopmentPath developmentPath) {

        DataGrid data = new DataGrid();

        List<DevelopmentPath> developmentPathList = developmentPathMapper.selectDevelopmentPathByPage(param, developmentPath);

        data.setRows(developmentPathList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public DevelopmentPath details(int id) {
        return developmentPathMapper.selectByPrimaryKey(id);
    }

}