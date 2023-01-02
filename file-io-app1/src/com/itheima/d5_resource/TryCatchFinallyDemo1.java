package com.itheima.d5_resource;

import java.io.*;

/**
 * 目标：学会使用finally释放资源
 */

public class TryCatchFinallyDemo1 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        // 1、创建一个字节输入流管道与原视频接通
        try {
            is = new FileInputStream("H:\\本庄优化\\[7sht.me]hfd-182\\安卓二维码.jpg");

            // 2、创建一个字节输出流管道与目标文件接通
            os = new FileOutputStream("H:\\本庄优化\\[7sht.me]nacx-018\\1.jpg");

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
        }finally {
            // 无论代码是正常结束，还是出现异常都要执行这里,就算写了return也要跑finally
            System.out.println("============finally=================");
            // 4、关闭流
            try {
                if( os != null){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if( is != null){
                    is.close(); // 一般关闭流 从里往外关
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(test(10, 2));
    }

    //考题
    public static int test(int a, int b){
        try {
            int c = a / b;
            return c;
        }catch (Exception e){
            e.printStackTrace();
            return -1111111; // 计算出bug
        }finally {
            // 哪怕上面有return语句执行，也必须先执行完这里才可以
            // 开发中不建议在这里加return，如果加了，返回的永远是这里的护具，这样会出问题
            return 100;  //如果在finally里加return ，那么所有的结果都为100
        }
    }
}
