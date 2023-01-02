package com.itheima.d1_polymorphic;

public class Test {
    public static void main(String[] args) {
        // 自动类型转换
        Animal a = new Dog();
        a.run();

        // 强制类型转换
        Animal a2 = new Tortoise();
        a2.run();
        //Tortoise t = (Tortoise)a2; //从父类类型到子类类型，必须强制类型转换
        //t.layEggs();

        //Dog d = (Dog) a2;// 强制类型转换，编译阶段不报错的，有继承或者实现关系编译阶段可以强制，没有毛病）运行时可能出错
        if(a2 instanceof Tortoise){
            Tortoise t = (Tortoise) a2;
            t.layEggs();
        }else if(a2 instanceof Dog){
            Dog d = new Dog();
            d.lookDoor();
        }
    }
}
