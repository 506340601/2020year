package day05;

public class DoWhileTest {
    public static void main(String[] args){
//        遍历100以内的偶数，并计算所有偶数的和及偶数的个数
        int i = 1;
        int sum = 0;
        int count = 0;
        do{
            if(i % 2 ==0){
                System.out.println(i);
                sum += i;
                ++count;
            }
            i++;


        }while(i <= 100);
        System.out.println("100以内的所有偶数和"+sum);
        System.out.println("100以内的所有偶数个数"+count);
    }
}
