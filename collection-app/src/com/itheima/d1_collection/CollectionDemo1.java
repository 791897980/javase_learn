package com.itheima.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


/**
 * 目标：明确Collection集合体系的特点
 */

public class CollectionDemo1 {
    public static void main(String[] args) {
        // 有序 可重复 有索引
        Collection list = new ArrayList();
        list.add("Java");
        list.add("Java");
        list.add("Mybatis");
        list.add(23);
        list.add(23);
        list.add(false);
        list.add(false);
        System.out.println(list);

        // 无序 不重复 无索引
        Collection list1 = new HashSet();
        list1.add("Java");
        list1.add("Java");
        list1.add("Mybatis");
        list1.add(23);
        list1.add(23);
        list1.add(false);
        list1.add(false);
        System.out.println(list1);

        System.out.println("----------------------------------");
        Collection<String> list2 = new ArrayList<>();  // JDK 7开始之后后面类型申明可以不写
        list2.add("Java");
        //list2.add(23);

        // 集合和泛型不支持基本数据类型，只支持引用数据类型 //
        Collection<Integer> list3 = new ArrayList<>();
        list3.add(23);
        Collection<Double> list4 = new ArrayList<>();
        list4.add(23.3);
    }
}

