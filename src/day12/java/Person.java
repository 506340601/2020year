package day12.java;

/**
 * ToDo
 *
 * @authorLong
 * @Date2020/2/20 20:29
 */
public class Person {
    String name;
    int age;

    public  Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭！");
    }
    public void walk(int distance ){
        System.out.println("走路,走的距离是"+distance+"公里");
    }

    public void show(){
        System.out.println("我是一个人");
    }
}
