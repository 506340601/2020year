package com.lsl.exer;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Long
 * @Date 2020/3/23 11:24
 */
public class FileDemo {
    /*
        利用File构造器，new 一个文件目录file
         1)在其中创建多个文件和目录
         2)编写方法，实现删除file中指定文件的操作

     */
    @Test
    public void test1() throws IOException {
        File file = new File("E:\\io\\io1\\hello.txt");
        //创建一个与file同目录下的另外一个文件；文件名为haha.txt
        File destFile = new File(file.getParent(),"haha.txt");

        boolean newFile =  destFile.createNewFile();
        if(newFile){
            System.out.println("创建成功!");
        }
    }

    //判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
    @Test
    public void test(){
        File file = new File("E:\\io\\io1");

        String[] list = file.list();
//        for (String s: list) {
//
//                System.out.println(s);
//        }
        for (String s: list) {
            if(s.endsWith(".txt")){
                System.out.println(s);
            }
        }
    }

}
