package com.itheima.d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * public Object[] toArray(): 把集合中的元素，存储到数组中
 * 小结：
 * 记住以上API
 */

public class CollectionDemo {
    public static void main(String[] args) {
        // HashSet:添加的元素是无序，不重复，无索引
        Collection<String> list = new ArrayList<>();
        // 1、添加元素，添加成功返回true
        list.add("Java");
        list.add("HTML");
        System.out.println(list.add("HTML"));
        list.add("MySQL");
        list.add("Java");
        list.add("黑马");
        System.out.println(list);
        // 2、清空集合的元素
        //list.clear();
        System.out.println(list);

        // 3、判断集合是否为空，是空返回true，反之
        System.out.println(list.isEmpty());

        // 4、获取集合的大小
        System.out.println(list.size());
        // 5、判断集合中是否包含某个元素
        System.out.println(list.contains("Java"));
        System.out.println(list.contains("java"));
        // 6、删除某个元素：如果有多个重复元素默认删除前面的第一个！
        System.out.println(list.remove("java"));
        System.out.println(list);
        System.out.println(list.remove("Java"));
        System.out.println(list);
        // 7、把集合转换成数组 [Java, 独孤求败, HTML, Mybatic]
        Object[] arrs = list.toArray();
        System.out.println("数组：" + Arrays.toString(arrs));
        System.out.println("++++++++++++++拓展++++++++++++++++++++");
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("赵敏");
        c2.add("殷素素");
        // addAll 把c2集合的元素全部倒入到c1中去
        c1.addAll(c2);
        System.out.println(c1);

    }
}
