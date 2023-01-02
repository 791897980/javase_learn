package com.itheima.d5_collection_list;

import java.util.LinkedList;

public class ListDemo03 {
    public static void main(String[] args) {
        // LinkedList 可以完成队列结构，和栈结构（双链表）
        // 栈
        LinkedList<String> stack = new LinkedList<>();
        // 压栈，入栈
//        stack.addFirst("第1颗子弹");
//        stack.addFirst("第2颗子弹");
//        stack.addFirst("第3颗子弹");
//        stack.addFirst("第4颗子弹");
//        stack.addFirst("第5颗子弹");
        stack.push("第1颗子弹");
        System.out.println(stack);

        // 出栈，弹栈
        stack.pop();
        System.out.println(stack.removeFirst());
        System.out.println(stack);

        // 队列
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);

        // 出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

    }
}
