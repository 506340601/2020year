package com.lsl.java;

import java.io.Serializable;

/**
 *  Person类要满足如下要求，才可以序列化
 *      1.需要实现Serializable(标识接口)
 *      2、需要当前类提供一个全局常量:serialVersionUID
 *      3、除了当前Person类需要实现Serializable接口外，还必须保证其内部属性
 *          也可以序列化的。（默认情况下，基本数据类型也是可序列化的）
 *
 *       补充：ObjectOutputStream和ObjectInputStream不能序列化static和transient修 饰的成员变量
 *
 * @author Long
 * @Date 2020/3/26 18:10
 */
public class Person implements Serializable {

    public static final long serialVersionUID = 43273474343132L;

   private String name;
   private int age;
   private Account acct;

    public Person(String name, int age, Account acct) {
        this.name = name;
        this.age = age;
        this.acct = acct;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", acct=" + acct +
                '}';
    }
}

class  Account implements Serializable{

    public static final long serialVersionUID = 432774343132L;

   private double balance;

   public Account(){

   }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}