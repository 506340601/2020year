package day13.java1;

import java.util.Objects;

/**
 * ToDo
 *  equals()方法的重写
 *
 * @authorLong
 * @Date2020/2/22 19:29
 */
public class Customer {
    String name;
    int age;

    public Customer() {
    }


    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public boolean equals(Object obj) {
//        return (this == obj);
//    }

    //重写原则：比较两个对象的实体内容是否相同
    //手动实现equals()方法
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj){
//            return true;
//        }
//        if (obj instanceof Customer){
//            Customer cust = (Customer)obj;
//            //比较两个对象的每个属性是否都相同
////            if (this.age == cust.age && this.name.equals(cust.name)){
////                return true;
////            }
////            else {
////                return  false;
////            }
//
//            //或
//            return this.age == cust.age && this.name.equals(cust.name);
//
//
//        }
//        return false;
//    }
    //

    //自动生成

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age &&
                Objects.equals(name, customer.name);
    }

    //手动实现
//    @Override
//    public String toString() {
//        return "Customer[name = " + name + ",age = "+ age+"]";
//    }
    //自动实现

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}