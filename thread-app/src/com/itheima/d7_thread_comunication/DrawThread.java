package com.itheima.d7_thread_comunication;

import com.itheima.d4_thread_synchronized_code.Account;

public class DrawThread extends Thread{
    private com.itheima.d4_thread_synchronized_code.Account acc;
    public DrawThread(Account acc, String name){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        // 小明 小红 ： acc
        acc.drawMoney(100000);
    }
}
