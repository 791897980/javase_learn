package com.itheima.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        //目标：学会使用Java提供的随机数类Random
        //1、导包
        //2、创建随机数对象
        Random r = new Random();
        //3、调用nextInt功能（方法）可以返回一个整型的随机数给你
        for (int i = 0; i < 100 ;i++) {
            int data = r.nextInt(10);
            System.out.println(data);
        }
    }
}
