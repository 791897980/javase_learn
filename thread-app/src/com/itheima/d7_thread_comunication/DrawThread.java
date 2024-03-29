package com.itheima.d7_thread_comunication;


public class DrawThread extends Thread{
    private Account acc;
    public DrawThread(Account acc, String name){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        while (true) {
            // 小明 小红 取钱
            acc.drawMoney(100000);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
