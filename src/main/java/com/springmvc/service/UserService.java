package com.springmvc.service;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.po.User;

import java.util.List;
import java.util.Map;

public interface UserService
{
    Map saveUser(User user);

    DataGrid findAll();
}
