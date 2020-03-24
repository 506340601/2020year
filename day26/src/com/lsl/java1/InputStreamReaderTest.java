package com.lsl.java1;

import org.junit.Test;

import java.io.*;

/**
 *  处理流二：转换流的使用
 *     1、转换流：属于字符流
 *      InputStreamReader:将一个字节的输入流转化为一个字符的输入流
 *      OutputStreamWriter：将一个字符的的输出流转换为字节的输出流
 *
 *     2、作用：提供字节流与字符流之间的转换
 *
 *     3、解码：字节、字节数组--->字符数组、字符串
 *        编码：字符数组、字符串----> 字节、字节数组
 *
 *     4、字符集
 *
 * @author Long
 * @Date 2020/3/24 16:20
 */
public class InputStreamReaderTest {

    @Test
    public void test1() throws IOException {
        FileInputStream fis = new FileInputStream("dbcp.txt" );
//        InputStreamReader isr =new InputStreamReader(fis);//使用系统默认的字符集
        //参数2指明了字符集，具体使用哪个字符集，取决于文件dbcp.txt保存时使用的字符集
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        char[] cubf =new char[20];
        int len;
        while ((len =isr.read(cubf))!= -1){
            String str = new String(cubf,0,len);
            System.out.print(str);
        }

        isr.close();
    }

    /*
        综合使用InputStreamReader和OutputStreamWriter

     */
    @Test
    public void test2() throws IOException {

        File file1 =new File("dbcp.txt");
        File file2 =new File("dbcp_gbk.txt");

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");

        char[] cubf = new char[20];
        int len;
        while ((len =isr.read(cubf))!= -1){
            osw.write(cubf,0,len);
        }

        isr.close();
        osw.close();
    }
}
