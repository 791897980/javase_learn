package com.itheima.scanner;
//1、导包操作（并不需要自己写，通过工具导入更方便）

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //目标： 学会键盘录入技术
        //2、得到一个键盘扫描器对象
        Scanner sc = new Scanner(System.in);

        //3、调用sc对象的功能等待接受用户输入的数据
        // 这个代码会等待用户输入数据，知道用户输入完数据并按了回车键就会把数据拿到。
        System.out.println("请您输入您的年龄");
        int age = sc.nextInt();
        System.out.println("您的年龄是： " + age);

        System.out.println("请您输入您的名称");
        String name = sc.next();
        System.out.println("欢迎 " + name);

    }
}