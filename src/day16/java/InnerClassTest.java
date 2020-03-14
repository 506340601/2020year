package day16.java;

/**
 * ToDo
 *
 * @authorLong
 * @Date2020/2/25 21:23
 */
public class InnerClassTest {

    /**
     *  在局部内部类中（比如：show）如果调用局部内部类所声明的方法（比如：method）中的局部变量（比如num）
     *  要求此局部变量声明为final
     *  jdk 7 及之前的版本，要求此局部变量显式声明为final
     *  jdk 8 及之后的版本：可以省略final的声明
     *@author Long
     *@date 2020/2/25 21:25
     */
    public void method(){
        //局部变量
        int num = 10;
        class AA{

            public void show(){
//                num = 20;
                System.out.println(num);
            }
        }
    }
}
