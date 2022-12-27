package com.itheima;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo02 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个文件字符输入流与源文件接通
        Reader fr = new FileReader("file-out-app/src/data.txt");

        // 2、用循环，每次读取一个字符数组的数据
        char[] buffer = new char[1024]; // 1K字符
        int len;
        while ((len = fr.read(buffer)) != -1){
            String rs = new String(buffer,0,len);
            System.out.println(rs);
        }
    }
}
