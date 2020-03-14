package com.lsl.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * jdk 8之前的日期时间的API测试
 *  1、System类中的currenttimeMillis()
 *  2、java.util.Date和子类java.sql.Date
 *  3、SimpleDateFormat
 *  4、Calendar
 *
 * @author Long
 * @Date 2020/3/4 11:45
 */
public class DateTimeTest {
    /*
    SimpleDateFormat的使用： SimpleDateFormat

        1、两个操作：
        1.1 格式化：日期--->字符串
        1.2 解析：格式化的逆过程，字符串 ---》日期

        2. SimpleDateFormat的实例化

    */

    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化 SimpleDateFormat:使用默认的构造器
        SimpleDateFormat sdf = new  SimpleDateFormat();

        //格式化：日期---》字符串
        Date date = new Date();
        System.out.println(date);

        String format =sdf.format(date);
        System.out.println(format);

        //解析：格式化的逆过程：字符串 ---》日期

        //**************按照指定的格式化和解析：调用带参的构造器**************
//        SimpleDateFormat sdf1=new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");//02020.三月.04 公元 12:26 下午
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy.MM.dd  hh:mm:ss");//2020.03.04  12:27:26
        //格式化
        String format1 = sdf1.format(date);
        System.out.println(format1);

        //解析：要求字符串必须符合SimpleFormat识别的格式(通过构造器参数体现)
        //否则就会抛异常。
        Date date2 =sdf1.parse("2020.03.04  12:27:26");
        System.out.println(date2);
    }
 /*
    练习一：字符串"2020-09-08"转换为java.sql.Date

    */
    @Test
    public void testSimpleFormat2() throws ParseException {

        //解析：
        String str = "2020-09-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date =sdf.parse(str);
        System.out.println(date);

        java.sql.Date birthDate =new java.sql.Date(date.getTime());
        System.out.println(birthDate);

    }

}
