package com.itheima.d2_stream;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 目标：收集Stream流的数据到 集合或者数组中去
 */

public class StreamDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张三丰","张无忌","周芷若","赵敏","张强","张三丰");
        Stream<String> s = list.stream().filter(s1 -> s1.startsWith("张"));
        List<String> zhanglist = s.collect(Collectors.toList());
        System.out.println(zhanglist);

        // 注意注意注意 "流只能使用一次"
        Stream<String> s2 = list.stream().filter(s1 -> s1.startsWith("张"));
        Set<String> zhangSet = s2.collect(Collectors.toSet());
        System.out.println(zhangSet);

        // 收集成数组
        Stream<String> s3 = list.stream().filter(s1 -> s1.startsWith("张"));
        //Object[] arrs = s3.toArray();
        String[] arrs = s3.toArray(String[]::new);
        System.out.println("Arrays数组内容：" + Arrays.toString(arrs));
    }
}
