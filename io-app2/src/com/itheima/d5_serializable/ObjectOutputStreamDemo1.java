package com.itheima.d5_serializable;

import java.io.*;

/**
 * 目标：学会对象序列化，使用ObjectOutputStream 把内存中的对象存入到磁盘文件中
 */

public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 1、创建学生对象
        Student s = new Student("陈磊","chenlei","1314520",21);

        // 2、对象序列化使用对象字节输出流包装字节输出流管道
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("io-app2/src/obj.txt"));

        // 3、直接调用序列化方法
        oos.writeObject(s);

        // 4、释放资源
        oos.close();
        System.out.println("序列化完成了");
    }
}
