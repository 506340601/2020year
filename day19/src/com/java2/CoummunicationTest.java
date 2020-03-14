package com.java2;

/**
 * 线程间的通信：
 *  例子;使用两个线程打印 1-100。线程1, 线程2 交替打印
 *
 *  涉及到的三个方法
 *  wait()：一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器
 *  notify():一旦执行此方法，就会唤醒一个被wait()的一个线程。如果有多个线程，就唤醒优先级高的那个。
 *  notifyAll():一旦执行此方法，就会被唤醒所有被wait的线程。
 *
 *      说明：
 *          1、wait()、notify()、notifyAll()三个方法必须使用在同步代码块或者同步方法中
 *          2、wait()、notify()、notifyAll()这三个方法的调用者必须是同步代码块或者同步方法的同步监视器
 *              否则会出现java.lang.IllegalMonitorStateException
 *
 *
 *  面试题：sleep()和wait(）方法的异同
 *          1、相同点：一旦执行方法，都可以使当前线程进入阻塞状态。
 *          2、不同点：1）两个位置声明的位置不同：Thread类中声明sleep()，Object类中声明wait()
 *                   2）调用的范围不同：sleep()可以在任何需要的场景下调用。wait()必须在使用同步代码块或同步方法中。
 *                  3）关于是否释放同步监视器：如果两个方法都使用在同步代码块或同步方法这种，sleep()不会是释放锁，wait()会释放锁
 *
 * @author Long
 * @Date 2020/3/1 14:58
 */
class Number implements Runnable{

    private int number =1;
    private Object obj = new Object();

    @Override
    public void run() {
        while(true){
//           synchronized (obj){
           synchronized (this){
               this.notify();
               try {
                   Thread.sleep(10);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               if(number <= 100){
                   System.out.println(Thread.currentThread().getName()+"："+number);
                   number++;

                   try {
                       //使得调用如下调用wait()方法的线程进入阻塞状态
                       wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }else {
                   break;
               }
           }
        }
    }
}
public class CoummunicationTest {
    public static void main(String[] args) {

        Number num = new Number();

        Thread t1 = new Thread(num);
        Thread t2 = new Thread(num);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
