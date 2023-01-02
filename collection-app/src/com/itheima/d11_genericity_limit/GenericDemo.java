package com.itheima.d11_genericity_limit;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
    }
    public static void go(ArrayList<?> cars){

    }


}

class Dog{

}

class BENZ extends Car{

}

class BMW extends Car{

}

// 父类
class Car{

}

