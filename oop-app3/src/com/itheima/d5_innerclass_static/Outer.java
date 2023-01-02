package com.itheima.d5_innerclass_static;

/**
 * 外部类
 */

public class Outer {
    public static int a = 100;
    private String hobby;
    /**
     * 学习静态成员内部类
     */
    public static class Inner{
        private String name;
        private int age;
        public static String schoolName;

        public String getName() {
            return name;
        }
        public void show(){
            System.out.println(a);
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            Inner.schoolName = schoolName;
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Inner(){

        }
    }
}
