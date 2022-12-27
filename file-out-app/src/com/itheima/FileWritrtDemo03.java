package com.itheima;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWritrtDemo03 {
    public static void main(String[] args) throws IOException {
        // 1、创建一个字符输出流管道与目标文件接通
        //Writer fw = new FileWriter(new File("file-out-app/src/data01.txt"));  // 覆盖管道，每次启动都会清空文件之前的数据
        Writer fw = new FileWriter("file-out-app/src/data01.txt",true);  // 追加管道，不会清空文件之前的数据
        // a、public void write(int c)
        fw.write(98);
        fw.write('a');
        fw.write('徐');  // 不会出问题了
        fw.write("\r\n"); // 换行

        // b、public void write(String c)写一个字符串出去
        fw.write("abc我是中国人");
        fw.write("\r\n"); // 换行

        // c、public void write(char[] buffer): (比较多余）可以发字符串出去
        char[] chars = "abc我是中国人".toCharArray();
        fw.write(chars);
        fw.write("\r\n"); // 换行

        //d、public void write(String c,int pos, int len):写字符串的一部分出去
        fw.write("abc我是中国人",0,5);
        fw.write("\r\n"); // 换行

        // e、public void write(char[] buffer , int pos, int len):写字符数组的一部分出去
        fw.write("abc我是中国人", 3,5);
        fw.write("\r\n"); // 换行

        //  fw.flush(); // 刷新后流可以继续使用
        fw.close();  // 关闭包含刷新，关闭后流不能使用
    }
}
