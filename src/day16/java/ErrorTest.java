package day16.java;

/**
 * ToDo
 *  Error：Java虚拟机无法解决的严重问题。如：JVM系统内部错误、资源 耗尽等严重情况。
 *          比如：StackOverflowError和OOM。一般不编写针对性 的代码进行处理。
 * @authorLong
 * @Date2020/2/25 22:32
 */
public class ErrorTest {
    public static void main(String[] args) {
        //1、栈溢出：Exception in thread "main" java.lang.StackOverflowError
//        main(args);

        //2、堆溢出：OOM:Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//        Integer[] arr = new Integer[1024*1024*1024];
    }
}
