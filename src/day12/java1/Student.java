package day12.java1;

/**
 * ToDo
 *
 * @authorLong
 * @Date2020/2/21 12:47
 */
public class Student extends Person {
    String major;

    public Student(){

    }

    public  void Student(String major){
        this.major =major;
    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的食物");
    }

    public void study(){
        System.out.println("学生应该好好学习");
    }

    public void show(){
        System.out.println("name = "+name +", age = "+age);
    }
}
