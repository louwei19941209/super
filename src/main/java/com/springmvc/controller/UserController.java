package com.springmvc.controller;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.commons.util.BaseConfig;
import com.springmvc.po.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Map;

@ApiIgnore
@Controller
@RequestMapping("user")
public class UserController
{
    @Autowired
    UserService userService;
    private final static String SAVEPATH = BaseConfig.uploadPath + "jps";

    @ResponseBody
    @RequestMapping("add/user")
    public Map addUser(User user)
    {
        System.out.println(SAVEPATH);
        return userService.saveUser(user);
    }

    @ResponseBody
    @RequestMapping("find/list")
    public DataGrid findUserList()
    {
        return userService.findAll();
    }
}
