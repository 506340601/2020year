package day11.com.java;

/**
 * ToDo
 *
 * @authorLong
 * @Date2020/2/19 19:27
 *  面向对象的特征之二：继承性
 *      1、减少代码冗余，提高了代码的复用性
 *      2、便于功能功能的拓展
 *      3、为之后的多态性提供了前提
 *
 *  二、继承性的格式：  class A extends B{}
 *      A：子类、派生类 subclass
 *      B：父类、超类、基类 superclass
 *
 *      2.1体现：一旦子类A继承父类B以后，子类A中就获取了父类B中声明的结构：属性、方法
 *          特别的父类中声明为private的属性或者方法，子类继承父类后，仍认为获取了父类私有的的结构。
 *        只因为封装性的影响，使得子类不能直接调用父类的结构而已。
 *      2.2 子类继承完父类之后，还可以声明自己的属性和方法，实现功能的拓展。
 *          子类和父类的关系不同于子集和集合的关系。
 *          extend:延展、拓展
 *   三、Java中关于继承性的规定
 *       1、一个类可以被多个子类继承
 *       2、Java中的单继承性：一个类只能继承一个父类：
 *       3、子父类是相对的概念。java中的多层继承
 *       4、子类直接继承的父类：称为直接父类。间接继承的父类称为：间接父类
 *       5、子类继承父类以后，就直接获取了父类以及所有间接父类中声明的属性和方法
 *
 *   四、1如果我们没有显式的声明一个类的父类的话，则此类继承于java.lang.Object类
 *       2、所有的java类（除java.lang.Object类之外）都直接或间接的继承于java.lang.Object类
 *       3、意味着，所有的java类具有java.lang.Object类声明的功能。
 *
 *
 */
public class ExtendsTest {
    public static void main(String[] args) {

        Person p1 =new Person();
        p1.age =1;
        p1.eat();

        Student s1 =new Student();
        s1.eat();
        s1.sleep();
        s1.name ="Tom";
        s1.breath();


        Creature c = new Creature();
//        c.
    }
}
