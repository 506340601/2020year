package day08.exer;

/**
 * 计算圆的面积 s =πr*r
 */
public class Circle {



        //属性
        double radius;

        //求圆的面积
        public double findArea(){

            double area = Math.PI * radius *radius;
            return  area;
        }

}
