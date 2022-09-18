package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * 目标：能够使用泛型约束ArrayList集合操作的数据类型
 */

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String>();//JDK 1.7开始，泛型后面的类型申明可以不写
        list.add("ad");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(23);

        ArrayList<Object> list3 = new ArrayList<>();

    }
}
