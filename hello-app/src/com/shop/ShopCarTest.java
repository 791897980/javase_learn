package com.shop;

import java.util.Scanner;

/**
 *  目标：购物车模块
 */

public class ShopCarTest {
    public static void main(String[] args) {
        //1、定义商品类，用于后期创建商品对象
        //2、定义一个购物车对象，使用一个数组对象表示
        Goods[] shopCar = new Goods[100];
        //3、搭建操作架构
        while (true) {
            System.out.println("请您选择如下命令进行操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询商品到购物车：query");
            System.out.println("修改商品到购物车：update");
            System.out.println("结算购买商品的金额：pay");
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入命令：");
            String command = sc.next();
            switch (command) {
                case "add":
                    //添加商品到购物车
                    addGoods(shopCar, sc);
                    break;
                case "query":
                    //查询商品到购物车
                    queryGoods(shopCar);
                    break;
                case "update":
                    //修改商品到购物车
                    updateGoods(shopCar, sc);
                    break;
                case "pay":
                    //结算购买商品的金额
                    pay(shopCar);
                    break;
                default:
                    System.out.println("没有该功能");
            }

        }

    }

    private static void pay(Goods[] shopCar) {
        queryGoods(shopCar);
        //1、定义一个求和变量累加金额
        double money = 0;
        //2\遍历购物车数组中的全部商品对象,累加单价+数量
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if(g != null){
                money += (g.price * g.buyNumber);
            }else {
                break;
            }
        }
        System.out.println("订单总金额:" + money);
    }

    private static void updateGoods(Goods[] shopCar, Scanner sc) {
        //让用户输入要修改商品的id,根据id查询出要修改的商品对象
        while (true) {
            System.out.println("请您输入要修改的商品id:");
            int id  = sc.nextInt();
            Goods g = getGoodsById(shopCar, id);
            if(g == null){
                //没有该商品
                System.out.println("对不起,没有购买该商品");
            }else {
                //说明存在该商品对象,可以修改它了
                System.out.println("请您输入: " + g.name + "商品最新购买数量");
                int buyNumber = sc.nextInt();
                g.buyNumber = buyNumber;
                System.out.println("修改完成!");
                queryGoods(shopCar);
                break;
            }
        }
    }

    public static Goods getGoodsById(Goods[] shopCar, int id){
        //shopCar = [g1, g2, g3, null.....]
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                //判断这个商品对象的ID是否是我们要找的
                if (g.id == id) {
                    return g;
                }
            } else {
                return null;//照完了前面存在的商品,都没有找到
            }
        }
        return null;//代表找完了100个商品都没有找到id一样的商品
    }


    /**
     * 查询购物车中的商品对象信息，并展示出来
     * @param shopCar
     */
    private static void queryGoods(Goods[] shopCar) {
        System.out.println("===============查询购物车信息如下=================");
        System.out.println("编号\t\t名称\t\t\t价格\t\t\t购买数量");
        //shopCar = [g1, g2, g3, null.....]
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null){
                //展示这个商品对象
                System.out.println(g.id + "\t\t" + g.name + "\t\t" + g.price + "\t\t" + g.buyNumber);
            }else {
                //遍历结束
                break;
            }
        }
    }

    /**
     * 完成商品添加到购物车的功能
     * @param shopCar
     */

    private static void addGoods(Goods[] shopCar, Scanner sc) {
        //1、录入用户输入的购买商品的信息
        System.out.println("请您输入购买商品的编号(不重复):");
        int id = sc.nextInt();
        System.out.println("请您输入购买商品的名称:");
        String name = sc.next();
        System.out.println("请您输入购买商品的数量:");
        int buyNumber = sc.nextInt();
        System.out.println("请您输入购买商品的价格");
        double price = sc.nextDouble();

        //2、把购买商品的信息封装成一个商品的对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.price = price;
        g.buyNumber = buyNumber;

        //3、把这个商品对象添加到购物车数组中去
        //shopCar= 【null，null，null,null....】
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i] == null){
                // 说明此位置没有元素存入，把我们新买的商品添加到此处即可
                shopCar[i] = g;
                break; //结束：因为商品已经被成功存入了，不需要继续找位置了
            }
        }
        System.out.println("您的商品：" + g.name + "添加到 购物车完成！");
    }
}






























