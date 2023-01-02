package com.itheima.d1_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        // 看看Set系列集合的特点 HashSet LinkedHashSet TreeSet
        // 无序不重复，无索引
        Set<String> sets = new HashSet<>(); // 一行经典代码
        sets.add("MySQL");
        sets.add("MySQL");
        sets.add("Java");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        System.out.println(sets);

        // 有序 不重复 无索引
        Set<String> sets1 = new LinkedHashSet<>();
        sets1.add("MySQL");
        sets1.add("MySQL");
        sets1.add("Java");
        sets1.add("HTML");
        sets1.add("HTML");
        sets1.add("SpringBoot");
        sets1.add("SpringBoot");
        System.out.println(sets1);

    }
}
