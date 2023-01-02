package com.itheima.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ColletionDemo01 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("a");
        lists.add("c");
        lists.add("b");
        lists.add("d");
        System.out.println(lists);

        // 得到当前集合的迭代器对象
        Iterator<String> it = lists.iterator();
//        String ele = it.next();
//        System.out.println(ele);
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        //System.out.println(it.next()); //NoSuchElementException
        // 2、定义while循环
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }
    }
}
