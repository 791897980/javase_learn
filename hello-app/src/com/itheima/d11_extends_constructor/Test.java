package com.itheima.d11_extends_constructor;

public class Test {
    public static void main(String[] args) {
        // 目标：学习子类构造器如何访问父类有参数构造器，还得清除其作用
        Teacher t = new Teacher();
        t.setName("");
    }
}
