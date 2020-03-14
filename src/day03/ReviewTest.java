package day03;

public class ReviewTest {
    public static void main(String[] args){
        char c1 ='a';
        char c2 =97;
        System.out.println("字符"+c2);

        char c3 = 5;
        char c4 ='5';
        int i1 =(int)c4;
        System.out.println(i1);

//      %取模预算
        int m1 =12;
        int n1 =5;
        System.out.println("m1 % n1 = "+ m1 % n1);
        int m2 = -12;
        int n2 =5;
        System.out.println("m2 % n2 = "+ m2 % n2);

        int m3 =12;
        int n3 = -5;
        System.out.println("m3 % n3 = "+ m3 % n3);

        int m4 = -12;
        int n4 = -5;
        System.out.println("m4 % n4 = "+ m4 % n4);

        byte b1 =127;
        b1++;
        System.out.println("b1 = ");
    }
}
