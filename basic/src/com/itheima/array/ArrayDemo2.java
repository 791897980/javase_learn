package com.itheima.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //目标：学会动态初始化数组的定义和使用
        double[] scores = new double[3];//[0.0,0.0,0.0]默认值

        //赋值
        scores[0] = 99.5;
        System.out.println(scores[0]);
        System.out.println(scores[2]);

        String[] names = new String[90]; //String默认赋值是null
        names[0] = "dolireba";
        names[2] = "maerzhaha";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}
