package com.itheima.d6_printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 目标：学会使用打印流 搞笑 方便写数据到文件
 */

public class PrintDemo1 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个打印流对象
        PrintStream ps = new PrintStream(new FileOutputStream("io-app2/src/data01.txt",true)); // 追加数据，在低级管道后面加true
        //PrintStream ps = new PrintStream("io-app2/src/data01.txt");
        //PrintWriter ps = new PrintWriter("io-app2/src/data01.txt");  // 打印功能上与PrintStream的使用没有区别
        ps.println(97);
        ps.println('a');
        ps.println(true);
        ps.println(23.3);
        ps.println("sjakhdguu1873电话带来了");
        //ps.write("我在学校");
        ps.close();

    }
}
