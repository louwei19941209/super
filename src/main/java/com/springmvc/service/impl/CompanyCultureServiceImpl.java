package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.CompanyCultureMapper;
import com.springmvc.po.CompanyCulture;
import com.springmvc.service.CompanyCultureService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * 企业文化表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: companycultureServiceImpl.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
@Service
public class CompanyCultureServiceImpl implements CompanyCultureService {

    /**
     * 企业文化表数据层访问接口实现
     **/
    @Autowired
    private CompanyCultureMapper companycultureMapper;

    @Override
    public String addCompanyCulture(CompanyCulture companyculture, MultipartFile file, String savePath) {


        try {

            if (file != null && !file.isEmpty()) {

                String uuid = FileUtils.getUUID();

                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File saveFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(saveFile);

                companyculture.setImage(BaseConfig.url + "tmp/culture/" + uuid + "." + ext);

            }

            if (companycultureMapper.insert(companyculture) > 0) {
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
    public String deleteCompanyCulture(String ids) {

        if (StringUtils.isNotBlank(ids)) {

            String[] idArray = ids.split(",");

            try {

                for (String id : idArray) {
                    companycultureMapper.deleteByPrimaryKey(Long.valueOf(id));
                }

                return MsgConfig.MSG_KEY_SUCCESS;

            } catch (Exception e) {
                e.printStackTrace();
                return MsgConfig.MSG_KEY_SUCCESS;
            }

        }

        return MsgConfig.MSG_KEY_FAIL;
    }

    @Override
    public String updateCompanyCulture(CompanyCulture companyculture, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {

                String uuid = FileUtils.getUUID();

                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File saveFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(saveFile);

                companyculture.setImage(BaseConfig.url + "tmp/culture/" + uuid + "." + ext);

            }

            if (companycultureMapper.updateByPrimaryKeySelective(companyculture) > 0) {
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
    public DataGrid queryFullPage(PageParam param, CompanyCulture companyculture) {

        DataGrid data = new DataGrid();

        List<CompanyCulture> companycultureList = companycultureMapper.selectCompanyCultureByPage(param, companyculture);

        data.setRows(companycultureList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public CompanyCulture details(Long id) {
        return companycultureMapper.selectByPrimaryKey(id);
    }

}