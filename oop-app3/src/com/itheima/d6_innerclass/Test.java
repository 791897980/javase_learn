package com.itheima.d6_innerclass;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        System.out.println(in);
        System.out.println("---------------------------");

        Outer.Inner in1 = new Outer("爱听课").new Inner();
        in1.run();
    }
}
