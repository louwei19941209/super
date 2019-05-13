package com.springmvc.commons.util;

import java.util.UUID;

/**
 * @program: webssm
 * @description: 生成UUID
 * @author: lou wei
 * @create: 2018-09-09 18:20
 */
public class UUIDUtil
{
    public static String getUUID()
    {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
