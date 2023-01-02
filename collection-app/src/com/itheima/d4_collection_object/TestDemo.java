package com.itheima.d4_collection_object;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo {
    public static void main(String[] args) {
        // 1、定义一个电影类
        // 2、定义一个集合对象存储3部电影对象
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("a",9.9,"aa"));
        movies.add(new Movie("b",9.8,"bb"));
        movies.add(new Movie("c",9.7,"cc"));

        // 3、遍历集合容器中的每个电影对象
        for (Movie movie : movies) {
            System.out.println("片名" + movie.getName());
            System.out.println("分数" + movie.getScore());
            System.out.println("主演" + movie.getActor());
        }
    }
}
