package day05;

import java.util.Scanner;

/*
    从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入0时结束程序；
 */
public class ForTest {
    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);
        int m = 0;//记录正数的个数
        int n =0;//记录负数的个数

        while (true){
            int number =scan.nextInt();
            if(number >0){
                m++;
            }else if(number < 0){
                n++;
            }else{
//                一旦执行break，跳出循环
                break;
            }
        }
        System.out.println("正整数的个数为："+m);
        System.out.println("负整数的个数为："+n);
    }
}
