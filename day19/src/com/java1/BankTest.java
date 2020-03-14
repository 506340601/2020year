package com.java1;

/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 *
 * @author Long
 * @Date 2020/3/1 12:15
 */
class Bank{
    //1、声明私有的构造器
    private Bank(){

    }
    private static Bank instance = null;
    //2、声明一个公共的静态的方法
    public static synchronized Bank getInstance(){
        //方式一：效率稍差
//        synchronized (Bank.class){
//            if(instance ==null){
//                instance = new Bank();
//            }
//            return instance;
//        }

       // 方式二：效率更高 （笔试建议写这个）
        if(instance ==null){
            synchronized (Bank.class){
                if(instance ==null){
                    instance = new Bank();
                }

            }
        }
        return instance;
    }
}
public class BankTest {
}
