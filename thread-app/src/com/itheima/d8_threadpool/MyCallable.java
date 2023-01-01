package com.itheima.d8_threadpool;

import java.util.concurrent.Callable;

/**
 *  1、定义一个任务类，实现Callable接口，应该声明线程任务执行完毕后的结果的数据类型
 */

public class MyCallable implements Callable<String>{
    private int n;
    public MyCallable(int n){
        this.n = n;
    }
    /**
     * 2、重写call方法（线程的任务方法）
     */
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "执行 1-" + n + "执行的结果是：" + sum;
    }
}
