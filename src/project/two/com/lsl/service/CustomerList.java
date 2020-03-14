package project.two.com.lsl.service;

import project.two.com.lsl.bean.Customer;

/**
 * ToDo
 * CustomerList为Customer对象的管理模块，
 * 内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
 *
 * @authorLong
 * @Date2020/2/19 12:18
 */
public class CustomerList {

    private Customer[] customers;//用来保存对象的数组
    private int total = 0; //记录已经存储的客户对象的数量

    /**
     * 用来初始化数组的构造器
     *
     * @param totalCustomer,指定数组的长度
     * @throws
     * @author Long
     * @date 2020/2/19 13:04
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }

        customers[total] = customer;
        total++;
        return true;
    }

    /**
     * @param index 修改指定位置的索引
     * @return true 修改成功
     * @throws
     * @author Long
     * @date 2020/2/19 13:38
     */
    public boolean replaceCustomer(int index, Customer cust) {

        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[index] = customers[index + 1];
        }
        //最后有数据的元素需要置空
        customers[total - 1] = null;
        total--;
        return true;
    }

    public Customer[] getAllCustomers() {

        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {

            custs[i] = customers[i];
        }
        return custs;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    /**
     * 获取存储的客户的数量
     *
     * @param {@link int}
     * @return {@link int}
     * @throws
     * @author Long
     * @date 2020/2/19 13:54
     */
    public int getTotal() {
        return total;
    }
}
