package com.lsl.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Long
 * @Date 2020/3/13 10:55
 */
public class ListExer {
    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);//

        }
        private static void updateList(List list) {
            list.remove(2);
        }
}

