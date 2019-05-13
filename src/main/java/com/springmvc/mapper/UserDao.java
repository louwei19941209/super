package com.springmvc.mapper;

import com.springmvc.po.User;

import java.util.List;

public interface UserDao
{
    boolean add(User user);

    List<User> selectAllUsers();
}
