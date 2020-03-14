package day15.java1;

/**
 *      接口的使用：
 *          1、接口使用interface来定义
 *          2、Java中，接口和类是并列的两个接口
 *          3、如何定义接口，定义接口的成员
 *              3.1 JDK7及以前，只能定义全局常量和抽象方法
 *                      >全局常量：public static final的
 *                      >抽象方法：public abstract的
 *              3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法
 *
 *          4、接口中是不能定义构造器的！意味着接口不可以实例化
 *
 *          5、Java开发中，接口都通过让类去实现（implements）的方式来使用
 *              如果实现覆盖了接口中的抽象方法，则此实现类就可以实例化
 *              如果实现类中没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类
 *
 *         6、Java可以实现多个接口 ---->弥补了Java单继承性的局限性
 *          格式：class AA  extends BB implements CC,DD,EE
 *
 *          7、接口与接口之间可以继承,而且可以多继承
 *          ************************************
 *          8、接口的具体使用，体现了多态性
 *          9、接口，实际上可以看做是一种规范
 *
 *          面试题：抽象类和接口有哪些异同？
 *
 *
 * @author  Long
 * @Date   2020/2/24 20:02
 */
public class InterfaceTest {

    public static void main(String[] args) {

        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
//        Flyable.MIN_SPEED = 2;

        Plan p = new Plan();
        p.fly();
        p.stop();
    }
}

interface Flyable{

    //全局常量
    public static final int MAX_SPEED =7900;//第一宇宙速度
    public static final int MIN_SPEED = 1;

    //抽象方法
    public  abstract void fly();
    //省略了 public abstract
     void stop();

     //接口中是不能定义构造器的！意味着接口不可以实例化
//    public void Flyable(){//
//    }
}

interface Attackable{
    void attack();
}
class Plan implements Flyable{

    @Override
    public void fly() {
        System.out.println("飞机通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

abstract class Kite implements Flyable{

    @Override
    public void fly() {

    }


}
class Bullet extends Object implements Flyable,Attackable,CC{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

interface AA{
    void method1();
}

interface BB{
    void method2();
}

interface CC extends AA ,BB{

}