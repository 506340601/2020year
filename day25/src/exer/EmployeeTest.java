package exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *  创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（下一章： TreeSet 需使用泛型来定义）
 *  分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 *
 * 1). 使 Employee 实现 Comparable 接口，并按 name 排序
 * 2). 创建 TreeSet 时传入 Comparator 对象，按生日日期的先后排序。
 *
 * @author Long
 * @Date 2020/3/13 21:03
 */
public class EmployeeTest {

    //使用定制排序:按生日日期的先后排序。
    @Test
    public void test2() {
        TreeSet<Employee> set = new TreeSet(new Comparator<Employee>() {
            //使用泛型以后的写法
            @Override
            public int compare(Employee o1, Employee o2) {
                MyDate b1 = o1.getBirthday();
                    MyDate b2 = o2.getBirthday();

//                    //比较年
//                    int minusYear = b1.getYear() - b2.getYear();
//                    if (minusYear != 0) {
//                        return minusYear;
//                    }
//                    //比较月
//                    int minsMonth = b1.getMonth() - b2.getMonth();
//                    if (minsMonth != 0) {
//                        return minsMonth;
//                    }
//                    //比较日
//                    return b1.getDay() - b2.getDay();
                //方式二：
                return b1.compareTo(b2);
            }

            //使用泛型之前的写法
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Employee && o2 instanceof Employee) {
//                    Employee e1 = (Employee) o1;
//                    Employee e2 = (Employee) o2;
//
//                    MyDate b1 = e1.getBirthday();
//                    MyDate b2 = e2.getBirthday();
//
//                    //比较年
//                    int minusYear = b1.getYear() - b2.getYear();
//                    if (minusYear != 0) {
//                        return minusYear;
//                    }
//                    //比较月
//                    int minsMonth = b1.getMonth() - b2.getMonth();
//                    if (minsMonth != 0) {
//                        return minsMonth;
//                    }
//                    //比较日
//                    return b1.getDay() - b2.getDay();
//                }
//
//
////                return 0;
//                throw new RuntimeException("传入的数据类型格式不一致");
//            }
        });

        Employee e1 = new Employee("liudehua1", 55, new MyDate(1988, 5, 4));
        Employee e2 = new Employee("wangfei", 45, new MyDate(1978, 5, 4));
        Employee e3 = new Employee("weiwei", 32, new MyDate(1978, 5, 4));
        Employee e4 = new Employee("hanxue", 56, new MyDate(1938, 5, 4));
        Employee e5 = new Employee("chenglong", 54, new MyDate(1998, 5, 4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

        //问题一：使用自然排序
        @Test
        public void test1 () {

            TreeSet<Employee> set = new TreeSet<Employee>();

            Employee e1 = new Employee("liudehua1", 55, new MyDate(1988, 5, 4));
            Employee e2 = new Employee("wangfei", 45, new MyDate(1958, 5, 4));
            Employee e3 = new Employee("weiwei", 32, new MyDate(1978, 5, 9));
            Employee e4 = new Employee("hanxue", 56, new MyDate(1938, 5, 4));
            Employee e5 = new Employee("chenglong", 54, new MyDate(1998, 5, 4));

            set.add(e1);
            set.add(e2);
            set.add(e3);
            set.add(e4);
            set.add(e5);

            Iterator<Employee> iterator = set.iterator();
            while (iterator.hasNext()) {
                Employee e=iterator.next();

                System.out.println(e);
            }
        }

}
