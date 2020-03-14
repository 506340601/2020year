package com.lsl.java;

/**
 * 多线程的创建：方式一继承于Thread类
 *  1、创建一个继承于Thread类的子类
 *  2、重写Thread类的run() ----->将此线程执行的操作声明在run()中
 *  3、创建Thread类的子类的对象
 *  4、通过此对象调用start()方法
 *
 *  例子：遍历100以内所有的偶数
 *
 * @author Long
 * @Date 2020/2/27 21:52
 */

//1、创建一个继承于Thread类的子类
    class MyThread extends Thread{

        //2、重写Thread类的run()
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(i % 2 == 0){
                System.out.println(i+Thread.currentThread().getName());
            }

        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        //3、创建Thread类的子类的对象
        MyThread myThread = new MyThread();

        //4、通过此对象调用start()方法:1)启动当前线程；2）调用当前线程的run().
        myThread.start();

        //问题一：我们不能通过直接调用run()方法的方式启动线程
//        myThread.run();

        //问题二：再启动一个线程遍历一百以内的偶数---->不可以还让已经start()的线程去执行。会报IllegalThreadStateException
//        myThread.start();

        //需要重新创建
        MyThread t2 = new MyThread();
        t2.start();
        //如下操作仍是在main线程中执行的。
        for (int i = 0; i <100 ; i++) {
            if(i % 2 == 0){
                System.out.println(i+Thread.currentThread().getName());
            }

        }

    }

}
