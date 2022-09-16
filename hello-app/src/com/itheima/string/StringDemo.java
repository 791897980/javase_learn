package com.itheima.string;

public class StringDemo {
    public static void main(String[] args) {
        String name = "购物车";
        System.out.println(name);

        char[] chars = {'a','b','c','d'};
        String s3 = new String(chars);
        System.out.println(s3);

        byte[] bytes = {97,98,99,65,66,67};
        String s4 = new String(bytes);
        System.out.println(s4);
    }
}
