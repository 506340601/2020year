package day08.exer;
/**
 * 计算圆的面积 s =πr*r
 */
//测试类
public class CircleTest {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.radius =3;

        double area = c.findArea();
        System.out.println(area);
    }
}


