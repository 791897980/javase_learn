package com.itheima.d4_byte_stream;

import java.io.*;

/**
 * 目标：学会使用字节流完成文件的复制（支持一切文件类型的复制）
 */

public class CopyDemo05 {
    public static void main(String[] args) {
        // 1、创建一个字节输入流管道与原视频接通
        try {
            InputStream is = new FileInputStream("H:\\本庄优化\\[7sht.me]hfd-182\\hfd-182.mp4");

            // 2、创建一个字节输出流管道与目标文件接通
            OutputStream os = new FileOutputStream("H:\\本庄优化\\[7sht.me]nacx-018\\2.mp4");

            // 3、定义一个字节数组来转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读写的字节数
            while ((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成了！");
            // 4、关闭流
            os.close();
            is.close(); // 一般关闭流 从里往外关

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
