package com.itheima.d8_threadpool;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出了：" + i);
        }
        try {
            System.out.println(Thread.currentThread().getName() + "进入了休眠");
            Thread.sleep(1000000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
