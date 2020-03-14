package day12.java2;

/**
 * ToDo
 *  多态性的使用举例一：
 * @authorLong
 * @Date2020/2/22 3:47
 */
public class AnimalTest {

    public static void main(String[] args) {

        AnimalTest test = new AnimalTest();
        test.func(new Dog());

        test.func(new Cat());
    }

    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
    public void func(Dog dog){

        dog.eat();
        dog.shout();
    }

    public void func(Cat cat){
        cat.eat();
        cat.shout();
    }

}
class Animal{
    String name;

    public void eat(){
        System.out.println("动物进食");
    }

    public void shout(){
        System.out.println("动物：叫");
    }
}

class Dog extends  Animal{

    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void shout(){
        System.out.println("汪！汪！汪！");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void shout(){
        System.out.println("喵喵喵！");
    }
}