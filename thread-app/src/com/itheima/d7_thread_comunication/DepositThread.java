package com.itheima.d7_thread_comunication;


public class DepositThread extends Thread{
    private Account acc;
    public DepositThread(Account acc, String name){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        while (true) {
            // 亲爹 干爹 岳父
            acc.deposit(100000);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
