package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.FileList;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.EnterpriseHonorMapper;
import com.springmvc.po.EnterpriseHonor;
import com.springmvc.po.HonorFile;
import com.springmvc.service.EnterpriseHonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.Map;


/**
 * 企业荣誉业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: enterpriseHonorServiceImpl.java, v 0.1  2019-4-23 16:43:21  自动生成 Exp $
 */
@Service
public class EnterpriseHonorServiceImpl implements EnterpriseHonorService {

    /**
     * 企业荣誉数据层访问接口实现
     **/
    @Autowired
    private EnterpriseHonorMapper enterpriseHonorMapper;

    @Override
    public String addEnterpriseHonor(EnterpriseHonor enterpriseHonor, FileList files, String savePath) {

        try {

            if (enterpriseHonorMapper.insert(enterpriseHonor) > 0) {

                List<MultipartFile> getFile = files.getFile();
                if (getFile != null) {
                    for (MultipartFile f : getFile) {
                        if (f != null && !f.isEmpty()) {

                            //uuid作为保存时的文件名
                            String uuid = FileUtils.getUUID();
                            //获取文件名后缀
                            String ext = FileUtils.getFileExt(f.getOriginalFilename());

                            File newFile = new File(savePath + "/" + uuid + "." + ext);
                            f.transferTo(newFile);

                            HonorFile honorFile = new HonorFile();
                            honorFile.setNewName(uuid);
                            honorFile.setHonorId(enterpriseHonor.getId());
                            honorFile.setOldName(f.getOriginalFilename());
                            honorFile.setSize((int) f.getSize());
                            honorFile.setExt(ext);
                            honorFile.setPath(BaseConfig.url + "tmp/honor/" + uuid + "." + ext);
                            enterpriseHonorMapper.insertFile(honorFile);
                            //enterpriseHonor.setImage(BaseConfig.url + "tmp/honor/" + uuid + "." + ext);
                        }
                    }
                }

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
    public String deleteEnterpriseHonor(String[] ids) {

        try {

            for (String id : ids) {
                enterpriseHonorMapper.deleteByPrimaryKey(Integer.valueOf(id));
                enterpriseHonorMapper.deleteFile(Integer.valueOf(id));
            }

            return MsgConfig.MSG_KEY_SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public String updateEnterpriseHonor(EnterpriseHonor enterpriseHonor, FileList files, String savePath) {

        try {

            List<MultipartFile> getFile = files.getFile();

            if (getFile != null) {

                for (MultipartFile f : getFile) {
                    if (f != null && !f.isEmpty()) {
                        enterpriseHonorMapper.deleteFile(enterpriseHonor.getId());
                    }
                }

                for (MultipartFile f : getFile) {
                    if (f != null && !f.isEmpty()) {

                        //uuid作为保存时的文件名
                        String uuid = FileUtils.getUUID();
                        //获取文件名后缀
                        String ext = FileUtils.getFileExt(f.getOriginalFilename());

                        File newFile = new File(savePath + "/" + uuid + "." + ext);
                        f.transferTo(newFile);

                        HonorFile honorFile = new HonorFile();
                        honorFile.setNewName(uuid);
                        honorFile.setHonorId(enterpriseHonor.getId());
                        honorFile.setOldName(f.getOriginalFilename());
                        honorFile.setSize((int) f.getSize());
                        honorFile.setExt(ext);
                        honorFile.setPath(BaseConfig.url + "tmp/honor/" + uuid + "." + ext);
                        enterpriseHonorMapper.insertFile(honorFile);
                        //enterpriseHonor.setImage(BaseConfig.url + "tmp/honor/" + uuid + "." + ext);
                    }
                }
            }

            if (enterpriseHonorMapper.updateByPrimaryKeySelective(enterpriseHonor) > 0) {
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
    public DataGrid queryFullPage(PageParam param, EnterpriseHonor enterpriseHonor) {

        DataGrid data = new DataGrid();

        List<EnterpriseHonor> enterpriseHonorList = enterpriseHonorMapper.selectEnterpriseHonorByPage(param, enterpriseHonor);

        for (EnterpriseHonor e : enterpriseHonorList) {
            List<Map<String, Object>> honorFileList = enterpriseHonorMapper.selectFiles(e.getId());
            e.setImages(honorFileList);
        }

        data.setRows(enterpriseHonorList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public EnterpriseHonor details(int id) {
        return enterpriseHonorMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Map<String, Object>> queryFiles(int honorId) {
        return enterpriseHonorMapper.selectFiles(honorId);
    }
}