package com.itheima.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        //目标：理解自动类型转换
        byte a = 20;
        int b = a;
        System.out.println(a);
        System.out.println(b);
        int age = 23;
        double db = age;
        System.out.println(age);
        System.out.println(db);
        char ch = 'a';
        int code = ch;
        System.out.println(ch);
        System.out.println(code);
    }
}
