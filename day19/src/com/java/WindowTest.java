package com.java;

/**
 * 使用同步代码块解决继承Thread类的方式的线程安全问题
 *
 * 例子：创建三个窗口卖票，总票数为100张，使用继承Thread类的方式
 *
 *  说明：在继承Thread类实现创建多线程慎用this充当监视器
 *      存在线程安全问题：待解决
 *
 * @author Long
 * @Date 2020/2/28 14:34
 */

class Window extends Thread{

    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {

       while(true){

           //正确的
//          synchronized(obj){
           synchronized(Window.class){
           //错误的方式：this代表t1,t2,t3三个对象
//           synchronized(this){
              if(ticket > 0){
                  System.out.println(getName() +"：卖票，票号为："+ticket);
                  ticket--;
              }else {
                  System.out.println("票以售罄！");
                  break;
              }
          }
       }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();
    }
}
