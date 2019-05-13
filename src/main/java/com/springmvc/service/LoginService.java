package com.springmvc.service;

import com.springmvc.po.SyUsers;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface LoginService
{
    Map updateLogin(SyUsers syUsers, HttpServletRequest request);
}
