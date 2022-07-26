package com.branch.random;
import java.util.Random;
import java.util.Scanner;

public class RandomDemo3 {
    public static void main(String[] args) {
        // 1 、随机一个幸运号码，1-100
        Random r = new Random();
        int luckyNumber = r.nextInt(100) + 1;

        //2、猜测逻辑-死循环 并给出提示
        Scanner sc = new Scanner(System.in);
        while (true){
            // 让用户输入数据猜测
            System.out.println("请输入猜测的数字(1-100)： ");
            int guessNumber = sc.nextInt();
            //3、判断这个猜测的好吗与幸运号码的大小情况
            if (guessNumber > luckyNumber){
                System.out.println("您猜测的数据过大：");
            } else if (guessNumber < luckyNumber) {
                System.out.println("您猜测的数据过小： ");
            }else {
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
    }
}
