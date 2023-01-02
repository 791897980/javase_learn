package com.itheima.d9_map_impl;

import java.util.*;

/**
 * 需求：统计投票人数
 */

public class MapTest4 {
    public static void main(String[] args) {
        // 1、要求程序记录每个学生选择的情况
        // 使用一个Map集合存储
        Map<String, List<String>> data = new HashMap<>();


        // 把学生选择的数据存入进去
        List<String> selects = new ArrayList<>();
        Collections.addAll(selects,"A","C");
        data.put("a",selects);
        System.out.println(data);

        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1,"B","C","D");
        data.put("b",selects1);
        System.out.println(data);

        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2,"A","B","C","D");
        data.put("c",selects2);
        System.out.println(data);


        // 3、统计每个景点选择的人数
        Map<String, Integer> infos = new HashMap<>();

        // 4、提取所有人选择的景点的信息
        Collection<List<String>> values = data.values();
        // values = [[A, C], [B, C, D], [A, B, C, D]]

        for (List<String> value : values) {
            for (String s : value) {
                // 有没有包含这个景点
                if(infos.containsKey(s)){
                    infos.put(s, infos.get(s) + 1);
                }else {
                    infos.put(s, 1);
                }
            }
        }
        System.out.println(infos);
    }
}
