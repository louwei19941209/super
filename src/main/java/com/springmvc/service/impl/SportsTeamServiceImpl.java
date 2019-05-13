package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.SportsTeamMapper;
import com.springmvc.po.SportsTeam;
import com.springmvc.service.SportsTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * 运动团队业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: sportsTeamServiceImpl.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
@Service
public class SportsTeamServiceImpl implements SportsTeamService {

    /**
     * 运动团队数据层访问接口实现
     **/
    @Autowired
    private SportsTeamMapper sportsTeamMapper;

    @Override
    public String addSportsTeam(SportsTeam sportsTeam, MultipartFile file, String savePath, MultipartFile dFile) {

        try {

            //小图
            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                sportsTeam.setImage(BaseConfig.url + "tmp/founder/" + uuid + "." + ext);
            }

            //大图
            if (dFile != null && !dFile.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(dFile.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                dFile.transferTo(newFile);

                sportsTeam.setdImage(BaseConfig.url + "tmp/founder/" + uuid + "." + ext);
            }

            if (sportsTeamMapper.insert(sportsTeam) > 0) {
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
    public String deleteSportsTeam(String[] ids) {

        try {

            for (String id : ids) {
                sportsTeamMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }

            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public String updateSportsTeam(SportsTeam sportsTeam, MultipartFile file, String savePath, MultipartFile dFile) {

        try {

            //小图
            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                sportsTeam.setImage(BaseConfig.url + "tmp/founder/" + uuid + "." + ext);
            }

            //大图
            if (dFile != null && !dFile.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(dFile.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                dFile.transferTo(newFile);

                sportsTeam.setdImage(BaseConfig.url + "tmp/founder/" + uuid + "." + ext);
            }

            if (sportsTeamMapper.updateByPrimaryKeySelective(sportsTeam) > 0) {
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
    public DataGrid queryFullPage(PageParam param, SportsTeam sportsTeam) {

        DataGrid data = new DataGrid();

        List<SportsTeam> sportsTeamList = sportsTeamMapper.selectSportsTeamByPage(param, sportsTeam);

        data.setRows(sportsTeamList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public SportsTeam details(int id) {
        return sportsTeamMapper.selectByPrimaryKey(id);
    }

}