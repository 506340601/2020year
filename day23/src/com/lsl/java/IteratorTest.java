package com.lsl.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *  集合元素的遍历操作，使用迭代器Iterator接口
 *      1、内部的方法：hasNext()和next()
 *      2、集合对象每次调用iterator()方法都得到一个全新的迭代器对象，默认游标都在集合 的第一个元素之前。
 *      3、内部定义了一个remove(),可以在遍历的时候，删除集合中的元素，此方法不同于集合直接调用remove
 *
 *
 *
 * @author Long
 * @Date 2020/3/10 17:35
 */
public class IteratorTest {

    @Test
    public void test1(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Tom",20));
        coll.add(new String("李羽羽"));
        coll.add(false);

        Iterator iterator =coll.iterator();
        //方式一：

//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        //报异常：NoSuchElementException
//        System.out.println(iterator.next());

        // 方式二：不推荐
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        //方式三：推荐
        //hasNext()：是否还有下一个元素
        while (iterator.hasNext()){
            //next():①指针下移②将下移以后集合位置上的元素返回
            System.out.println(iterator.next());
        }

    }

    //测试Iterator中的remove()
   // 如果还未调用next()或在上一次调用 next 方法之后已经调用了 remove 方法，
    // 再调用remove都会报IllegalStateException。

    @Test
    public void test2(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Tom",20));
        coll.add(new String("李羽羽"));
        coll.add(false);

        //删除集合中的"李羽羽"

        Iterator iterator =coll.iterator();
        while (iterator.hasNext()){
            Object obj =iterator.next();
            if ("李羽羽".equals(obj)){
                iterator.remove();
            }
        }

        iterator =coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
