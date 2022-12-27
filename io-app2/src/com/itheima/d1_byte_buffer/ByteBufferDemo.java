package com.itheima.d1_byte_buffer;

import java.io.*;

/**
 * 目标：使用字节缓冲流完成数据的读写操作
 */

public class ByteBufferDemo {
    public static void main(String[] args) {
        try(
                InputStream is = new FileInputStream("io-app2/src/data.txt");
                // a、把原始的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream("io-app2/src/data01.txt");
                // b、把字节输出流管道包装成高级的缓冲字节输出流管道
                OutputStream bos = new BufferedOutputStream(os);
        ){
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成了");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
