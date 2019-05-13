package com.springmvc.commons.util;

import java.security.MessageDigest;

/**
 * @program: webssm
 * @description: MD5生成加密
 * @author: lou wei
 * @create: 2018-09-10 09:08
 */
public class MD5Util
{
    /**
     *
     * 加密
     * @author louwei
     * @date 2018/9/10 9:10
     * @param [s]
     * @return java.lang.String
     */
    public static String MD5(String s)
    {

        if (s == null || s.length() == 0)
        {
            return null;
        }
        char hexDigits[] = {'A', '1', 'B', '3', 'C', '5', 'D', '7', 'E', '9', 'F', '0', 'G', '2', 'H', '4'};
        try
        {
            byte[] btInput = s.getBytes();
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++)
            {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        }
        catch (Exception e)
        {
            return null;
        }
    }

    /**
     *
     * 比较加密是否一致
     * @author louwei
     * @date 2018/9/10 9:14
     * @param [str, md5Str]
     * @return java.lang.Boolean
     */
    public static Boolean MD5Validate(String str, String md5Str)
    {
        if (md5Str == null || md5Str.length() == 0)
        {
            return false;
        }
        if (md5Str.equals(MD5(str)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
