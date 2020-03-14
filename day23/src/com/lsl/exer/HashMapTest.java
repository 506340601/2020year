package com.lsl.exer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Long
 * @Date 2020/3/13 23:32
 */
public class HashMapTest {
        public static void main(String[] args) {
            HashMap hm = new HashMap();
            hm.put(1, "chen");
            hm.put(2, "chan");
            hm.put(3, "zhang");
            hm.put(4, "wang");
            System.out.println(hm.size());
            hm.put(2, "sun");
            System.out.println(hm.size());
            //1、
            System.out.println(hm);//默认调用toString
            System.out.println("\n----------------------");
            //2、
            Set keys = hm.keySet();
            for (Object key : keys) {
                System.out.print(key+"="+hm.get(key));
            }
            System.out.println("\n----------------------");
            //3\***
            Set<Map.Entry> ms =hm.entrySet();
            for (Map.Entry entry : ms) {
                System.out.print(entry.getKey()+"="+entry.getValue());
            }
            System.out.println("\n----------------------");
        }
    }



