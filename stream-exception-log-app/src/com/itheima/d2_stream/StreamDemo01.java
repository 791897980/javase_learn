package com.itheima.d2_stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo01 {
    public static void main(String[] args) {
        /**
         * Collection集合获取流
         */
        Collection<String> list = new ArrayList<>();
        Stream<String> s= list.stream();

        /**
         * Map集合获取流
         */
        Map<String, Integer> maps = new TreeMap<>();
        // 不认为map整体有类型，没办法直接拿到流
        // 可以先拿键流
        Stream<String> keyStream = maps.keySet().stream();
        // 值流
        Stream<Integer> valueStream = maps.values().stream();
        // 键值对流
        Stream<Map.Entry<String,Integer>> keyValueStream = maps.entrySet().stream();

        /**
         * 数组获取流
         */
        String[] names = {"a","b","c","d","e"};
        Stream<String> nameStream = Arrays.stream(names);
        Stream<String> nameStream2 = Stream.of(names);

    }
}
