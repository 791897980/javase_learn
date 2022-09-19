package com.itheima.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        //1、定义学生类
        //2、创建集合存储学生对象，创建学生对象封装学生对象
        //把学生对象添加到集合中去
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("20180302","aaaa",23,"电子一班"));
        students.add(new Student("20180303","bbb",23,"电子二班"));
        students.add(new Student("20180304","ccc",23,"电子三班"));
        students.add(new Student("20180305","ddd",23,"电子四班"));

        //3、遍历这些学生信息展示
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.print(s.getStudyNumber() + "\t");
            System.out.println(s.getName());
            System.out.println(s.getAge());
            System.out.println(s.getClassName());
            System.out.println("-----------------------");
        }
        Scanner sc = new Scanner(System.in);
        //4、定义方法完成按照学号的搜索功能
        while (true){
            System.out.println("请输入学号查询学生对象: ");
            String studyNumber = sc.next();
            //5、调用方法查询
            Student s = getStudentById(students, studyNumber);
            //6、判断s中是否存在学生对象地址
            if(s == null){
                System.out.println("对不起，查无此人~~~");
            }else {
                System.out.println("您查询的学生信息如下");
                System.out.print(s.getStudyNumber() + "\t");
                System.out.println(s.getName());
                System.out.println(s.getAge());
                System.out.println(s.getClassName());
                System.out.println("-----------------------");
            }
        }
    }

    /**
     * 根据学生的学号查询学生对象返回
     * @param students  存储全部学生对象的集合
     * @param studyNumber  搜索的学生的学号
     * @return 学生对象 | null
     */
    public static Student getStudentById(ArrayList<Student> students, String studyNumber){
        //1、遍历全部学生对象
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            //2、询问当前遍历的这个学生对象的学号，是否是我们要找的学号
            if(s.getStudyNumber().equals(studyNumber)){
                //这个s代表的学生对象，就是我们要找的
                return s;
            }

        }
        //查无此人
        return null;

    }
}
