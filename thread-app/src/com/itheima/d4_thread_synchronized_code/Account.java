package com.itheima.d4_thread_synchronized_code;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String name;
    private double money;

    // final修饰后，锁对象是唯一和不可替换的，非常专业
    private final Lock lock = new ReentrantLock();

    public Account(String name, double price) {
        this.name = name;
        this.money = price;
    }

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setPrice(double money) {
        this.money = money;
    }

    // 100 个线程人
    public static void run(){
        synchronized (Account.class){

        }
    }

    public synchronized void drawMoney(double money){
        // 1、拿到是谁来取钱
        String name = Thread.currentThread().getName();

        // 同步代码块
        // 小明 小红
//        synchronized (this) {
//            // 2、判断余额是否足够
//            if(this.money >= money){
//                // 钱够了
//                System.out.println(name + "来取钱，吐出：" + money);
//                // 更新余额
//                this.money -= money;
//                System.out.println(name + "取钱后，余额剩余：" + this.money);
//
//            }else {
//                // 3、余额不足
//                System.out.println(name + "来取钱，余额不足");
//            }
        lock.lock(); // 上锁
        try {
            if(this.money >= money){
                // 钱够了
                System.out.println(name + "来取钱，吐出：" + money);
                // 更新余额
                this.money -= money;
                System.out.println(name + "取钱后，余额剩余：" + this.money);

            }else {
                // 3、余额不足
                System.out.println(name + "来取钱，余额不足");
            }
        } finally {
            lock.unlock(); // 解锁
        }

    }
}
















