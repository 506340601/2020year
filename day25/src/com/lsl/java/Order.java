package com.lsl.java;

import java.util.ArrayList;
import java.util.List;

/**
 *  自定义的泛型类
 * @author Long
 * @Date 2020/3/22 11:43
 */
public class Order<T> {

    String orderName;
    int orderAge;

    //类的内部结构就可以使用类的泛型

    T orderT;

    public Order(){};
    public Order(String orderName,int orderAge,T orderT){
        this.orderName = orderName;
        this.orderAge =orderAge;
        this.orderT = orderT;

    }


    public T getOrderT(){
        return orderT;
    }

    public void setOrderT(T orderT){
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderAge=" + orderAge +
                ", orderT=" + orderT +
                '}';
    }

    //静态方法中不能使用类的泛型
//    public static void show(T orderT){
//        System.out.println(orderT);
//    }

    public void show(){
        //编译不通过

//       try{
//
//       }catch (T t){
//
//       }
    }

    //泛型方法：在方法中出现了泛型结构，泛型参数与类的泛型参数没有任何关系。
    //换句话说，泛型方法所属的类是不是泛型类型都没有关系
    //泛型方法，可以声明为静态的。原因：泛型参数在调用方法时确定的。并非在实例化时确定
    public <E> List<E> copyFromArrayToList(E[] arr){

        ArrayList<E> list = new ArrayList<>();
        for (E e:arr ){
            list.add(e);
        }
        return list;

    }
}
