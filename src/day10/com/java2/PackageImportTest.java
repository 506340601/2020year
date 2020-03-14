package day10.com.java2;

import day10.com.exercise2.Bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * 一 、关键字：package的使用：
 *   1、为了更好地实现类的管理，提供包的概念
 *   2、使用package来声明类或接口所属的包，声明在源文件的首行
 *   3、包，属于标识符，遵循标识符的命名规则、规范(xxxyyyzzz)，“见名知意”
 *   4、每“.”一次，就代表一层文件目录。
 *
 *  补充：同一个包下，不能命名同名的接口、类
 *         不同的包下，可以命名同名的接口、类
 *
 * 二、import关键字的作用
 *   import:导入
 *   1、在源文件显式使用import结构导入指定包下的类、接口
 *   2、声明在包的声明和类的声明之间
 *   3、如果需要导入多个结构，则并列写出即可
 *   4、可以使用“xxx.*”的方式，表示可以导入xxx包下的所有结构
 *   5、如果使用的类和接口是java.lang包下的。可以省略import结构
 *   6、如果使用的类或者接口是本包下定义的，则可以省略import结构
 *   7、如果在源文件中使用了不同包下的同名类，那么就需要使用类的全类名的方式指明调用的 是哪个类。
 *   8、如果已经导入xxx.*包下的类。那么如果需要使用xxx包的子包下的类的话，仍然需要导入
 *   9、import static组合的使用：调用指定类或接口下的静态的属性或方法
 *
 *
 */
public class PackageImportTest {
    public static void main(String[] args) {

        String info = Arrays.toString(new int[]{1,2,3});

        Bank bank =new Bank();

        ArrayList lisr = new ArrayList();
        HashMap map = new HashMap();
    }
}
