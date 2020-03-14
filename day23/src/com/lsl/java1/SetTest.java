package com.lsl.java1;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *       |---Collection接口：单列集合，用来存储一个一个的对象
 *              |----Set接口：存储无序的，不可重复的数据。   ----> 高中的“集合”
 *                   |----HashSet:作为Set接口的主要实现类；线程不安全；可以存储null
 *                   |----、LinkHashSet：作为HashSet的子类；遍历其内部数据时，可以按添加的顺序进行遍历
 *                   |----TreeSet：可以按照添加对象的指定属性，进行排序
 *
 *      1.Set接口中没有额外定义的方法，使用的是Collection中生声明的方法。
 *
 *      2、要求：向Set添加数据，其所在的类一定要重写hashCode()和equals()方法
 *          要求：重写的对应的类一定要重写equals()和hashCode(Object obj)方法，以实现对象相等规则。
 *                  即：“相等的对象必须具有相等的散列码”。
 *
 * @author Long
 * @Date 2020/3/13 11:36
 */
public class SetTest {
    /*
    一、Set接口：存储无序的，不可重复的数据

     1、无序性：不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值进行分组

     2.不可重复性：保证添加的元素按照equals()判断时，不能返回true。即：相同的元素只能添加一个。

   二、添加元素的过程：以HashSet为例：
        我们向HashSet中添加元素a，首先调用的是a所在类的hashCode()方法，计算元素a的哈希值
        此哈希值接着通过某种算法计算出HashSet底层数组中存放的位置（即为：索引位置），判断
        数组此位置上是否已经有元素：
            如果此位置上没有其他元素，则添加成功。-----情况一
            如果此位置上有其他元素b（或以链表形式存在的多个元素），则比较元素a与元素b的hash值：
                如果hash值不相同，则元素a添加成功。---情况2
                如果hash值相同进而需要调用元素a所在类的equals()方法：
                    equals()返回true，元素a添加失败
                    equals()返回false，则元素a添加成功。---情况3

           对于添加的成功的情况2和情况3而言：元素a与已经存在指定的索引位置上数据以链表的的方式存储。
           jdk 7:元素a放到数组中，指向原来的元素.
           jdk 8:原来的元素在数组中，指向元素a

           总结：七上八下
           HashSet的底层：数组+链表

    */

    @Test
    public void test1(){

        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add(new User("Tom",12));
        set.add(new User("Tom",12));
        set.add(123);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
