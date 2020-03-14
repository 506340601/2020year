package test;

import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        //int[] arr={1,2,3};
        Scanner sc = new Scanner(System.in);
        String str =sc.next().toString();
        String[] arr = str.split(",");
        int[] a=new int[arr.length];
        for(int i =0;i < arr.length;i++){
            a[i] =Integer.parseInt(arr[1]);
            System.out.print(a[i]);
        }
        int[] newArr= reverse(a);
        //System.out.println(Arrays.toString(newArr));
        for(int i =0;i < newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }

    public static int[] reverse(int[] a) {
        int[] tempArr = a;
        for (int start = 0, end = tempArr.length - 1; start < end; start++, end--) {
            int temp = tempArr[start];
            tempArr[start] = tempArr[end];
            tempArr[end] = temp;
        }
        return tempArr;
    }
}