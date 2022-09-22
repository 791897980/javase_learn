package com.itheima.string;

public class StringDemo5 {
    public static void main(String[] args) {
        //1、public int length():获取字符串长度
        String name = "aa啊/";
        System.out.println(name.length());


        //2、public char charAt(int index):获取某个索引位置处的字符
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        //3、public char[] toCharArray():把字符串转换成字符数组



        //4、public String substring(int beginIndex, int endIndex):包前不包后的

        //5、public String substring(int beginIndex) :从当前索引一直截取到末尾

        //6、public String replace(CharSequence target，CharSequence replacement)

        //7、public boolean contains(CharSequence s)

        //8、public boolean startsWiths(String prefix)

        //9、public String[] split(String s); 按照某个内容把字符串分割成字符串数组返回



    }
}
