package day13.exer;

/**
 * ToDo
 *  若子类重写了父类方法，就意味着子类里定义的方法彻底覆盖了父类里的同名方法，
 *      系统将不可能把父类里的方法转移到子类中。编译看左边，运行看右边
 *  对于实例变量则不存在这样的现象，即使子类里定义了与父类完全相同的实例变量，
 *      这个实例变量依然不可能覆盖父类中定义的实例变量。编译运行看左边
 * @authorLong
 * @Date2020/2/22 16:45
 */
class Base {
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

public class FieldMethodTest {

    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);//20
        s.display();
        Base b = s;
        // == 对于引用数据类型来讲，比较的是两个运用数据类型得变量的地址值是否相同
        System.out.println(b == s);
        System.out.println(b.count);
        b.display();
    }


}

class Sub extends Base {
    int count = 20;

    public void display() {
        System.out.println(this.count);
    }

}
