package day02;

public class VariableTest {
    public static void main(String[] args){
//      精度损失举例1
        double d1 =12.9;//截断操作
        int i1 =(int)d1;
        System.out.println("测试成功！"+i1);
//        12

//        没有精度损失
        long l1 =123;
        short s2 =(short)l1;
        System.out.println(s2);
//        123

//          精度损失举例2
        int i2= 128;
        byte b =(byte)i2;
        System.out.println(b);
//        -128

        /*
            编码异常情况有2：
            1、long l =12421  (默认为int自动转为long，所以没加l)
            2、byte b =b3+1;(报错，因为int转为byte，精度损失)
            整形常量，默认类型为int型
            浮点型常量，默认类型为double型
         */
//        float f1 =12.3f;
        byte b3 =12;
//        byte b4 =b3+1;
        String str ="abc";
        str =str +"xyz";
        System.out.println("字符串调用"+str);
//        字符串调用abcxyz
        int n=100;
        str=str+n;
        System.out.println("字符串调用"+str);

    }
}
