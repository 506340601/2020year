package day15.exer1;

/**
 * ToDo
 *  （1）定义一个Employee类，该类包含： private成员变量name,number,birthday，
 *      其中birthday 为MyDate类的对象； abstract方法earnings()；
 *      toString()方法输出对象的name,number和birthday。
 * @authorLong
 * @Date2020/2/24 16:30
 */
public  abstract class Employee {

    private String name;
    private int number;
    private Mydate birthday;

    public abstract  void earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday +
                '}';
    }
}
