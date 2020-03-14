package com.lsl.java;

import org.junit.Test;

import java.util.Arrays;

/**
 *  一、说明：Java中的对象，正常情况下，我们只能进行比较： == 或 ！= 。不能使用 >或 <的
 *           但是在实际开发场景中，我们需要对多个对象进行排序，言外之意，就需要比较对象的大小。
 *           如何实现？使用两个接口中的任何一个：Comparable 或 Comparator
 *
 *  二、Comparable接口的使用举例：   自然排序
 *      1、像String、包装类等实现了Comparable接口，重写了compareTo(obj)方法，给出了比较两个对象的大小的方式
 *      2、像String、包装类重写compareTo()方法以后，进行了从小到大的排列
 *      3、重写compareTo(obj)的规则：
 *          1）如果当前对象this大于形参对象obj，则返回正整数
 *          2）如果当前对象this小于形参对象obj，则返回 负整数，
 *          3）如果当前对象this等于形参对象obj，则返回零。
 *      4、对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口，重写compareTO(obj)方法，
 *          在compareTo(obj)方法知名如何排序
 * @author Long
 * @Date 2020/3/4 18:37
 */
public class CompareTest {

    @Test
    public void test(){
        String[] arr =new String[]{"AA","CC","KK","GG","MM","JJ","DD"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("雅诗兰黛",298);
        arr[1] = new Goods("圣罗兰",310);
        arr[2] = new Goods("阿玛尼405",309);
        arr[3] = new Goods("迪奥999哑光",290);
        arr[4] = new Goods("香奈儿147",309);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

  /*
        Comparator接口的使用： 定制排序
        1、背景：
            当元素的类型没有实现java.lang,Comparable接口而又不方便修改代码
            或者实现了java.lang.Comparator接口的排序规则又不适合当前的操作
            那么可以考虑使用Comparator的对象来排序

         2、重写compare(Object o1,Object o2)方法，比较o1和o2的大小：
                如果要返回正整数，则表示o1大于o2；
                返回0，则表示大小相等；
                如果返回负整数，表示o1小于o2。

    */
    @Test
    public void test3(){

    }
}
