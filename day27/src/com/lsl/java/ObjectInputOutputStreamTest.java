package com.lsl.java;

import org.junit.Test;

import java.io.*;

/**
 *  对象流的使用：
 *      1、ObjectInputStream和ObjectOutputStream
 *      2、作用：用于存储的和读取基本数据类型数据或对象的处理流。
 *          它的强大之处就是可以把Java中的对象写入到数据源中，也能把对象从数据源中还原回来。
 *
 *       3、要定义一个序列化类，要满足哪些条件
 * @author Long
 * @Date 2020/3/26 17:44
 */
public class ObjectInputOutputStreamTest {

    /*
        序列化的过程：将内存中的java对象保存到磁盘当中或者通过网络传输出去
        使用ObjectOutputStream
     */

    @Test
    public void testObjectOutputStream(){
        ObjectOutputStream oos = null;
        try {
            //1、
            oos = new ObjectOutputStream(new FileOutputStream("object.bat"));
            //2、
            oos.writeObject(new String("我爱北京天安门"));
            oos.flush();//刷新操作
            //自定义类序列化
            oos.writeObject(new Person("王明",23));
            oos.flush();

            oos.writeObject(new Person("李三",23,new Account(5000)));
            oos.flush();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3、关闭
            if (oos !=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    //反序列化过程：将磁盘文件中的对象还原成内存中的一个java对象
    //使用ObjectInputStream
    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;

        try {
            //1、造流造对象
            ois = new ObjectInputStream(new FileInputStream("object.bat"));

            //2、
            Object obj =ois.readObject();
            String str =(String) obj;

            Person p =(Person) ois.readObject();
            Person p1 =(Person) ois.readObject();

            System.out.println(str);
            System.out.println(p);
            System.out.println(p1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            //3、关闭流
            if (ois !=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
