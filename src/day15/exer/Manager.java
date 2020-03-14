package day15.exer;

import day15.exer.Employee;

/**
 * ToDo
 *
 * @authorLong
 * @Date2020/2/24 15:45
 */
public class Manager extends Employee {

    private double bonus;//奖金

    public Manager(){

    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工，提高公司的效率");
    }
}
