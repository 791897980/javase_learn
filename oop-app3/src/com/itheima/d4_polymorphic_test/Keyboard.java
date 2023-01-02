package com.itheima.d4_polymorphic_test;

/**
 * 实现类
 */

public class Keyboard implements USB {
    private String name;

    public Keyboard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功连接了电脑");
    }

    /**
     * 独有功能不能放在USB接口中
     */
    public void keyDown(){
        System.out.println(name + "敲击了，666");
    }
    @Override
    public void unconnect() {
        System.out.println(name + "成功从电脑中拔出了");
    }
}
