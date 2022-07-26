package com.itheima.scanner;

import java.util.Scanner;

public class DeadForDemo8 {
    public static void main(String[] args) {
//        //目标：学会定义死循环
//        int count = 0;
//        for (;;){
//            System.out.println("Hello-----");
//            count++;
//            System.out.println(count);
//        }
////        while (true){
//////            count++;
//////            System.out.println(count);
////        }
//        //经典写法
//        while (true){
//            System.out.println("我是快乐的死循环");
//        }

//        do{
//            System.out.println("我是快乐的死循环");
//        }while (true);
        System.out.println("----------------------------");
        //1、定义正确的密码
        int okPassword = 520;
        //2、定义一个死循环让用户不断的输入密码验证
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入正确的密码：");
            int password = sc.nextInt();
            //3、使用if判断密码是否正确
            if (password == okPassword){
                System.out.println("登陆成功");
                break;
            }else {
                System.out.println("密码错误");
            }
        }

    }
}





















