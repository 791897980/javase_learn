package com.itheima.d5_collection_list;

import java.util.ArrayList;

public class ListDemo01 {
    public static void main(String[] args) {
        // 1、创建一个ArrayList集合对象
        // List：有序，课程福，有索引的
        ArrayList<String> list = new ArrayList<>();  // 一行经典代码就诞生了！
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MySQL");
        // 2、在某个索引位置插入元素
        list.add(2, "HTML");
        System.out.println(list);
        // 3、根据索引删除元素，返回被删除元素
        System.out.println(list.remove(2));
        System.out.println(list);

        // 4、根据索引获取元素：public E get(int index)：返回集合中指定位置的元素
        System.out.println(list.get(2));
        // 5、修改索引位置处的元素：public E set(int index, E element)
        // 返回修改前的数据
        System.out.println(list.set(1, "高斯林"));
        System.out.println(list);
        list.clear();
    }
}
