package com.itheima.d7_properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo01 {
    public static void main(String[] args) throws IOException {
        // 需求：使用Properties把键值对信息存入到属性文件中去。
        Properties properties = new Properties();
        properties.setProperty("admin","123456");
        properties.setProperty("dlei","123457");
        properties.setProperty("heima","123458");


        System.out.println(properties);
        /**
         * 参数一：保存管道字符输出流管道
         * 参数二：保存心得，类似于注释 没什么用
         */
        properties.store(new FileWriter("io-app2/src/users.properties"),"this is users");
    }
}
