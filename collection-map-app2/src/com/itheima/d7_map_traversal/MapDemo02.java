package com.itheima.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
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

        // 1、把Map集合转换成Set集合  ctrl+alt+v 自动补全
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        // 2、开始遍历
        for(Map.Entry<String, Integer> entry : entries){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "===>" + value);
        }
    }
}
