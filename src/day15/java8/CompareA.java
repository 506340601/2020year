package day15.java8;

/**
 * ToDo
 *  JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法
 * @authorLong
 * @Date2020/2/25 10:24
 */
public interface CompareA {

    //静态方法
    public static void method1(){
        System.out.println("ComparA:北京");
    }

    //默认方法
    public default void method2(){
        System.out.println("默认方法CompareA：上海");
    }

     default void method3(){
        System.out.println("默认方法2CompareA：上海");
    }
}
