package com.lsl.java;

import org.junit.Test;

import java.util.*;

/**
 *  一、集合框架的概述
 *
 *      1、集合和数组都是对多个对象进行存储的操作的结构，简称Java容器。
 *          说明：此时的存储，主要指的是内存层面的存储，不涉及到持久化存储（.txt、.jpg、.avi、数据库中）
 *
 *      2.1、数组在存储多个数据方面的特点：
 *          > 一旦初始化之后，其长度就确定了。
 *          > 数组一旦定义好，其元素的类型也就确定了。我们也只能操作其指定的类型的数据了。
 *              比如：String[] arr, int[] arr1 ;Object[] arr2
 *      2.2 数组在存储多个数据方面的缺点：
 *          > 一旦初始化以后，其长度就不可修改
 *          > 数组中提供的方法非常有限，对于添加。删除、插入数据等操作，非常不便，同时效率不高。
 *          > 获取数组中实际元素的个数需求，数组没有现成的属性或方法可用
 *          > 数组存储数据的特点：有序、可重复。对于无序、不可重复的需求不能满足。
 *
 *
 *      二、集合框架
 *          |---Collection接口：单列集合，用来存储一个一个的对象
 *              |----List接口：存储有序的、可重复的数据。   ---->“动态”数组
 *                  |ArrayList、LinkedList、Vector
 *                  |
 *                  |
 *
 *              |----Set接口：存储无序的，不可重复的数据。   ----> 高中的“集合”
 *                  |----HashSet、LinkHashSet、TreeSet
 *
 *
 *          |-------Map接口：双列集合，用来存储一对（key,value）一对的数据  ----> 高中函数：y =f(x)
 *                  |----HashMap、LinkedHashMap、TreeMap、HashTable、Properties
 *
 *      三、Collection接口中的方法
 *
 *
 *
 *  //Collection接口中声明的方法的测试
 *      向Collection接口的实现类的对象中添加数据obj时，要求obj所在类重写equals()方法
 * @author Long
 * @Date 2020/3/9 13:27
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();

        //1、add(Object e):将元素e添加到集合coll
        coll.add("AAA");
        coll.add("BB");
        coll.add("123");//自动装箱
        coll.add(new Date());

        //2、size():获取添加元素的个数
        System.out.println(coll.size());//4

        //3、addAll(Collection coll1):将coll1集合中的元素添加到当前集合中
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("CC");
        coll.addAll(coll1);
        System.out.println(coll.size());//6
        System.out.println(coll);

        //4、clear():清空集合元素
        coll.clear();

        //5、isEmpty():判断当前集合是否为空
        System.out.println(coll.isEmpty());

    }

    @Test
    public void test2(){

        Collection coll = new ArrayList();

        coll.add(123);
        coll.add(456);
        coll.add(new String("李羽羽"));
        coll.add(false);

//        Person p =new Person("Tom",20);
//        coll.add(p);
        coll.add(new Person("Tom",20));

        //6、contains(Object obj):判断当前集合中是否包含obj
        //我们在判断时会调用obj对象所在类的equals()。

        boolean contains =coll.contains(123);
        System.out.println(contains);//true
        System.out.println(coll.contains(new String("李羽羽")));//true
//        System.out.println(coll.contains(p));//true
        //
        System.out.println(coll.contains(new Person("Tom",20)));

        System.out.println("************************************1");
        //7、containsAll(Collection coll1):判断形参coll1中所有元素都存在于当前集合中。
        Collection coll1 = Arrays.asList(123,456);//加了别的 112 就为false
        System.out.println(coll.containsAll(coll1));//true


    }


    @Test
    public void test3(){
        Collection coll = new ArrayList();

        //8、remove（object obj）:从当前的集合中移除obj元素
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Tom",20));
        coll.add(new String("李羽羽"));
        coll.add(false);

        boolean isRemove = coll.remove(1234);
        boolean isRemove1 = coll.remove(new Person("Tom",20));
        System.out.println(isRemove);
        System.out.println(isRemove1);

        System.out.println(coll);

        //9、removeAll(Collection coll1):从当前的集合中移除coll1中的所有元素
        Collection coll1 = Arrays.asList(123,456);
        coll.removeAll(coll1);
        System.out.println(coll);

        //10、retainAll():获取两个集合中相同的对象并返回给当前对象。
        Collection coll2 = Arrays.asList(123,456,789);
        coll.retainAll(coll2);
        System.out.println(coll);


    }

    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Tom",20));
        coll.add(new String("李羽羽"));
        coll.add(false);

        //11、hashCode()：返回当前的对象的哈希值
        System.out.println(coll.hashCode());

        //12、集合--->数组：toArray()
        Object[] arr =coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //拓展：数组---> 集合:调用Arrays类的静态方法asList()
        List<String> list = Arrays.asList(new String[]{"AA","BB","CC"});
        System.out.println(list);

        List arr1 = Arrays.asList(new int[]{123,456});
        System.out.println(arr1.size());

        List arr2 = Arrays.asList(new Integer[]{123,456});
        System.out.println(arr2.size());

        //13、iterator():返回Iterator接口的实例，用于遍历集合元素。放在IteratorTest.java中



    }
}
