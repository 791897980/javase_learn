package com.itheima.d8_genericity_class;

import java.util.ArrayList;

public class MyArrayList<E> {
    private ArrayList lists = new ArrayList<>();
    // 需求：模拟ArrayList定义一个MyArrayList，关注泛型设计
    public void add(E e){
        lists.add(e);
    }

    public void remove(E e){
        lists.remove(e);
    }

    @Override
    public String toString() {
        return lists.toString();
    }
}
