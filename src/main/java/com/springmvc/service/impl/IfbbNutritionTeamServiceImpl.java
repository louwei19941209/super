package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.IfbbNutritionTeamMapper;
import com.springmvc.po.IfbbNutritionTeam;
import com.springmvc.service.IfbbNutritionTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * IFBB营养团队表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: ifbbNutritionTeamServiceImpl.java, v 0.1  2019-4-23 16:43:22  自动生成 Exp $
 */
@Service
public class IfbbNutritionTeamServiceImpl implements IfbbNutritionTeamService {

    /**
     * IFBB营养团队表数据层访问接口实现
     **/
    @Autowired
    private IfbbNutritionTeamMapper ifbbNutritionTeamMapper;

    @Override
    public String addIfbbNutritionTeam(IfbbNutritionTeam ifbbNutritionTeam, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                ifbbNutritionTeam.setImage(BaseConfig.url + "tmp/nutrition_team/" + uuid + "." + ext);
            }

            if (ifbbNutritionTeamMapper.insert(ifbbNutritionTeam) > 0) {
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
    public String deleteIfbbNutritionTeam(String[] ids) {

        try {

            for (String id : ids) {
                ifbbNutritionTeamMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }

            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public String updateIfbbNutritionTeam(IfbbNutritionTeam ifbbNutritionTeam, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                ifbbNutritionTeam.setImage(BaseConfig.url + "tmp/nutrition_team/" + uuid + "." + ext);
            }

            if (ifbbNutritionTeamMapper.updateByPrimaryKeySelective(ifbbNutritionTeam) > 0) {
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
    public DataGrid queryFullPage(PageParam param, IfbbNutritionTeam ifbbNutritionTeam) {

        DataGrid data = new DataGrid();

        List<IfbbNutritionTeam> ifbbNutritionTeamList = ifbbNutritionTeamMapper.selectIfbbNutritionTeamByPage(param, ifbbNutritionTeam);

        data.setRows(ifbbNutritionTeamList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public IfbbNutritionTeam details(int id) {
        return ifbbNutritionTeamMapper.selectByPrimaryKey(id);
    }

}