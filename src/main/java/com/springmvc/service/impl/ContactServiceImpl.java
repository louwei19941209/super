package com.springmvc.service.impl;

import com.springmvc.commons.config.MsgConfig;
import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.commons.util.FileUtils;
import com.springmvc.mapper.ContactMapper;
import com.springmvc.po.Contact;
import com.springmvc.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


/**
 * 联系我们业务层访问接口实现
 *
 * @author 自动生成
 * @version $Id: contactServiceImpl.java, v 0.1  2019-4-19 11:01:41  自动生成 Exp $
 */
@Service
public class ContactServiceImpl implements ContactService {

    /**
     * 联系我们数据层访问接口实现
     **/
    @Autowired
    private ContactMapper contactMapper;

    @Override
    public String addContact(Contact contact, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                contact.setNoPublic(BaseConfig.url + "tmp/contact/" + uuid + "." + ext);
            }

            if (contactMapper.insert(contact) > 0) {
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
    public String deleteContact(String[] ids) {

        try {

            for (String id : ids) {
                contactMapper.deleteByPrimaryKey(Integer.valueOf(id));
            }
            return MsgConfig.MSG_KEY_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    @Override
    public String updateContact(Contact contact, MultipartFile file, String savePath) {

        try {

            if (file != null && !file.isEmpty()) {
                //uuid作为保存时的文件名
                String uuid = FileUtils.getUUID();

                //获取文件名后缀
                String ext = FileUtils.getFileExt(file.getOriginalFilename());

                File newFile = new File(savePath + "/" + uuid + "." + ext);

                file.transferTo(newFile);

                contact.setNoPublic(BaseConfig.url + "tmp/contact/" + uuid + "." + ext);
            }

            if (contactMapper.updateByPrimaryKeySelective(contact) > 0) {
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
    public DataGrid queryFullPage(PageParam param, Contact contact) {

        DataGrid data = new DataGrid();

        List<Contact> contactList = contactMapper.selectContactByPage(param, contact);

        data.setRows(contactList);

        data.setTotal(param.getTotle());

        return data;

    }

    @Override
    public Contact details(int id) {
        return contactMapper.selectByPrimaryKey(id);
    }

}