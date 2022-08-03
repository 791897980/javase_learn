package com.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //目标：学会使用静态初始化的方式定义数组
        //数据类型[] 数组名称 = new 数据类型（元素1，元素2，。。。）
        //原始写法
        double[] scores = new double[]{99.5,88.0,75.5};
        int[] ages = new int[]{12, 24, 36};
        String[] names = new String[]{"wangda","lier"};
        //简化写法
        double[] scores1 = {99.5,88.0,75.5};
        int[] ages1 = new int[]{12, 24, 36};
        String[] names1 = {"wangda","lier"};


        System.out.println(scores);//[D@1540e19d  [-代表数组  D-代表double类型 @-代表地址
    }
}
