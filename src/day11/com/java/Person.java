package day11.com.java;

/**
 * ToDo
 *
 * @authorLong
 * @Date2020/2/19 19:20
 */
public class Person extends Creature{

    String name;
    int age;

    Person(){

    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭！");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
