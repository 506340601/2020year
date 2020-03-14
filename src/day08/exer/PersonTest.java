package day08.exer;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 =new Person();

        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;

        p1.study();
        p1.showAge();

       int newAge = p1.addAge(2);
        System.out.println("新增后的年龄"+newAge);
        System.out.println(p1.age);

    }


}
