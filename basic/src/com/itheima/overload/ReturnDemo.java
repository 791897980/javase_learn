package com.itheima.overload;

public class ReturnDemo {
    public static void main(String[] args) {
        // 目标：明确return关键字的作用
        chufa(10, 0);
    }

    public static void chufa(int a, int b){
        if(b == 0){
            System.out.println("您输入的数据有问题，除数不能是0！！");
            return;// 立即跳出当前方法，并结束当前方法的执行
        }
        int c = a / b;
        System.out.println("结果是：" + c);
    }
}
