package day12.java3;

/**
 * ToDo
 * 面试题：多态是编译时行为，还是运行时行为
 * 证明如下：
 *
 * @authorLong
 * @Date2020/2/22 4:09
 */
 class Animal {

    protected void eat() {
        System.out.println("animal eat food");
    }
}

class Cat extends Animal {
    protected void eat() {
        System.out.println("cat eat fish");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("dog eat bone");
    }

    class Sheep extends Animal{

        public void eat(){
            System.out.println("sheep eat grass");
        }
    }
}
public class InterviewTest {


}