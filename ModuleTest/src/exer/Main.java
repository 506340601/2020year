package exer;

/**
 * @author Long
 * @Date 2020/3/14 19:00
 */
public class Main {
    public static void main(String[] args) {

        double[] arr ={-2,32,5,6,8,5,33};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j]>arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (double d: arr) {
            System.out.println(d);
        }
    }
}
