package com.itheima.d2_recusion;

/**
 * 递归的形式
 */

public class RecursionDemo01 {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        System.out.println("============test===============");
        test();//方法递归 直接递归形式
    }
    public static void test2(){
        System.out.println("============test2===============");
        test3();//方法递归 直接递归形式
    }

    private static void test3() {
        System.out.println("============test3===============");
        test2();

    }
}
