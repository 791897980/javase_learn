package com.itheima.d4_polymorphic_test;

public class Computer {
    private String name;

    public String getName() {
        return name;
    }

    public Computer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void start(){
        System.out.println("电脑开机了");
    }

    /**
     * 提供USB设备的入口，
     */
    public void installUSB(USB usb){
        //多态，父类接口作为入参，所有的实现类对象都可以进来
        //usb == 可能是鼠标，也可能是键盘
        usb.connect();
        // 独有功能 ：先判断再强转
        if(usb instanceof Keyboard){
            Keyboard k = (Keyboard) usb;
            k.keyDown();
        }else if(usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.dbclick();
        }
        usb.unconnect();
    }
}


