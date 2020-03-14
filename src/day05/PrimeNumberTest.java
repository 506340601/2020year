package day05;

/*
    100以内所有质数(素数)的输出
    （质数：只能被1和它本身整除的自然数）--->从2开始到这个数-1结束为止，都不能被这个数整除
    最小的质数：2
 */
public class PrimeNumberTest {
    public static void main(String[] args ){

        int count =0;
        boolean isFlag = true;
        for (int i = 2;i<= 100;i++){

            for (int j =2;j< i;j++) {

                if (i % j == 0) {
                    isFlag = false;
                }
            }

                if(isFlag == true){
                    System.out.println(i);
                    count++;
            }
            //        重置isFlag
            isFlag = true;
        }
        System.out.println("质数一共有："+count);

    }
}
