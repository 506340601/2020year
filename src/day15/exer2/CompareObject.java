package day15.exer2;

/**
 * ToDo
 *  定义一个接口用来实现两个对象的比较。
 *  interface CompareObject{ public int compareTo(Object o);
 *          // 若返回值是 0 , 代表相等;
 *             若为正数，代表当 前对象大；负数代表当前对象小 }
 * @authorLong
 * @Date2020/2/25 9:35
 */
public interface CompareObject {
    public int compareTo(Object o);
}
