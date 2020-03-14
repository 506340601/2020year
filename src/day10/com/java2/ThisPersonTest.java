package day10.com.java2;
/*
 * this 关键字的使用：
 *  1、this可以用来修饰属性、方法、构造器
 *
 *  2、this修饰属性和方法
 *      this理解为：当前对象或当前正在创建的对象（构造器情况）
 *
 *    2.1在类的方法中，我们可以使用“this.属性”或“this.方法”来调用当前对象的属性或方法。但是
 *      通常情况下，我们都省略“this”。
 *      特殊情况下如果方法的形参和类的属性同名，我们必须显示的使用“this.变量”的方式，来表明此变量是属性，而非形参
 *
 *     2.2在类的构造器中，我们可以使用“this.属性”或“this.方法”来调用当前正在创建对象的属性或方法。但是
 *      通常情况下，我们都省略“this”。
 *      特殊情况下如果构造器的形参和类的属性同名，我们必须显示的使用“this.变量”的方式，来表明此变量是属性，而非形参
 *
 *   3、this调用构造器
 *      1）我们在类的构造器中，可以显式的使用“this(形参列表)”方式，调用本类的其他构造器
 *      2）构造器中不能通过“this(形参列表)”方式调用自己
 *      3）如果一个类中有n个构造器，，则最多有n - 1个构造器使用了“this(形参列表)”
 *      4）规定：“this(形参列表)”必须声明在
 *      5）构造器内部，最多只能声明一个“this(形参列表)”，用来调用其他的构造器
 */
public class ThisPersonTest {

    public static void main(String[] args) {

        Person p1 =new Person();
        p1.setAge(18);
        System.out.println(p1.getAge());
        p1.eat();
    }
}
class Person{

    private String name;
    private int age;

    public Person(){
        this.eat();
        //Person初始化是，需要考虑如下的1,2,3,4，...(共40行代码)
    }
    public Person(String name){
        this();
        this.name =name;
    }
    public Person(int age){
        this.age =age;
    }
    public Person(String name,int age){
        this.name =name;
        this.age = age;
    }

    public void setName(String name){
        this.name =name;
    }
    public void setAge(int age){
        this.age = age;//this理解为当前对象 属性 = 形参
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void eat(){
        System.out.println("人吃饭");
        study();
    }
    public void study(){
        System.out.println("人学习");
    }
}