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
















