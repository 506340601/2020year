package day04;
//      输出所有的水仙花数（水仙花数是指一个3位数，其各位上的数字立方和等于它本身）
public class ForFlowerTest {
    public static void main(String[] args){

        for(int i =100; i<1000;i++){
//            百位上的数字立方和
            int m = i / 100 ;
            int m3 = m * m * m;


//                     十位数上的数字立方和
//            int n = k % 10;
            int n = i % 100 / 10;
            int n3 = n * n * n;

            //             个位上的数字立方和
            int k = i % 10;
            int k3 =k * k *k;


            int sum = m3 + k3 + n3 ;
            if(i == sum){
                System.out.println("水仙花数有："+i);
                System.out.println("百位数为"+ m +"百位数的立方和为："+m3);
                System.out.println("十位数为"+ n +"个位数的立方和为："+n3);
                System.out.println("个位数为"+ k +"个位数的立方和为："+k3);
            }
        }
    }
}
