package com.itheima.d7_exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("开始");
        parseTime("2011-11-11 11:11:11");
        System.out.println("结束");

    }

    public static void parseTime(String date)  {
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Date d = sdf.parse(date);
//            System.out.println(d);
//        } catch (ParseException e) {
//            // 解析出现问题
//            System.out.println("出现了解析时间异常");
//        }
//
//        try {
//            InputStream is = new FileInputStream("E:/meinv.jpg");
//        } catch (FileNotFoundException e) {
//            System.out.println("你的文件根本没有");
//        }
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Date d = sdf.parse(date);
//            System.out.println(d);
//            InputStream is = new FileInputStream("E:/meinv.jpg");
//        } catch (ParseException e) {
//            // 解析出现问题
//            e.printStackTrace();  //打印异常栈信息
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(date);
            System.out.println(d);
            InputStream is = new FileInputStream("E:/meinv.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
