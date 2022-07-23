package com.itheima.type;

public class OperatorDemo8 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 30;
        //1、 先找出2个整数的较大值
        int temp = i > j ? i : j;
        //2、拿临时变量与第三个变量的值继续比较
        int rsMax = temp > k ? temp : k;
        System.out.println(rsMax);

        System.out.println("---------------拓展内容------------------");
        int rsMax1 = i > j ? i > k ? i : k : j > k ? j : k;
        System.out.println(rsMax1);
    }
}
