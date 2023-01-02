package com.itheima.lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // 目标：学会使用Lambda的标准格式简化匿名内部类的代码形式
        // Lambda只能简化接口中只有一个抽象方法的匿名内部类形式
//        Swimming s1 = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("老师游泳贼溜");
//            }
//        };
        // 简化1：
//        Swimming s1 = () -> {
//            System.out.println("老师游泳贼溜~~~");
//        };
        // 简化2：
        go(() -> {
            System.out.println("老师游泳很开心");
        });
    }
    public static void go(Swimming s){
        System.out.println("开始。。。。。");
        s.swim();
        System.out.println("结束。。。。。。");
    }
}

@FunctionalInterface  // 一旦加上这个注解必须是函数式接口，里面只能有一个抽象方法
interface Swimming{
    void swim();
}