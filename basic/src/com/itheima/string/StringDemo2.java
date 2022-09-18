package com.itheima.string;

import java.util.Random;

public class StringDemo2 {
    public static void main(String[] args) {
        //1、定义可能出现额字符信息
        String datas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count = 0;
        //2、循环五次，每次生成一个随机的索引，提取对应的字符连接起来即可
        while (true) {
            String code1 = "";
            String code2 = "";


            for (int i = 0; i < 5; i++) {
                Random r = new Random();
                //随机一个索引
                int index1 = r.nextInt(datas.length());
                int index2 = r.nextInt(datas.length());
                char c1 = datas.charAt(index1);
                char c2 = datas.charAt(index2);
                code1 += c1;
                code2 += c2;
            }
            if (code1 == code2){
                System.out.println(code1);
                System.out.println(code2);
                break;
            }else {
                count += 1;
                System.out.println(count);
            }
        }
        //3、输出字符串变量即可

    }
}
