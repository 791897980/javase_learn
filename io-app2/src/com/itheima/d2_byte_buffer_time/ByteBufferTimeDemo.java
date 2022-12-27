package com.itheima.d2_byte_buffer_time;

import java.io.*;

public class ByteBufferTimeDemo {
    private static final String SRC_FILE = "/Users/jinzhilai/Desktop/2282EF4B60843B40FC74B86C5EA2CFEE.mp4";
    private static final String DEST_FILE = "io-app2/src/";

    public static void main(String[] args) {
        //copy01(); // 使用低级的字节流按照一个一个字节的形式复制文件,慢的让人简直无法忍受，直接被淘汰
        copy02(); // 使用低级的字节流按照一个一个字节数组的形式复制文件,比较慢，但是还是可以忍受的
        //copy03(); // 缓冲流一个一个字节复制，很慢，不建议使用
        copy04(); // 缓冲流一个一个字节数组复制：飞快，简直太完美了（推荐使用）
    }

    /**
     * 缓冲流一个一个字节数组复制
     */
    private static void copy04() {
        long startTime = System.currentTimeMillis();
        try (
                //1、创建低级的字节输入流与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                InputStream bis = new BufferedInputStream(is);
                // 2、创建低级的字节输出流与目标文件接通
                OutputStream os = new FileOutputStream(DEST_FILE + "video04.mp4");
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            // 3、定义一个字节数组转移数据
            byte[] buffer = new byte[1024 * 8];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用高级的字节流按照一个一个字节数组的形式复制文件耗时：" + (endTime - startTime) / 1000.0 + "s");
    }

    /**
     * 缓冲流一个一个字节复制
     */
    private static void copy03() {
        long startTime = System.currentTimeMillis();
        try (
                //1、创建低级的字节输入流与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                InputStream bis = new BufferedInputStream(is);
                // 2、创建低级的字节输出流与目标文件接通
                OutputStream os = new FileOutputStream(DEST_FILE + "video03.mp4");
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            // 3、定义一个变量记录每次读取字节（一个一个字节的复制）
            int b;
            while ((b = bis.read()) != -1){
                bos.write(b);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用高级（缓冲）的字节流按照一个一个字节的形式复制文件耗时：" + (endTime - startTime) / 1000.0 + "s");

    }

    /**
     * 使用低级的字节流按照一个一个字节数组的形式复制文件
     */
    private static void copy02() {
        long startTime = System.currentTimeMillis();
        try (
                //1、创建低级的字节输入流与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);

                // 2、创建低级的字节输出流与目标文件接通
                OutputStream os = new FileOutputStream(DEST_FILE + "video02.mp4");
        ) {
            // 3、定义一个字节数组转移数据
            byte[] buffer = new byte[1024 * 8];
            int len;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用低级的字节流按照一个一个字节数组的形式复制文件耗时：" + (endTime - startTime) / 1000.0 + "s");
    }

    /**
     * 使用低级的字节流按照一个一个字节的形式复制文件
     */
    private static void copy01() {
        long startTime = System.currentTimeMillis();
        try (
                //1、创建低级的字节输入流与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);

                // 2、创建低级的字节输出流与目标文件接通
                OutputStream os = new FileOutputStream(DEST_FILE + "video01.mp4");
                ) {
            // 3、定义一个变量记录每次读取字节（一个一个字节的复制）
            int b;
            while ((b = is.read()) != -1){
                os.write(b);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用低级的字节流按照一个一个字节的形式复制文件耗时：" + (endTime - startTime) / 1000.0 + "s");
    }
}
