package com.itheima.d7_thread_comunication;

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

    /**
     * 亲爹 干爹 岳父
     * @param money
     */
    public synchronized void deposit(double money) {
        try {
            String name = Thread.currentThread().getName();
            if(this.money == 0){
                // 没钱了，存钱
                this.money += money;
                System.out.println(name + "存钱" + money + "成功！存钱后余额是：" + this.money);
                // 有钱了：唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            }else {
                // 有钱 不存钱
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 小红 小明 ： 取钱
     * @param
     */
    public synchronized void drawMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if(this.money >= money){
                // 钱够：可取
                this.money -= money;
                System.out.println(name + "来取钱：" + money + "成功!余额是：" + this.money);
                // 没钱了
                this.notifyAll(); // 唤醒所有线程
                this.wait(); // 锁对象，让当前线程进入等待
            }else {
                // 钱不够：不可取
                // 唤醒别人，等待自己
                this.notifyAll(); // 唤醒所有线程
                this.wait(); // 锁对象，让当前线程进入等待

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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



}
















