package com.itheima.d4_static_singleinstance;

public class Test2 {
    // 目标：掌握懒汉单例的设计。理解其思想
    public static void main(String[] args) {
        SingleInstance2 s1 = SingleInstance2.getInstance();
        SingleInstance2 s2 = SingleInstance2.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
