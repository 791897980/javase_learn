package com.itheima.d5_exception_javac;

public class ExceptionDemo {
    public static void main(String[] args) {
        /**
         * 1、数组索引越界异常：ArrayIndexOutOfBoundsException
         */
        int[] arr = {1,2,3};
        System.out.println(arr[2]);
        //System.out.println(arr[3]);

        /**
         * 2、空指针异常：NullPointerException。直接输出没有问题，但是调用空指针的变量的功能就会报错！！
         */

        String name = null;
        System.out.println(name); //null
        //System.out.println(name.length());

        /**
         * 3、类型转换异常 ClassCastException
         */
        Object o = 23;
        //String s = (String) o;  //运行出错，程序终止

        /**
         * 4、数字操作异常：ArithmethicException
         */
        //int c = 10 / 0;

        /**
         * 6、数字转换异常 NumberFormatException
         */
        String number = "23aabb";
        Integer it = Integer.valueOf(number); // 运行出错 程序终止
        System.out.println(it + 1);

    }
}
