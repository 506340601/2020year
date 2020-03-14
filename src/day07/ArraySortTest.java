package day07;

/*
    数组冒泡排序的实现：
 */
public class ArraySortTest {
    public static void main(String[] args) {

        int[] arr =new int[]{-34,-23,5,9,-6,67,88,32,12,55};

        //冒泡排序：

        System.out.println("冒泡排序后的数组");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();

        for(int i =0;i < arr.length - 1; i++){//外层循环是i,几大轮，例如8个元素就要7大轮

            for(int j =0; j < arr.length -1 -i ;j++){

                int temp = 0;
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j +1] = temp;
                }
            }

        }

        System.out.println("冒泡排序后的数组");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();

    }
}
