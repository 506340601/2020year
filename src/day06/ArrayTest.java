package day06;

/*
    数组分为：一维数组。二维数组...
    一维数组的使用
        ① 声明和初始化
 */
public class ArrayTest {
    public static  void main(String[] args){

        /*
            1.一维数组的声明和初始化
         */
        int num;//声明
        num = 10;
        int id = 1001;//声明加初始化

        int[] ids;//声明
        //1.1 静态初始化:数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001,1002,1003,1004};
        //1.2动态初始化：数组的初始化和数组元素的复制操作分开进行
        String[] names =new String[5];

        //总结：数组一旦初始化完成，其长度就确定了。

        /*
            2、如何调用数组指定位置的元素：通过角标
         */
        //数组的脚标（或索引）从0开始，到数组的长度 -1 结束
        names[0] = "李羽羽";
        names[1] = "李书龙";
        names[2] = "李书旺";
        names[3] = "李书权";
        names[4] = "李书梅";

        /*
            如何获取数组的长度：
            属性：length
         */
        System.out.println(names.length);//5
        System.out.println(ids.length);


        /*
            如何遍历数组：

         */
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);

        for (int i = 0;i <names.length ; i++){
            System.out.println(names[i])  ;
        }



    }
}
