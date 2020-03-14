package day14.java;

/**
 * ToDo
 *  单例模式：懒汉式的实现
 *
 * @authorLong
 * @Date2020/2/23 23:39
 */
public class SingletonTest1 {

    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1==order2);
    }
}

class Order{

    //1、私有化类的构造器
    private Order(){

    }

    //2、先声明当前类的对象，没有初始化(不急（饿汉）着new)
    private static Order instance = null;

    //3、声明public 、static的返回当前对象的方法
    public static Order getInstance(){
        if (instance ==null){
            instance = new Order();
        }

        return instance;
    }
}
//public class Singleton {
//    private static Singleton instance;
//    private Singleton (){}
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}