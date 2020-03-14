package day15.exer2;

/**
 * ToDo
 *  定义一个测试类InterfaceTest，创建两个ComparableCircle对象，调用compareTo 方法比较两个类的半径大小
 * @authorLong
 * @Date2020/2/25 9:49
 */
public class ComparableCircleTest {
    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(3.4);
        ComparableCircle c2 = new ComparableCircle(4.3);
        int compareValue =c1.compareTo(c2);
        if (compareValue > 0){
            System.out.println("c1对象大");
        }else if(compareValue < 0){
            System.out.println("c2对象大");
        }else {
            System.out.println("一样大");
        }
    }
}
