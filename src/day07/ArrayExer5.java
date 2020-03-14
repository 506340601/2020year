package day07;

public class ArrayExer5 {
    public static void main(String[] args) {

        String[] arr =new String[]{"AA","BB","CC","DD","EE","FF"};

        //数组的复制(区别于数组变量的赋值：arr1 = arr)
        String[] arr1 =new String[arr.length];
        for(int i = 0;i <arr1.length;i++){
            arr1[i] = arr[i];
        }

        //数组的反转
        //
//        for(int i = 0; i < arr.length /2;i++){
//            String temp = arr[i];
//            arr[i] = arr[arr.length - i -1];
//            arr[arr.length -i -1] =temp;
//        }

        //遍历
        for(int i =0 ;i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        //查找（或者搜索）
        //线性查找：
        String dest = "BB";

        boolean isFlag = true;
        for (int i = 0; i <arr.length; i++){
            if (dest.equals(arr[i])){
                System.out.println("找到了指定的元素，位置为："+i);
                isFlag = false;
                break;
            }
        }

        if (isFlag){
            System.out.println("很遗憾韩，未找到指定元素");
        }

        //二分法查找：
        //前提;所要查找的数组必须有序
        int[] arr2 = new int[]{-98,-34,2,34,56,78,105,210,333};
        int dest1 = 334;
        int head = 0;//初始的首索引
        int end = arr2.length - 1;//初始的末索引

        boolean isFlag1 = true;
        while(head <= end){
            int middle = (head + end)/2;

            if(dest1 == arr2[middle]){
                System.out.println("找到了指定位置的元素，位置为："+ middle);
                isFlag1 =false;
                break;
            }else if(arr2[middle] > dest1){
                end =middle -1;
            }else{
                head = middle + 1;
            }
        }
        if(isFlag1){
            System.out.println("很遗憾，未发现指定元素！");
        }
    }
}
