package com.itheima.scanner;

public class WhileDemo1 {
    public static void main(String[] args) {
        double peakHeight = 8848480;
        double paperThickness = 0.1;
        int count = 0;
        while (paperThickness < peakHeight){
            paperThickness *= 2;
            count ++;
        }
        System.out.println("折叠的次数：" + count);
        System.out.println("纸张的最终厚度：" + paperThickness);
    }
}
