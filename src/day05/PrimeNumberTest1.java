package day05;

/*
    100以内所有质数(素数)的输出
    （质数：只能被1和它本身整除的自然数）--->从2开始到这个数-1结束为止，都不能被这个数整除
    最小的质数：2
    优化，提高效率：
                ① 除去偶数
                ② 开方
 */
public class PrimeNumberTest1 {
    public static void main(String[] args ){

        int count =0;
        boolean isFlag = true;
//        获取开始时间：
        long start =System.currentTimeMillis();
        for (int i = 2;i<= 100000;i++){
//                  优化二：开方 Math.sqrt(i)
            for (int j =2;j<= Math.sqrt(i);j++) {

                if (i % j == 0) {
                    isFlag = false;
                    break;//   优化一：支队本身非质数的自然数有效
                }
            }

            if(isFlag == true){
//                System.out.println(i);
                count++;
            }
            //        重置isFlag
            isFlag = true;
        }
//       获取结束时间
        long end =System.currentTimeMillis();
        System.out.println("质数一共有："+count+"花费的时间为："+(end - start));//未优化时：32630，优化一：3836，优化二：234 不输出：29

    }
}
