package com.itheima.d2_api;

public class ThreadDemo02 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            System.out.println("输出：" + i);
            if(i == 3){
                // 让线程进入休眠状态
                Thread.sleep(3000);
            }
        }
    }
}
