package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.IfbbStrategyMapper;
import com.springmvc.po.IfbbStrategy;
import com.springmvc.service.IfbbStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * IFBB战略表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: ifbbStrategyServiceImpl.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
@Service
public class IfbbStrategyServiceImpl implements IfbbStrategyService {

    /**
     * IFBB战略表数据层访问接口实现
     **/
    @Autowired
    private IfbbStrategyMapper ifbbStrategyMapper;

    @Override
    public String addIfbbStrategy(IfbbStrategy ifbbStrategy, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                ifbbStrategy.setImage(BaseConfig.url + "tmp/strategy/" + uuid + "." + ext);
            }

            if (ifbbStrategyMapper.insert(ifbbStrategy) > 0) {
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
    public String deleteIfbbStrategy(String[] ids) {

        try {

            for (String id : ids) {
                ifbbStrategyMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }

            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public String updateIfbbStrategy(IfbbStrategy ifbbStrategy, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                ifbbStrategy.setImage(BaseConfig.url + "tmp/strategy/" + uuid + "." + ext);
            }


            if (ifbbStrategyMapper.updateByPrimaryKeySelective(ifbbStrategy) > 0) {
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
    public DataGrid queryFullPage(PageParam param, IfbbStrategy ifbbStrategy) {

        DataGrid data = new DataGrid();

        List<IfbbStrategy> ifbbStrategyList = ifbbStrategyMapper.selectIfbbStrategyByPage(param, ifbbStrategy);

        data.setRows(ifbbStrategyList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public IfbbStrategy details(int id) {
        return ifbbStrategyMapper.selectByPrimaryKey(id);
    }

}