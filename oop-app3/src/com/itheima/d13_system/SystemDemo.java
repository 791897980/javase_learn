package com.itheima.d13_system;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        // 3、做数组拷贝（了解）
        /**
         arraycopy(Object src,  int  srcPos,
         Object dest, int destPos,
         int length);
         参数一：被拷贝的参数
         参数二：从哪个索引位置开始拷贝
         参数三：复制的目标数组
         参数四：粘贴位置
         参数五：拷贝元素的个数
         */
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70};
        int[] arr2 = new int[6]; // [0, 0, 0, 0, 0, 0] ==> [0, 0, 40, 50, 60, 0]
        System.arraycopy(arr1,3,arr2,2,3);
        System.out.println("程序结束。。。。");
        System.out.println(Arrays.toString(arr2));
    }
}
