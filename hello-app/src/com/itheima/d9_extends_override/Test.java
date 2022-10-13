package com.itheima.d9_extends_override;

public class Test {
    public static void main(String[] args) {
        // 目标：认识方法重写
        NewPhone hw = new NewPhone();
        hw.call();
        hw.sendMessage();
    }
}

/**
 *
 */
class Phone{
    public void call(){
        System.out.println("打电话~~");
    }

    public void sendMessage(){
        System.out.println("发消息");
    }
}

class NewPhone extends Phone{
    // 重写的方法
    public void call(){
        super.call();//先用父类的基本功能
        System.out.println("开始视频通话");
    }
    public void sendMessage(){
        super.sendMessage();
        System.out.println("发送图片");
    }
}
