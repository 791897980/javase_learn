package com.itheima.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("iphoneX",10);
        maps.put("娃娃",20);
        maps.put("iphoneX",100);
        maps.put("huawei",1000);
        maps.put("生活用品",10);
        maps.put("手表",10);
        //{huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=20}
        System.out.println(maps);

//        maps.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String key, Integer value) {
//                System.out.println(key + "------->" + value);
//            }
//        });
        maps.forEach((k, v) -> System.out.println(k + "------->" + v));
    }
}
