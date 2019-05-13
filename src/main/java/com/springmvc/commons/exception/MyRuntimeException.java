package com.springmvc.commons.exception;

/**
 * @program: webssm
 * @description: 自定义异常
 * @author: lou wei
 * @create: 2018-09-16 18:12
 **/
public class MyRuntimeException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    /**
     *
     * 创建一个新的实例 MyException.
     *
     * @param message 异常信息
     */
    public MyRuntimeException(String message) {
        super(message);
    }
}
