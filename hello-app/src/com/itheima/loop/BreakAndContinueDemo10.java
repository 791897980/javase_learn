package com.itheima.loop;

public class BreakAndContinueDemo10 {
    public static void main(String[] args) {
        //目标：理解break和continue的作用
        //场景：假如你又有老婆，你犯错了，你老婆罚你做五天家务，每天都是洗碗，洗碗到第三天后不用洗碗了
        for (int i = 0; i < 5; i++){
            System.out.println("快乐的洗碗");
            if (i == 2){
                break;//跳出并结束当前的循环执行
            }
        }
    }
}
