package com.springmvc.service.impl;

import com.springmvc.commons.model.DataGrid;
import com.springmvc.mapper.UserDao;
import com.springmvc.po.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;

    public static final String USER = "user.";

    public static final String USER_SELECT = USER + "queryAllUsers";

    @Override
    //@CacheEvict(value = "myCache", key = "0", beforeInvocation = true)
    public Map saveUser(User user)
    {
        Map<String, Object> map = new HashMap<>();

        if (userDao.add(user))
        {
            map.put("success", true);
            map.put("mgs", "添加成功");
        }
        else
        {
            map.put("success", false);
            map.put("msg", "添加失败");
        }

        return map;
    }

    @Override
    //@Cacheable(value = "myCache", key = "0")
    public DataGrid findAll()
    {

        DataGrid data = new DataGrid();
        List<User> list = userDao.selectAllUsers();
        data.setRows(list);
        return data;
    }
}
