package com.itheima.d14_interface_attention;

public class Test {
    public static void main(String[] args) {
        // 1、接口不能创建对象（接口更加彻底的抽象）

        // 2、一个类实现多个接口，多个接口中有同样的静态方法不冲突，原因是接口的静态方法不能C调用，只能A调用A的，只能B调用B的
        Cat c = new Cat();
        c.eat();

        // 3、一个类继承了父类，同时又实现了接口，父类中和接口中有同名方法，默认用父类的

        // 4、一个类实现了多个接口，多个接口中存在的同名的默认方法，不冲突，这个类重写该方法即可

        // 5、一个接口继承多个接口，是没有问题的，如果多个接口中存在的规范冲突则不能多继承
    }
}
interface AA{
    default void go(){

    }
}

interface BB{
    default void go(){

    }
}
class  CC implements AA,BB{

    @Override
    public void go() {
        AA.super.go();
    }
}

interface A{
    static void test(){
        System.out.println("A");
    };
}

interface B{
    static void test(){
        System.out.println("B");
    };
}

class C implements A,B{
    public static void main(String[] args) {

    }
}
interface Food{
    default void eat(){
        System.out.println("接口中的吃方法~~~~");
    };
}

class Animal{
    public void eat(){
        System.out.println("父类动物吃");
    };
}

class Cat extends Animal implements Food,A{

}

interface AAA{
    void run();
}

interface BBB{
    void run();
}

interface CCC extends AAA,BBB{

}