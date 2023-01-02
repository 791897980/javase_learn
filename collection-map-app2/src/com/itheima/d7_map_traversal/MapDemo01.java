package com.itheima.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
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

        // 1、键找值，第一步：先拿到集合的全部键
        Set<String> keys = maps.keySet();
        // 2、第二部：遍历每个键，根据键提取值
        for(String key: keys){
            int value = maps.get(key);
            System.out.println(key + "===>" + value);
        }
    }
}
