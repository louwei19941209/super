package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.FounderMapper;
import com.springmvc.po.Founder;
import com.springmvc.service.FounderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * 创始人表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: founderServiceImpl.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
@Service
public class FounderServiceImpl implements FounderService {

    /**
     * 创始人表数据层访问接口实现
     **/
    @Autowired
    private FounderMapper founderMapper;

    @Override
    public String addFounder(Founder founder, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                founder.setImage(BaseConfig.url + "tmp/founder/" + uuid + "." + ext);
            }

            if (founderMapper.insert(founder) > 0) {
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
    public String deleteFounder(String[] ids) {

        try {

            for (String id : ids) {
                founderMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }

            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public String updateFounder(Founder founder, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                founder.setImage(BaseConfig.url + "tmp/founder/" + uuid + "." + ext);
            }


            if (founderMapper.updateByPrimaryKeySelective(founder) > 0) {
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
    public DataGrid queryFullPage(PageParam param, Founder founder) {

        DataGrid data = new DataGrid();

        List<Founder> founderList = founderMapper.selectFounderByPage(param, founder);

        data.setRows(founderList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public Founder details(int id) {
        return founderMapper.selectByPrimaryKey(id);
    }

}