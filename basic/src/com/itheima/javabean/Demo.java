package com.itheima.javabean;

/**
 * 目标：完成电影信息的展示案例，
 */

public class Demo {
    public static void main(String[] args) {
        //1、设计电影类
        //2、创建3个电影对象，封装电影的信息吧
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("aaa",9.7,"aaa1");
        movies[1]  = new Movie("bbb",9.7,"bbb1");
        movies[2]  = new Movie("ccc",9.7,"ccc1");
        //3、定义一个电影类型的数组，存储3部电影对象


        //4、遍历数组中的每个电影对象，然后获取它的信息展示出来
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m.getName());
            System.out.println(m.getActor());
            System.out.println(m.getScore());

        }


    }
}
