package com.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //目标：理解数组的注意事项
        //1、数据类型【】 数组名称 也可以写成 数据类型 数组名称【】  不过不建议
        int[] ages = {12,24,36};
        int ages1[] = {12,24,36};

        //2、什么类型的数组只能存放什么类型的元素
        //String[] names = {"西门吹雪", "独孤求败" , 23};//会报错 因为类型为字符串 数组中有了int类型

        //3、数组一旦定义出来之后，类型和长度就固定了
        int[] ages2 = {12,24,36};
        System.out.println(ages2[3]);//数组越界，因为长度固定为3，不能访问第四个元素
    }
}
