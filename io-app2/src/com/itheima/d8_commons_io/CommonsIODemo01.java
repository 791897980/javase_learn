package com.itheima.d8_commons_io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class CommonsIODemo01 {
    public static void main(String[] args) throws Exception {
        // 1、完成文件复制
        //IOUtils.copy(new FileInputStream("io-app2/src/log.txt"),
                //new FileOutputStream("io-app2/src/log1.txt"));

        // 2、完成文件复制到某个文件夹下
        //FileUtils.copyFileToDirectory(new File("io-app2/src/log.txt"),
                //new File("io-app2/src/log/"));

        // 3、完成文件夹复制到某个文件夹下
        // FileUtils.copyDirectoryToDirectory(new File("io-app2/src/log"),new File("io-app2/src/copy"));
        //FileUtils.deleteDirectory(new File("io-app2/src/copy"));

        //JDK 1.7 自己也做了一些一行代码完成复制的操作 ： NIO
        Files.copy(Path.of("io-app2/src/log.txt"),Path.of("io-app2/src/log2.txt"));
    }
}
