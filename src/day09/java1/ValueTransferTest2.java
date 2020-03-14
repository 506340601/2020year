package day09.java1;

/**
 *
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {

        Data data = new Data();
        data.m = 20;
        data.n = 10;

        System.out.println("m = "+ data.m + ",n = "+data.n);

        //交換m和n的值
//        int temp = data.n;
//        data.n = data.m;
//        data.m = temp ;

        ValueTransferTest2 test = new ValueTransferTest2();
        test.swap(data);
        System.out.println("m = "+ data.m + ",n = "+data.n);
    }
    public void swap(Data data){
        int temp = data.n;
        data.n = data.m;
        data.m = temp ;
    }
}

class Data{
    int m;
    int n;

}