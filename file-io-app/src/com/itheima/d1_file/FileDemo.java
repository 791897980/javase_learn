package com.itheima.d1_file;

import java.io.File;

/**
 * 目标：学会创建File对象定位操作系统的文件（文件 文件夹）的
 */

public class FileDemo {
    public static void main(String[] args) {
        // 1、创建File对象（制定了文件的路径）
        // 路径写法——1
        //File f = new File("H:\\迅雷福利\\资源库\\写真视频\\阿包也是兔娘写真\\阿包也是兔娘 - NO.01 JK日常 [15P-179MB]\\TG@taotuporn (1).jpg");
        //  路径写法——2
        // File f = new File("H:/迅雷福利/资源库/写真视频/阿包也是兔娘写真/阿包也是兔娘 - NO.01 JK日常 [15P-179MB]/TG@taotuporn (1).jpg");
        //  路径写法——3(比较麻烦 / 可以换为File.separator  优点：可以跨平台
        File f = new File("H:"+ File.separator + "迅雷福利" + File.separator + "资源库" + File.separator +
                "写真视频" + File.separator + "阿包也是兔娘写真" + File.separator + "阿包也是兔娘 - NO.01 JK日常 [15P-179MB]" + File.separator +
                "TG@taotuporn (1).jpg");
        long size = f.length();
        System.out.println(size);

        // 2、File创建对象，支持绝对路径  支持相对路径
        File f1 = new File("H:\\迅雷福利\\资源库\\写真视频\\阿包也是兔娘写真\\阿包也是兔娘 - NO.01 JK日常 [15P-179MB]\\TG@taotuporn (1).jpg");// 绝对路径
        System.out.println(f1.length());

        // 相对路径：一般定位模块中的文件的,相对到工程下
        File f2 = new File("file-io-app/src/data.txt");
        System.out.println(f2.length());

        // 3、File创建对象，可以是文件也可以是文件夹
        File f3 = new File("H:\\迅雷福利\\资源库\\写真视频\\阿包也是兔娘写真\\阿包也是兔娘 - NO.01 JK日常 [15P-179MB]");
        // System.out.println(f3.length());// 不能这么拿文件夹的大小
        System.out.println(f3.exists()); // 判断这个路径是否存在，这个文件夹是否存在
    }
}
