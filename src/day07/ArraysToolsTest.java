package day07;

import java.util.Arrays;

/*
    java.util.Arrays类即为操作数组的工具类，包含了用来操作数组（比 如排序和搜索）的各种方法。
 */
public class ArraysToolsTest {

    public static void main(String[] args) {

        // 1、boolean equals(int[] a,int[] b) 判断两个数组是否相等
        int[] arr1 =new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,3,2,4};
       boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);//false

        // 2、String toString(int[] a) 输出数组信息

        System.out.println(Arrays.toString(arr1));

        // 3、void fill(int[] a,int val) 将指定值填充到数组之中

        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        // 4、void sort(int[] a) 对数组进行排序。

        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // 5、 int binarySearch(int[] a,int key) 对排序后的数组进行二分法检索指定的值
        int[] arr3 =new int[]{-98,-34,2,34,54,66,79,105,210,333};
        int index = Arrays.binarySearch(arr3,210);
        if(index > 0){
            System.out.println(index);//8 210
        }else{
            System.out.println("未找到");//211 未找到
        }

    }
}
