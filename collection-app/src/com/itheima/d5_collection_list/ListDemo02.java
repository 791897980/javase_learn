package com.itheima.d5_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Java1");
        lists.add("Java2");
        lists.add("Java3");

        /**
         * (1)for 循环
         */
        System.out.println("----------------------------------");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.size() + "listsize");
            String ele = lists.get(i);
            System.out.println(ele);
        }

        /**
         * (2)迭代器
         */
        System.out.println("----------------------------");
        Iterator<String> it = lists.iterator();
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }
    }
}
