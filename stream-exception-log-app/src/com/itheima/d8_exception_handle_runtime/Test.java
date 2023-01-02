package com.itheima.d8_exception_handle_runtime;

/**
 * 目标：运行时异常的处理机制
 * 可以不处理 ，编译阶段又不报错
 * 按照理论规范，建议还是处理，只需要在最外层捕获处理即可
 */

public class Test {
    public static void main(String[] args) {
        try {
            chu(10,0);
        } catch (Exception e) {
            e.printStackTrace(); // 打印崩溃日志信息
        }
    }

    public static void chu(int a, int b) {//throws RuntimeException 运行时异常 默认会抛 不抛也不会报错
        System.out.println(a);
        System.out.println(b);
        int c = a / b;
        System.out.println(c);
    }
}
