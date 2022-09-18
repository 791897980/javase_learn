package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Mysql");
        list.add("MyBatics");
        list.add("HTML");

        //1、public E get(int index) 获取某个索引位置处的元素值
        String e = list.get(3);
        System.out.println(e);
        //2、public int size()  获取集合的大小（元素个数）
        int mount = list.size();
        System.out.println(mount);
        //3、完成集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        //4、public E remove(int index) 删除某个索引位置处的元素值，并返回被删除的元素值
        //System.out.println(list.remove(1));
        System.out.println(list);
        //5、public boolean remove(Object o):直接删除元素值，删除成功返回true，删除失败返回false
        System.out.println(list.remove("Java"));
        System.out.println(list);
        System.out.println(list.remove("Java"));

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("aadbb");
        list1.add("Java");
        //只会删除第一次出现的这个元素值，后面的不删除
        System.out.println(list1.remove("Java"));
        System.out.println(list1);

        //6、public E set (int index, E element) 修改某个索引位置处的元素值,返回修改前的值
        System.out.println(list1.set(0, "dddd"));
        System.out.println(list1);
    }
}
