package com.itheima.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("a");
        lists.add("c");
        lists.add("b");
        lists.add("d");
        System.out.println(lists);

        for(String ele: lists){
            System.out.println(ele);
        }

        double[] scores = {100, 99.5, 59.5};
        for (double score : scores) {
            System.out.println(score);
        }
    }
}
