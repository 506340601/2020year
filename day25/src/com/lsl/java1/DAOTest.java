package com.lsl.java1;

import org.junit.Test;

import java.util.List;

/**
 * @author Long
 * @Date 2020/3/22 15:04
 */
public class DAOTest {

    @Test
    public void test1(){

        CustomerDAO dao1 =new CustomerDAO();
        dao1.add(new Customer());
        List<Customer> lis = dao1.getForList(10);
    }
}
