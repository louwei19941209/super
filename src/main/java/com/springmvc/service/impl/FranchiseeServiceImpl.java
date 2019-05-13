package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.FranchiseeMapper;
import com.springmvc.po.Franchisee;
import com.springmvc.service.FranchiseeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * 加盟商表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: franchiseeServiceImpl.java, v 0.1  2019-4-9 11:40:03  自动生成 Exp $
 */
@Service
public class FranchiseeServiceImpl implements FranchiseeService {

    /**
     * 加盟商表数据层访问接口实现
     **/
    @Autowired
    private FranchiseeMapper franchiseeMapper;

    @Override
    public String addFranchisee(Franchisee franchisee, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                franchisee.setImage(BaseConfig.url + "tmp/franchisee/" + uuid + "." + ext);
            }

            if (franchiseeMapper.insert(franchisee) > 0) {
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
    public String deleteFranchisee(String[] ids) {

        try {

            for (String id : ids) {
                franchiseeMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }
            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updateFranchisee(Franchisee franchisee, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                franchisee.setImage(BaseConfig.url + "tmp/franchisee/" + uuid + "." + ext);
            }

            if (franchiseeMapper.updateByPrimaryKeySelective(franchisee) > 0) {
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
    public DataGrid queryFullPage(PageParam param, Franchisee franchisee) {

        DataGrid data = new DataGrid();

        List<Franchisee> franchiseeList = franchiseeMapper.selectFranchiseeByPage(param, franchisee);

        data.setRows(franchiseeList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public Franchisee details(int id) {
        return franchiseeMapper.selectByPrimaryKey(id);
    }

}