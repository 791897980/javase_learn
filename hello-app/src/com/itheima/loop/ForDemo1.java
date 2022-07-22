package com.itheima.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        //
        for (int i = 0; i < 3; i++){
            System.out.println("H");
        }
        int sum = 0;
//        for (int j = 1; j <= 5; j ++){
//            sum += j;
//
//        }
        System.out.println(sum);
        //求1-10的奇数和
        for(int i = 1; i <=10; i++) {
            //i 1 2 3 4 5 6 7 8 9 10
            //2、筛选出奇数
            if (i % 2 == 1) {
            sum += i;
            }
        }
        System.out.println(sum);
    }
}
