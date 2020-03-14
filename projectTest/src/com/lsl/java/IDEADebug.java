package com.lsl.java;

import org.junit.Test;

/**
 * @author Long
 * @Date 2020/3/3 15:38
 */
public class IDEADebug {

    @Test
    public void testStringBuffer(){
        String str =null;
        StringBuffer sb= new StringBuffer();
        sb.append(str);//

        System.out.println(sb.length());
        System.out.println(sb);//

        StringBuffer sb1 = new StringBuffer(str);//抛异常
        System.out.println(sb1);//
    }
}
