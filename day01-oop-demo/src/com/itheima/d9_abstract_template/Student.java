package com.itheima.d9_abstract_template;

public abstract class Student {
    /**
     * 正式：声明了模板方法模式
     */
    public final void write(){
        System.out.println("《学生》");
        System.out.println("《学生》123");
        // 正文部分（每个子类都要写，每个子类写的情况不一样
        //因此。模板方法把正文部分定义成抽象方法，交给
        //具体的子类来完成
        System.out.println(writeMain());
        System.out.println("hhh,结束");
    }

    public abstract String writeMain();
}
