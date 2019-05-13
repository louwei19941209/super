package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.CompanyProfileMapper;
import com.springmvc.po.CompanyProfile;
import com.springmvc.service.CompanyProfileService;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * 企业简介表业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: companyProfileServiceImpl.java, v 0.1  2019-4-9 11:40:02  自动生成 Exp $
 */
@Service
public class CompanyProfileServiceImpl implements CompanyProfileService {

    /**
     * 企业简介表数据层访问接口实现
     **/
    @Autowired
    private CompanyProfileMapper companyProfileMapper;

    @Override
    public String addCompanyProfile(CompanyProfile companyProfile, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                companyProfile.setImage(BaseConfig.url + "tmp/profile/" + uuid + "." + ext);
            }

            if (companyProfileMapper.insert(companyProfile) > 0) {
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
    public String deleteCompanyProfile(String[] ids) {

        try {

            for (String id : ids) {

                companyProfileMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }
            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            return MsgConfig.MSG_KEY_FAIL;
        }

    }

    @Override
    public String updateCompanyProfile(CompanyProfile companyProfile, MultipartFile file, String savePath) {

        try {

            //修改文件
            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                companyProfile.setImage(BaseConfig.url + "tmp/profile/" + uuid + "." + ext);
            }

            if (companyProfileMapper.updateByPrimaryKeySelective(companyProfile) > 0) {
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
    public DataGrid queryFullPage(PageParam param, CompanyProfile companyProfile) {

        DataGrid data = new DataGrid();

        List<CompanyProfile> companyProfileList = companyProfileMapper.selectCompanyProfileByPage(param, companyProfile);

        data.setRows(companyProfileList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public CompanyProfile details(CompanyProfile companyProfile) {
        CompanyProfile c = companyProfileMapper.selectByPrimaryKey(companyProfile);
        c.setIntroduction(StringEscapeUtils.unescapeHtml4(c.getIntroduction()));
        return c;
    }

}