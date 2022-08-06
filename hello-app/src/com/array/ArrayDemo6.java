package com.array;

public class ArrayDemo6 {
    public static void main(String[] args) {
        //1、定义一个数组，存储一些数据
        int[] arr = {5, 2, 3, 1};
        //2、定义一个循环控制比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            //3、定义一个循环控制每轮比较的次数，占位
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //4、判断当前位置的元素值是否大于后一个元素值 若较大 则交换
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //5、遍历数组内容输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
