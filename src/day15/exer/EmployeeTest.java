package day15.exer;

/**
 * ToDo
 *  请使用继承的思想，设计CommonEmployee类和Manager类，要求类 中提供必要的方法进行属性访问。
 * @authorLong
 * @Date2020/2/24 15:48
 */
public class EmployeeTest {
    public static void main(String[] args) {

        //
//        Manager manager = new Manager("库克",1001,5000,500000);
        Employee manager = new Manager("库克",1001,5000,500000);

        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }
}
