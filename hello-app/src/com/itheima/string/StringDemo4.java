package com.itheima.string;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
//        String okName = "aabbcc";
//        String okPassword = "123456";
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        String password = sc.next();
//
//        if(okName.equals(name) && okPassword.equals(password)){
//            System.out.println("登陆成功");
//        }else {
//            System.out.println("登录失败");
//        }

        String sysCode = "23AdFh";
        String code1 = "23adFH";
        System.out.println(sysCode.equals(code1));
        System.out.println(sysCode.equalsIgnoreCase(code1));
    }
}
