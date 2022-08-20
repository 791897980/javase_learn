package com.itheima.param;

public class Test6 {
    public static void main(String[] args) {
        // 目标：识别方法重载的形式，并理解其调用流程，最后需要知道使用方法重载的好处
        fire();
        fire("岛国");
        fire("岛国",1000);
    }

    public static void fire(){
        System.out.println("开炮");
    }

    public static void fire(String location){
        System.out.println("默认发射" + location + "---");
    }

    public static void fire(String location, int numbers){
        System.out.println("默认发射" +numbers + location + "---");
    }
}
