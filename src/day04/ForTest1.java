package day04;

import java.util.Scanner;

/*
    题目：输入两个正整数m和n，求其最大公约数和最小公倍数
 */
/*
    思路：先输入两个m和n，再着手准备求公约数（求m和n之中较小的值，）
 */
public class ForTest1 {
    public static void main(String[] args){
        System.out.println("请输入正整数m");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();

        System.out.println("请输入正整数n");
        Scanner scan1 = new Scanner(System.in);
        int n = scan.nextInt();

//        先求较小值
        int min = (m>n)? n : m;
        for(int i =min;i>=1;i--){
            if(m % i == 0 && n % i == 0){
                System.out.println("最大公约数："+i);
                break;//一旦找到公约数，就跳出循环，就是最大公约数
            }
        }

//        获取最小公倍数
//        获取两个数中的较大值
        int max =(m >= n)? m:n;
        for(int i = max;i<= m * n;i++){
            if(i % m == 0 && i% n == 0){
                System.out.println("最小公倍数为："+i);
                break;
            }

        }

    }
}
