package com.itheima.d10_interface;

/**
 * 声明了一个接口
 */
public interface InterfaceDemo {
    // 目标：接口中的成分特点，JDK 8之前接口中只能有抽象方法和常量
    //1、常量
    //public static final String SCHOOL_NAME = "12323";
    String SCHOOL_NAME = "12323";

    //2、抽象方法
    // 注意：由于接口体现规范思想，规范默认都是公开的，所以代码层面，所以public abstract可以省略不写
    //public abstract void run();
    //public abstract void eat();
    void run();
    void eat();
}
