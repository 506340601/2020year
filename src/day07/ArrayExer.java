package day07;

public class ArrayExer {
    public static void main(String[] args) {

        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};

        //定义一个变量用来存放数组的和：
        int sum = 0;
        for (int i = 0; i <arr.length; i++){
            for(int j = 0; j <arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("arr数组中所有元素的和为："+sum);
    }
}
