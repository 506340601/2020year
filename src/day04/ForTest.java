package day04;

public class ForTest {
    public static void main(String[] agrs){
        //遍历输出100以内的偶数，输出所有偶数的和

        int sum = 0;
        for(int i =1 ;i <= 100;i++){
            if(i % 2 ==0){
                System.out.println(i);
                sum+=i;
            }
            System.out.println("100以内的偶数和为："+sum);
        }
    }
}
