package com.itheima.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // 目标： 学会使用自增自减运算符： ++ --
        int a = 10;
        a++; // a = a + 1
        System.out.println(a);
        ++a;
        System.out.println(a);

        int b = 10;
        b--;
        System.out.println(b);
        --b;
        System.out.println(b);
        System.out.println("---------------");
        // 在表达式中或者不是单独操作的情况。 ++ -- 在变量前后存在区别
        int i = 10;
        int j = ++i;

        int m = 10;
        int w = m++;
        System.out.println(i);
        System.out.println(j);
        System.out.println(w);
        System.out.println("--------------------------");
        int k = 3;
        int p = 5;
    }
}
