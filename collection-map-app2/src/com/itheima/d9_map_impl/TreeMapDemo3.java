package com.itheima.d9_map_impl;

import com.itheima.d1_set.Apple;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        // TreeMap 集合自带排序， 可排序 不重复（只要大小规则一样就认为重复） 无索引
        Map<Apple, String> maps = new TreeMap<>((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));//按照价格降序排序
        maps.put(new Apple("红富士", "红色", 9.9, 500), "山东");
        maps.put(new Apple("青苹果", "绿色", 15.9, 300),"上海");
        maps.put(new Apple("绿苹果", "青色", 29.9, 400),"江西");
        maps.put(new Apple("黄苹果", "黄色", 9.8, 500),"湖北");
        System.out.println(maps);
    }
}
