package com.itheima.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        //需求：找出水仙花数并输出
        //1、定义一个for循环找出全部三位数
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            //2.判断这个三位数是否满足需求
            int ge = i % 10;
            int shi = (i / 10) % 10;
            int bai = i / 100;

            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                System.out.print(i + "\t");
                count++;
            }


        }
        System.out.println(count);
    }
}
