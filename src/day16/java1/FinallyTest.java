package day16.java1;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ToDo
 *  1、finally是可选
 *  2、finally中声明的是一定会被执行的代码，即使catch出现了异常，try中有return语句，catch中有return等情况
 *  3、像数据库连接、输入输出流、网络编程Socket等资源，JVM是不能自动回收的，我们需要自己手动的进行资源的释放
 *      。此时的资源释放，就需要声明在finally中。
 * @authorLong
 * @Date2020/2/26 12:18
 */
public class FinallyTest {

    @Test
    public void test2(){
        FileInputStream fis =null;
        try {
            File file = new File("E:\\idea\\code\\2020year\\src\\day16\\hello.txt");
           fis = new FileInputStream(file);

            int data = fis.read();
            while (data != -1){
                System.out.print((char)data);
                data =fis.read();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fis !=null){
                    fis.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    @Test
    public void testMethod(){
        int num = method();

        System.out.println(num);
    }

    public int method(){
        try{
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("我一定会被执行");
            return 3;
        }
    }
    @Test
    public void test(){
        try {
            int a =10;
            int b =0;
            System.out.println(a/b);
        }catch (ArithmeticException e){
//            e.printStackTrace();
            int[] arr = new int[10];
            System.out.println(arr[10]);
        }catch (Exception e){
            e.printStackTrace();
        }
//        System.out.println("我好帅啊!!!");
        finally {
            System.out.println("我好帅啊");
        }

    }
}
