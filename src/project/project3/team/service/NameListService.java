package project.project3.team.service;

import project.project3.team.domain.Employee;

import static project.project3.team.service.Data.EMPLOYEES;

/**
 * ToDo
 * 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 *
 * @author Long
 * @Date 2020/2/27 12:06
 */
public class NameListService {

    private Employee[] employees;

    /***
     *  给employees数组元素进行初始化
     *
     *@author Long
     *@date 2020/2/27 12:48
     */
    public NameListService() {
        //1、根据项目提供的Data类构建相应大小的employees数组
        //2、再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，
        //  以及相关联的Equipment子类的对象
        //3、将对象存于数组中

        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i <employees.length ; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);

        }

    }

    public Employee[] getEmployees() {
        return null;
    }

    public Employee setEmployees(int id) {
        return null;
    }
}
