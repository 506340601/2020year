package com.java;

import org.junit.Test;

/**
 *
 * @author Long
 * @Date 2020/3/2 18:21
 */
public class StringMethodTest {

    /*
    替换：
     String replace(char oldChar, char newChar)：返回一个新的字符串，
            它是通过用newChar 替换此字符串中出现的所有oldChar得到的。
     String replace(CharSequence target, CharSequence replacement)：
            使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
     String replaceAll(String regex, String replacement) ：
            使用给 定 的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
     String replaceFirst(String regex, String replacement) ：
            使用给定的replacement替换此字符串匹配给定的正则表达式的第一个子字符串。
     匹配
     boolean matches(String regex)：告知此字符串是否匹配给定的正则表达式。
    切片
     String[] split(String regex)：根据给定正则表达式的匹配拆分此字符串。
     String[] split(String regex, int limit)：根据匹配给定的正则表达式来拆分此字符串
            ，最多不超过limit个，如果超过了，剩下的全部都放到最后一个元素中
    */
    @Test
    public void test4(){

    }







/*  字符串相关的类：String常用方法1:
    boolean endsWith(String suffix)：测试此字符串是否以指定的后缀结束
     boolean startsWith(String prefix)：测试此字符串是否以指定的前缀开始
     boolean startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的 子字符串是否以指定前缀开始
     boolean contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列 时，返回 true
     int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引
     int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出 现处的索引，从指定的索引开始
     int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引
     int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，
        从指定的索引开始反向搜索 注：indexOf和lastIndexOf方法如果未找到都是返回-1
*/

    @Test
    public void test3(){
        String s1 = "helloworld.txt";
        String s2 = "helloworld.txtw";
        System.out.println(s1.endsWith(".txt"));//true
        System.out.println(s2.endsWith(".txt"));//false

        System.out.println(s1.startsWith("hel"));//true
        System.out.println(s2.startsWith("ll",2));//true

        System.out.println("**********");//true
        System.out.println(s1.contains("or"));//3

        System.out.println(s1.indexOf("lo"));
        System.out.println(s1.indexOf("lo", 5));//找不到就返回-1
        System.out.println("*********");

        String s3 ="hellorworld";
        System.out.println(s3.lastIndexOf("or"));//7

        System.out.println(s3.lastIndexOf("or", 6));//4 从指定的索引位置，从右往左找


    }

  /*  字符串相关的类：String常用方法1:
     int length()：返回字符串的长度： return value.length
     char charAt(int index)： 返回某索引处的字符return value[index]
     boolean isEmpty()：判断是否是空字符串：return value.length == 0
     String toLowerCase()：使用默认语言环境，将 String 中的所有字符转换为小写
     String toUpperCase()：使用默认语言环境，将 String 中的所有字符转换为大写
     String trim()：返回字符串的副本，忽略前导空白和尾部空白
     boolean equals(Object obj)：比较字符串的内容是否相同
     boolean equalsIgnoreCase(String anotherString)：与equals方法类似，忽略大 小写
     String concat(String str)：将指定字符串连接到此字符串的结尾。 等价于用“+”
     int compareTo(String anotherString)：比较两个字符串的大小
     String substring(int beginIndex)：返回一个新的字符串，它是此字符串的从 beginIndex开始截取到最后的一个子字符串。
     String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字 符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。
 **/
    @Test
    public void test2() {
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));//false 字符串区分大小写
        System.out.println(s1.equalsIgnoreCase(s2));//true

        String s3 = "abc";
        String s4 = s3.concat("def");
        System.out.println(s3);//abc
        System.out.println(s4);//abcdef


        String s5 = "abc";
        String s6 = new String("abe");
        System.out.println(s5.compareTo(s6));//-2 涉及到字符串排序

        String s7 = "李羽羽铁憨憨";
        System.out.println(s7.substring(1));//羽羽铁憨憨
        System.out.println(s7.substring(1, 3));//羽羽


    }


    @Test
    public void test1() {
        String s1 = "HelloWorld";
        System.out.println(s1.length());//10
        System.out.println(s1.charAt(0));//H
        System.out.println(s1.charAt(9));//d
//        System.out.println(s1.charAt(10));//错误，超过数组长度

//        s1 = "";
        System.out.println(s1.isEmpty());//false

        System.out.println(s1.toUpperCase());//HELLOWORLD
        String s2 = s1.toLowerCase();//
        System.out.println(s1);//s1是不可变的  HelloWorld
        System.out.println(s2);//改写成小写的  helloworld

        String s3 = "  he  llo  world     ";
        String s4 = s3.trim();
        System.out.println("-----------" + s3 + "----------");//-----------  he  llo  world     ----------
        System.out.println("-----------" + s4 + "----------");//-----------he  llo  world----------
    }
}
