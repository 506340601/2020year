package com.lsl.java;

import org.junit.Test;

import java.time.*;
import java.util.Date;

/**
 * jdk 8 中日期API的测试
 *
 * @author Long
 * @Date 2020/3/4 13:43
 */
public class JDK8DateTimeTest {

    @Test
    public void testDate(){
        //偏移量
        Date date1 =new Date(2020-1900,9-1,8);
        System.out.println(date1);
    }
/*

    LocalDate、LocalTime、LocalDateTime 的使用
    说明：
        1、LocalDateTime相较于LocalDate、LocalTime,使用频率较高
        2、类似于Calendar

*/
    @Test
    public void test1(){

        //now():获取当前日期、时间、日前+时间
        LocalDate localDate =LocalDate.now();
        LocalTime localTime =LocalTime.now();
        LocalDateTime localDateTime =LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of():设置指定的年月日时分秒，无偏移量
        LocalDateTime localDateTime1 =LocalDateTime.of(2020,2,6,13,23,9);
        System.out.println(localDateTime1);

        //获取相关属性：getXxx()
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

        //体现不可变性 Local
        //withXxx():设置相关的属性
        System.out.println("*************");
        LocalDate localDate1 =localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);

        LocalDateTime localDateTime2 =localDateTime.withHour(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        //不可变性：加
        LocalDateTime localDateTime3=localDateTime.plusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);


        //减：
        LocalDateTime localDateTime4 =localDateTime.minusDays(6);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);

    }

 /*
    Instant的使用：（瞬时）
        类似于java.util.Date类
    */

    @Test
    public void test2(){
        //实例化
        Instant instant=Instant.now();
        System.out.println(instant);//2020-03-04T06:22:33.882Z

        //考虑时区问题
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        //toEpochMilli():获取(瞬时点的毫秒数)即自1970年1月1日0时0分0秒(UTC)开始的毫秒数

       long milli= instant.toEpochMilli();
        System.out.println(milli);//1583303241389

        //ofEpochMilli():通过给定的毫秒数，获取Instant实例 ---》Date(long millis)
        Instant instant1 = Instant.ofEpochMilli(1583303241389L);
        System.out.println(instant1);
    }
}
