package com.lsl.java;

/**
 *  测试Thread中常用的方法
 *      1、start(): 1)启动线程； 2）调用当前线程的run() .
 *      2、run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中。
 *      3、currentThread():静态方法，返回执行当前代码的线程
 *      4、getName():获取当前线程的名字
 *      5、setName():设置当前线程的名字
 *      6、yield():释放当前CPU的执行权
 *      7、join():在线程a中调用b的join()方法，此时线程a巨进入阻塞状态，直到线程b完全执行完以后，线程a才结束阻塞状态。
 *      8、stop()：当执行此方法时，强制结束当前线程。（注意：此方法已过时，不推荐使用）
 *      9、sleep(long millitime):让当前线程“睡眠”指定的millitime毫秒。在指定的millitime毫秒时间内，
 *          当前线程是阻塞状态
 *      10、isAlive():查看当前线程是否存活
 *
 *      线程的优先级：
 *      1、
 *          MAX_PRIORITY：10
 *          MIN _PRIORITY：1
 *          NORM_PRIORITY：5 ---> 默认优先级
 *      2、如何获取和设置当前线程的优先级：
 *          getPriority() ：返回线程优先值
 *          setPriority(int newPriority) ：设置线程的优先级
 *
 *          说明：高优先级的线程要抢占低优先级线程的cpu执行权，但是只是从概率上讲，高优先级的线程高概率的情况下被执行。
 *              并不意味着只有当高优先级的线程执行完以后，低优先级的线程才执行。
 *
 * @author Long
 * @Date 2020/2/28 12:37
 */

class HelloThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){

//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName()+"："+Thread.currentThread().getPriority()+":"+i);
            }

            if( i % 20 ==0){
               // 6、yield():释放当前CPU的执行权
                yield();
            }
        }
    }
    public HelloThread(String name){
        super(name);
    }
}
public class ThreadMethodTest {
    public static void main(String[] args) {

        HelloThread h1 = new HelloThread("憨憨一号");

//        h1.setName("铁憨憨一号");

        //设置分线程的优先级
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();

        //给主线程命名
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+"："+Thread.currentThread().getPriority()+"："+i);
            }
//
//            try {
//                if(i == 20){
//                    h1.join();
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }

        System.out.println(h1.isAlive());
    }
}
