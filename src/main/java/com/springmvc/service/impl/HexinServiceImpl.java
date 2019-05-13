package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.HexinMapper;
import com.springmvc.po.Hexin;
import com.springmvc.service.HexinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * 核心竞争业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: hexinServiceImpl.java, v 0.1  2019-5-13 9:36:43  自动生成 Exp $
 */
@Service
public class HexinServiceImpl implements HexinService {

    /**
     * 核心竞争数据层访问接口实现
     **/
    @Autowired
    private HexinMapper hexinMapper;

    @Override
    public String addHexin(Hexin hexin, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {

                String uuid = FileUtils.getUUID();

                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File saveFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(saveFile);

                hexin.setImage(BaseConfig.url + "tmp/jiameng/" + uuid + "." + ext);

            }

            if (hexinMapper.insert(hexin) > 0) {
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
    public String deleteHexin(String[] ids) {

        try {

            for (String id : ids) {
                hexinMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }
            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public String updateHexin(Hexin hexin, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {

                String uuid = FileUtils.getUUID();

                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File saveFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(saveFile);

                hexin.setImage(BaseConfig.url + "tmp/jiameng/" + uuid + "." + ext);

            }

            if (hexinMapper.updateByPrimaryKeySelective(hexin) > 0) {
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
    public DataGrid queryFullPage(PageParam param, Hexin hexin) {

        DataGrid data = new DataGrid();

        List<Hexin> hexinList = hexinMapper.selectHexinByPage(param, hexin);

        data.setRows(hexinList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public Hexin details(int id) {
        return hexinMapper.selectByPrimaryKey(id);
    }

}