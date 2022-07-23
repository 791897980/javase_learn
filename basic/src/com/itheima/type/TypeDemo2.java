package com.itheima.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        //目标：掌握表达式的自动类型转换的规则，
        byte a = 10;
        int b = 20;
        double c = 1.0;
        double r = a + b + c;
        System.out.println(r);

        double r2 = a + b - 2.3;
        System.out.println(r2);
        //面试题
        byte i = 10;
        byte j = 20;
        int k = i + j;
        System.out.println(k);
    }
}
