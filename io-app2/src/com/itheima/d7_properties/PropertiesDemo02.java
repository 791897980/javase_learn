package com.itheima.d7_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *  目标：Properties读取属性文件中的键值对信息（读取）
 */

public class PropertiesDemo02 {
    public static void main(String[] args) throws IOException {
        // 需求：Properties读取属性文件中的键值对信息。（读取）
        Properties properties = new Properties();
        System.out.println(properties);

        // 加载属性文件中的键值对数据
        properties.load(new FileReader("io-app2/src/users.properties"));
        System.out.println(properties);
        String rs = properties.getProperty("dlei");
        System.out.println(rs);
    }
}



