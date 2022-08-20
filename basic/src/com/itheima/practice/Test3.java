package com.itheima.practice;
/*
        需求：定义方法实现随机产生一个5位验证码，每位可能是数字、大小写、字母
 */

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //5、调用获取验证码的方法得到一个随机的验证码
        String code = createCode(5);
        System.out.println("随机验证码：" + code);

    }

    /*
        1、定义一个方法返回一个随机验证码：是否需要返回值类型声明？String 是否需要生命形参 int n
     */

    public static String createCode(int n){
        //4、定义一个字符串变量记录生成的随机字符
        String code = "";
        //2、定义一个for循环，循环n次，依次生成随机字符
        Random r = new Random();

        for(int i = 0; i < n; i++){
            //3、生成一个随机字符：英文大写 小写 数字
            int type = r.nextInt(3);
            switch (type){
                case 0:
                    //大写字符(A 65 - Z 65 + 25)
                    char ch = (char) (r.nextInt(26) + 65);
                    code += ch;
                    break;
                case 1:
                    //小写字符(a 97 - z 97 + 25)
                    char ch1 = (char) (r.nextInt(26) + 97);
                    code += ch1;
                    break;
                case 2:
                    //数字字符
                    code += r.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
