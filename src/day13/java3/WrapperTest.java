package day13.java3;

import org.junit.jupiter.api.Test;

/**
 * ToDo
 *  包装类的使用：
 *      1、java提供了8种基本数据类型对应的包装的，使得基本数据类型的变量具有类的特征
 *      2、掌握的：基本数据类型、包装类、String三者之间的相互转换
 *
 * @authorLong
 * @Date2020/2/22 22:10
 */
public class WrapperTest {



    //基本数据类型、包装类 ---> String类型：调用Sting重载的valueof(Xxx xxx)
    @Test
    public void test4(){

//        int num1 =10；
        //方式1：连接运算
//        String str1 =
    }




    /**
     *  JDK 5.0 新特性：自动装箱与自动拆箱
     *@author Long
     *@date 2020/2/22 22:48
     */
    @Test
    public void test3(){
//        int num1 = 10;
//        //基本数据类型转为 --> 包装类对象
//        Integer in1 = new Integer(num1);
//        method(in1);
//        method(num1);//Object obj = null;

        //自动装箱和拆箱

        //自动装箱
        int num2 =20;
        Integer in1 = num2;//自动装箱

        //自动拆箱：包装类 ---》 基本数据类型
        System.out.println(in1.toString());
        int num3 = in1;//自动拆箱

    }

    public void method(Object obj){
        System.out.println(obj);
    }


    //包装类 --- 》 基本数据类型:调用包装类的xxxvalue()
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i =in1.intValue();
        System.out.println(i);

        Float f1 = new Float(12.3);
        float f2 =f1.floatValue();
        System.out.println(f2+1);

    }
    //基本数据类型---> 包装类:调用包装类的构造器
    @Test
    public void test1(){

        int num1 =10;

        Integer in1 =new Integer(num1);
        System.out.println(in1.toString());


        Integer in2 = new Integer("123");
        System.out.println(in2.toString());

//          报异常
//        Integer in3 = new Integer("123abc");
//        System.out.println(in3.toString());

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);


        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("tRUe");
        System.out.println(b2);//true
        Boolean b3 = new Boolean("true123");
        System.out.println(b3);//false


        Order order = new Order();
        System.out.println(order.isMale);//false（默认值false）
        System.out.println(order.isFemale);//null （此时是个类了）
    }
}
class Order{
    boolean isMale;
    Boolean isFemale;
}
