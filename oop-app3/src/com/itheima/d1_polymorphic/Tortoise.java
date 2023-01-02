package com.itheima.d1_polymorphic;

public class Tortoise extends Animal{

    public String name = "子类乌龟";

    @Override
    public void run() {
        System.out.println("乌龟根本跑不了");
    }

    /**
     * 独有功能
     */
    public void layEggs(){
        System.out.println("乌龟在下蛋");
    }
}
