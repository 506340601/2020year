package com.lsl.java;

/**
 * 创建多线程的方式二：实现Runnable接口
 *      1、创建一个实现Runnable接口的类
 *      2、实现类去实现Runnable中的抽象方法：run()
 *      3。创建实现类的对象
 *      4、将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 *      5、通过Thread类的对象调用start()
 *
 *
 *   比较创建线程的两种方式：
 *      开发中：优先选择：实现Runnable接口的方式
 *      原因：1、实现的方式没有类的单继承性的局限性
 *           2、实现的方式更适合来处理多个线程共享数据的情况
 *
 *      联系:public class Thread implements Runnable {}
 *          两种方式需要重写run()方法,将线程要执行的逻辑声明在run()中。
 *
 *
 * @author Long
 * @Date 2020/2/28 14:48
 */

class MThread implements Runnable{//1、创建一个实现Runnable接口的类

    @Override
    public void run() {//2、实现类去实现Runnable中的抽象方法：run()
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println("憨憨真可爱!  "+i+"***"+ Thread.currentThread().getName());

            }
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {

        MThread m1 = new MThread();//3、创建实现类的对象

        //4、将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1=new Thread(m1);
        //5、过Thread类的对象调用start():1)启动线程； 2）调用当前线程的run() .---->调用了Runnable类型的target的run()方法。
        t1.setName("线程一t1");
        t1.start();

        //再启动一个线程，遍历100以内的偶数
        Thread t2 = new Thread(m1);
        t2.setName("线程二 t2");
        t2.start();

    }
}
