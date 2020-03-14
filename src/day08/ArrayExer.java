package day08;

import java.util.Arrays;

public class ArrayExer {
    public static void main(String[] args) {

        //初始化数组
        int[] arr = new int[]{34,5,22,-98,6,-76,0,3};
        //冒泡排序：
            System.out.println("冒泡排序前的数组："+Arrays.toString(arr));

        for(int i =0; i < arr.length -1;i++){//几大轮
            for(int j =0;j < arr.length - 1 - i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
            System.out.println("冒泡排序后的数组："+Arrays.toString(arr));

    }
}
