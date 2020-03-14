package com.lsl.exer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Long
 * @Date 2020/3/13 22:56
 */
public class Test {

    @org.junit.Test
    public void test(){

        User u1 =new User("yuyu",20);
        User u2 =new User("hanhan",22);
        User u3 =new User("benben",19);
        User u4 =new User("cc",24);
        User u5 =new User("chacha",12);
    }

    @org.junit.Test
    public void test2(){

        User u1 =new User("yuyu",20);
        User u2 =new User("hanhan",22);
        User u3 =new User("benben",19);
        User u4 =new User("cc",24);
        User u5 =new User("chacha",12);

        ArrayList list =new ArrayList();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        Collections.sort(list, new Comparator<User>() {

                @Override
                public int compare(User o1, User o2) {
                   if(o1 instanceof User && o2 instanceof User){
                       User a =(User)o1;
                       User b =(User)o2;

                       int u1 = a.getAge();
                       int u2 =a.getAge();
                       return u1-u2;
                   }
                   throw  new RuntimeException("输入的数据格式不一致");
                }
            });
    }
}
