package com.itheima.javabean;

public class User {
    /**
     * 1、成员变量建议使用private私有
     */
    private String name;
    private double height;
    private double salary;

    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    public User() {
    }

    /**
     * 3、要求提供无参数构造器，有参数构造器都是可选
     * @return
     */
    


    /*
    2、必须为成员变量提供成套的setter和getter方法
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
