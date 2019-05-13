package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.model.PageParam;
import com.springmvc.po.Contact;
import org.springframework.web.multipart.MultipartFile;

/**
 * 联系我们业务层访问接口
 *
 * @author 自动生成
 * @version $Id: contactService.java, v 0.1  2019-4-19 11:01:41  自动生成 Exp $
 */
public interface ContactService {

    /**
     * 添加
     *
     * @param contact  {@link Contact}
     * @param file     {@link MultipartFile}
     * @param savePath 保存路径
     * @return String
     */
    String addContact(Contact contact, MultipartFile file, String savePath);

    /**
     * 删除
     *
     * @param ids 主键
     * @return String
     */
    String deleteContact(String[] ids);

    /**
     * 修改
     *
     * @param contact  {@link Contact}
     * @param file     {@link MultipartFile}
     * @param savePath 保存路径
     * @return String
     */
    String updateContact(Contact contact, MultipartFile file, String savePath);

    /**
     * 分页查询
     *
     * @param param   {@link PageParam}
     * @param contact {@link Contact}
     * @return DataGrid
     */
    DataGrid queryFullPage(PageParam param, Contact contact);

    /**
     * 详情
     *
     * @param id 主键
     * @return Contact
     */
    Contact details(int id);

}