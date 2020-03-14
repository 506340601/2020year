package day04;

public class NumberTest {
    public static void main(String[] args){
        int a = 10;
        int b = 8;
        int c = 13;
//        三元运算符取最大值
        int max1 =(a>b)?a:b;
        int max = (max1>c)?max1:c;
//        System.out.println("三个数中最大值为："+max);

        double d1 =12.3;
        double d2 =32.1;
        if(d1>10.0 && d2<20.0){
            double sum =d1+d2;
            System.out.println("两数和为："+sum);
        }else{
            double chengji =d1*d2;
            System.out.println("两数的乘积为："+chengji);

        }
//        交换两个变量的值
        String s1 ="北京";
        String s2 ="南京";
        System.out.println("s1="+s1+"s2="+s2);
        String temp =s1;
                s1 = s2;
                s2 =temp;
                System.out.println("s1="+s1+"s2="+s2);
    }
}
