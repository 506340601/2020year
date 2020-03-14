package day09.java1;
/*
 * 递归方法的使用（了解）
 *  1、递归方法： 一个方法体内调用它自身
 *    方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执 行无须循环控制。
 *   递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死 循环。
 *
 */
public class RecursionTest {
    public static void main(String[] args) {

        //例1：计算1~100之间所有自然数的和
        //方式一
    int sum = 0;
    for(int i =1 ;i<=100;i++){
        sum+=i;
    }

        System.out.println(sum);
        //方式二

        RecursionTest test =new RecursionTest();
       int sum1 = test.getSum(100);
        System.out.println(sum1);
    }

    public int getSum(int n){

        if(n == 1){
            return 1;
        }else{
            return n + getSum(n -1);
        }
    }

}
