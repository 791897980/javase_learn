package com.itheima.d4_byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 文件字节输出流
 */

public class OutputStreamDemo04 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个文件字节输出流管道与目标文件接通
        //OutputStream os = new FileOutputStream("file-io-app1\\src\\out01.txt"); 覆盖管道，先清空之气的数据，写新数据进入
        OutputStream os = new FileOutputStream("file-io-app1\\src\\out01.txt",true);//  追加数组 ，不会清空上次的数据 加一个参数true即可

        // 2、写数据出去
        // a.public void write(int a);写一个字节出去
        os.write('a');
        os.write(98);
        os.write("\r\n".getBytes()); // \r\n 换行 相对于 \n  \r\n 对不同系统的兼容性更强
        //os.write('徐');// 写一个字节不能写中文的 会乱码

        // 写数据必须，刷新数据
        //os.flush(); 单纯刷新数据，可以继续使用流
        //os.close();  // 关流，释放资源 因为管道是资源，一定要关流 会占用资源 也会占用cpu的性能 关流也包括刷新了
        // 关闭后不可再使用流了

        // b、public void write(byte[] buffer), 写一个字节数组出去
        byte[] buffer = {'a',97,98,99};
        os.write(buffer);

        byte[] buffer2 = "我是中国人".getBytes();
        os.write(buffer2);

        // c、public void write(byte[] buffer, int pos, int len):写一个字节数组的一部分出去
        byte[] buffer3 = {'a',97,98,99};
        os.write(buffer3,0,3);
        os.close();
    }
}
