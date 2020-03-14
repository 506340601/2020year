package day16.java1;

import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * ToDo
 *  一：异常体系结构
 *      java.lang.Throwable
 *      ------------java.lang.Error:一般不编写针对性的代码进行处理
 *      ------------java.lang.Exception:可以进行异常的处理
 *          |--------------编译时异常(checked)
 *                      ----------IOException
 *                          -------FileNotFoundException
 *                      -------ClassNotFoundException
 *          |--------------运行时异常(unchecked)
 *                     |--------------NullPointException
 *                     |--------------ArrayIndexOutOFBoundException
 *                     |--------------ClassCastException
 *                     |--------------NumberFormatException
 *                     |--------------InputMismatchException
 *                     |--------------ArithmeticException
 *
 *   面试题：常见的异常有哪些?举例说明
 * @authorLong
 * @Date2020/2/26 9:41
 */
public class ExceptionTest {

    //NumberFormatException
    @Test
    public void test4(){
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }


    //ClassNotFoundException
    @Test
    public void test3(){
        Object obj = new Date();
        String str = (String )obj;
    }



    //ArrayIndexOutOFBoundException
    @Test
    public void test2(){
        //ArrayIndexOutOFBoundException
//        int[] arr = new int[3];
//        System.out.println(arr[3]);

        // StringIndexOutOfBoundsException
        String str = "abc";
        System.out.println(str.charAt(3));

    }





    //NullPointerException
    @Test
    public void test1(){

        //例1：
//        int[] arr = null;
//        System.out.println(arr[3]);

        //例2：
        String str = "abc";
        str =null;
        System.out.println(str.charAt(0));
    }
}
