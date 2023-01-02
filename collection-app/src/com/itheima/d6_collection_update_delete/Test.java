package com.itheima.d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 1、准备数据
        List<String> list = new ArrayList<>();
        list.add("黑马");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 需求：删除全部的Java信息
        // a、迭代器遍历删除
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String ele = it.next();
//            if("a".equals(ele)){
//                // list.remove("a"); 会崩
//                it.remove();// 删除当前所在元素，并且不会后移：使用迭代器删除当前位置的元素，保证不后移，能够成功遍历到全部元素
//            }
//        }
//        System.out.println(list);

        // b、foreach遍历删除(会出现bug）
//        for(String s :list){
//            if("a".equals(s)){
//                // list.remove("a"); 会崩
//                list.remove("a");// 删除当前所在元素，并且不会后移：使用迭代器删除当前位置的元素，保证不后移，能够成功遍历到全部元素
//            }
//        }

        // c、lambda表达式(会出现bug）
//        list.forEach(s -> {
//            if("a".equals(s)){
//                // list.remove("a"); 会崩
//                list.remove("a");// 删除当前所在元素，并且不会后移：使用迭代器删除当前位置的元素，保证不后移，能够成功遍历到全部元素
//            }
//        });

        // for循环(不会出现异常错误，但是数据删除出现了问题，会漏掉元素）
//        for (int i = list.size() - 1; i >= 0; i--) {
//            String ele = list.get(i);
//            if("a".equals(ele)){
//                // list.remove("a"); 会崩
//                list.remove("a");// 删除当前所在元素，并且不会后移：使用迭代器删除当前位置的元素，保证不后移，能够成功遍历到全部元素
//            }
//        }
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            if("a".equals(ele)){
                // list.remove("a"); 会崩
                list.remove("a");// 删除当前所在元素，并且不会后移：使用迭代器删除当前位置的元素，保证不后移，能够成功遍历到全部元素
                i--;
            }
        }
        System.out.println(list);

        // 解决方案


    }
}
