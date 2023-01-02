package com.itheima.d1_file;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File f = new File("file-io-app/src/data.txt");
        // a、创建新文件，创建成功返回true，繁殖，不需要这个，以后文件写出去的时候都会自动创建
        System.out.println(f.createNewFile());
        File f1 = new File("file-io-app/src/data02.txt");
        System.out.println(f1.createNewFile()); // （几乎不用的，因为以后文件都是自动创建的！）

        // b、mkdir创建一级目录
        File f2 = new File("file-io-app/aaa");
        System.out.println(f2.mkdir());
        // c、mkdirs创建多级目录（重点）
        File f3 = new File("file-io-app/aaa/bbb/ccc/ddd");
        System.out.println(f3.mkdirs()); // 支持多级创建

        // d、删除文件或者文件夹
        System.out.println(f3.delete());  // 占用一样可以删除

        // 只能删除空文件夹，不能删除非空文件夹
        File f5 = new File("file-io-app/aaa");
        System.out.println(f5.delete());
    }
}
