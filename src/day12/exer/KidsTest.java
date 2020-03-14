package day12.exer;

/**
 * ToDo
 *  定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量和方法
 *
 * @authorLong
 * @Date2020/2/20 14:40
 */
public class KidsTest {
    public static void main(String[] args) {

        Kids someKid = new Kids(12);

        someKid.printAge();

        someKid.setSalary(0);
        someKid.setSex(1);

        someKid.emplyeed();
        someKid.manOrWoman();
    }
}
