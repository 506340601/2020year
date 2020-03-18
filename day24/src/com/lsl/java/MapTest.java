package com.lsl.java;

import org.junit.Test;

import java.util.*;

/**
 *  |----Map:双列数据；存储key-value对的数据 ---类似于高中的函数：y =f(x)
 *          |---HashMap:作为Map的主要实现类；线程不安全，效率高；存储null的key和value
 *              |---LinkHashMap:保证在遍历HashMap元素时，可以按照添加的顺序实现遍历
 *              原因：在原有的HashMap底层结构上添加了一对指针，指向前一个和后一个元素。
 *              对于频繁的遍历操作，此类执行效率高于HashMap。
 *          |---TreeMap：保证添加的key-value对进行排序，实现排序遍历，此时考虑key的自然排序和定制排序
 *                      底层上使用红黑树
 *          |---Hashtable：作为古老的实现类；线程安全，效率低；不能存储null的key和value
 *              |---Properties:常用来处理配置文件，key和value都是String类型
 *
 *
 *
 *       HashMap的底层：  数组+链表 （jdk 7 及以前）
 *                       数组+链表+红黑树  （jdk 8）
 *
 *  面试题：
 *      1、HashMap的底层实现原理？
 *      2、HashMap和Hashtable的异同
 *      3、CurrentHashMap与Hashtable的异同？
 *
 *
 *    二、Map结构的理解：
 *      Map中的key：无序的、不可重复的，使用Set存储所有的Key ---key所在的类要重写equlas()和hashCode() (以HashMap为例)
 *      Map中的value:无序，可重复的，使用Collection存储所有的value ----value所在的类要重写equals()
 *     一个键值对：key-value构成的一个Entry对象
 *     Map中的entry：无序的、不可冲读的的，使用的Set存储所有的entry
 *
 *      三、HashMap的底层实现原理，以jdk7为例
 *      HashMap map = new HashMap();
 *      在实例化以后，底层创建了长度是16的一维数组Entry[] table;
 *      ...可能已经执行过多次put...
 *      map.put(key1,value1):
 *       首先，调用key1所在类的hashCode()计算key1哈希值，此哈希值经过某种算法计算以后，得到Entry数组的存放位置。
 *       如果此位置上的数据为空，此时key1-value1添加成功----情况1
 *       如果此位置上的数据不为空，（意味着此位置上存在一个或者多个数据（以链表形式存在）），比较key1和已经存在的一个或者
 *       多个的哈希值：
 *          如果key1的哈希值和已经存在的数据的哈希值都不相同，此时key1-value1添加成功。----情况1
 *          如果key1的哈希值和1已经存在的某个数据(key2-value2)的哈希值相同，继续比较：调用key1所在类的equals(key2）
 *              如果equals()返回false:此时key1-value1添加成功。----情况1
 *              如果equals()返回true:使用value1替换value2。
 *
 *
 *
 *      补充：关于情况2和情况3：此时key1-value1和原来的数据以链表的方式存在。
 *      在不断添加的过程中，会涉及到扩容问题，当超出临界值（且要存放的位置非空时）
 *      默认的扩容方式:扩容为原来容量的2倍，并将数据赋值过来。
 *
 *
 *
 *      jdk 8 相较于jdk在底层实现方面的不同：
 *          1、new HashMap():底层没有创建一个长度为16的数组
 *          2、jdk 8 底层的数组是：Node[],而非Entry[]
 *          3、首次使用put()方法时，底层创建长度为16的数组
 *          4、jdk 7 底层结构只有：数组+链表。jdk 8中底层结构：数组+链表+红黑树。
 *              当数组的某一个索引位置上的元素以链表的形式存在的数据个数 > 8 且当前数组的长度 > 64时，
 *              此时此索引位置上的所有数据改为使用红黑树存储。
 *
 *
 * @author Long
 * @Date 2020/3/16 15:40
 */
public class MapTest {
    public static void main(String[] args) {
        System.out.println("你在我眼中真的很特别");
        System.out.println("为什么最迷人的最危险");
        System.out.println("我爱你却变成残缺");
    }




    @Test
    public void test4(){
/*
        元视图操作的方法：
         Set keySet()：返回所有key构成的Set集合
         Collection values()：返回所有value构成的Collection集合
         Set entrySet()：返回所有key-value对构成的Set集合
                */
        //map遍历：
        Map map = new HashMap();

        map.put("AA",123);
        map.put(45,123);
        map.put("BB",123);
        map.put("AA",87);

        //遍历所有key集：keySet()

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("***************");
        //遍历所有的value集：values();

        Collection values = map.values();
        for (Object obj: values) {
            System.out.println(obj);
        }

        //遍历所有的key-value
        //方式一：entrySet():
        Set entrySet =map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Object obj = iterator1.next();
            //entrySet集合中的每个元素都是entry
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey()+"------>"+entry.getValue());
        }

    }

 /*
     添加、删除、修改操作：
             Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
     void putAll(Map m):将m中的所有key-value对存放到当前map中
     Object remove(Object key)：移除指定key的key-value对，并返回value
     void clear()：清空当前map中的所有数
    */
    @Test
    public void test1(){

        Map map = new HashMap();

        map.put("AA",123);
        map.put(45,123);
        map.put("BB",123);
        map.put("AA",87);

        System.out.println(map);

        Map map1 = new HashMap();
       map1.put("CC",123);
       map1.put("DD",123);

       map.putAll(map1);

        System.out.println(map);

        //remove(Object key)
        Object value = map.remove("CC");
        System.out.println(value);
        map.remove(value);
        System.out.println(map);

        //clear
        map.clear();
        System.out.println(map.size());
        System.out.println(map);

    }

 /*
     元素查询的操作：
             Object get(Object key)：获取指定key对应的value
     boolean containsKey(Object key)：是否包含指定的key
     boolean containsValue(Object value)：是否包含指定的value
     int size()：返回map中key-value对的个数
     boolean isEmpty()：判断当前map是否为空
     boolean equals(Object obj)：判断当前map和参数对象obj是否相等
*/
    @Test
    public void test2(){

        Map map = new HashMap();

        map.put("AA",123);
        map.put(45,123);
        map.put("BB",123);
        map.put("AA",87);

        System.out.println(map.get(45));
    }


}
