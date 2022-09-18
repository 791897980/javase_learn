package com.itheima.string;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //1、正确登录名和密码
        String okName = "itheima";
        String okPassword = "123456";

        //2、请您输入登录名称和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("登录名称：");
        String name = sc.next();
        System.out.println("登录密码：");
        String password = sc.next();

        //3、判断用户输入的登录名称和密码与正确的内容是否相等

    }
}
