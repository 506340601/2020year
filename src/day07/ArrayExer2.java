package day07;

/*
    定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
    然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
    要求：所有随机数都是两位数。
    提示； [0,1) * 90 [0,90) + 10      [10,100) [10,99] (int)(Math.random() * 90 + 10)

 */
public class ArrayExer2 {

    public static void main(String[] args) {
        //1.声明和定义一个一维数组
        int[] arr =new int[10];

        //2.给元素赋值（随机）
        for(int i = 0;i < arr.length;i++){
            arr[i] =(int)(Math.random() * 90 + 10);
        }
        System.out.println("输出查看一维数组各个元素的值：");
        //定义所需要的变量
        int max = 0;//最大值
        int avra = 0;//平均值
        int sum = 0;//和
        int min = arr[0];//最小值
        for(int i =0;i < arr.length; i++){
            System.out.print(arr[i]+ "  ");
            //最大值
            if(arr[i] > max){
                max =arr[i];
            }

            //最小值
            if(min > arr[i]){
                min =arr[i];
            }

            //和
            sum +=arr[i];
        }
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
        System.out.println("和为："+sum);
        System.out.println("平均值为："+(sum/10));
    }
}
