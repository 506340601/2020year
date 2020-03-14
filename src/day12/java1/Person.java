package day12.java1;

/*
 * ToDo
 *
 * @authorLong
 * @Date2020/2/21 12:47
 */
public class Person {


    String name;
    int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
//        this.name = name;
        this(name);
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃饭！");
    }

    public void walk(){
        System.out.println("人走路");
    }
}
