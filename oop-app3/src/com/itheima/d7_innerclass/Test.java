package com.itheima.d7_innerclass;

public class Test {
    static {
        class Dog{

        }

        abstract class Animal{

        }

        interface SportManInter{

        }
    }
    public static void main(String[] args) {
        class Cat{
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        Cat c = new Cat();
        c.setName("叮当猫");
    }
}
