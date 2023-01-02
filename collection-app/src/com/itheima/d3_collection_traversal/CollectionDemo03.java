package com.itheima.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("a");
        lists.add("c");
        lists.add("b");
        lists.add("d");
        System.out.println(lists);
        //lists.forEach( s -> System.out.println(s));
        lists.forEach(System.out::println);
    }
}
