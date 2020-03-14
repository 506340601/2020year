package day09.java1;

/*
 *
 * 已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0 的整数，求f(10)的值。

 */
public class RecurionTest1 {
    public static void main(String[] args) {

        RecurionTest1 test =new RecurionTest1();
        int a = test.f(10);
        System.out.println(a);
//        int f(0) =1;
//        int f(1) = 4;
//
//        if(n == 0){
//            return 1;
//        }else{
//            f(n+2) = 2*f(n+1)+f(n);
//            n--;
//        }
    }
    public int f(int n){
        if(n == 0){
            return 1;
        }else if(n ==1 ){
           return 4;
        }else{
            return  2*f(n-1) +f(n -2);

        }
    }
}
