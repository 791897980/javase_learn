package com.itheima.d1_create;

/**
 * 学会线程的创建方式二（匿名内部类方式实现，语法形式）
 */

public class ThreadDemo2Other {
    public static void main(String[] args) {
//        // 3、创建一个任务对象
//        Runnable target = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("子线程执行输出：" + i);
//                }
//            }
//        };
//        // 4、把任务对象交给Thread处理
//        Thread t = new Thread(target);
//        t.start();
//        for (int i = 0; i < 10; i++) {
//            System.out.println("主线程执行输出：" + i);
//        }
//    }

//        Thread t1 =
//        for (int i = 0; i < 10; i++) {
//            System.out.println("主线程执行输出：" + i);
//        }
//    }
        new Thread(() -> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("子线程执行输出：" + i);
                }
            }
        ).start();

    }
}

/**
 * 1、定义一个线程任务类 实现Runnable接口
 */
//class MyRunnable implements Runnable{
//    /**
//     * 2、重写run方法，定义线程的任务
//     */
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("子线程执行输出：" + i);
//        }
//    }
////}
