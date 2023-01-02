package com.itheima.d9_exception_custom;

/**
 * 自定义的编译时异常
 * 1、继承Exception
 * 2、重写构造器
 */

public class ItheimaAgeIllegalException extends Exception{
    public ItheimaAgeIllegalException() {
    }

    public ItheimaAgeIllegalException(String message) {
        super(message);
    }
}
