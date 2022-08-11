package com.itheima.demo;

public class Test2 {
    public static void main(String[] args) {
        // 需求：判断一个整数是奇数还是偶数
        check(11);
        check(23);
        check(100);
    }
    public static void check(int number){
        if(number % 2 == 0){
            System.out.println(number + "是偶数");
        }
        else {
            System.out.println(number + "是奇数");
        }
    }
}
