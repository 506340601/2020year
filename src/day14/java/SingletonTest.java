package day14.java;

/**
 * ToDo
 * 设计模式是在大量的实践中总结和理论化之后优选的代码结构、编程风格、 以及解决问题的思考方式。
 * 设计模免去我们自己再思考和摸索。就像是经典 的棋谱，不同的棋局，我们用不同的棋谱。”套路”
 * <p>
 * 单例设计模式
 * 1、所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，
 * 并且该类只提供一个取得其对象实例的方法。
 * <p>
 * 如果我们要让类在一个虚拟机中只能产生一个对象，我们首先必须将类的构造器的访问权限设置为private，
 * 这样，就不能用new操作符在类的外部产生 类的对象了，但在类内部仍可以产生该类的对象。因为在类的外部开始还
 * 无法得到类的对象，只能调用该类的某个静态方法以返回类内部创建的对象， 静态方法只能访问类中的静态成员变量
 * ，所以，指向类内部产生的该类对象的变量也必须定义成静态的
 * <p>
 * 2、如何实现
 * 饿汉式 vs 懒汉式
 * <p>
 * 3、区分饿汉式和懒汉式
 * 饿汉式：坏处：对象加载时间过长。
 * 好处：饿汉式是线程安全的
 * <p>
 * 懒汉式：好处：延迟对象的创建
 * 坏处：线程不安全的 -----> 多线程的时候再修改 必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 *
 * @authorLong
 * @Date2020/2/23 19:18
 */
public class SingletonTest {

    public static void main(String[] args) {
        //    Bank b = new Bank();

        Bank bank = Bank.getInstance();
        Bank bank1 = Bank.getInstance();
        System.out.println(bank == bank1);

    }
}

//饿汉式单例模式
class Bank {

    //1、私有化类的构造器
    private Bank() {

    }

    //2、内部创建类的对象
    //4、要求此对象也必须声明为静态的
    private static Bank instance = new Bank();

    //3、提供公共的方法，返回类的对象

    public static Bank getInstance() {
        return instance;
    }
}