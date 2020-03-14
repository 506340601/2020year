package day02;

/*
    1、String类型变量的使用
    2、声明String类型变量时，使用一对""
 */
public class StringTest {
    public static void main(String[] args){
        String str ="abc";
        str =str +"xyz";
        System.out.println("字符串调用"+str);
//        字符串调用abcxyz
        int n=100;
        str=str+n;
        System.out.println("字符串调用"+str);
//        char =''; //编译不通过


    }
}
