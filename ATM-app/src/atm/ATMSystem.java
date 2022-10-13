package atm;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ATM系统的入口类
 */
public class ATMSystem {
    public static void main(String[] args){
        //1、定义账户类
        //2、定义一个集合容器，负责以后存储全部的账户对象，进行相关的业务操作。
        ArrayList<Account> accounts = new ArrayList<>();
        //3、展示系统的首页
        while (true) {
            System.out.println("==================黑马ATM系统===============");
            System.out.println("1、账户登录");
            System.out.println("2、账户开户");
            Scanner sc = new Scanner(System.in);
            System.out.println("请您选择操作：");
            int command = sc.nextInt();

            switch (command){
                case 1:
                    //用户登录操作
                    break;
                case 2:
                    //用户账户开户
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您输入的命令不存在~~");
            }
        }
    }

    /**
     * 用户开户功能的实现
     * @param accounts  接收的账户集合
     */

    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("*******************系统开户操作*******************");
        //1、创建一个账户对象，用于后期封装账户信息
        Account account = new Account();

        //2、录入当前这个账户的信息，注入到账户对象中去
        System.out.println("请您输入账户用户名：");
        String userName = sc.next();
        account.setUserName(userName);



        while (true) {
            System.out.println("请您输入账户密码：");
            String passWord = sc.next();
            System.out.println("请您输入确认密码：");
            String okPassWord = sc.next();
            if (okPassWord.equals(passWord)){
                //密码如恩正通过可以注入给账户对象
                account.setPassWord(okPassWord);
                break; // 密码已经录入成功了，死循环没有必要继续了
            }else {
                System.out.println("对不起，您输入的两次密码不一致，请重新输入");
            }
        }

        System.out.println("请您输入账户档次限额：");
        double quotaMoney = sc.nextDouble();
        account.setQquotaMoney(quotaMoney);

        //为账户随机一个8位且与其他账户的卡号不重复的号码(独立功能，独立成方法）
        String cardId = getRandomCardId(accounts);


        //3、把账户对象添加到账户集合中去
    }

    /**
     * 为账户生成8位与其他账户卡号不同的号码
     * @return
     */
    private static String getRandomCardId(ArrayList<Account> accounts) {
        //1、先生成8位数字
        String cardId = "";
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            cardId += r.nextInt(10);
        }

        //2、判断这个8位的卡号是否与其他账户的卡号重复了，
        //根据这个


        return null;
    }

    /**
     * 根据卡号查询出一个账户对象出来
     * @param cardId 卡号
     * @param accounts  全部账户的集合
     * @return  账户对象 | null
     */

    private static Account getAccountByCardId(String cardId, ArrayList<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)){
                return acc;
            }
        }
        return null; //查无此账号
    }
}
















