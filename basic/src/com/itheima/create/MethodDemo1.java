package com.itheima.create;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 目标：学习方法的完整定义格式，并理解其调用和执行流程
        int rs = add(100, 200);
        System.out.println("和是：" + rs);
    }

    public static int add(int a, int b){
        return a + b;
    }
}
