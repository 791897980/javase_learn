package com.itheima.string;

/*
    练习题：模拟用户登录
 */

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1、定义正确的登录名称和密码
        String okLoginName = "admin";
        String okPassword = "itheima";

        //2、定义一个循环，循环3次，让用户登录
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 3 ; i++) {
            System.out.println("请输入您的登录名称：");
            String loginName = sc.next();
            System.out.println("请输入您的登录密码：");
            String password = sc.next();

            //3、判断登录是否成功
            if(okLoginName.equals(loginName)){
                //4、判断密码是否正确
                if(okPassword.equals(password)){
                    System.out.println("登录成功！欢迎进入系统随意浏览~~~");
                    break;
                }else {
                    // 密码错误了
                    System.out.println("您的密码不正确!您还剩余" + (3 - i));
                }
            }else {
                System.out.println("登录名称错误");
            }
        }
    }
}
