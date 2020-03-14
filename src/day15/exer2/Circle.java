package day15.exer2;

/**
 * ToDo
 *  定义一个Circle类，声明redius属性，提供getter和setter方法
 * @authorLong
 * @Date2020/2/25 9:37
 */
public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
