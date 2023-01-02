package com.itheima.d6_char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileRederDemo01 {
    public static void main(String[] args) throws Exception {
        // 目标：每次读取一个字符
        // 1、创建一个字符输入流管道与源文件接通
        Reader fr = new FileReader("file-io-app1\\src\\data02.txt");

        // 2、读取一个字符返回，没有可读的字符了返回-1
        int code;
        while ((code = fr.read()) != -1) {
            System.out.print((char) code);
        }
    }
}
