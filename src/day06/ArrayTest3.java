package day06;

/*
    二维数组的使用：
        规定：二维数组的分为外层数组的元素，内层数组的元素
        int[][] arr = new int[4][6];
        外层元素：arr[0],arr[1]等
        内层元素：arr[0][0],arr[1][2]等

        ⑤ 数组元素默认初始化值：
            针对于初始化方式一：比如：int[][]  arr = new int[4][3];
            外层元素的初始值为：地址值
            内层元素的初始值为：与一维数组的初始化情况一致

            针对于初始化方式二：比如：int[][] arr =new nt[4][];
            外层元素初始化值为：null
            内层元素初始化值为：空指针异常


        ⑥ 数组内存解析：
 */
public class ArrayTest3 {
    public static void main(String[] args) {

        int[][] arr = new int[4][3];
        System.out.println(arr[0]);//地址值 [I@4554617c
        System.out.println(arr[0][0]);

        System.out.println(arr);//二维数int型 [[I@74a14482
    }
}
