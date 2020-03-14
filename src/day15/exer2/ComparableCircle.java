package day15.exer2;

/**
 * ToDo
 *  定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。
 *      在 ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半 径大小
 * @authorLong
 * @Date2020/2/25 9:38
 */
public class ComparableCircle extends Circle implements CompareObject {


    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;

            //错误的，精度损失过大，比如 3.1  3
            //return (int) (this.getRadius() - c.getRadius());
            //正确的
            if (this.getRadius() > c.getRadius()){
                return 1;
            }else if(this.getRadius() < c.getRadius()){
                return -1;
            }
            else {
                return 0;
            }
        }else{
           // return 0;
           throw new RuntimeException("传入的数据类型不匹配");
        }

    }
}
