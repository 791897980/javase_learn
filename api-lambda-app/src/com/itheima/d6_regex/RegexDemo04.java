package com.itheima.d6_regex;

import java.util.Scanner;

public class RegexDemo04 {
    public static void main(String[] args) {
        String newNames = domainTransformation(new Scanner(System.in));
        if(newNames != null){
            System.out.println(newNames);
        }
    }
    public static String domainTransformation(Scanner sc){
        while (true) {
            String names = sc.next();
            String[] arrs = names.split("\\.");
            if(arrs.length == 3) {
                String tmp = arrs[2];
                arrs[2] = arrs[0];
                arrs[0] = tmp;
                StringBuilder newNames = new StringBuilder();
                newNames.append(arrs[0]).append(".").append(arrs[1]).append(".").append(arrs[2]);
                return newNames.toString();
            }else {
                System.out.println("域名格式输入错误，清重新输入");
            }
        }
    }
}
