package com.itheima.d1_unchange_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 不可变集合
 */

public class CollectionDemo {
    public static void main(String[] args) {
//        List<Double> lists = List.of(569.5,700.5,523.0,570.4);
//        System.out.println(lists);
//        lists.add(689.0);
//        System.out.println(lists);
//        lists.set(2,698.5);

        // 2、不可变Set集合
//        Set<String> names = Set.of("迪丽热巴","b","c","d");
//        System.out.println(names);
//        names.add("三");
//        System.out.println(names);

        // 3、不可变的Map集合
        Map<String,Integer> maps = Map.of("huawei",2,"Java",1,"手表",1);
        System.out.println(maps);
        maps.put("衣服",1);
    }
}
