package com.itheima.d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // names.add("楚留香");
        // names.add("胡铁花");
        // names.add("张无忌");
        // names.add("陆小凤");
        Collections.addAll(names,"楚留香","胡铁花","张无忌","陆小凤");
        System.out.println(names);

        // 2、 public static void shuffle(List<?> list):打乱集合顺序
        Collections.shuffle(names);
        System.out.println(names);

        // 3、public static <T> void sort(List<T> list):将集合中元素按照默认规则排序（排值特性的元素）
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,12,23,2,4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
