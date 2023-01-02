package com.itheima.d4_polymorphic_test;

/**
 * 实现类
 */

public class Mouse implements USB {
    private String name;

    public Mouse(String name) {
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
    public void dbclick(){
        System.out.println(name + "双击点亮，一键三连");
    }
    @Override
    public void unconnect() {
        System.out.println(name + "成功从电脑中拔出了");
    }
}
