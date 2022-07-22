package com.itheima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //掌握基本算数运算符的使用 + - * / %
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);  //3.33333 ==>  3
        System.out.println((double) a / b);
        System.out.println(a * 1.0 / b);
    }
}
