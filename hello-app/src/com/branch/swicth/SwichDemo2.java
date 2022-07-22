package com.branch.swicth;

public class SwichDemo2 {
    public static void main(String[] args) {
        // 目标：清除switch的注意点，并在开发的时候注意
        //表达式类型只能是byte、short、int、char、JDK5 开始支持String，不支持double，float，long
        byte a = 20;
        char b = 'c';
        double c = 12.3;
        switch (b){
        }
        //需求：用户输入月份可以展示该月份的天数
        //1、3、5、7、8、10、12月份是31天
        //4、6、8、11月份是30天

        int month = 7;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "是31天");
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "30天");
                break;
            default:
                System.out.println("数据错误");
        }
    }
}
