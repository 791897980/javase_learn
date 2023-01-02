package com.itheima.d6_innerclass;

/**
 * 外部类
 */

public class Outer {
    public static int num = 111;
    private String hobby;
    /**
     * 成员内部类：不能加static修饰
     */
    public Outer(){

    }
    public Outer(String hobby){

    }

    public class Inner{
        private String name;
        private int age;
        public static int a; // JDK 16开始支持静态成员

        public Inner() {
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void run(){
            System.out.println(num);
            System.out.println(hobby);
        }
    }
}
