package com.itheima.d1_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo04 {
    public static void main(String[] args) {
        // Set集合去重复原因：先判断哈希值，再判断equals
        Set<Student> sets = new LinkedHashSet<>();
        Student s1 = new Student("a", 20, '男');
        Student s2 = new Student("b", 21, '男');
        Student s3 = new Student("c", 22, '男');
        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        System.out.println(sets);
    }

}