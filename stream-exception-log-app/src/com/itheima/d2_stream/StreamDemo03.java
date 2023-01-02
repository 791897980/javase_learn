package com.itheima.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张三丰","张无忌","周芷若","赵敏","张强","张三丰");
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("张");
//            }
//        });
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
        long size = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(size);
        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(System.out::println);
        list.stream().filter(s -> s.startsWith("张")).skip(2).forEach(System.out::println);
        
        //Map加工方法：第一个参数原材料 -> 第二个参数是加工后的结果
        // 给集合元素的前面都加上一个黑马的
        list.stream().map(s -> "黑马的：" + s).forEach(s -> System.out.println(s));

        // 需求：把所有的名称 都加工成一个学生对象
//        list.stream().map(s -> new Student(s)).forEach(s -> System.out.println(s));
        list.stream().map(Student::new).forEach(System.out::println); // 构造器引用  方法引用

        // 合并流。
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2 = Stream.of("Java1","Java2");
        Stream<String> s3 = Stream.concat(s1,s2);
        s3.distinct().forEach(s -> System.out.println(s));
    }
}
