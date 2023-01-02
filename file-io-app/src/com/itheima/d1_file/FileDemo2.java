package com.itheima.d1_file;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String[] args) {
        // 1、绝对路径创建一个文件对象
        File f1 = new File("H:\\迅雷福利\\资源库\\写真视频\\阿包也是兔娘写真\\阿包也是兔娘 - NO.01 JK日常 [15P-179MB]\\TG@taotuporn (1).jpg");

        // a、获取它的绝对路径
        System.out.println(f1.getAbsolutePath());
        // b、获取文件定义的时候使用的路径
        System.out.println(f1.getPath());
        // c、获取文件的名称，带后缀
        System.out.println(f1.getName());
        // d、获取文件的大小：字节个数
        System.out.println(f1.length());
        // e、获取文件的最后修改时间
        long time = f1.lastModified();
        System.out.println("最后修改时间：" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));
        // f、判断文件对象是文件还是文件夹
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
    }
}
