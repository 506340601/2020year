package day13.java1;

import java.util.Date;

/**
 * ToDo
 *  toString() 方法的测试
 *      Object类中toString()的使用：
 *      1、当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
 *      2、Object类中toString()的定义
 *           public String toString() {
 *               return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *           }
 *      3、像String、Date、File、包装类等都重写了Object类中的toString()方法。
 *          使得在调用对象的toString()方法时，返回“实体内容”信息
 *      4、自定义类也可以重写toString()方法，当调用此方法时，返回对象的“实体内容”
 * @authorLong
 * @Date2020/2/22 20:11
 */
public class ToStringTest {

    public static void main(String[] args) {

        Customer c1 =new Customer("Tom",18);

        System.out.println(c1.toString());//day13.java1.Customer@4554617c
        System.out.println(c1);//day13.java1.Customer@4554617c

        String str = new String("MM");
        System.out.println(str);//MM

        Date date = new Date(3255258935223L);
        System.out.println(date);//Sat Feb 25 22:35:35 CST 2073

    }
}
