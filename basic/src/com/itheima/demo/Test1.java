package com.itheima.demo;

public class Test1 {
    public static void main(String[] args) {
        // 需求：使用方法计算1-n的和并返回
        int he = add(2,100);
        System.out.println(he);
    }

    public static int add(int n, int m){
        int sum = 0;
        if (n < m) {
            for (int i = n; i <= m; i++) {
                sum += i;
            }
        }
        else {
            System.out.println("输入的数据有错误");
        }
        return sum;
    }
}
