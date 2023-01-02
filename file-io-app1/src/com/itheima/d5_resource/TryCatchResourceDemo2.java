package com.itheima.d5_resource;

import java.io.*;

/**
 * 目标：学会使用finally释放资源
 */

public class TryCatchResourceDemo2 {
    public static void main(String[] args) {

        // 1、创建一个字节输入流管道与原视频接通
        try (
                // 这里面只能放置自愿对象，用完会自动关闭，自动调用资源对象的close方法关闭资源（即使出现异常也会做关闭操作）
                InputStream is = new FileInputStream("H:\\本庄优化\\[7sht.me]hfd-182\\安卓二维码.jpg");
                OutputStream os = new FileOutputStream("H:\\本庄优化\\[7sht.me]nacx-018\\1.jpg");

                //int age = 23; // 这里只能放资源
                MyConnection connection = new MyConnection(); // 最终会自动调用资源的close()方法

                )
        {
            // 3、定义一个字节数组来转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读写的字节数
            while ((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成了！");
            //System.out.println(10/0);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyConnection implements AutoCloseable{

    @Override
    public void close() throws IOException {
        System.out.println("连接资源被成功释放了");
    }
}
