package com.itheima.constructor;

public class Test {
    public static void main(String[] args) {
        //通过调用构造器得到对象
        Car c = new Car();
        System.out.println(c.price);
        System.out.println(c.name);
        Car c1 = new Car("name", 13.11);
        System.out.println(c.name);
        System.out.println(c1.name);
        System.out.println(c.price);
        System.out.println(c1.price);
        System.out.println(c);
        System.out.println(c1);
    }
}
