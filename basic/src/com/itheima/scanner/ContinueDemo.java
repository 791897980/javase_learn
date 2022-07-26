package com.itheima.scanner;

public class ContinueDemo {
    public static void main(String[] args) {
        //continue 跳出当前循环的当次执行，进入循环的下一次
        //场景：假如你又有老婆，每天都被罚洗碗，洗到第三天后原谅你了，依然不解恨，继续洗第四天、五天
        for (int i = 1; i <= 5; i++){
            if(i == 3){
                continue;//立即跳出档次执行，进入循环的下一次
            }
            System.out.println("洗碗" + i);
        }
    }
}
