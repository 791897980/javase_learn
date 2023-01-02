package com.itheima.d1_polymorphic;

public class Dog extends Animal{
    public String name = "子类狗";
    @Override
    public void run() {
        System.out.println("狗跑的贼溜");
    }
    /**
     * 独有功能
     */
    public void lookDoor(){
        System.out.println("狗在看门");
    }
}
