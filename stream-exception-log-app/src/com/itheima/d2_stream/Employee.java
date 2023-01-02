package com.itheima.d2_stream;

public class Employee {
    private String name;
    private char sex;
    private double salary;
    private double bonus;
    private String punish; //处罚信息

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", pinish='" + punish + '\'' +
                '}';
    }

    public Employee() {
    }

    public Employee(String name, char sex, double salary, double bonus, String pinish) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.bonus = bonus;
        this.punish = pinish;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getPinish() {
        return punish;
    }

    public void setPinish(String pinish) {
        this.punish = pinish;
    }
}
