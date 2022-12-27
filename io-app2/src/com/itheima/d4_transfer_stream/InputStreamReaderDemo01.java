package com.itheima.d4_transfer_stream;

import java.io.*;

public class InputStreamReaderDemo01 {
    public static void main(String[] args) throws IOException {
        // 代码UTF-8 文件GBK  ("io-app2/src/data01.txt");
        // 1、提取GBK文件的原始字节流。 abc  我
        InputStream is = new FileInputStream("io-app2/src/data01.txt");

        // 2、把原始字节流转换成字符输入流
        //Reader isr = new InputStreamReader(is); // 默认以UTF-8的方式转换成字符流。还是会乱码的 跟直接使用FileReader是一样的
        Reader isr = new InputStreamReader(is,"GBK"); // 以指定的GBK编码转换成字符输入流 完美解决乱码问题
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
