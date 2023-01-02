package com.itheima.d9_exception_custom;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            checkAge(-34);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkAge(int age) throws ItheimaAgeIllegalException {
        if(age < 0 || age > 200){
            // 抛出去一个异常对象给调用者
            // throw   在方法内部直接创建一个异常对象，并从此点抛出
            // throws  用在方法声明行，抛出方法内部的异常
            throw new ItheimaAgeIllegalException(age + "is illegal");
        }else {
            System.out.println("年龄合法，推荐商品给其购买");
        }
    }
}
