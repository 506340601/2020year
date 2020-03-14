package day10.com.java;
/*
 * 总结：属性赋值的先后顺序：
 *      1）默认初始化值
 *      2）显式初始化值
 *      3）构造器中初始化
 *      4）通过“对象.属性”、“对象.方法”
 *
 * 以上操作的先后顺序：1) -- 2) -- 3) -- 4)
 */
public class UserTest {

}

class User{
    String name;
    int age =1;
    public User(){

    }
}
