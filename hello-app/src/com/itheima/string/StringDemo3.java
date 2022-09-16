package com.itheima.string;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2 + "c";
        System.out.println(s3 == s1);
        System.out.println(s3);
        System.out.println(s1);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
    }
}
