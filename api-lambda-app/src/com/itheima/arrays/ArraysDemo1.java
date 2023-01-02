package com.itheima.arrays;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        // 目标：学会使用Arrays类的常用API，并理解其原理
        int[] arr = {10, 2, 55, 23, 24, 100};
        System.out.println(arr);
        // 1、返回数组内容的 toString（数组）
//        String rs = Arrays.toString(arr);
//        System.out.println(rs);

        System.out.println(Arrays.toString(arr));

        // 2、排序的API（默认自动对数组元素进行升序排行）
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 3、二分搜索技术
        int index = Arrays.binarySearch(arr, 55);
        System.out.println(index);
    }
}
