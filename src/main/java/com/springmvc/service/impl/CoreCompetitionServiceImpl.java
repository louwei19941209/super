package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.CoreCompetitionMapper;
import com.springmvc.po.CoreCompetition;
import com.springmvc.service.CoreCompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * 核心竞争表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: corecompetitionServiceImpl.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
@Service
public class CoreCompetitionServiceImpl implements CoreCompetitionService {

    /**
     * 核心竞争表数据层访问接口实现
     **/
    @Autowired
    private CoreCompetitionMapper corecompetitionMapper;

    @Override
    public String addCoreCompetition(CoreCompetition corecompetition, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {

                String uuid = FileUtils.getUUID();

                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File saveFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(saveFile);

                corecompetition.setImage(BaseConfig.url + "tmp/protection/" + uuid + "." + ext);

            }

            if (corecompetitionMapper.insert(corecompetition) > 0) {
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
    public String deleteCoreCompetition(String[] ids) {

        try {

            for (String id : ids) {

                corecompetitionMapper.deleteByPrimaryKey(Integer.valueOf(id));

            }

            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public String updateCoreCompetition(CoreCompetition corecompetition, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {

                String uuid = FileUtils.getUUID();

                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File saveFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(saveFile);

                corecompetition.setImage(BaseConfig.url + "tmp/protection/" + uuid + "." + ext);

            }

            if (corecompetitionMapper.updateByPrimaryKeySelective(corecompetition) > 0) {
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
    public DataGrid queryFullPage(PageParam param, CoreCompetition corecompetition) {

        DataGrid data = new DataGrid();

        List<CoreCompetition> corecompetitionList = corecompetitionMapper.selectCoreCompetitionByPage(param, corecompetition);

        data.setRows(corecompetitionList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public CoreCompetition details(int id) {
        return corecompetitionMapper.selectByPrimaryKey(id);
    }

}